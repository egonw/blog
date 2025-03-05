---
layout: post
title:  "Bioclipse-Oscar4 - Text mining in Bioclipse"
date:   2011-09-27
modified_date: 2025-03-05
doi: 10.59350/qgrq1-4r761
blogger-link: https://chem-bla-ics.blogspot.com/2011/09/almost-year-ago-i-started-position-with.html
tags: oscar bioclipse beilstein
image: /assets/images/oscarDemo2.png
---

Almost a year ago I [started a position <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/15/working-on-oscar-for-three-months.html)
with [Peter Murray-Rust](http://blogs.ch.cam.ac.uk/pmr/) to work on Oscar for three months (see this overview of results;
a paper by the full Oscar team (Sam, David, Dan, Lezan) is pending, and I'm really happy to have been able to contribute
bits to the project). Since then, I have had little time :( That's how it goes, with post-hopping, unfortunately.
One thing I did do after that, was write a [Bioclipse plugin](https://github.com/bioclipse/bioclipse.oscar).

I was asked recently via [LinkedIn](http://www.linkedin.com/in/egonw) if I was planning a Bioclipse-Oscar plugin, and
I realized that I forgot to blog about it. So, here goes. The `oscar` manager I implemented follows the
[Oscar API <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2010/10/28/oscar4-java-api-chemical-name.html), and these
methods are available: `extractText()`, `findNamedEntities()`,  `findResolvedNamedEntities()`.

When I wrote the plugin, I also uploaded an [example workflow to MyExperiment](http://www.myexperiment.org/workflows/2117.html).
The code is:

```javascript
// Demo showing the Oscar text mining functionality
// in Bioclipse
var html = bioclipse.download(
  "http://dx.doi.org/10.3762/bjoc.6.133",
  "text/html"
)
var text = oscar.extractText(html);
// the next step may take some time, while
// initializing the Oscar software for the
// first time
var mols = oscar.findResolvedNamedEntities(text);
var file = "/Oscar Demo/extractedMols.sdf";
cdk.saveSDFile(file, mols);
ui.open(file);
```

The code will extract chemical entities, and open a molecules table in [Bioclipse](http://www.bioclipse.net/):

![](/assets/images/oscarDemo2.png)
