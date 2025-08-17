---
layout: post
title:  "Simple, Open Bug Track System: social bookmarking"
date:   2008-02-06
modified_date: 2025-08-17
blogger-link: https://chem-bla-ics.blogspot.com/2008/02/simple-open-bug-track-system-social.html
doi: 10.59350/kk9bs-x2a77
tags: crystal
---

[Jim](http://wwmm.ch.cam.ac.uk/blogs/downing/) replied to the [request by Anthony in my blog](http://chem-bla-ics.blogspot.com/2008/01/why-chemistry-rich-rss-feeds-matter.html#c9123182507496435262)
for a bug track system for [CrystalEye](http://wwmm.ch.cam.ac.uk/crystaleye/) (in beta), after a discussion on the CIF
processing pipeline (see [here] <i class="fa-solid fa-recycle fa-xs"></i>(https://chem-bla-ics.linkedchemistry.info/2008/01/30/why-chemistry-rich-rss-feeds-matter.html),
[here](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=943), [here](http://www.chemspider.com/blog/why-we-cant-publish-scraped-crystaleye-data-yetand-science-commons-declare-a-protocol-for-implementing-open-access-data.html)
and [here](http://wwmm.ch.cam.ac.uk/blogs/murrayrust/?p=946)).

Instead of setting up a BTS at [SourceForge](http://www.sf.net/), locally with [Bugzilla](http://www.bugzilla.org/), or at
[LaunchPad](http://www.launchpad.net/), he [suggested to use](http://wwmm.ch.cam.ac.uk/blogs/downing/?p=171)
[Connotea](http://www.connotea.org/):

> To report a problem in CrystalEye, simply bookmark an example of the problem with the tag “crystaleyeproblem”, using the
> Description field to describe the problem. All the problems will appear on the tag feed.
>
> When we fix the problem we’ll add the tag “crystaleyefixed” to the same bookmark. If you subscribe to this feed, you’ll
> know to remove the crystaleyeproblem tag.
>
> In the fullness of time, we’re planning to use connotea tags to annotate structures where full processing hasn’t been
> possible (uncalculatable bond orders, charges etc).

Now, Connotea is advertised as a *[f]ree online reference management for all researchers, clinicians and scientists*,
and I have never really been happy with any HTML page ending up in the system, I would counter the suggestion by using social
bookmarking websites for any HTML page (not just publications), such as [Del.icio.us](http://del.icio.us/)
(see [their list of CrystalEye bookmarks](http://del.icio.us/search/?fr=del_icio_us&p=crystaleye&type=all)).

Anyway, it does not really matter, and Connotea has an open API to query the database. This will allow Jim to write a simple
userscript to enhance each CrystalEye page with a list of bug reports. That will allow every CrystalEye visitor to see what
others are commenting on it. In that respect, many other things can be envisioned... Getting comments on the paper behind the
crystal structure from [Chemical blogspace](http://cb.openmolecules.net/) and [Postgenomic](http://www.postgenomic.com/),
...
