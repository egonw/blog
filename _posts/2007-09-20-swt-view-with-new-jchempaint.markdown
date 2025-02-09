---
layout: post
title:  "SWT View with the new JChemPaint"
date:   2007-09-20
blogger-link: https://chem-bla-ics.blogspot.com/2007/09/swt-view-with-new-jchempaint.html
tags: bioclipse jchempaint
image: /blog/assets/images/swtJCP.png
---

The second [Programmeerzomer](http://programmeerzomer.nl/) and the second summer of code for me, will end tomorrow with a presentation of
[Niels on his new JChemPaint code](http://progz-jchem.blogspot.com/). The summer is over before you know it. One of the goals was
making the JChemPaint editor Swing independent and more easy to integrate with SWT widgets.

So, I hacked up the last bits of Bioclipse code. However, the CDK version in the net.bioclipse.cdk is still CDK 1.0, and Niels'
requires CDK trunk/. So I copied in the `cdk.jar` and `cdk-jchempaint.jar` from `trunk/` into the *net.bioclipse.cdk.progz*
plugin, only to find out that that gives binary problems: the plugin would still depend on *net.bioclipse.cdk.ui* which depends
on the CDK 1.0 plugin...

![](/blog/assets/images/swtJCP.png)

To get something going, I removed the dependency on CDKResource. So, the screenshot above is a bit artificial: it shows a
static picture and the View does not react on ISelectionEvent's. But that is a Bioclipse/CDK issue, and not caused by Niels'
code. Additionally, it does not handle mouse events or so. For that, I need to make it an SWT Editor first.
