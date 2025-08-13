---
layout: post
title:  "Integrating comments via the Fediverse"
date:   2025-08-13
doi: 10.59350/r4mbg-yyb06
tags: blog cito:usesMethodIn:10.59350/pr6zx-10397 mastodon
image: /assets/images/fedicomments2.png
comments:
  host: social.edu.nl
  username: egonw
  id: 115020983724055256
---

My [old blog](https://chem-bla-ics.linkedchemistry.info/2023/07/27/archiving-and-updating-my-blog.html)
had (has) comments via the Blogger.com platform, but I did not have anything for the new blog. A couple of options
are used, like Disqus and [comments via GitHub](https://skerdiberberi.com/blog/utterances). However, these both
have the downside of a [vendor lock-in](https://en.wikipedia.org/wiki/Vendor_lock-in) and the whole point of moving
my blog was to break out from such lock-ins.

Almost half a year ago I read [this post](https://tzovar.as/commenting/) by [Bastian](https://tzovar.as/about/)
about, well, *integrating comments via the Fediverse*. He explains a solution worked out in 2021 by
[Robert W. Gehl](https://fossacademic.tech/2021/12/16/CommentsTest.html). I liked this idea and had the blog
post bookmarked for some time. But I did not get around working it [out until Monday](https://github.com/egonw/blog2/commit/006b41822b46a935d159ca276cfab3a6a3b00e40).
I had to do some [CSS fixing](https://github.com/egonw/blog2/commit/cc4f81db22d69d928352ee06ecad889286ae27bf)
after that, but I can now have fediverse-powered comments in my blog by adding a bit of YAML, like this:

```yaml
comments:
  host: social.edu.nl
  username: egonw
  id: 115009169485329450
```

I have annotated a few posts now, and will have some curation to do. But when I have made such a link,
the this is what it will look like by default:

![](/assets/images/fedicomments1.png)

After clicking the button (I want to style that a bit better), it shows the fediverse reactions:

![](/assets/images/fedicomments2.png)

There are some things that I like to improve. For example, clicking the *reply*, *boost*, or *like*
buttons doesn't do anything yet. But there is code around that will show a popup box to redirect you
to your home fediserver. Let's see how this evolves.
