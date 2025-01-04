---
layout: post
title:  "Molecular Connectivity Tables in Images"
date:   2007-08-11 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2007/08/molecular-connectivity-tables-in-images.html
tags: publishing chemistry inchi
---

Rich blogged about to [Never Draw the Same Molecule Twice: Viewing Image Metadata](http://depth-first.com/articles/2007/08/08/never-draw-the-same-molecule-twice-viewing-image-metadata)
in which he shows his molecular editor outputting images of molecular structure where the connectivity table
of structure is embedded in the image. His molecular editor can read the image again, and will automatically
pick up the embedded connection table. Noel showed that such can not only be done in Java, but
[in Python too](http://baoilleach.blogspot.com/2007/08/access-embedded-molecular-information.html).

This is important progress, though I would still like to see [InChI](http://iupac.org/inchi/)s in the
documents, and/or the data files as supplementary information. Actually, I would even more like to
see that all experimental sections not just list the structure name, but give the InChI. An important
spin-off is that when giving spectral information, the atom numbering given by InChI can be used to
associate NMR shifts, and IR wavenumbers to atoms and atom groups, removing the ambiguity in those
associations as we are used to find in literature.

Chemistry Central is [looking into improving the submission process](http://blogs.openaccesscentral.com/blogs/ccblog/entry/symyx_technologies_to_acquire_mdl)
for molecular data, and hereby request the commenting on, taking into account in ongoing internal
discussings, and incorporation of these approaches in the editorial requirements for CC publications:

* including the connection table as metadata in images
* including the InChI in experimental sections for newly synthesized molecules
* use InChI atom numbering to associate NMR shifts with atoms in these experimental sections

I will shortly blog an example experimental section incorporating the InChI.

