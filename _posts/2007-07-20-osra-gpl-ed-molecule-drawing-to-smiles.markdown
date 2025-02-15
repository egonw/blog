---
layout: post
title:  "OSRA: GPL-ed molecule drawing to SMILES convertor"
date:   2007-07-20 00:10
modified_date: 2025-02-15
doi: 10.59350/arc2j-1ha32
blogger-link: https://chem-bla-ics.blogspot.com/2007/07/osra-gpl-ed-molecule-drawing-to-smiles.html
tags: cheminf openbabel
image: /assets/images/osra.png
---

Igor wrote a message to the [CCL mailing list](http://www.ccl.net/chemistry/sub_unsub.shtml) about
[OSRA](http://cactus.nci.nih.gov/osra/):

<ul><i>
We would like to announce a new addition to the set of chemoinformatics tools available from the Computer-Aided Drug Design Group
at the NCI-Frederick. OSRA is a utility designed to convert graphical representations of chemical structures, such as they appear
in journal articles, patent documents, textbooks, trade magazines etc., into SMILES.<br /><br />

OSRA can read a document in any of the over 90 graphical formats parseable by ImageMagick (GIF, JPEG, PNG, TIFF, PDF, PS etc.) and
generate the SMILES representation of the molecular structure images encountered within that document.
</i></ul>

The email does not give any information on the fail rate, but the demo they provide via the
[webinterface](http://cactus.nci.nih.gov/cgi-bin/osra/index.cgi) does show some minor glitches (the bromine is not recognized):

![](/assets/images/osra.png)

The source reuses [OpenBabel](http://openbabel.sf.net/) and uses the GPL license. The value equal to that of text mining tools like
[OSCAR3 <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/06/22/text-mining-for-chemistry-using-oscar3.html),
and together they sounds like the Jordan and Pippen of mining chemical literature.
