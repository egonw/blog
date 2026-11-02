---
layout: post
title:  "Java Performance..."
date:   2011-03-08
blogger-link: https://chem-bla-ics.blogspot.com/2011/03/java-performance.html
doi: 10.59350/bpym4-p7194
tags: java
---

[Java virtual machines](http://en.wikipedia.org/wiki/Java_Virtual_Machine) are
weird things. They can optimize code on the fly, tuning how it runs the code,
depending on the data it processes. That is why it can be faster than C and
C++, or even faster then Fortran. Those are all pre-optimized based on the code,
not based on the workload. But, at the same time, performance is tricky, and
your best friend is a good profiler (like [YourKit](http://www.yourkit.com/),
which is free for Open Source use).

Reading about Java performance now and then is useful. It's keep you aware of
the things that matter and that don't. Via [Planet Eclipse](http://planeteclipse.org/planet/),
I read a couple of posts from the [Java Persistence Performance blog](http://java-persistence-performance.blogspot.com/).
And today [I learned](http://java-persistence-performance.blogspot.com/2011/03/jvm-performance-part-iii-concurrent.html)
that the [JIT compiler](http://en.wikipedia.org/wiki/Just-in-time_compilation)
can in fact remove the threading support in [Hashtable](http://download.oracle.com/javase/6/docs/api/java/util/Hashtable.html)
when only one thread is used.
