---
layout: post
title:  "CDK Literature #5"
date:   2008-07-26
blogger-link: https://chem-bla-ics.blogspot.com/2008/07/cdk-literature-5.html
doi: 10.59350/bsv98-6bz80
tags: cdk justdoi:10.1093/bioinformatics/btn181 justdoi:10.1016/j.pnmrs.2007.04.003
  justdoi:10.1021/ci700334f justdoi:10.1093/bioinformatics/btm578
  justdoi:10.1016/j.jmb.2007.10.065
---

Time flies. Another CDK Literature (see also [#1](http://chem-bla-ics.blogspot.com/2007/01/cdk-literature-1.html),
[#2](http://chem-bla-ics.blogspot.com/2007/07/cdk-literature-2.html), [#3](http://chem-bla-ics.blogspot.com/2008/01/cdk-literature-3.html),
[#4](http://chem-bla-ics.blogspot.com/2008/01/cdk-literature-4.html)). Quite a few papers have been published again,
and I'll briefly discuss a few of them.

## Detection of IUPAC names
Klinger et al. have written a paper on detection of IUPAC names. As long as semantic markup languages are not the default,
this remains important. Remaining problems include correctly finding boundaries in summaries of chemical. The
[CDK](http://cdk.sf.net/) has been used to create [SMILES](http://www.opensmiles.org/).
*Roman Klinger, Corinna Kolárik, Juliane Fluck, Martin Hofmann-Apitius, Christoph M. Friedrich, Detection of IUPAC and
IUPAC-like chemical names, Bioinformatics 2008 24(13):i268-i276; doi:[10.1093/bioinformatics/btn181](https://doi.org/10.1093/bioinformatics/btn181)*

## Structure elucidation
Elyashberg, [Williams](http://www.chemspider.com/blog/) and Martin wrote a review on structure elucidation and discuss
[Steinbeck](http://www.steinbeck-molecular.de/steinblog/)'s Seneca software, which uses components of the CDK, though
the CDK is not directly mentioned.
*M.E. Elyashberg, A.J. Williams, G.E. Martin, Computer-assisted structure verification and elucidation tools in NMR-based
structure elucidation, Progress in Nuclear Magnetic Resonance Spectroscopy, 2008, 53(1-2):1-104,
doi:[10.1016/j.pnmrs.2007.04.003](https://doi.org/10.1016/j.pnmrs.2007.04.003)*

## Opensource Distributed Chemical Computing
Karthikeyan et al. have published [ChemStar](http://moltable.ncl.res.in/chemstar/), an opensource distributed chemical
computing system, build on top the Java Remote Method Invocation architecture, used by the original Seneca too. The
CDK paper and a [Fechner/Guha's CDK News](http://prdownloads.sourceforge.net/cdk/cdknews3.2.pdf?download) paper are
cited in relation to a ChemStar application of benchmarking QSAR descriptors. The article does not seem to mention
the opensource license, nor have I yet found a source package download.
*M. Karthikeyan, S. Krishnan, A.K. Pandey, A. Bender, A. Tropsha, Distributed Chemical Computing Using ChemStar:
An Open Source Java Remote Method Invocation Architecture Applied to Large Scale Molecular Data from PubChem,
J. Chem. Inf. Model., 48 (4), 691–703, 2008. [10.1021/ci700334f](https://doi.org/10.1021/ci700334f)*

## Taverna's APIConsumer
Taverna has several means of making functionality available to the workflow engine. SOAP and BioMoby are two
prominent ones. The APIConsumer is another one, and described in this paper. The
[CDK-Taverna](http://www.cdk-taverna.de/) project lead by [Thomas Kuhn](http://cdktaverna.wordpress.com/),
is mentioned as another project that uses this approach.
*Peter Li, Tom Oinn, Stian Soiland, Douglas B. Kell, Automated manipulation of systems biology models using
libSBML within Taverna workflows, Bioinformatics 2008 24(2):287-289, doi:[10.1093/bioinformatics/btm578](https://doi.org/10.1093/bioinformatics/btm578)*

## Docking for Substrate Identification
Favia uses docking to recognize interesting substrates for short-chain dehydrogenases/reductases. The CDK's
fingerprinter is used to describe intermolecular similarity, by calculating the Tanimoto distances between the
bit strings.
*Angelo D. Favia1, Irene Nobeli, Fabian Glaser, Janet M. Thornton, Molecular Docking for Substrate Identification:
The Short-Chain Dehydrogenases/Reductases, Journal of Molecular Biology, 2008, 375(3):855-874,
doi:[10.1016/j.jmb.2007.10.065](http://dx.doi.org/10.1016/j.jmb.2007.10.065)*
