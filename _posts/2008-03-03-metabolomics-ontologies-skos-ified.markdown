---
layout: post
title:  "Metabolomics Ontologies: SKOS-ified the ArMet specification"
date:   2008-03-03
modified_date: 2025-08-17
blogger-link: https://chem-bla-ics.blogspot.com/2008/03/metabolomics-ontologies-skos-ified.html
doi: 10.59350/ne3f5-6kt41
tags: bioclipse metware ontology semweb owl xml
---

The [MetWare project <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/11/22/metware-metabolomics-database-project.html)
is going to make use of ontology
technologies to control the content of the database, and a first step is to convert [our MetWare database design](http://metware.svn.sourceforge.net/viewvc/metware/trunk/metware/design/)
into something using a formal ontology language. I have played with [OWL](http://en.wikipedia.org/wiki/Web_Ontology_Language)
in the past (see for example
[its use in Bioclipse <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/04/24/bioclipse-now-allows-qsar-descriptor.html)),
but was not overly happy with it in all situations.

Then I read about [SKOS](http://en.wikipedia.org/wiki/SKOS), Simplified Knowledge Organisation System. Unlike OWL, SKOS is less strict on relations
between concepts being marked up. Often these concepts are loosely bound, instead following a strict *is_a* hierarchy.
[ArMet](http://www.armet.org/) is a Metabolomics knowledge system which does not have a strong hierarchy, and SKOS seemed to me to be the most
suitable markup candidate. So, I SKOS-ified the ArMet specification, resulting in [this rather simple document](http://metware.svn.sourceforge.net/viewvc/*checkout*/metware/trunk/metware/design/onto/armet.skos?revision=HEAD&content-type=text%2Fxml).
The document is SKOS, but has an associated [skos2html.xsl](http://metware.svn.sourceforge.net/viewvc/*checkout*/metware/trunk/metware/design/onto/skos2html.xsl?revision=HEAD&content-type=text%2Fxml)
[XSLT stylesheet](http://en.wikipedia.org/wiki/XSLT), so that Firefox converts it to XHTML on the fly.

An entry looks like:

```xml
<skos:Concept rdf:about="GenotypeID">
  <skos:prefLabel>genotypeID</skos:prefLabel>

  <skos:definition>A unique identifier for the genotype.</skos:definition>
  <skos:broader rdf:about="GenotypeProperty"/>
</skos:Concept>
```

The full SKOS specification allows capturing much of what we want to do, including i18n via the label system, loos hierarchical relations via
*skos:broader*, and the concepts of *skos:Collection* to aggregate concepts. Where needed, it allows borrowing from other languages. For example,
to link concepts from MetWare to the original ArMet specification *owl:sameAs* can be used.
