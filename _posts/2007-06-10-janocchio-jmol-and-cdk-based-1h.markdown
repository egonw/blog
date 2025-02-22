---
layout: post
title:  "Janocchio: Jmol and CDK based 1H coupling constant prediction"
date:   2007-06-10
modified_date: 2025-02-22
doi: 10.59350/rxzh8-9yr48
blogger-link: https://chem-bla-ics.blogspot.com/2007/06/janocchio-jmol-and-cdk-based-1h.html
tags: jmol cdk nmr justdoi:10.1002/mrc.2016
---

While looking up a reference for [FirstGlance in Jmol](http://firstglance.jmol.org/), I found [Janocchio](https://sourceforge.net/projects/janocchio/),
a [CDK](http://cdk.sf.net/) and [Jmol](http://www.jmol.org/) based tool for prediction of coupling constants,
[recently published](https://doi.org/10.1002/mrc.2016) in [Magnetic Resonance in Chemistry](http://www3.interscience.wiley.com/cgi-bin/jhome/3767).
It's written by Evans, Bodkin, Baker and Sharman (from [Eli Lilly](http://lilly.com/)) and licensed LGPL. It is one of those rare contributions of
pharmaceutical industry, and I can only deeply appreciate this contribution.

A quote from the article:

> It was therefore decided to create a Java application and applet,
> ‘JAva NOe and Coupling Calculator with Handy Interactive Operation’
> (Janocchio), using the open source libraries of the molecular viewer Jmol
> and the Chemical Development Kit (CDK). It aims to provide a simple and
> intuitive way to calculate both the NOEs and couplings.

Release 1.0.1 of last May uses an old Jmol, and the CDK release from 26 August 2005. A bit outdated, and I am wondering if it would
be a lot of work to integrate this into Bioclipse. [Maybe a summer job](http://wiki.bioclipse.net/index.php?title=SummerOfCode)?
