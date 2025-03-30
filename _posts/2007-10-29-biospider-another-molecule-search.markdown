---
layout: post
title:  "BioSpider: another molecule search engine"
date:   2007-10-29
blogger-link: https://chem-bla-ics.blogspot.com/2007/10/biospider-another-molecule-search.html
doi: 10.59350/9qsxx-j6z92
image: /assets/images/biospider.png
---

I just ran into [BioSpider](http://biospider.ca/). Unlike [ChemSpider](http://www.chemspider.com/), BioSpider crawls the
internet (well, [this list of sources really](http://redpoll.pharmacy.ualberta.ca/~knox/biospider2/sources.html)) to find
information, and depending on what it finds it continues the search. Below is a screenshot of an intermediate point after
starting with the InChI of methane:

![](/assets/images/biospider.png)

After the search it generates a long HTML page with all the information it found on the molecule you queried for.
This approach is much more scalable than storing all in one database.

This crawling of information is something I was working on myself a bit too, and I think this is a good approach.
However, I think the use of a central website is not the right approach. Instead, the search should be distributed too:
the crawling should be done on the client machine; it should be done in [Taverna](http://taverna.sf.net/) or
[Bioclipse](http://bioclipse.net/) instead.

My conclusion: excellent idea, bad implementation.
