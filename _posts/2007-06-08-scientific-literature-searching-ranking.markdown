---
layout: post
title:  "Scientific Literature: searching, ranking, storage"
date:   2007-06-08
modified_date: 2025-04-27
doi: 10.59350/8rxpp-1e755
blogger-link: https://chem-bla-ics.blogspot.com/2007/06/scientific-literature-searching-ranking.html
tags: citeulike publishing chemistry justdoi:10.59350/6zgf4-2wb06 connotea
---

Dealing with scientific literature has been one important theme in [Chemical blogspace](http://wiki.cubic.uni-koeln.de/cb/).
For example, ranking articles and how to store your personal PDF archive has been topics of discussion. In this blog I will
summarize bits of the discussion, and my personal view on things.

## Searching

Searching literature is traditionally done in systems like Chemical Abstracts and Web-of-Science. The open nature of a
growing number of repositories (e.g. the Dutch [DARE](http://www.darenet.nl/en/page/language.view/search.page)) and
indexing facilities like [PubMed](http://www.ncbi.nlm.nih.gov/sites/entrez?db=pubmed) make these proprietary tools
obsolete.

It is incorrect to assume that these payed services are the only trustworthy sources. Even WoS fails to make the all
links between entries in the database. For example, I am aware of two missing citations to articles I have written,
even though both the cited and the citing article is available in the system. One of the citing articles was in the
[Angewandte Chemie](http://www3.interscience.wiley.com/cgi-bin/jhome/26737?CRETRY=1&SRETRY=0)!

Additionally, some search services, like [Google Scholar](http://scholar.google.com/), have the advantage that they
find copies and close variants of articles in proprietary articles on home pages and in open repositories. Today,
I learned about [Scientific Commons](http://en.scientificcommons.org/) which indexes and links to a staggering
1.5M publications, using, among others, PubMed and university repositories. Where possible it makes direct links
to PDF versions of the article.

## Ranking

[Mitch set up](http://www.chemicalforums.com/index.php?topic=17653.msg67580#msg67580) [ChemRank](http://chemrank.com/),
to which [Peter <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2007/05/30/ranking-chemistry-and-blogosphere-metrics/), the [ChemBlog](http://www.thechemblog.com/?p=552)
and [I replied](http://chem-bla-ics.blogspot.com/2007/05/chemrank-ranking-scientific-literature.html). Afterwards,
I learned that other services are available too, that allow, in addition to setting up an online personal literature
database, voting and commenting on articles.

Apparently, [CiteULike](http://www.citeulike.org/) (CUL) supports this too. In contrast to ChemRank, CUL requires
a login, which I personally see as an advantage, because I can browse literature bookmarked by other accounts I trust.
There is also [Connotea](http://www.connotea.org/) but I never liked that site that much (e.g. is allows bookmarking
any web page); [Rich has his comments too <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/6zgf4-2wb06).
I would also like to mention [BioWizard](http://www.biowizard.com/) which is based on the PubMed content, which actually
covers a good deal of chemistry literature nowadays too.

## Local Storage

These above mentioned systems can be used as alternative to offline bibliographic database systems, like EndNote and
[JabRef](http://jabref.sf.net/). The latter is my favorite, being based on BibTeX which I use for my LaTeX based
publications, and is opensource and contains [a few patches](http://www.ohloh.net/accounts/2934/contributions/557)
from yours truly. Jungfreudlich wondered [how people organized their PDF archive](http://www.jungfreudlich.de/2007/05/20/how-are-your-paper-files-organized/)
and [I commented how I do it](http://www.jungfreudlich.de/2007/05/20/how-are-your-paper-files-organized/#comment-3199):

* a directory hierarchy based on journal name and year
* file names that include last name of the first author and year
* JabRef for the bibiographic database
* [Strigi](http://strigi.sf.net/) for full text search

[Jörg](http://miningdrugs.blogspot.com/2007/05/literature-management.html) and
[the power of goo](http://www.thepowerofgoo.net/2007/05/20/organizing-pdfs-papers/) replied too.

## Mashups

I have accounts on several online tools now (with some duplication which I don't like), and I have no idea which of
the options will stay around. Time will learn. Good news is that the open characters of many of these allow making
mashups, and generally integrate tools. For example, JabRef allows downloading citations from PubMed, and Noel
[suggested to use Greasemonkey scripts to link to the supplementary information for his articles](http://baoilleach.blogspot.com/2007/05/supporting-information-available-as.html),
instead of using the mechanisms journals have. I can see the advantage of this, as, for example,
[Wiley takes full copyright of the data in SI material <i class="fa-solid fa-recycle fa-xs"></i>](https://blogs.ch.cam.ac.uk/pmr/2007/05/09/access-to-and-re-use-of-open-data-in-chemistry-impressions/),
while Noel's mechanism would keep the data open.

For now, however, I would very much like to see a meta service where I can query rankings and comment for
articles using any or all of the above tools.
