---
layout: post
title:  "SPARQL examples: SIB model, software, and patches"
date:   2024-11-17 00:00
tags: sparql doi:10.32388/ZNWI7T justdoi:10.48550/arXiv.2410.06010 wikipathways vhp4safety chembl scholia
image: /assets/images/sparql-examples-tgx.png
---

[Jerven Bolleman](https://akademienl.social/@jerven) *et al.* recently [published a great preprint](https://arxiv.org/abs/2410.06010)
about how to use RDF to give SPARQL queries context by linking it (semantically) with metadata. The context includes
keywords, the SPARQL endpoint the query can be run against, and a human-oriented description of the query. A few groups
have at recent hackathons been working on usingn the combination of a SPARQL query and a human-oriented description
to train large language models, including the group behind this paper. Given that SPARQL is a very small language, I can see
this may work well, and that it may support our [VHP4Safety](https://vhp4safety.nl/) and
[Scholia](https://scholia.toolforge.org/) projects.

But in addition to the data model for SPARQL as research output (see doi:[10.32388/ZNWI7T.2](https://doi.org/10.32388/ZNWI7T.2)),
the paper also introduces the [sparql-example-utils](https://github.com/sib-swiss/sparql-examples-utils) software that I was
first introduced with at [the recent October Scholia hackathon](https://www.wikidata.org/wiki/Wikidata:Scholia/Events/Hackathon_October_2024).

But I have/had some features I like to see added. The first is provenance. Who is the author/contributor of the SPARQL
query? Is there a open license for it, or perhaps public domain? How do I give attribution if I reuse the SPARQL query?
These things matter in a modern [recognition and rewards](https://recognitionrewards.nl/) world where is room for
everyone's talent. A set of good SPARQL queries may be more valuable than a ten-page Jupyter notebook (and the other way
around). So, I [started](https://github.com/sib-swiss/sparql-examples-utils/pull/24)
[writing](https://github.com/sib-swiss/sparql-examples-utils/pull/25)
[patches](https://github.com/sib-swiss/sparql-examples-utils/pull/26). And I created
[a custom jar](https://github.com/BiGCAT-UM/sparql-examples-utils/releases/tag/v2.0.11-tgx-1) so that I can see these
patches in action in [our growing list of SPARQL queries](https://bigcat-um.github.io/sparql-examples/)
(here [a WikiPathways query](https://bigcat-um.github.io/sparql-examples/examples/WikiPathways/002.html)):

![](/assets/images/sparql-examples-tgx.png)

I started collecting SPARQL queries for [ChEMBL](https://bigcat-um.github.io/sparql-examples/examples/ChEMBL/),
[WikiPathways](https://bigcat-um.github.io/sparql-examples/examples/WikiPathways/), and
[VHP4Safety](https://bigcat-um.github.io/sparql-examples/examples/VHP4Safety/). These queries are often part
of other interfaces but we can easily extract the original SPARQL from the Turtle files behind these pages.
