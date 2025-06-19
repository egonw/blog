---
layout: post
title:  "My FOAF network #4: Tabulating my publications"
date:   2008-03-18
blogger-link: https://chem-bla-ics.blogspot.com/2008/03/my-foaf-network-4-tabulating-my.html
doi: 10.59350/5gmnt-8b189
tags: foaf rdf
image: /blog/assets/images/tabulator1.png
---

[Richard](http://dowhatimean.net/) informed me (via [Planet RDF](http://planetrdf.com/)) about [N3 support in Tabulator](http://dowhatimean.net/2008/03/tabulator-does-n3).
[N3](http://www.w3.org/DesignIssues/Notation3.html) is a more compressed version of RDF/XML, which I have been using so far, but both are
[RDF](http://en.wikipedia.org/wiki/Resource_Description_Framework). Now, I don't plan to use N3 for my FOAF experimenting, but two things caught
my eye in the nice blog item.

First, it has a very useful tip on `.htaccess` which you can use to teach Apache about MIME types, even when you do not have root access.
So, I added this `.htaccess` file to [blueobelisk.sourceforge.net/people/egonw/](http://blueobelisk.sourceforge.net/people/egonw/):

```
AddType application/rdf+xml;charset=utf-8 .xrdf
```

Now, you can also access my [FOAF file with the MIME type](http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf) set to
`application/rdf+xml`. And, [my bibliography too](http://blueobelisk.sourceforge.net/people/egonw/biblio.xrdf). Now, the latter becomes
interesting when you have [Tabulator](http://dig.csail.mit.edu/2007/tab/) installed in your Firefox. Instead of applying the XSLT,
Firefox will now show it like this:


![](/blog/assets/images/tabulator.png)

And, in the *under the hood* mode it looks like:

![](/blog/assets/images/tabulator1.png)

Now, my FOAF file does not seem to work well. Not sure what goes wrong there, but given the fact that Tabulator seems to be able to
recurse into referenced RDF files, I think it nicely complements what we already have.

Wow, it seems Web3.0/WebNG is really going to happen this year!
