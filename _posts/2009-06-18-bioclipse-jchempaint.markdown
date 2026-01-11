---
layout: post
title:  "Bioclipse-JChemPaint"
date:   2009-06-18
blogger-link: https://chem-bla-ics.blogspot.com/2009/06/bioclipse-jchempaint.html
doi: 10.59350/4ctw6-teq86
tags: bioclipse jchempaint cdk
image: /blog/assets/images/Picture_4.png
---

The Uppsala and EBI CDK-teams have been working hard on finishing the rewrite of [JChemPaint](http://jchempaint.sf.net/) I started with Niels earlier.
While the EBI-team focused on the applet (and Swing application), the Uppsala team, obviously, focused on the SWT side, for integration into
[Bioclipse](http://bioclipse.net/). The new JChemPaint is reaching a useful state, and below is a quick update screenshot something Arvid has been
working on:

![](/blog/assets/images/Picture_4.png)


It shows a periodic table which allows you to drag any element type onto the JChemPaint drawing area. It is using regular drag and drop functionality,
allowing you to create any arbitrary pseudo atom too. This also paves the way for a template system, allowing you to drag-n-drop fragments onto an
active JChemPaint editor.
