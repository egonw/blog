---
layout: post
title:  "Archiving spectra: use InChI and CML"
date:   2007-06-22
blogger-link: https://chem-bla-ics.blogspot.com/2007/06/archiving-spectra-use-inchi-and-cml.html
tags: cml inchi nmr
---

[Ryan](http://acdlabs.typepad.com/my_weblog/) blogged in [Archive This](http://acdlabs.typepad.com/my_weblog/2007/06/archive_this.html)
about some advices from ACD on how to store spectra in your electronic lab notebook.

## Use InChI

This reminded me of a [discussion I had with with Colin](http://chem-bla-ics.blogspot.com/2007/02/rsc-first-publisher-to-go-semantic.html)
when he was at the CUBIC, which was about experimental sections. I proposed that the [InChI](http://www.iupac.org/inchi/) should have a
prominent place in the experimental section. An important argument for this is that it allows well-defined atom numbering to be used when
writing down the NMR bits in that section: the InChI gives a unique numbering, so that the numbering used in the experimental section
becomes author neutral. Because the InChI puts the carbons up front, the <sup>13</sup>C NMR details get numbers from 1-13, or whatever
the carbon count is. For proton NMR it is not difficult either, they are simply numbered according to the heavy atom to which they are
attached. For situations where two hydrogens attached to the same heavy atom have different shifts, then a and b can still be used.
The numbers are easily added to 2D diagrams anyway.

If software vendors (e.g. [ACD](http://www.acdlabs.com/) and [Bioclipse](http://bioclipse.net/)) and publishers (e.g. ACS,
[RSC](http://www.rsc.org/Publishing/Journals/ProjectProspect/), [Chemistry Central](http://www.chemistrycentral.com/)) could adopt this
proposal, then experimental sections immediately are better machine parsable and ready for automatic processing, such as discussed in
my blog item [Chemical Archeology: OSCAR3 to NMRShiftDB.org](http://chem-bla-ics.blogspot.com/2006/09/chemical-archeology-oscar3-to.html)
and by [Christoph at the ACS meeting](http://www.acscinf.org/dbx/mtgs/232nm/232cinfprogram.asp), available as
[PDF](http://acscinf.org/docs/meetings/232nm/presentations/232nm101.pdf) and this 18MB
[MP3](http://acscinf.org/docs/meetings/232nm/presentations/232nm101.mp3).

## Use CML

Even better is to use [CML](http://en.wikipedia.org/wiki/Chemical_Markup_Language) for this, or CMLSpect to be precise (paper is accepted,
and should appear soon). This XML-based language allows the full semantic markup of all the experimental details and all the interesting
assignments you want to archive. I would like to **challenge ACD** to follow Bioclipse's lead and provide export as CMLSpect for spectral
assignments and markup of experimental details, in addition to the PDF in whatever format they prefer. Cheers for the work by Tobias
and Stefan on spectrum support in Bioclipse!
