---
layout: post
title:  "Scintilla and Postgenomic.com on Linux 2.6.17+"
date:   2007-11-12
blogger-link: https://chem-bla-ics.blogspot.com/2007/11/scintilla-and-postgenomiccom-on-linux.html
doi: 10.59350/bw5s8-f0t43
tags: linux postgenomic
---

That's why blogging works! I reported last Friday on [using my Wii for reading](http://chem-bla-ics.blogspot.com/2007/11/using-nintendo-wii-for-serious-science.html)
[Scintilla](http://scintilla.nature.com/) and [Postgenomic.com](http://www.postgenomic.com/).
[Alf replied](http://chem-bla-ics.blogspot.com/2007/11/using-nintendo-wii-for-serious-science.html#c9163469498026561308):

> It is the Linux kernel, yes: TCP window scaling was switched on by default in kernels since about a year ago
> (and in Vista too, I think), and one of our routers or firewalls doesn't like it. We're trying to get them
> upgraded, but it takes a while...

Ah, the trick word: TCP windows scaling. A quick google turned up a [workaround in John's Tidbits blog](http://inodes.org/blog/2006/09/06/tcp-window-scaling-and-kernel-2617/):

> There are 2 quick fixes. First you can simply turn off windows scaling all together by doing
>
> echo 0 > /proc/sys/net/ipv4/tcp_window_scaling
>
> but that limits your window to 64k. Or you can limit the size of your TCP buffers back to pre 2.6.17 kernel values which means a wscale value of about 2 is used which is acceptable to most broken routers.
>
> echo "4096 16384 131072" > /proc/sys/net/ipv4/tcp_wmem
> echo "4096 87380 174760" > /proc/sys/net/ipv4/tcp_rmem
>
> The original values would have had 4MB in the last column above which is what was allowing these massive windows.
>
> In a thread somewhere which I can’t find anymore Dave Miller had a great quote along the lines of
>
> “I refuse to workaround it, window scaling has been part of the protocol since 1999, deal with it.”

That worked for me. I think Dave Miller is right, but can't resist reading Scintilla and Postgenomic.com on my desktop too ;)
