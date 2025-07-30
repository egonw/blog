---
layout: post
title:  "Improved CMLRSS feed for Chemical blogspace"
date:   2007-04-30
modified_date: 2025-07-30
blogger-link: https://chem-bla-ics.blogspot.com/2007/04/improved-cmlrss-feed-for-chemical.html
doi: 10.59350/ztgma-ppp65
tags: cb rss cml inchi semweb pubchem
image: /assets/images/cmlrss_Cb2.png
---

While adding the [116th blog (David Bradley's Chemistry News)](http://wiki.cubic.uni-koeln.de/cb/blog_search.php?blog_id=116)
to [Chemical blogspace](http://wiki.cubic.uni-koeln.de/cb/) (see also [New Blogs #5](http://chemicalblogspace.blogspot.com/2007/04/new-blogs-5.html),
I noticed that [David](http://www.sciencebase.com/science-blog/) is using
[semantic markup for InChI's <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/12/10/including-smiles-cml-and-inchi-in.html) (thanx!).

That urged me to finally clean up [my InChI extension<i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2006/02/25/hacking-inchi-support-into.html) for the
[Postgenomic.com](http://www.postgenomic.com/) software. One important step was to create a PHP page with only one InChI, such as
[this one](http://wiki.cubic.uni-koeln.de/cb/inchi.php?id=61). That would solve the something broken links in the CMLRSS feed,
because of characters in InChIs that Apache cannot handle as the PHP page expects. Once that was done, I also pimped up the
CMLRSS feed itself: I added a human-friendly name, the title of the blog item discussing the molecule, and the picture Cb
downloads from [PubChem](http://pubchem.ncbi.nlm.nih.gov/):

![](/assets/images/cmlrss_Cb2.png)

Of course the feed is still [CML enabled](http://chem-bla-ics.blogspot.com/search?q=CMLRSS).
