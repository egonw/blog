---
layout: post
title:  "MetWare: metabolomics database project started on SourceForge"
date:   2007-11-22
blogger-link: https://chem-bla-ics.blogspot.com/2007/11/metware-metabolomics-database-project.html
doi: 10.59350/j6f3x-a2q13
tags: metabolomics metware justdoi:10.1038/nbt1041 justdoi:10.1007/s11306-007-0070-6
  justdoi:10.1093/bioinformatics/bti525
---

The Applied Bioinformatics at [PRI](http://www.pri.wur.nl/NL/) group where I now work in [Wageningen](http://en.wikipedia.org/wiki/Wageningen)
and the group of [Steffen Neumann](http://www.ipb-halle.de/de/forschung/stress-und-entwicklungsbiologie/forschungsgruppen/bioinformatik-massenspektrometrie/)
in Halle have started the [MetWare](http://metware.sf.net/) project on [Sourceforge](http://sf.net/) to develop
opensource databases for metabolomics data.

The databases design will be based on and ideally compatible with proposed standards like ArMet (DOI:[10.1038/nbt1041](https://doi.org/10.1038/nbt1041))
and those recently written up by the [Metabolomics Standards Initiative](http://msi-workgroups.sourceforge.net/)
(see the issue around DOI:[10.1007/s11306-007-0070-6](https://doi.org/10.1007/s11306-007-0070-6)).

One important design goal is that the project will use [BioMart](http://www.biomart.org/), which will allow easy
integration of the database content in data analysis programs like [Taverna](http://taverna.sf.net/)
and [R](http://www.r-project.org/) using the [biomaRt](http://www.bioconductor.org/packages/2.1/bioc/html/biomaRt.html)
package (see DOI:[10.1093/bioinformatics/bti525](http://dx.doi.org/10.1093/bioinformatics/bti525)).

Though the software will be opensource, it is yet unsure how much data will be open.
