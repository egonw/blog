---
layout: post
title:  "New Edition! Getting CAS registry numbers out of WikiData"
date:   2015-12-22
blogger-link: https://chem-bla-ics.blogspot.com/2015/12/new-edition-getting-cas-registry.html
doi: 10.59350/vt6nr-28g72
tags: cas wikidata chemistry justdoi:10.15200/winn.142867.72538
image: /assets/images/aceticAcidCAS.png
---

<span style="width: 30%; display: block; margin-left: auto; margin-right: auto; float: right">
<img src="/assets/images/aceticAcidCAS.png" /> <br />
Source: Wikipedia. <a href="https://en.wikipedia.org/wiki/File:Acetic_acid.jpg">CC-BY-SA</a>
</span>
April this year [I blogged about an important SPARQL query](https://chem-bla-ics.blogspot.nl/2015/04/getting-cas-registry-numbers-out-of.html)
for many chemists: getting CAS registry numbers from Wikidata. This is relevant for two reasons:

1. [CAS works together with Wikimedia](http://commonchemistry.org/) on a large, free CAS-to-structure database
2. [Wikidata](http://wikidata.org/) is [CCZero](https://creativecommons.org/choose/zero/)

The original effort validated about eight thousand registry numbers, made available via Wikipedia and the
[Common Chemistry](http://commonchemistry.org/) website. However, the effort did not stop there, and Wikipedia
now contains many more CAS registry numbers. In fact, Wikidata picked up many of these and now lists almost
twenty thousand CAS numbers. That well exceeds what databases are allowed to aggregate and make available.

Since the post in April, Wikidata put online a [new SPARQL end point](https://query.wikidata.org/) and
created "direct" property links. This way, you loose the provenance information, but the query becomes simpler:

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
SELECT ?compound ?id WHERE {
  ?compound wdt:P231 ?id .
}
```

The other thing that changed since April is that others and I requested the creation of more compound identifiers,
and here's an overview along with the current number of such identifiers in Wikidata:

* CAS registry number ([P231](https://www.wikidata.org/wiki/Property:P231)): [19420](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20(count(%3Fid)%20as%20%3Fcount)%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP231%20%3Fid%20.%0A%7D%0A)
* PubChem ID (CID) ([P662](https://www.wikidata.org/wiki/Property:P662)): [16616](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP662%20%3Fid%20.%0A%7D%0A)
* InChI ([P234](https://www.wikidata.org/wiki/Property:P234)): [14312](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP234%20%3Fid%20.%0A%7D%0A)
* ChemSpider ID ([P661](https://www.wikidata.org/wiki/Property:P661)): [11566](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP661%20%3Fid%20.%0A%7D%0A)
* ChEBI ID ([P683](https://www.wikidata.org/wiki/Property:P683)): [4313](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP683%20%3Fid%20.%0A%7D%0A)
* KEGG ID ([P665](https://www.wikidata.org/wiki/Property:P665)): [3983](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP665%20%3Fid%20.%0A%7D%0A)
* Drugbank ID ([P715](https://www.wikidata.org/wiki/Property:P715)): [2518](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP715%20%3Fid%20.%0A%7D%0A)
* KNApSAcK ID ([P2064](https://www.wikidata.org/wiki/Property:P2064)): [9](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP2064%20%3Fid%20.%0A%7D%0A)
* HMDB ID ([P2057](https://www.wikidata.org/wiki/Property:P2057)): [6](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP2057%20%3Fid%20.%0A%7D%0A)
* ZINC ID ([P2084](https://www.wikidata.org/wiki/Property:P2084)): [4](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20%28count%28%3Fid%29%20as%20%3Fcount%29%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP2084%20%3Fid%20.%0A%7D%0A)
* LIPID MAPS ID ([P2063](https://www.wikidata.org/wiki/Property:P2063)): [3](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20(count(%3Fid)%20as%20%3Fcount)%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP2063%20%3Fid%20.%0A%7D%0A)
* Leadscope ID ([P2083](https://www.wikidata.org/wiki/Property:P2083)): [3](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0ASELECT%20(count(%3Fid)%20as%20%3Fcount)%20WHERE%20%7B%0A%20%20%3Fcompound%20wdt%3AP2083%20%3Fid%20.%0A%7D%0A)

Clearly, some identifiers are not well populated yet. This is what bots are for, like
[those used by the Andrew Su team](https://bitbucket.org/sulab/wikidatabots/overview).

Because there is also a predicate for SMILES, we can also create a query that puts the CAS registry
number alongside to the SMILES (or any other identifier):

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
SELECT ?compound ?id ?smiles WHERE {
  ?compound wdt:P231 ?id ;
            wdt:P233 ?smiles .
}
```

Of course, then the question is, [are these SMILES string valid](https://chem-bla-ics.blogspot.nl/2015/10/how-to-test-smiles-strings-in.html)...
And, importantly, this is nothing compared to the number of chemical compounds we know about, which currently is in
the order of 100 million, of which a quarter can be readily purchased:

[![](/assets/images/twitter_chem4biology_679314144680513536.png)](https://twitter.com/chem4biology/status/679314144680513536)

[![](/assets/images/twitter_chem4biology_677593362640142336.png)](https://twitter.com/chem4biology/status/677593362640142336)
