// Copyright (c) 2023-2026  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.12')
@Grab(group='io.github.egonw.bacting', module='net.bioclipse.managers.jsoup', version='1.0.12')

bioclipse = new net.bioclipse.managers.BioclipseManager("..");
ui = new net.bioclipse.managers.UIManager("..");
jsoup = new net.bioclipse.managers.JSoupManager("..");

// Command line options
def cli = new groovy.cli.commons.CliBuilder(usage: 'groovy getpost.groovy [options] <blogger-url> [day]', stopAtNonOption: false)
cli.h(longOpt: 'help', 'show this help')
cli._(longOpt: 'doi', args: 1, argName: 'doi', 'use this DOI instead of creating one with commonmeta')
cli._(longOpt: 'fakedoi', 'use 10.fake/xxxx as DOI instead of creating one with commonmeta (for testing)')
def options = cli.parse(args)
if (!options) System.exit(1)
if (options.h || options.arguments().isEmpty()) { cli.usage(); System.exit(0) }
if (options.doi && options.fakedoi) {
  System.err.println("Use only one of --doi and --fakedoi")
  System.exit(1)
}

blogpost = options.arguments()[0]
dayOverride = options.arguments().size() > 1 ? options.arguments()[1] : null // this 2nd parameter is now optional. it will take it from the Atom feed entry

if (options.doi) {
  doi = options.doi.replace("https://doi.org/", "")
} else if (options.fakedoi) {
  doi = "10.fake/xxxx"
} else {
  def sout = new StringBuilder(), serr = new StringBuilder()
  def proc = 'commonmeta encode 10.59350'.execute()
  proc.consumeProcessOutput(sout, serr)
  proc.waitForOrKill(5000)
  println "out> $sout\nerr> $serr"
  doi = serr.toString().replace("https://doi.org/10.", "10.").replace("\n","").replace("\r","")
  if (doi == null || doi.isEmpty()) {
    doi = sout.toString().replace("https://doi.org/10.", "10.").replace("\n","").replace("\r","")
  }
}

htmlContent = bioclipse.download(blogpost)
htmlDom = jsoup.parseString(htmlContent)
// print htmlDom

title = jsoup.select(htmlDom, "meta[property='og:title']");
parts = blogpost.split("/")
year = parts[3]; if (year.length() == 1) year = "0" + year
month = parts[4]; if (month.length() == 1) month = "0" + month
key = parts[5].replace(".html","")

// fetch the blog post content from the Atom feed entry
postIdMatcher = (htmlContent =~ /'postId':\s*'(\d+)'/)
if (!postIdMatcher.find()) {
  System.err.println("Could not find the postId in ${blogpost}")
  System.exit(1)
}
postId = postIdMatcher.group(1)
blogBase = parts[0..2].join("/")

entryXml = bioclipse.download("${blogBase}/feeds/posts/default/${postId}")
entry = new groovy.xml.XmlSlurper().parseText(entryXml)
published = entry.published.text()

if (published.substring(0,4) != year || published.substring(5,7) != month) {
  System.err.println("Warning: published date ${published} does not match the year and month in the URL")
}
day = dayOverride ?: published.substring(8,10)
if (day.length() == 1) day = "0" + day

content = """---
layout: post
title:  "${title.first().attr("content")}"
date:   ${year}-${month}-${day}
blogger-link: ${blogpost}
doi: ${doi}
tags:
---
"""

ui.newFile("/_posts/${year}-${month}-${day}-${key}.markdown", content)
