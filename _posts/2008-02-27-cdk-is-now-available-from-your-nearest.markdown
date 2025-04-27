---
layout: post
title:  "CDK is now available from your nearest Debian mirror"
date:   2008-02-27
blogger-link: https://chem-bla-ics.blogspot.com/2008/02/cdk-is-now-available-from-your-nearest.html
doi: 10.59350/g5s78-zqk90
tags: cdk debian
image: /blog/assets/images/cdkbsh.png
---

[Some days have passed](http://chem-bla-ics.blogspot.com/2008/02/cdk-close-to-entering-debian.html), and the Debian mirrors have
now picked up the [CDK](http://cdk.sf.net/) package (unstable only so far), allowing you to `sudo aptitude install libcdk-java` from
your favorite local mirror. The details are available from this [packages.debian.org/libcdk-java](http://packages.debian.org/libcdk-java)
page. The fact that it is listed as contrib is a small mistake; the package is really *main* material.

Now, also make sure to install BeanShell (`sudo aptitude install bsh`), which allows you to start scripting the CDK. For example,
consider this simple script:

```java
import org.openscience.cdk.Atom;
Atom atom = new Atom("C");
print(atom);
```

Save this as content of a file `simpleExample.bsh`, and run the bsh program to run the script. You will have to set the
`CLASSPATH`, so the full command looks like this on my Linux desktop:

```shell
CLASSPATH=/usr/share/java/cdk-interfaces.jar:/usr/share/java/cdk-core.jar:/usr/share/java/cdk-data.jar:/usr/share/java/vecmath1.2-1.14.jar bsh simpleExample.bsh
```

A wrapper script `cdkbsh` that adds the CLASSPATH seems desirable here :) But you get the point.

Interestingly, BeanShell also comes with a graphical user interface, as well as a command line based scripting environment.
Both make perfect set ups for quickly testing some code. The GUI version `xbsh` looks like (don't forget to set the CLASSPATH):

![](/blog/assets/images/cdkbsh.png)
