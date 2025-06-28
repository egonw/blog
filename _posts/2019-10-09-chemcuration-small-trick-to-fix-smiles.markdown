---
layout: post
title:  "ChemCuration: a small trick to fix the SMILES of glucuronides"
date:   2019-10-09
blogger-link: https://chem-bla-ics.blogspot.com/2019/10/chemcuration-small-trick-to-fix-smiles.html
doi: 10.59350/preah-ehh72
tags: chemistry curation wikidata wikipathways smiles
image: /assets/images/Screenshot_20191008_144049.png
---

<span style="width: 40%; display: block; margin-left: auto; margin-right: auto; float: right">
<img src="/assets/images/Screenshot_20191008_144049.png" /> <br />
Glucuronide functional group.
</span>

Now that the [ChemCuration 2019](https://chemcuration.github.io/chemcuration2019/) online poster conference is nearing, and
my upcoming talks about chemistry in [Wikidata](https://wikidata.org/) (also needing curation), and the much longer process
of curation of metabolite (-like) structures in [WikiPathways](https://wikipathways.org/), I decided that something I
tweeted earlier this week is actually quite useful, and therefore something I should really write up in my lab notebook.

[Glucuronide](https://en.wikipedia.org/wiki/Glucuronide) is an example (biological) functional group. And there are several
databases that represent the stereochemistry now always correct. That is an interoperability (and thus FAIR) problem.
Correcting this is not trivial, particularly if you have to redraw the same glucuronide group again and again.

So, not looking forward to that, I invested a bit of time to find a [SMILES](http://opensmiles.org/) trick. What if I had
a SMILES snippet that I could easily copy/paste and attach to the SMILES of the chemical structure it is attached to? Here
goes.

```
O1[C@H](C(O)=O)[C@H]([C@H](O)[C@@H](O)[C@@H]1O9)O.
```

I just realized that [the original 3 I used](https://twitter.com/egonwillighagen/status/1181573810543321088) can better be
a `9`, which is less likely to occur in the SMILES of the rest of the molecule. The period at the end is also deliberate.
That way, I can just copy past the SMILES of the rest directly after that period. Then I get a disconnected structure, but
I only have to put a 9 next to the atom that is binding to the glucuronide. So, let's see the R group is methane, I get:

```
O1[C@H](C(O)=O)[C@H]([C@H](O)[C@@H](O)[C@@H]1O9)O.C9
```

Now, next stop: `CoA` and other common biological tags.
