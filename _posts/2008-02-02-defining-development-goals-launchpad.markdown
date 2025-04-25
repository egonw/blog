---
layout: post
title:  "Defining Development Goals: LaunchPad complements SourceForge"
date:   2008-02-02 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2008/02/defining-development-goals-launchpad.html
doi: 10.59350/nks4k-n7e69
tags:
---

Today, Miguel (who made [the 10000th CDK commit](http://chem-bla-ics.blogspot.com/2008/02/10000-cdk-commits.html)) and I gave
[LaunchPad](http://launchpad.net/) a go, because if offers a nice GUI for planning and monitoring source code development. We
have set up a [CDK team](https://launchpad.net/~cdk-developers) and a [CDK project](https://launchpad.net/cdk/). LaunchPad
has overlap with [SourceForge](http://www.sf.net/) functionality, but they idea is not to duplicate functionality. Moreover,
we do not translate the CDK either, so that LaunchPad functionality is not useful either. Not for the CDK at least; maybe for
[Jmol](http://www.jmol.org/) and [Bioclipse](http://www.bioclipse.net/)?

However, we are interested in the task management system of LaunchPad. While the CDK project is currently maintaining a
[Project Maintenance Tasks](http://sourceforge.net/tracker/?atid=631143&group_id=20024&func=browse) tracker, it does not have
the feature richness of the LaunchPad equivalent. The latter allows us to link tasks with series goals. We currently basically
have two series: the cdk1.0.x/ branch, and trunk. Miguel and I have been working on getting the
[ionization potential prediction](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/qsar/descriptors/molecular/IPMolecularDescriptor.html)
in trunk working, which involves about all the code Miguel wrote during his PhD thesis with
[Christoph](http://www.steinbeck-molecular.de/steinblog/). And, this is one of the goal of the next stable CDK series
(replacing the 1.0.x series). This is something we can easily define in LaunchPad:

![](/blog/assets/images/trunkSeriesGoals.png)

Getting the IP-prediction code updated for the new CDK atom types and other changes, and making it CDK stable involved
quite a long list of tasks, which shows dependencies. For example, I can't continue
[cleaning up the partial charge prediction code](http://cdk.svn.sourceforge.net/viewvc/cdk/branches/egonw/charge/), before
the [resonance structure generator in the reaction module](http://cdk.svn.sourceforge.net/viewvc/cdk/branches/miguelrojasch/reaction/)
is working properly again. This in turn depends on me adding missing radical and charge atom types, which in turn depends
on expected atom types, which Miguel had to implement. And this last is actually what he was committing around
the 10000th commit.

Now, Miguel and I will try to manage this development in trunk using LaunchPad. It allows as to define all these
smaller tasks, but, more importantly, the dependencies between them:

![](/blog/assets/images/ipPredictionDeps.png)

As such, LaunchPad gives us the means to manage this complex development. It shows up what we're facing, how far we
have progressed, and much, much more:

![](/blog/assets/images/taskMaintenance.png)

This goes well beyond what SourceForge has to offer; this will be an interesting experiment. I do not anticipate dropping
SourceForge at all (just in case you were wondering...); they have served as generally very, very well; and completely
free too! (LaunchPad is free too) As far as I can see, they form a perfect complement. Like a ligand and an enzyme, like
opensource and [open notebook science](http://precedings.nature.com/documents/39/version/1), or like a
Mammoth and an ice field.

Speaking about ONS... [Jean-Claude](http://usefulchem.blogspot.com/), not sure if LaunchPad would be open to projects
without source code too...
