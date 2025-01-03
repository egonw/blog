---
layout: post
title:  "Molecules in Wikipedia"
date:   2007-08-02
blogger-link: https://chem-bla-ics.blogspot.com/2007/08/molecules-in-wikipedia.html
tags: chemistry wikipedia rdf inchi
---

I do not care about physical and chemical properties in [Wikipedia](http://wikipedia.org/), as I can easily extract them from other sources.
The main value of Wikipedia for molecules is, I think, that it describes the history of a molecule. Additionally, the Wikipedia URL is a
nice unique molecular identifier (for example *[http://en.wikipedia.org/wiki/Lactose](http://en.wikipedia.org/wiki/Lactose)*) given certain
conditions, and many [bloggers are using it as such](http://chem-bla-ics.blogspot.com/2007/06/using-wikipedia-to-recognize-molecules.html).
But, it only is a useful identifier if one (and only one) InChI is stated on the wiki page.

Now that I am [RDF-ing molecular space](http://chem-bla-ics.blogspot.com/2007/07/rdf-ing-molecular-space.html), I was
[again](http://del.icio.us/url/e24b896a3398220b76d47f59dbdc2634) interested in [dbpedia](http://dbpedia.org/docs/), a RDF version of Wikipedia.
See these two [blog](http://chem-bla-ics.blogspot.com/2007/06/quality-of-chemical-database.html)
[items](http://radar.oreilly.com/archives/2007/03/different_appro_1.html) and Peter's very nice
[dbpedia, RDF and SPARQL - for chemistry](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=333) item.
[Christian](http://www.scs.carleton.ca/~cleger) is picking this up, and extending dbpedia for support for the various chemical boxes.

## Wikipedia Templates

I have spotted a couple of templates: [Drugbox](http://en.wikipedia.org/w/index.php?title=Template:Drugbox),
[Chembox](http://en.wikipedia.org/w/index.php?title=Template:Chembox), [Chembox new](http://en.wikipedia.org/w/index.php?title=Template:Chembox_new),
of which the last one seems to most recent, and has extensions for explosives and drugs. The
[WikiProject Chemicals](http://en.wikipedia.org/wiki/Wikipedia:WikiProject_Chemicals) does not mention it though. Anyone who knows the status?
Is *chembox new* the way forward and going to replace the older *chembox*? I hope so, because only the newer one has InChI in
the last of official fields. Or is *chembox new* simply an extension of *chembox* itself?

Somewhere between 1000 and 1500 entries use the *chembox new* and another 1000 to 1500 use *chembox* but I assume there is
considerable overlap. Additionally, Christian noted that there still seem to be molecules in Wikipedia which do not use a
template at all, and counted some 1900 molecules using various lists. If you you want to keep a more close eye on chemistry in
dbpedia, you should register to the [dbpedia-discussion](http://sourceforge.net/mailarchive/forum.php?forum_name=dbpedia-discussion)
mailing list.
