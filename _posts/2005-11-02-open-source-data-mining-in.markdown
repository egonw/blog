---
layout: post
title:  "Open Source data mining in chemoinformatics"
date:   2005-11-02
modified_date: 2025-06-08
blogger-link: https://chem-bla-ics.blogspot.com/2005/11/open-source-data-mining-in.html
tags: iccs cheminf
doi: 10.59350/gc4hw-5k265
---

On the [7th International Conference on Chemical Structures <i class="fa-solid fa-box-archive fa-xs"></i>](http://web.archive.org/web/20050829074352/http://www.int-conf-chem-structures.org/)
[Jeroen Kazius <i class="fa-solid fa-box-archive fa-xs"></i>](http://web.archive.org/web/20061011043216/http://www.medchem.leidenuniv.nl/people/jeroen_kazius.htm) has a
[poster <i class="fa-solid fa-box-archive fa-xs"></i>](http://web.archive.org/web/20070123184631/http://www.liacs.nl/~snijssen/gaston/iccs.html) on finding discriminative substructures, that is, molecular fragments
which can be discriminate between two acitivity classes. The software is released as
[Gaston <i class="fa-solid fa-box-archive fa-xs"></i>](http://web.archive.org/web/20060829055804/http://www.liacs.nl/~snijssen/gaston/), is written in C++ and has the GPL license.

Later I encountered [MoSS <i class="fa-solid fa-box-archive fa-xs"></i>](http://web.archive.org/web/20051218120845/http://fuzzy.cs.uni-magdeburg.de/~borgelt/moss.html)
which has the same goal, but uses a different algorithm.
MoSS is written in Java and uses the LGPL license. MoSS reads STN and SMILES as input, which might not be optimal for all users,
so a CDK port comes to mind.
