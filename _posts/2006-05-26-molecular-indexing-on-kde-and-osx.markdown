---
layout: post
title:  "Molecular indexing on the KDE and OS/X desktops"
date:   2006-05-26
modified_date: 2025-02-15
doi: 10.59350/51khs-pyh66
blogger-link: https://chem-bla-ics.blogspot.com/2006/05/molecular-indexing-on-kde-and-osx.html
tags: kde cheminf inchi
---

[Geoff Hutchinson](http://geoffhutchison.net/about/) [blogged](http://geoffhutchison.net/blog/archives/2006/05/25/chemspotlight-indexing-chemistry-on-your-mac/)
about his [OS/X ChemSpotLight](http://geoffhutchison.net/projects/chem/), an indexing tool for chemistry documents. It's like,
but more advanced than, the [kfile_chemical](http://www.kde-apps.org/content/show.php?content=28995) and
[Kat](http://kat.mandriva.com/) I have been working on (with others) for the
[KDE <i class="fa-solid fa-recycle fa-xs"></i>](https://kde.org/) desktop (see earlier blog items).

ChemSpotLight currently does more than the KDE tools: it adds Spotlight comments. I assume these are like the Linux
[extended attributes](http://wiki.linuxquestions.org/wiki/Extended_attributes), used for example by
[Beagle](http://beaglewiki.org/Main_Page). For example, a file indexed by Beagle will have extended attributes like:

```
# file: home/egonw/m43.jpg
user.Beagle.AttrTime="20060509071950"
user.Beagle.Filter="003 Beagle.Filters.FilterJpeg"
user.Beagle.Fingerprint="02 xHn5Yi58x0eoI8ityBYkUw"
user.Beagle.MTime="20031225151016"
user.Beagle.Uid="YcIW72RWyk+K5FbGnpv4iA"
```

This is very suitable for adding metadata, like comments as in ChemSpotLight. Geoff's program adds metadata like number of
atoms and bond, but it calculates the [SMILES](http://www.daylight.com/smiles/) and [InChI](http://www.iupac.org/inchi/)
on the fly too. Especially the last is very good for indexing purposes, as it is a really unique identifier for molecular
structures, and even works for [proteins <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/03/31/inchis-in-latex-and-cdk-news.html).

Now, kfile_chemical is a kfile plugin. These kfile plugins only extract metadata from files, and have little to do with
calculated metadata. Kat, on the other hand, is an indexing application and might be expected to add additional, derived
or calculated, metadata as extended attributes, just like Beagle does. And then InChI and SMILES are good candidates.
