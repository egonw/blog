---
layout: post
title:  "Importing RDF input in R for analysis"
date:   2011-04-28
blogger-link: https://chem-bla-ics.blogspot.com/2011/04/importing-rdf-input-in-r-for-analysis.html
doi: 10.59350/b3ear-2mp24
tags: chembl rstats rdf sparql
---

August last year I asked on BioStar about [how to import RDF into the R statistical
package](http://biostar.stackexchange.com/questions/2069/how-do-i-import-rdf-data-into-r)
and at the time nothing seemed existing. Over the past few weeks I ported code
I wrote for [Bioclipse](http://www.bioclipse.net/) to create the [rrdf package](http://cran.r-project.org/web/packages/rrdf/index.html)
for [R](http://www.r-project.org/), which is now available from [CRAN](http://cran.r-project.org/).
RDF can be loaded from RDF/XML, Notation3, and Turtle files, using [Jena](http://jena.sourceforge.net/),
and read data can be queried using [SPARQL](http://www.w3.org/TR/rdf-sparql-query/).
I have not yet ported the remote SPARQL functionality we used in [our recent
paper](http://www.jbiomedsem.com/content/2/S1/S6), but that will make a nice
alternative to [using ChEMBL data in Pipeline Pilot](http://chembl.blogspot.com/2011/04/access-to-chembl-through-pipeline-pilot.html)
or [in Bioclipse](http://www.jbiomedsem.com/content/2/S1/S6) :)
