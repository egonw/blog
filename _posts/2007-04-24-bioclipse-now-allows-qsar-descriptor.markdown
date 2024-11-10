---
layout: post
title:  "Bioclipse now allows QSAR descriptor selection"
date:   2007-04-24
blogger-link: https://chem-bla-ics.blogspot.com/2007/04/bioclipse-now-allows-qsar-descriptor.html
tags:
image: /blog/assets/images/bioclipseDescriptorSelection.png
---

In preparation for the [Embrace Workshop for Bioclipse](http://teacher.bmc.uu.se/BioclipseWS07/Welcome.html) in May, I am working on the QSAR functionality of
[Bioclipse](http://www.bioclipse.net/). A nice extension point got set up some time ago, called [DescriptorProvider](http://chem-bla-ics.blogspot.com/2006/11/bioclipse-workshop-short-but.html),
and implemented by plugins to allow calculation of one or more descriptors for the selected molecules. Now, the
[functionality for the resulting matrix](http://chem-bla-ics.blogspot.com/2006/07/matrix-support-in-bioclipse.html) has been around for some time too.

What had not been available yet, was some GUI stuff to select descriptors to calculate, and the actual calculation. While the latter is yet to be
hooked up, the selection of descriptors is now available:

![](/blog/assets/images/bioclipseDescriptorSelection.png)

Interesting here is the use of OWL. CDK's `DescriptorEngine` provides a simple API written by Rajarshi that interfaces to the dictionary support
for OWL (which CDK offers in addition to CML based dictionaries). All CDK descriptors are written up in OWL (the
[source file](http://cdk.svn.sourceforge.net/viewvc/cdk/trunk/cdk/src/org/openscience/cdk/dict/data/descriptor-algorithms.owl?view=markup)
and the [HTML version](http://qsar.sourceforge.net/dicts/qsar-descriptors/index.xhtml)).
You'll notice the weird characters in the screenshot; there something goes wrong with the encoding when reading the OWL.
