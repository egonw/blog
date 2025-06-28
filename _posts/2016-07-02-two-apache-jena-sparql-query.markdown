---
layout: post
title:  "Two Apache Jena SPARQL query performance observations"
date:   2016-07-02
blogger-link: https://chem-bla-ics.blogspot.com/2016/07/two-apache-jena-sparql-query.html
doi: 10.59350/nwnd6-hj737
tags: curation wikipathways sparql rdf justdoi:10.1016/j.websem.2014.11.003
image: /assets/images/jenaSlow.png
---

<span style="width: 50%; display: block; margin-left: auto; margin-right: auto; float: right">
<img src="/assets/images/jenaSlow.png" />
</span>

Doing searches in RDF stores is commonly done with SPARQL queries. I have been using this with [the semantic web translation of WikiPathways](http://chem-bla-ics.blogspot.nl/2016/06/new-paper-using-semantic-web-for-rapid.html)
by [Andra](https://twitter.com/andrawaag) to find common content issues, though sometimes combined with some additional Java code.
For example, find [PubMed](http://www.ncbi.nlm.nih.gov/pubmed) identifiers that are not numbers.

Based on [Ryan](http://orcid.org/0000-0003-3477-7443)'s work on interactions, a more complex curation query I
recently wrote in reply to issues that [Alex](https://twitter.com/xanderpico) ran into with converting pathways to
BioPax, is to find interactions that convert a gene to another gene. Such occurred in [WikiPathways](http://wikipathways.org/)
because graphically you do not see the difference. I originally had this query:

```sparql
SELECT (str(?organismName) as ?organism) ?page
       ?gene1 ?gene2 ?interaction
WHERE {
  ?gene1 a wp:GeneProduct .
  ?gene2 a wp:GeneProduct .
  ?interaction wp:source ?gene1 ;
    wp:target ?gene2 ;
    a wp:Conversion ;
    dcterms:isPartOf ?pathway .
  ?pathway foaf:page ?page ;
    wp:organismName ?organismName .
} ORDER BY ASC(?organism)
```

This query properly found all gene-gene conversions to be fixed. However, it was also horribly slow with my
[JUnit](http://junit.org/)/[Apache Jena](https://jena.apache.org/) set up. The queries runs very efficiently on [the Virtuoso-based SPARQL end point](http://sparql.wikipathways.org/).
I had been trying to speed it up in the past, but without much success. Instead, I ended up batching the
testing on our Jenkins instance. But this got a bit silly, with at some point subsets of less than 100 pathways.

## Observation #1

So, I [turned to twitter](https://twitter.com/egonwillighagen/status/748817658758344704), and quite soon got
[three](https://twitter.com/xbib/status/748818534457716736) [useful](https://twitter.com/jervenbolleman/status/748820145028550656)
[leads](https://twitter.com/soilandreyes/status/748891148182257664). The first two suggestions did not help, but helped me rule out the problem.
Of course, there is literature about optimizing, like this recent paper by Antonis (doi:[10.1016/j.websem.2014.11.003](http://doi.org/10.1016/j.websem.2014.11.003)),
but I haven't been able to convert this knowledge into practical steps either. After ruling out these options (though I kept the
`sameTerm()` suggestion), and realized it had to be the first two triples with the variables `?gene1` and `?gene2`. So,
[I tried using *FILTER* there too](https://github.com/BiGCAT-UM/WikiPathwaysCurator/commit/b8283419b252bd8525631d5035d086a15d0773e0),
resulting with this query:

```sparql
WHERE {
  ?interaction wp:source ?gene1 ;
    wp:target ?gene2 ;
    a wp:Conversion ;
    dcterms:isPartOf ?pathway .
  ?pathway foaf:page ?page ;
    wp:organismName ?organismName .
  FILTER (!sameTerm(?gene1, ?gene2))
  FILTER (?gene1 a wp:GeneProduct)
  FILTER (?gene2 a wp:GeneProduct)
} ORDER BY ASC(?organism)
```

That did it! The time to run a query halved. Not so surprising, in retrospect, but it all depends on the SPARQL engine:
which parts does it run first. Apparently, Jena's SPARQL engine starts at the top. This seems to be confirmed by
[the third comment I got](https://twitter.com/soilandreyes/status/748891148182257664). However, I always understood
engine can also start at the bottom.

## Observation #2

But that's not all. This speed up made me wonder something else. The problem clearly seems to engine approach to run
parts of the query. So, what if I remove further choices in what to run first? That leads me to
[a second observation](https://twitter.com/egonwillighagen/status/748844395701506048). It helps significantly if you
reduce the number of subgraphs it should later "merge". Instead, if possible, use
[property paths](https://www.w3.org/TR/sparql11-query/#propertypaths). That again, about halved the runtime of the query.
I ended up with the below query, which, obviously, no longer give me access to the pathway resources, but I can live
with that:

```sparql
WHERE {
  ?interaction wp:source ?gene1 ;
    wp:target ?gene2 ;
    a wp:Conversion ;
    dcterms:isPartOf/foaf:page ?pathway ;
    dcterms:isPartOf/wp:organismName ?organismName .
  FILTER (!sameTerm(?gene1, ?gene2))
  FILTER EXISTS {?gene1 a wp:GeneProduct}
  FILTER EXISTS {?gene2 a wp:GeneProduct}
} ORDER BY ASC(?organism)
```

I'm hoping these two observations may help other with using Apache Jena with unit and integrated testing of RDF generation too.
