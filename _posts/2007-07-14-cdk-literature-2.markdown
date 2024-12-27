---
layout: post
title:  "CDK Literature #2"
date:   2007-07-14
blogger-link: https://chem-bla-ics.blogspot.com/2007/07/cdk-literature-2.html
tags: cdk doi:10.1186/1471-2105-8-59 justdoi:10.1021/ac070741j justdoi:10.1186/1471-2105-8-105
  justdoi:10.1002/qsar.200630101 justdoi:10.1021/ci600305h
---

Second in a series of articles summarizing articles that cite one of the main CDK articles for
[CDK News](http://www.cdknews.org/). The [first CDK Literature](http://chem-bla-ics.blogspot.com/2007/01/cdk-literature-1.html)
was already half a year ago, so it was about time.

## Bioclipse

Nothing much I have to say about that. Just [browse my blog](http://chem-bla-ics.blogspot.com/search?q=Bioclipse) and
you'll see that it heavily uses CDK, JChemPaint and Jmol. See also the [Bioclipse blog](http://bioclipse.blogspot.com/). <br />
*Ola Spjuth, Tobias Helmus, Egon Willighagen, Stefan Kuhn, Martin Eklund, Johannes Wagener, Peter Murray-Rust,
Christoph Steinbeck, Jarl Wikberg, Bioclipse: an open source workbench for chemo- and bioinformatics, BMC Bioinformatics,
2007, 8(59), doi:[10.1186/1471-2105-8-59](https://doi.org/10.1186/1471-2105-8-59)*

## Proteomics in 2005/2006

Review article on proteomics which mentions the CDK and JChemPaint in the data analysis section, but it does not cite them.
It does cite the Bioclipse article though. <br />
*Jeffrey Smith, Jean-Philippe Lambert, Fred Elisma, Daniel Figeys, Proteomics in 2005/2006: Developments, applications
and challenges, Analytical Chemistry, 2007, 79(12):4325-4343, doi:[10.1021/ac070741j](https://doi.org/10.1021/ac070741j)*

## Combinatorial Enumeration

Article by Andreas on [SmiLib](http://gecco.org.chemie.uni-frankfurt.de/smilib/index.html) (BSD-like license) which
is library for combinatorial enumeration using building blocks. The CDK is used for the addition of explicit
hydrogens and the creation of MDL SD files. Andreas mentions in the article that the CDK's SMILES parser ignores
stereo chemistry. <br />
*Andreas Schüller, Volker Hänke, Gisbert Schneider, SmiLib v2.0: A Java-Based Tool for Rapid Combinatorial Library
Enumeration, QSAR & Combinatorial Science, 2007, 26(3):407-410, doi:[10.1002/qsar.200630101](https://doi.org/10.1002/qsar.200630101)*

## Molecular Query Language

This article is also from the group of Gisbert. Ewgenij introduces an open standard SMARTS replacement, covered in
[CDK News in 2005](http://chem-bla-ics.blogspot.com/2005/10/cdk-news.html). There is an interface to the CDK, but the
license of the reference implementation makes it impossible to distribute it with the CDK itself. This is rather
unfortunate, because if it would have been possible, a number of implementations in the CDK, such as atom type
perception, could be based on MQL. See also [Jörgs blog on MQL](http://miningdrugs.blogspot.com/2007/01/molecular-query-languages-flexmol-mql.html). <br />
*Ewgenij Proschak, Jörg Wegner, Andreas Schüller, Gisbert Schneider, Uli Fechner, J. Chem. Inf. Model., 2007, 47(2):295-301,
doi:[10.1021/ci600305h](https://doi.org/10.1021/ci600305h)*

## Golden Rules in Mass Spectroscopy

Tobias Kind wrote about structure elucidation using mass spectra, and discusses MolGen and CDK's `DeterministicStructureGenerator`,
and mentions problems with both generators. He has been in contact with the CDK and recently did
[extensive tests](http://sourceforge.net/tracker/index.php?func=detail&aid=1743861&group_id=20024&atid=120024). <br />
*Tobias Kind and Oliver Fiehn, Seven Golden Rules for heuristic filtering of molecular formulas obtained by accurate mass
spectrometry, BMC Bioinformatics, 2007, 8:105, doi:[10.1186/1471-2105-8-105](https://doi.org/10.1186/1471-2105-8-105)*
