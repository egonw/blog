---
layout: post
title:  "ChEMBL-RDF now linking to CrossRef"
date:   2011-05-06
blogger-link: https://chem-bla-ics.blogspot.com/2011/05/chembl-rdf-now-linking-to-crossref.html
doi: 10.59350/e75m1-n1652
tags: chembl doi rdf
---

[CrossRef](http://www.crossref.org/) [reported recently](http://www.crossref.org/CrossTech/2011/04/content_negotiation_for_crossr.html)
they started supporting RDF, which is great news indeed! The [RDF version of
ChEMBL I created](http://chem-bla-ics.blogspot.com/2011/04/chembl-09-as-rdf.html)
already contained the [DOI](http://en.wikipedia.org/wiki/Digital_object_identifier),
so the [patch to link out](https://github.com/egonw/chembl.rdf/commit/a7c141d362f45ffbb2f4429fde91a220c4548cb3)
was simple.

I have updated the docs.n3 for the [downloads](https://github.com/egonw/chembl.rdf/downloads)
I prepared, which can simply be loaded into your triples store. A typical change
looks like, so loading the new triples will only add triples, and URIs of papers
are not changed:

<pre>@@ -742,6 +802,7 @@
  dc:isPartOf jrn:jaf567f18f5617b0fe77d704fe8f61a3e .
res:r91 a bibo:Article ;
  bibo:doi "10.1016/S0960-894X(01)80794-0" ;
+ owl:sameAs &lt;<a href="http://dx.doi.org/10.1016/S0960-894X(01)80794-0">http://dx.doi.org/10.1016/S0960-894X(01)80794-0</a>&gt; ;
  dc:date "1991" ;
  bibo:volume "1" ;
  bibo:issue "3" ;
</pre>

Info on the license (CC-SA-BY), and which two papers you are asked to cite if
you use this data, can be found [here](https://github.com/egonw/chembl.rdf/blob/master/README.markdown).
Oh, and have a peek at the series on *database cheminformatics* by John ([part1](http://chembl.blogspot.com/2011/04/molecular-databases-and-molecule.html),
[part2](http://chembl.blogspot.com/2011/04/molecule-databases-and-molecule.html),
[part3](http://chembl.blogspot.com/2011/05/molecular-databases-and-molecule.html))!
