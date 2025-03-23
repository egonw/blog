---
layout: post
title:  "QSAR plugin for Bioclipse getting in shape"
date:   2007-06-27
blogger-link: https://chem-bla-ics.blogspot.com/2007/06/qsar-plugin-for-bioclipse-getting-in.html
tags: bioclipse qsar cdk ambit
image: /blog/assets/images/bioQSAR.png
---

Over the last few weeks I continued the work on getting (descriptor-based) [QSAR](http://en.wikipedia.org/wiki/QSAR)/QSPR implemented in
[Bioclipse](http://www.bioclipse.net/). [JOELib](http://joelib.sf.net/) (GPL) and the [CDK](http://cdk.sf.net/) (LGPL) being two prominent
opensource engines that can calculate molecular descriptors, and [AMBIT](http://ambit.acad.bg/) a front-end.

To be able to do QSAR/QSPR model building from start to end in Bioclipse, I worked in April
[on an architecture for selecting descriptors](http://chem-bla-ics.blogspot.com/2007/04/bioclipse-now-allows-qsar-descriptor.html).
Being busy with so many things, it took me some time to get around to completing that, but here are the screenshots:

![](/blog/assets/images/bioQSAR1.png)

The funny characters and the whitespace is gone. Right now, it still only lists one provider, but I plan to add JOELib plugin soon.
The list of actual descriptors is provided by the extension.

What Bioclipse then does, is have the extension calculate the descriptor values for the selected `CDKResource` in the BioNavigator
using the selected descriptors. This will then create a new `MatrixResource` in the Bioclipse workspace (currently called
qsarResult.jam), and which is opened in the Matrix editor:

![](/blog/assets/images/bioQSAR1.png)

There is still enough work left to do. For example, the columns are not yet labeled according to the descriptor name, and
selecting more then one `CDKResource` in the navigator does not give a multirow matrix yet.
