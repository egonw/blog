---
layout: post
title:  "Taverna Workshop, Day 1 Update"
date:   2007-10-08 00:10
doi: 10.59350/58bs7-cpq93
blogger-link: https://chem-bla-ics.blogspot.com/2007/10/taverna-workshop-day-1-update.html
tags: taverna ebi cdk bioclipse myexperiment justdoi:10.1073/pnas.0610772104
  inchikey:ZPUCINDJVBIVPJ-LJISPDSOSA-N
---

The second part of the morning session featured a presentation by Sirisha Gollapudi which spoke about mining
biological graphs, such as protein-protein interaction networks and metabolic pathways. Patterns detection
for nodes with only one edge, and cycles etc, using Taverna. An example data she worked on is the Palsson human
metabolism (doi:[10.1073/pnas.0610772104](https://doi.org/10.1073/pnas.0610772104)); she mentioned that this
metabolite data set contains [cocaine](http://en.wikipedia.org/wiki/Cocaine) :) Neil Chue Hong finished with
an introduction on the [OMII-UK](http://www.omii.ac.uk/) which is co-host of this meeting.

After lunch Mark Wilkinson introduced [BioMoby](http://biomoby.org/), which we actually use in Wageningen already.
I have tried to use [jMoby](http://biomoby.open-bio.org/CVS_CONTENT/moby-live/Java/docs/) to set up services
based on the [CDK](http://cdk.sf.net/), but failed sofar. Will talk with Mark on that. Next was my presentation,
and I spoke about [CDK-Taverna](http://www.cdk-taverna.de/), [Bioclipse](http://www.bioclipse.net/) and some
peculiarities with chemoinformatics workflow, like the importance with intermediate interaction, the need to
visualize the data and complex, information rich data. Bioclipse is seeing
[an integration of BioMoby and of Taverna](http://wiki.bioclipse.net/index.php?title=Bioclipse2).

After the coffee brake Marco Roos spoke about [myExperiment](http://myexperiment.org/) and his work on text
mining. I unfortunately missed this presentation, as I was meeting with people from the EBI who work on the
[MACiE database](http://www.ebi.ac.uk/thornton-srv/databases/MACiE/) (see
[this blog item](http://chem-bla-ics.blogspot.com/2006/02/chemical-reactions-in-cml.html)).

A discussion session afterwards introduced a few more Taverna uses, and encountered technical problems.
Taverna2 is actually going to be quite interesting, with a data caching system between work processors, and a
powerful scheme of annotation of processors, which will allow rating, finding local services, etc. More on
that tomorrow. Dinner time now :)
