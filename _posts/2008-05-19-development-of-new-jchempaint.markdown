---
layout: post
title:  "Development of the new JChemPaint"
date:   2008-05-19
blogger-link: https://chem-bla-ics.blogspot.com/2008/05/development-of-new-jchempaint.html
doi: 10.59350/1bbpk-5ye80
tags: jchempaint cdk bioclipse
image: /assets/images/jchempaintNew.png
---

A quick screenshot, after some work on the JChemPaint code based on [CDK](http://cdk.sf.net/) `trunk/`. Nothing much to see, but a rather small
code base, which is good. Today, I have set up [cdk/cdk/trunk/](http://cdk.svn.sourceforge.net/viewvc/cdk/cdk/trunk/) and
[cdk/jchempaint/trunk](http://cdk.svn.sourceforge.net/viewvc/cdk/jchempaint/trunk/) as Eclipse plugins, allowing the second to depend on the first.
So, no more use of svn:externals. This is what it now looks like, and basically formalizes the end result of
[Niels](http://progz-jchem.blogspot.com/)' work of last year:

![](/assets/images/jchempaintNew.png)

A possible spin of is that [Bioclipse](http://bioclipse.net/)2 can use these plugins too, instead of defining plugins itself.

To reproduce the above screenshot, just import `cdk/cdk/trunk and` `cdk/jchempaint/trunk` into Eclipse, and run the `TestEditor` from the
JChemPaint plugin.
