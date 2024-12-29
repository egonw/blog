---
layout: post
title:  "Complex PDB documents using the Bioclipse ChildResourceCreator"
date:   2006-09-14
modified_date: 2024-12-29
blogger-link: https://chem-bla-ics.blogspot.com/2006/09/complex-pdb-documents-using-bioclipse.html
tags: bioclipse biojava cdk pdb jmol
image: /assets/images/bioclipseBioJavaSupport.png
doi: 10.59350/b3zbn-9w223
---

Some time ago I blogged about the [ChildResourceCreator extension point in Bioclipse <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/08/22/bioclipse-gets-new-extension-point.html)
and hinted as using that for [PDB files](http://www.rcsb.org/pdb/). which contain 3D molecular models, sequences and bibliographic information. Using the new extension point,
[Bioclipse](http://www.bioclipse.net/) now treats PDB files as complex documents, creating child resources for the 3D molecular model (using the
[CDK](http://cdk.sf.net/) plugin), and a sequence resource (using the [BioJava](http://www.biojava.org/) plugin).

![](/assets/images/bioclipseBioJavaSupport.png)
