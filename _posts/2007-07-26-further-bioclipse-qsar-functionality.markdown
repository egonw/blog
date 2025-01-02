---
layout: post
title:  "Further Bioclipse QSAR functionality development"
date:   2007-07-26
blogger-link: https://chem-bla-ics.blogspot.com/2007/07/further-bioclipse-qsar-functionality.html
tags: cdk qsar bioclipse joelib
image: /blog/assets/images/qsarJob.png
---

I had some time to [work some more on the QSAR functionality <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/06/27/qsar-plugin-for-bioclipse-getting-in.html)
in [Bioclipse](http://www.bioclipse.net/). There is still much to do, but it is getting there. The calculation of a QSAR descriptor data matrix

![](/blog/assets/images/qsarJob.png)

This screenshot shows that multi-resource selection is now working, and that the calculation is now a Job. The resulting matrix looks like:

![](/blog/assets/images/qsarJob1.png)

Things that remain to be done:

* work on a SDF resource
* a graph view for the matrix
* [R](http://www.r-project.org/) functionality for the matrices
* [JOELib](http://joelib.sf.net/) support
