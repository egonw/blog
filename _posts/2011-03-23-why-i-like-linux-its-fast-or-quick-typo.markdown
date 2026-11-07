---
layout: post
title:  "Why I like Linux, it's fast! Or, a quick typo fix in the CDK."
date:   2011-03-23
blogger-link: https://chem-bla-ics.blogspot.com/2011/03/why-i-like-linux-its-fast-or-quick-typo.html
doi: 10.59350/hwdav-wq744
tags: cdk git
---

Last week there was a short git tutorial, resulting in a [small test patch](https://github.com/cdk/cdk/commit/92609d21ec15586cb2337c389e5083f2c653901d)
(feel free to ping me, if you like git training for the CDK too). Gaev some
commit and review fame to [Jules](http://www2.cmbi.ru.nl/who-and-where/staff/142/)
and [Gilleain](http://gilleain.blogspot.com/). I ran onto another 'Contructs'
typo today, and decided to fix it. Linux is fast, and writing this blog post
took more time to fix it:

<pre>$ <a href="http://www.kernel.org/pub/software/scm/git/docs/git-checkout.html">git checkout</a> -b 266-14x-typo cdk-1.4.x
$ grep -ri Contructs src/main | cut -d':' -f1 | \\
  uniq | xargs replace Contructs Constructs --
$ <a href="http://www.kernel.org/pub/software/scm/git/docs/git-format-patch.html">git format-patch</a> -1
</pre>

Patch report is [here](https://sourceforge.net/tracker/?func=detail&aid=3237110&group_id=20024&atid=320024).
