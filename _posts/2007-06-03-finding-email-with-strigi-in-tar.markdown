---
layout: post
title:  "Finding email with Strigi in .tar backups"
date:   2007-06-03
modified_date: 2025-02-15
doi: 10.59350/t125s-b8827
blogger-link: https://chem-bla-ics.blogspot.com/2007/06/finding-email-with-strigi-in-tar.html
tags: kde
---

Now that [my CUBIC desktop machine is shutting down](http://chemicalblogspace.blogspot.com/2007/05/uploaded-source-code-to-sf-svn.html),
I made the necessary backups, among a mail.tar for my mail correspondence of about a year. About 500MB in size for almost 8700 files.
[Strigi](http://strigi.sf.net/) is a perfect tool to help me find messages in this archive, as it will recurse into the .tar archive,
and even into email attachements. I created an index just for the archive with:

```
strigicmd create -t clucene -d index/ mail.tar
```

It took Strigi about 30 seconds to index the whole archive. That's good performance!

Now, Strigi indexes content full text, but also uses a controlled vocabulary (among which
[one specifically for chemistry](http://kemistry-desktop.blogspot.com/2007/04/chemical-semantic-desktop.html)).
So I can search for email messages which have article in the subject with:

```
strigicmd query -t clucene -d index/ email.subject:article
```

However, `From:` and `To:` content was not yet extracted. That was easily patched. This allows me to find correspondence between me and, for example, Christoph:

```
strigicmd query -t clucene -d index/ email.to:Christoph AND email.from:Egon
```
