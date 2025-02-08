---
layout: post
title:  "CiTO for blog citations"
date:   2025-02-08
doi: 10.59350/cnt8a-3v351
tags: cito blog cito:extends:10.59350/er1mn-m5q69 json
---

This is mostly a test, but if it turns out the way I hope it will, likely after a few iterations, it adds
support in my blog for CiTO intent annotations to the DOIs I cite. I
[pondered about the earlier](https://chem-bla-ics.linkedchemistry.info/2024/12/30/fair-blog-to-blog-citations.html).
In the [JSON Feed](https://www.jsonfeed.org/version/1.1/) it should, at least for now, show up like this:

```json
"_references": [
  {
    "url": "https://doi.org/10.59350/er1mn-m5q69",
    "doi": "10.59350/er1mn-m5q69",
    "cito": [ "extends" ]
  }
]
```
