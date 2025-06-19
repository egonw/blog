---
layout: post
title:  "My FOAF network #5: SPARQL-ing my network"
date:   2008-03-19
blogger-link: https://chem-bla-ics.blogspot.com/2008/03/my-foaf-network-5-sparql-ing-my-network.html
doi: 10.59350/f6q3q-d2e52
tags: foaf rdf sparql
---

[FOAF rulez](http://www.foaf-project.org/): it's RDF. With RDF comes [SPARQL](http://www.w3.org/TR/rdf-sparql-query/).
SPARQL needs a query engine, however. And there comes [OpenRDF](http://openrdf.org/) which created Sesame. I have
to catch the train in about 15 minutes, so will not elaborate too much, but here are some
[Sesame 2.0.1](http://www.openrdf.org/doc/sesame2/2.0.1/users/index.html) work:

```
> create native.
Please specify values for the following variables:
Repository ID [native]: foafRepo
Repository title [Native store]: FOAF Repository
Triple indexes [spoc,posc]:
Repository created
> open foafRepo
```

Creates me a new RDF storage and opens it.

```
foafRepo> load http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf .
Loading data...
Data has been added to the repository (606 ms)
```

Loads my FOAF file. Now, a simple SPARQL query that finds me all friends that now someone with the nick egonw:

```
foafRepo> sparql

BASE <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>

SELECT ?s ?o
WHERE { ?s foaf:knows ?o ; foaf:nick "egonw" . }

.
Evaluating query...
+-------------------------------------+-------------------------------------+
| s                                   | o                                   |
+-------------------------------------+-------------------------------------+
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#HenryRzepa>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#CarstenNiehaus>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#RajarshiGuha>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#JeanClaudeBradley>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#GeoffHutchison>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#ChristophSteinbeck>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#PeterMurrayRust>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#TobiasHelmus>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#StefanKuhn>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#MartinEklund>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#JohannesWagener>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#JarlWikberg>|
| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#me>| <http://blueobelisk.sourceforge.net/people/egonw/foaf.xrdf#JeromePansanel>|
+-------------------------------------+-------------------------------------+
13 result(s) (15 ms)
```

Not very pretty, but rather accurate.

More SPARQL fun later. Do try this at home, but make sure to [not put a period at the end of a line in your SPARQL query](http://openrdf.org/forum/mvnforum/viewthread?thread=1641)! :)
