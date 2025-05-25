---
layout: post
title:  "Getting CAS registry numbers out of WikiData"
date:   2015-04-10
blogger-link: https://chem-bla-ics.blogspot.com/2015/04/getting-cas-registry-numbers-out-of.html
doi: 10.59350/2cfqr-fwe26
tags: wikidata chemistry cas justdoi:10.1186/s13321-015-0061-y doi:10.5281/ZENODO.13906
  justdoi:10.1007/978-3-319-11964-9_4 ldf
image: /assets/images/casPT.png
---

I have promised my Twitter followers the [SPARQL query](https://www.wikidata.org/wiki/Q54871) you have all been waiting
for. Sadly, you had to wait for it for more than two months. I'm sorry about that. But, here it is:

```sparql
PREFIX wd: <http://www.wikidata.org/entity/>

SELECT ?compound ?id WHERE {
  ?compound wd:P231s [ wd:P231v ?id ] .
}
```

What this query does is ask for all things (let's call whatever is behind the identifier is a "compound"; of course, it can
be mixtures, ill-defined chemicals, nanomaterials, etc) that have a CAS registry identifier. This query results in a nice
table of [Wikidata](https://www.wikidata.org/) identifiers (e.g. [Q47512](https://www.wikidata.org/wiki/Q47512) is acetic acid)
and matching CAS numbers, 16298 of them.

Because Wikidata is not specific to the English Wikipedia, CAS numbers from other origin will show up too. For example, the
CAS number for N-benzylacrylamide ([Q10334928](https://www.wikidata.org/wiki/Q10334928)) is provided by the Portuguese Wikipedia:

![](/assets/images/casPT.png)

I used Peter Ertl's [cheminfo.org](http://www.cheminfo.org/wikipedia) (doi:[10.1186/s13321-015-0061-y](https://doi.org/10.1186/s13321-015-0061-y))
to confirm this compound indeed does not have an English page, which is somewhat surprising.

The SPARQL query uses a predicate specifically for the CAS registry number ([P231](https://www.wikidata.org/wiki/Property:P231)).
Other identifiers have similar predicates, like for PubChem compound ([P662](https://www.wikidata.org/wiki/Property:P662)) and
Chemspider ([P661](https://www.wikidata.org/wiki/Property:P661)). That means, Wikidata can become a community crowdsource of
identifier mappings, which is one of the things Daniel Mietchen, me, and a few others proposed in this H2020 grant application
(doi:[10.5281/zenodo.13906](https://doi.org/10.5281/zenodo.13906)). The SPARQL query is run by the
[Linked Data Fragments](http://linkeddatafragments.org/) platform, which you should really check out too, using the
[Bioclipse](http://www.bioclipse.net/) manager I wrote around that.

The full Bioclipse script looks like:

```groovy
wikidataldf = ldf.createStore(
  "http://data.wikidataldf.com/wikidata"
)

// P231 CAS
identifier = "P231"
type = "cas"

sparql = """
PREFIX wd:

SELECT ?compound ?id WHERE {
  ?compound wd:${identifier}s [ wd:${identifier}v ?id ] .
}
"""
mappings = rdf.sparql(wikidataldf, sparql)

// recreate an empty output file
outFilename = "/Wikidata/${type}2wikidata.csv"
if (ui.fileExists(outFilename)) {
  ui.remove(outFilename)
  ui.newFile(outFilename)
}

// safe to a file
for (i=1; i<=mappings.rowCount; i++) {
  wdID = mappings.get(i, "compound").substring(3)
  ui.append(
    outFilename,
    wdID + "," + mappings.get(i, "id") + "\n"
  )
}
```

BTW, of course, all this depends on work by many others including the core [RDF generation](http://tools.wmflabs.org/wikidata-exports/rdf/)
with the [Wikidata Toolkit](https://www.mediawiki.org/wiki/Wikidata_Toolkit). See also the paper by Erxleben *et al.*
([PDF](http://korrekt.org/papers/Wikidata-RDF-export-2014.pdf)).
