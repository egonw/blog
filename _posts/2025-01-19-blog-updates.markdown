---
layout: post
title:  "Blog updates"
doi: 10.59350/cf885-kee54
date:   2025-01-19
modified_date: 2025-01-19
tags: blog justdoi:10.53731/m9d5v-xmr74 justdoi:10.53731/d6vdvbt-tffmezj justdoi:10.53731/3c6pm-xbp04
  justdoi:10.7717/peerj-cs.214
image: /assets/images/rs_archives.png
---

[One-and-a-half years ago](https://doi.org/10.59350/nfqxs-qs982) I started migration my blog from blogger.com to a Markdown and Git-based blog.
It has been a fascinating journey that I do not regret. I love being back in control and not reliant on features of some
*content management system*. I learned so much along the way, including [Jekyll](https://jekyllrb.com/) and [Liquid](https://jekyllrb.com/docs/liquid/)
to start with, but also [Fontawesome](https://doi.org/10.59350/nfqxs-qs982) (for better or worse)m and [Goatcounter](https://doi.org/10.59350/8x2f1-h6d21)
for GDPR-compatible and privacy-first impact tracking.

But I also greatly enjoy the interaction with the [Rogue Scholar](https://rogue-scholar.org/) team (particularly [Martin Fenner](https://blog.front-matter.io/)).
First, it has great to be listed on (something like) a blog planet, and to read the collection of blog posts, of course! BTW, also thanks to
[Lars Willighagen](https://larsgw.blogspot.com/) who joined Rogue Scholar earlier than I did. This interaction allowed me
to take part in various innovations, like archiving and getting DOIs for blog posts, archiving entire blogs (see doi:[10.53731/3c6pm-xbp04](https://doi.org/10.53731/3c6pm-xbp04) and
doi:[10.59350/vjvdy-6p110](https://doi.org/10.59350/vjvdy-6p110)), [cite blog posts with DOIs](https://doi.org/10.59350/er1mn-m5q69),
references in blogs (e.g. see doi:[10.53731/m9d5v-xmr74](https://doi.org/10.53731/m9d5v-xmr74)),
[JSON Feed](https://www.jsonfeed.org/) (see doi:[10.53731/d6vdvbt-tffmezj](https://doi.org/10.53731/d6vdvbt-tffmezj);
[last 10](https://chem-bla-ics.linkedchemistry.info/feed.json) or [full archive](https://chem-bla-ics.linkedchemistry.info/archive.json)),
[ORCID support](https://doi.org/10.59350/1cg8w-qth68),
and if things goes well, [preregistration of blogpost DOIs with commonmeta](https://doi.org/10.53731/m9d5v-xmr74).

The JSON Feed is interesting. For example, it includes more specific support for references, something that any scholarly
blogger should look at:

```json
{
  ...
  "_references": [
    { "url": "https://doi.org/10.7717/peerj-cs.214" },
    { "url": "https://doi.org/10.5281/ZENODO.14562484" },
    { "url": "https://doi.org/10.5281/ZENODO.14562504" }
  ],
  ...
}
```

And the citations get propagated and show up like this in the Rogue Scholar archives:

![](/assets/images/rs_archives.png)

I think we also see the ongoing innovation in action. Previously, this is the first time I see the "Unknown title",
but from the JSON it is obviously missing too. One thing to remember here, is that currently my blog does
not have this metadata, and when you read my blog, it is [citation.js](https://citation.js.org/)
(doi:[10.7717/peerj-cs.214](https://doi.org/10.7717/peerj-cs.214)) that looks up the metadata using the DOI and adds
that to the blog post in your browser. Doing this when the HTML is being generated is something
I still need to learn how to do that.
