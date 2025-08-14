---
layout: post
title:  "Retracted articles in Wikidata"
date:   2025-02-16
doi: 10.59350/w4zj3-mbw53
tags: wikidata wikipathways doi:10.1093/NAR/GKAD960 cito:citesAsEvidence:10.13003/c23rw1d9
image: /assets/images/retraction_SPARQL.png
comments:
  host: social.edu.nl
  username: egonw
  id: 114013109899779234
---

A good number of years ago, a colleague and I explored if we could get access to the [Retraction Watch Database](retractiondatabase.org/),
but we could not afford it. We have been using data on retractions for curate our databases, like
[WikiPathways](https://www.wikipathways.org/). A database should not contain knowledge based on (only) a retracted article.
Wikidata, btw, has a small number (499) of statements supported by retracted articles. Similarly, it turns out that I am
[citing retracted articles in two papers](https://w.wiki/8pwe) (and a preprint of one of them).

[Wikidata](https://www.wikidata.org/) has a good number of retracted articles in their database
([some 21 thousand at the time of writing](https://scholia.toolforge.org/statistics)). A lot of this data
comes from CrossRef, that recently [acquired the Retraction Watch Database](https://www.crossref.org/blog/news-crossref-and-retraction-watch/)
(doi:[10.13003/c23rw1d9](https://doi.org/10.13003/c23rw1d9))) and started providing the content as FAIR and Open data.
With [a Bacting-based script](https://github.com/egonw/ons-wikidata/blob/main/RetractionWatch/quickstatements.groovy)
I am regularly updating Wikidata with annotations from CrossRef, giving a rich dataset in Wikidata around
the queries. Over the past few years I have written various SPARQL queries to show the results which today
I [collected under a single home](https://bigcat-um.github.io/sparql-examples/examples/WikidataRetractions/):

![](/assets/images/retraction_SPARQL.png)
