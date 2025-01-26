---
layout: post
title:  "Niche papers and citation intentions"
date:   2025-01-26
modified_date: 2025-01-26
doi: 10.59350/am3yq-9xx77
tags: publishing justdoi:10.59350/m6erd-7px95 doi:10.1021/CI025584Y justdoi:10.1186/1471-2105-11-395
  justdoi:10.1093/NAR/GKH081 justdoi:10.1002/anie.200503833 justdoi:10.1186/2041-1480-1-S1-S6
  doi:10.1371/JOURNAL.PONE.0263057 doi:10.1371/JOURNAL.PCBI.1004989 doi:10.1186/S13321-023-00701-3
image: assets/images/cdk_citations.png
---

I wish I could say I remember the first citation to one of my research articles. I do not. But I do remember
the excitement to see why someone was citing my research. What I do remember is that I got a comment around
the same time along the lines of this: *"why would anyone cite your article if they can download the results
for free?"* (about open science cheminformatics research). Other times. Indeed, I found out there are many reasons why people are citing and not citing
articles. The above is one of them (still happens too often). But that's also an intrinsic property of the
current publishing model: some papers get cited too much, others get cited too little.

[Mark Dingemanse](https://scholar.social/@dingemansemark) wrote up a post *[[i]n praise of niche papers](https://doi.org/10.59350/m6erd-7px95)*,
suggesting people to highlight papers that are not cited enough (as proxy for not getting enough attention).
They write:

> Let’s define niche papers informally as work to be proud of even if it managed to remain a bit obscure;
> good work that would deserve more readers. Niche papers may not contain the most flashy results. They
> may not appear in the most glamourous venues. They may be book chapters. They don’t easily gather
> drive-by citations.

## Why I found this post interesting

Before I move on to highlighting niche papers (from our group and from others), I want to ponder
a bit more about the rest. The first I learned is that the citation count to articles is a bad measure
for the impact ([2006 pondering](https://chem-bla-ics.linkedchemistry.info/2006/11/07/when-is-open-source-chemoinformatics.html)):
articles using your work may get more citations than your own article. For example, the first paper
(doi:[10.1021/CI025584Y](https://doi.org/10.1021/CI025584Y)) about the open science cheminformatics
about the [Chemistry Development Kit](https://cdk.github.io) (CDK) was originally cited less than
the paper about the BRENDA enzyme database (doi:[10.1093/NAR/GKH081](https://doi.org/10.1093/NAR/GKH081))
using the CDK for fingerprint calculations (to compare and search enzyme substrates), and later much
less than MZmine (doi:[10.1186/1471-2105-11-395](https://doi.org/10.1186/1471-2105-11-395))
(see [this Scholia page](https://scholia.toolforge.org/works/Q27061829,Q27136473,Q24599948)):

![](/assets/images/cdk_citations.png)

I think we should with limiting ourselves to papers and book chapters. We must extend out notion of research output,
anyway, starting with data and software. This is part of defining what niche is, imo.

Second reason why I liked Mark's post is the *drive-by citations*, which he references to
[a 2009 post by andrewperrin](https://scatter.wordpress.com/2009/04/30/drive-by-citations/) which defined
such a citations as

> references to a work that make a very quick appearance, extract a very small, specific point from the work,
> and move on without really considering the existence or depth of connection between the student’s work and
> the cited work.

This is someone I noted too when analyzing citations to the aforementioned CDK paper. Particularly in the
early days, it was cited a lot in a similar way: it was not using the CDK, but ascribed some authority
to the paper in a *very quick appearance, without really considering the cited work*. The
[Citation Typing Ontology]() (CiTO, doi:) has *cito:citesAsAuthority* for that (not exactly the same thing,
and maybe CiTO should have *cito:driveByCitation* too). And they happen a lot, and in the past I have
guestimated them to make up 20-35% of the citations to an article, and I postulate that
high-journal-impact-factor journals amass a higher ratio than specialistic (niche?) journals.

With FAIR citations (see [this post](https://chem-bla-ics.linkedchemistry.info/2024/12/30/fair-blog-to-blog-citations.html))
we can visualize that ratio, here in [this Scholia page](https://scholia.toolforge.org/work/Q27061829#cito-incoming):

![](/assets/images/cdk_citations_why.png)

It is also obvious that the first CDK paper introduced a new method. But the pattern is not
limited to this paper, and with [just over 2000 citation intentions](https://scholia.toolforge.org/cito/#article-counts),
we start of get some idea of this pattern:

![](/assets/images/citations_why.png)

## My contributed Niche Papers

That brings me to a first neglected paper, David Shotton's original conference proceedings *CiTO, the Citation Typing Ontology*
(doi:[10.1186/2041-1480-1-S1-S6](https://doi.org/10.1186/2041-1480-1-S1-S6)), another paper where citing articles
are more cited than the original:

![](/assets/images/cito_openalex.png)

A second example is cited even less (only [36 times](https://openalex.org/works?page=1&filter=cites%3Aw2103581950)
according to OpenAlex), but a wonderful early example of machine learning of a massive amount of data:
*Genome‐Scale Classification of Metabolic Reactions: A Chemoinformatics Approach* (doi:[10.1002/anie.200503833](https://doi.org/10.1002/anie.200503833)) by
Diogo Latino and João Aires‐de‐Sousa. My [2006 blog post](https://chem-bla-ics.linkedchemistry.info/2006/04/04/mining-kegg-pathway-database-with-self.html)
about their article did not make a difference. And this is remarkable if you look at home many articles
are [published now yearly in similar efforts](https://scholar.google.com/scholar?hl=en&as_sdt=0,5&as_ylo=2021&q=enzyme+reaction+classification+with+machine+learning).

From our group, I think the impact of [Ryan Miller](https://scholar.google.com/citations?view_op=list_works&hl=en&hl=en&user=bJYJJVMAAAAJ)'s
*Understanding signaling and metabolic paths using semantified and harmonized information about biological interactions*
(doi:[10.1371/journal.pone.0263057](https://doi.org/10.1371/journal.pone.0263057) is not fully appreciated yet. This
paper describes and validates work by Ryan, Martina Kutmon, Answesha Bohler, and Andra Waagmeester on modelling biological
interaction in a FAIR way. It builds on earlier work, like the [WikiPathways RDF](https://rdf.wikipathways.org/)
work by Andra (doi:[10.1371/journal.pcbi.1004989](https://doi.org/10.1371/JOURNAL.PCBI.1004989)),
but zooms in on the interactions and develops method to assess the quality of the FAIR modelling
of them. This provides us with a method to evaluate later analyses where these interactions are used.

A second paper from our group which I expected to get more attention is a paper by [Ammar](https://scholar.google.com/citations?hl=en&user=8ZmXyZcAAAAJ)
(doi:[10.1186/s13321-023-00701-3](https://doi.org/10.1186/s13321-023-00701-3)) where he looked
into personalized binding affinities. That is, drugs may bind better to their targets for some
people than for other (and therefore work better for some people than for other), and his analysis
suggests they impact can be significant. We will learn in time.
