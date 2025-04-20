---
layout: post
title:  "Comparing JUnit test results between CDK trunk/ and a branch"
date:   2007-11-07
modified_date: 2025-04-20
blogger-link: https://chem-bla-ics.blogspot.com/2007/11/comparing-junit-test-results-between.html
doi: 10.59350/zs3tv-pp865
tags: cdk junit
---

I have started using branches for non-trivial patches, like removing the HückelAromaticityDetector, in favor of the
[new CDKHückelAromaticityDetector <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/11/06/evidence-of-aromaticity.html). I am doing
this in my personal [remove-non-cdkatomtype-code](http://cdk.svn.sf.net/svnroot/cdk/branches/egonw/remove-non-cdkatomtype-code/)
branch, where I can quietly work on the patch until I am happy about it. I make sure to keep it synchronized with
trunk with regular `svn merge` commands.

Now, the goal is that my branch only fixed failing JUnit tests, not that it creates new regressions. To compare the
results between two versions of the [CDK](), I use these commands:

```
$ cd cdk/trunk/cdk
$ ant -lib develjar/junit-4.3.1.jar -logfile ant.log test-all
$ cd ../../branches/egonw/remove-non-cdkatomtype-code/
$ ant -lib develjar/junit-4.3.1.jar -logfile ant.log test-all
$ cd ../../..
$ grep Testcase branches/egonw/remove-non-cdkatomtype-code/reports/*.txt | cut -d':' -f2,3 > branch.results
$ grep Testcase trunk/cdk/reports/*.txt | cut -d':' -f2,3 > trunk.results
$ diff -u trunk.results branch.results
```

The last diff commands gives me a quick overview of what has changed. See get the statistics, I can do:

```
$ diff -u trunk.results branch.results | grep "^-Testcase" | wc -l
$ diff -u trunk.results branch.results | grep "^+Testcase" | wc -l
```

The first gives me the number of JUnit tests which are now no longer failing, while the second
gives me the number of tests which are new fails. Ideally, the second is zero. Unfortunately, not yet the case :)
