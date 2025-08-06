---
layout: post
title:  "Performance: C, C++, C#, Java, Perl and Python"
date:   2008-02-05
modified_date: 2025-07-30
blogger-link: https://chem-bla-ics.blogspot.com/2008/02/performance-c-c-c-java-perl-and-python.html
doi: 10.59350/kktab-e6159
tags: java justdoi:10.1186/1471-2105-9-82
image: /assets/images/alignment.gif
---

Mathieu Fourment (et al.) just published a paper on some performance testing on 6 programming languages in
[BMC Bioinformatics](http://www.biomedcentral.com/bmcbioinformatics): *A comparison of common programming languages used
in bioinformatics* (doi:[10.1186/1471-2105-9-82](https://doi.org/10.1186/1471-2105-9-82)). The below figure is from
the paper, for a sequence alignment exercise (copyright with paper authors, OpenAccess license of journal):

![](/assets/images/alignment.gif)

Nothing shocking, I'd say; Java is similar in performance to C++.

What I'd love to have seen, was the performance of compiled Java too, using the java compiler (*gcj*) which comes with
GCC 4.1.1. No idea why that was left out. One could also question why they did not use the 1.6 JVM of Sun,
which is more faster (see [these results on running the CDK unit tests <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/08/01/cdk-and-java-6-beta.html)).
And, a major omission is Fortran.

Anyway, the authors provide [the source code](http://www.bioinformatics.org/benchmark/), so we can easily test
ourselves the effects of that.

BTW, first post? :) **update:** At least I beat [Carlos](http://cszamudio.spaces.live.com/blog/cns!9BCF6F9D6772B8F5!1742.entry).
