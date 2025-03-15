---
layout: post
title:  "new: \"Providing Adverse Outcome Pathways from the AOP-Wiki in a Semantic Web Format to Increase Usability and Accessibility of the Content\""
date:   2022-05-17
blogger-link: https://chem-bla-ics.blogspot.com/2022/05/new-providing-adverse-outcome-pathways.html
tags: openrisknet eutoxrisk doi:10.1089/AIVT.2021.0010 doi:10.3389/FGENE.2018.00661
doi: 10.59350/3f7mc-e0a42
image: /assets/images/images_medium_aivt.2021.0010_figure1.png
grants:
  - grant:
    title: "OpenRiskNet: Open e-Infrastructure to Support Data Sharing, Knowledge Integration and in silico Analysis and Modelling in Risk Assessment"
    acronym: OpenRiskNet
    id: cordis.project:731075
    funder:
      name: "European Commission"
      ror: 00k4n6c32
  - grant:
    title: "An Integrated European ‘Flagship’ Program Driving Mechanism-based Toxicity Testing and Risk Assessment for the 21st Century"
    acronym: EU-ToxRisk
    id: cordis.project:681002
    funder:
      name: "European Commission"
      ror: 00k4n6c32
---

I am a bit behind with tweeting about new published papers, but let that not reflect that these papers are not very exciting. The first paper is by
[Marvin](https://scholar.google.com/citations?user=GvOHiicAAAAJ&hl=en) an almost-finished PhD candidate in our group and now working as postdoc on the
[VHP4Safety](https://vhp4safety.nl/) project. He has been working on linking adverse outcome pathways (AOPs) with molecular pathways, such as in
[WikiPathways](https://www.wikipathways.org/). This work was mostly done as part of the EU projects
[OpenRiskNet](https://openrisknet.org/) and [EUToxRisk](https://www.eu-toxrisk.eu/), during which he disseminated his research in many directions
(e.g. the second paper in [this post](https://chem-bla-ics.blogspot.com/2022/03/contributions-to-two-new-papers-skin.html)). Talking about impact.

He previously already sketched out the ideas of integration the two kinds of pathways in [this paper](https://doi.org/10.3389/fgene.2018.00661).
The implementation of this has now been published in the paper *Providing Adverse Outcome Pathways from the AOP-Wiki in a Semantic Web Format
to Increase Usability and Accessibility of the Content* (doi:[10.1089/aivt.2021.0010](https://doi.org/10.1089/aivt.2021.0010)).
It's an important piece of our growing molecular life sciences knowledge graph, which already contains data from WikiPathways and ChEMBL. Of course, integrated with other SPARQL endpoints, such as NextProt/UniProt, Rhea, etc.

Schematic diagram from the article showing the kind of information in the database:

![](/assets/images/images_medium_aivt.2021.0010_figure1.png)

Marvin writes: *"The resulting RDF contains >122,000 triples describing 158 unique properties of >15,000 unique subjects. Furthermore, >3500 link-outs
were added to 12 chemical databases, and >7500 link-outs to 4 gene and protein databases. The AOP-Wiki RDF has been made available at
[https://aopwiki.rdf.bigcat-bioinformatics.org](https://aopwiki.rdf.bigcat-bioinformatics.org)".* The last comes with many example queries.

