---
layout: post
title:  "Profiling the CDK atom typer"
date:   2008-08-14
blogger-link: https://chem-bla-ics.blogspot.com/2008/08/profiling-cdk-atom-typer.html
doi: 10.59350/9xesf-et382
tags: cdk java
image: /assets/images/loadClassInternal.png
---

I was doing some profiling ([YourKit](http://yourkit.com/) and Eclipse3.4) of the [CDK](http://cdk.sf.net/) atom typer, and it turns out
that most time is spend on the perception of nitrogen atom types, which seems to be caused by the loadClassInternal() method of the JVM
(*java-1.5.0-sun-1.5.0.16* on Ubuntu Hardy):

![](/assets/images/loadClassInternal.png)
