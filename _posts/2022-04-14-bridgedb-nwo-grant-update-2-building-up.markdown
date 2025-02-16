---
layout: post
title:  "BridgeDb NWO grant update #2: building up momentum"
date:   2022-04-17
modified_date: 2025-02-16
doi: 10.59350/t5wrt-55f66
blogger-link: https://chem-bla-ics.blogspot.com/2022/04/bridgedb-nwo-grant-update-2-building-up.html
tags: bridgedb openscience isaac doi:10.3897/RIO.8.E83031 justdoi:10.5281/ZENODO.6367091 justdoi:10.7717/peerj-cs.214
image: /assets/images/bridgedb_nwo_isaac.png
---

<a href="/assets/images/bridgedb_nwo_uml.png"><img src="/assets/images/bridgedb_nwo_uml.png" style="width: 40%; display: block; margin-left: auto; margin-right: auto; float: right"
     alt="UML diagram showing the steps in a BridgeDb webservice call." /></a>
Last month I [reported <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2022/03/05/bridgedb-nwo-grant-update-1-first-steps.html) on the start of the
[NWO Open Science grant](https://www.nwo.nl/en/researchprogrammes/open-science/open-science-fund) and it is time for an update. First,
our grant now has a grant number, [203.001.121](https://www.nwo.nl/en/projects/203001121). For a project that is about identifiers,
having a project identifier is a big deal.

Some updates by Denise, Martina, Tooba, Helena, and me:

* the project proposal was accepted and published in RIO Journal (doi:[10.3897/rio.8.e83031](https://doi.org/10.3897/rio.8.e83031))
* we started drawing various [BridgeDb stories as UML diagrams](https://github.com/bridgedb/stories) using
  [Mermaid](https://mermaid-js.github.io/)
* updated the documentation in the [BridgeDb Webservice repository](https://github.com/bridgedb/bridgedb-webservice)
* an [Ensembl 104-based gene/protein ID mapping database](https://github.com/bridgedb/data/commit/172a9c69ef557e7cb065a138f0fc4f5243615188)
  (doi:[10.5281/zenodo.6367091](10.5281/zenodo.6367091))
* better unit test coverage of the BridgeDb Java library
* various [CITATION.cff](https://citation-file-format.github.io/) updates

There are some further things cooking, including an updated [datasources.tsv](https://github.com/bridgedb/datasources) and a few
[pull requests](https://github.com/bridgedb/BridgeDb/pulls). I expect a new release of the BridgeDb Java library before the end of the month.

With these new results, we also updated [the ISAAC database](https://www.isaac.nwo.nl/) for the two new products
(the published proposal and the gene/protein ID mapping database):

![](/assets/images/bridgedb_nwo_isaac.png)

Right now, the ISAAC database does not make it easy to add content. Instead, there is a series of forms that have to be
manually filled, including separate forms for authors. You cannot simply add a DOI. Well, until recent.
[Lars Willighagen](https://orcid.org/0000-0002-4751-4637) and I developed [a Chrome browser add-on](https://chrome.google.com/webstore/detail/isaac-chrome-extension/kiljfbiapahlahhilgcgfkfjnkgggode)
to help out (also works with Brave), using his awesome [citation-js](https://citation.js.org/)
(doi:[10.7717/peerj-cs.214](https://doi.org/10.7717/peerj-cs.214)). The above two entries in the database have
been added using this add-on.

We hope it will help other NWO grant holders too and that the add-on becomes obsolete in the near future Because the ISAAC database needs some updates elsewhere too. For example, it does not seem to value open source and open data so much yet:

![](/assets/images/bridgedb_nwo_isaac_output_types.png)

That is a shame.
