---
layout: post
title:  "A JChemPaint Hack-a-thon"
date:   2007-09-02
blogger-link: https://chem-bla-ics.blogspot.com/2007/09/jchempaint-hack-thon.html
tags: jchempaint doi:10.1021/CI025584Y
---

[Niels](http://progz-jchem.blogspot.com/) and I held a JChemPaint [hack-a-thon](http://wiki.cubic.uni-koeln.de/cdkwiki/doku.php?id=jcp_hack_20070902)
today ([the IRC log](http://moritz.faui2k3.org/irclog/out.pl?channel=cdk;date=2007-09-02)). We had a quite ambitious agenda:

* make the renderer modular
* make the controller modular
* make a controller interface with Swing + SWT implementations

All this to make the [JChemPaint](http://www.mdpi.org/molecules/html/50100093.htm) editor module of the [CDK](https://doi.org/10.1021/ci025584y)
more easily integrate with non-Swing widget environments. We achieved to make about 50% of these goals: the controller is now modular, and the
[Controller2DHub](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/controller/Controller2DHub.java) (soon going to deprecate
the old [Controller2D](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/controller/Controller2D.java)) no longer receives
Swing mouse events, but local events by implementing the new [IMouseEventRelay](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/controller/IMouseEventRelay.java)
interface.

Controller modules implement the new [IController2DModule](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/controller/IController2DModule.java)
interface. This modularization allows a clean up of CDK source code, making it more readable and easier to maintain. This was attempted in the past by setting up
an [AbstractController2D](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/controller/AbstractController2D.java) and a
[SimpleController2D](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/controller/SimpleController2D.java). The new approach,
however, allows to make separate modules for each rendering mode, which are independent anyway. The old code still needs to be ported to the
new architecture, and this is expected to happen in the next two weeks.

Another clean up in the architecture is that the controller modules no longer directly act on the IChemModel, but use a new (badly named)
[IChemModelRelay](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/controller/IChemModelRelay.java) interface, making
the architecture more closely adhere to the [MVC concept](http://en.wikipedia.org/wiki/Model-view-controller). The IChemModelRelay API
currently contains only two methods, but this is expected to expend considerably, because all current JChemPaint edit actions will
have to be passed via this interface.

If you want to give the new architecture a test run, look for the [TestEditor](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/renderer/progz/TestEditor.java)
application. At the time of writing, it uses a demo module, the [DumpClosestObjectToSTDOUTModule](http://cdk.svn.sf.net/svnroot/cdk/trunk/cdk/src/org/openscience/cdk/renderer/progz/DumpClosestObjectToSTDOUTModule.java),
which dumps the nearest IAtom to STDOUT.
