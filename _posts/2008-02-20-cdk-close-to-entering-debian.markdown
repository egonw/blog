---
layout: post
title:  "CDK close to entering Debian"
date:   2008-02-20
blogger-link: https://chem-bla-ics.blogspot.com/2008/02/cdk-close-to-entering-debian.html
doi: 10.59350/dmspa-wyb25
tags: cdk debian
---

[Michael Koch](http://gnu.wildebeest.org/diary-man-di/) (aka man-di) and [Daniel Leidert](http://www.wgdd.de/) (as part of the
[pkg-java team](http://alioth.debian.org/projects/pkg-java/)) have worked on packaging the [CDK](http://cdk.sf.net/). The ran into
some issues, such as the CDK build system not perfectly compatible with the Debian java libraries in */usr/share/java*.
Both detection of the available libraries as well as putting them in the classpath, caused trouble with the
[CDBS](http://build-common.alioth.debian.org/)-based build system wrapping around the [Ant](http://ant.apache.org/)
[build.xml](http://cdk.svn.sourceforge.net/viewvc/cdk/branches/cdk-1.0.x/build.xml?view=log) (note the many commit this weekend ;).

The result is noteworthy: [CDK has entered the Debian NEW queue](http://ftp-master.debian.org/new/cdk_1:1.0.1.91-1.html). This
means that the Debian experts will check that CDK is really ready to enter Debian. Licenses will be checked, for example. This
has been one of my long standing wishes, and I am happy that Michael got around to getting things done. Cheers!
