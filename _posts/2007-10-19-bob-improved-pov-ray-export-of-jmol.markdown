---
layout: post
title:  "Bob improved the POV-Ray export of Jmol"
date:   2007-10-19
blogger-link: https://chem-bla-ics.blogspot.com/2007/10/bob-improved-pov-ray-export-of-jmol.html
doi: 10.59350/byehz-56r07
tags: jmol
image: /assets/images/t2.pov.png
---

Bob has set up a new interface between the data model and the [Jmol](http://www.jmol.org/) renderer, which
allows him to define other types of export too. One of this is a [POV-Ray](http://www.povray.org/) export,
which allows creating of high quality images for paper. Jmol has had POV-Ray export for a long time now,
but never included the secondary structures or other more recent visual featues. [PyMOL](http://pymol.sourceforge.net/)
is well-known for its POV-Ray feature, and often used to create publication quality protein prints. The
script command to create a POV-Ray input file takes the output image size as parameters:

```
write povray 400 600   # width 400, height 600
```

Here's a screenshot of a protein with surface:

![](/assets/images/t2.pov.png)

And here a MO of water:

![](/assets/images/watermo.pov.png)

Note the shading. More examples are available [here](http://www.stolaf.edu/people/hansonr/temp/jmol/povray.htm).
