---
layout: post
title:  "Beilstein journals contain Bioschemas"
date:   2025-02-13
modified_date: 2025-02-22
doi: 10.59350/yyjnz-n5j48
tags: bioschemas rdf chemistry cito:citesForInformation:10.59350/ne4rf-wey66 cito:citesForInformation:10.1186/s13321-021-00520-4
  cito:citesForInformation:10.1021/jm5002056 cito:usesDataFrom:10.3762/bjoc.21.21 cito:usesMethodIn:10.21105/joss.02558
  cito:citesForInformation:10.59350/40377-hz881
image: /assets/images/bjoc_bioschemas.png
---

Two weeks ago, the [Beilstein Institute announced Bioschemas support in their journals](https://www.beilstein-journals.org/bjoc/news/LAFGBV6PT5ASC5R7JOKSEXOQYM):

> We streamline the discoverability of your research by incorporating machine-readable chemical information into many of our published articles.
> This includes the conversion of chemical structures from submitted ChemDraw files to InChI strings and validating them using open-source tools.

The idea is far from new and has been around for two decades. But the [two Beilstein journals](https://scholia.toolforge.org/publisher/Q4881267)
(both [diamond Open Access](https://en.wikipedia.org/wiki/Diamond_open_access)), actually integrated into their active publishing model.
That has been trialed and put in action before. For example, there was (is?) [Project Prospect](https://doi.org/10.59350/ne4rf-wey66)
(2007), [chemical structure annotation in Nature Chemistry](https://chem-bla-ics.linkedchemistry.info/2009/03/19/nature-chemistry-improves-publishing.html)
(2009), [SMILES in the ACS Journal of Medicinal Chemistry](https://chem-bla-ics.linkedchemistry.info/2014/02/21/slow-publishing-innovation.html)
(2014) (doi:[10.1021/jm5002056](https://doi.org/10.1021/jm5002056)),
and *FAIR chemical structures in the Journal of Cheminformatics* (2021) (doi:[10.1186/s13321-021-00520-4](https://doi.org/10.1186/s13321-021-00520-4)).

But this announcement is a new step. I like how validation of the chemical structures is part of the approach, and I like
how they use the [Bioschemas](https://bioschemas.org/) extention of [schema.org](https://schema.org/). The last because
they use two Bioschemas types/profiles that contributed to or initiated, respectively: [MolecularEntity](https://bioschemas.org/profiles/MolecularEntity/0.5-RELEASE)
and [ChemicalSubstance](https://bioschemas.org/profiles/ChemicalSubstance/0.4-RELEASE).

First stop for me is to check the schema.org annotation with a validation tool, like [Google's Rich Results Test](https://search.google.com/test/rich-results).
That gives an idea how they may have have their search engine pick it up. The test article I was given on LinkedIn is
Xiao *et al.*'s *Molecular diversity of the reactions of MBH carbonates of isatins and various nucleophiles*
(doi:[10.3762/bjoc.21.21](https://doi.org/10.3762/bjoc.21.21)) in the [Beilstein Journal of Organic Chemistry](https://scholia.toolforge.org/venue/Q2894008),
and we indeed [see the schema.org annotation show up](https://search.google.com/test/rich-results/result?id=FRW9wBOpXtsMp9TLUV6SfQ):

![](/assets/images/bjoc_bioschemas.png)

And because of the use of open standards, extracting the information is not so hard with, for example here,
Bacting (doi:[10.21105/joss.02558](https://doi.org/10.21105/joss.02558)), based on a 2022 script from the NanoSafety Cluster
projects NanoCommons and SbD4Nano:

```groovy
@Grab(group='io.github.egonw.bacting', module='managers-rdf', version='1.0.4')
@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.4')
@Grab(group='io.github.egonw.bacting', module='net.bioclipse.managers.jsoup', version='1.0.4')

bioclipse = new net.bioclipse.managers.BioclipseManager(".");
rdf = new net.bioclipse.managers.RDFManager(".");
jsoup = new net.bioclipse.managers.JSoupManager(".");

articles = [
   args[0]
]

kg = rdf.createInMemoryStore()

for (article in articles) {
    htmlContent = bioclipse.download(article)

    htmlDom = jsoup.parseString(htmlContent)

    // application/ld+json

    bioschemasSections = jsoup.select(htmlDom, "script[type='application/ld+json']");

    for (section in bioschemasSections) {
        bioschemasJSON = section.html()
        rdf.importFromString(kg, bioschemasJSON, "JSON-LD")
    }
}

turtle = rdf.asTurtle(kg);

println "#" + rdf.size(kg) + " triples detected in the JSON-LD"
// println turtle


sparql = """
PREFIX schema: <http://schema.org/>
SELECT ?entity ?inchikey ?smiles WHERE {
  ?entity a schema:MolecularEntity .
  OPTIONAL { ?entity schema:inChIKey ?inchikey }
  OPTIONAL { ?entity schema:smiles ?smiles }
}
"""

results = rdf.sparql(kg, sparql)

for (i=1;i<=results.rowCount;i++) {
  println "${results.get(i, "inchikey")}\t${results.get(i, "smiles")}"
}
```

The output is a simple table:

```
MGAPJMNPGGTFHJ-JEIPZWNWSA-N     CN1C(=O)/C(=C/2\C3=CC(=CC=C3N(CC4=CC=CC=C4)C2=O)Cl)/C(=P(C5=CC=CC=C5)(C6=CC=CC=C6)C7=CC=CC=C7)C1=O
XEWMQVUVGAHESA-UHFFFAOYSA-N     CC1=CC=C(C=C1)NC2=C(C3C4=CC(=CC=C4N(CC5=CC=CC=C5)C3=O)C)C(=O)N(C)C2=O
UVTJORFYHPGJDZ-PYCFMQQDSA-N     CCCCN1C2=CC=C(C)C=C2/C(=C(\C#N)/CNC3=CC=C(C)C=C3)/C1=O
ILWGDUYVQRAMMG-PGMHBOJBSA-N     CCCCN1C2=CC=C(C)C=C2/C(=C(\C#N)/CNC3=CC=C(C=C3)Cl)/C1=O
CAFIBKBZWJFZCW-FXBPSFAMSA-N     CCCCN1C2=CC=C(C)C=C2/C(=C(\C#N)/CNC3=CC=CC=C3)/C1=O
UOJSFLANMVIMBV-UHFFFAOYSA-N     CCCCN1C2=CC=C(C)C=C2C(C3=C(C(=O)N(C)C3=O)NC4=CC=C(C=C4)Cl)C1=O
VNJBTGZXAGHCSO-OAPYJULQSA-N     COC(=O)/C(=C\1/C2=C(C=CC=C2)N(CC3=CC=CC=C3)C1=O)/C=P(C4=CC=CC=C4)(C5=CC=CC=C5)C6=CC=CC=C6
KJXQRAKSOANQTJ-GFMRDNFCSA-N     CC1=CC=C(C=C1)NC/C(=C\2/C3=C(C=CC=C3)N(CC4=CC=CC=C4)C2=O)/C#N
IGEBJMZDOPBFGF-UHFFFAOYSA-N     CCCCN1C2=CC=C(C)C=C2C(C3=C(C(=O)N(C)C3=O)NC4=CC=CC=C4)C1=O
SSANVPNESOMKOM-AWQADKOQSA-N     C1=CC=C(C=C1)CN2C3=CC=C(C=C3/C(=C(/C#N)\C=P(C4=CC=CC=C4)(C5=CC=CC=C5)C6=CC=CC=C6)/C2=O)Cl
GEHWHSHQSIOZKL-NVQSTNCTSA-N     CCCCN1C2=CC=C(C=C2/C(=C\3/C(=P(C4=CC=CC=C4)(C5=CC=CC=C5)C6=CC=CC=C6)C(=O)N(C)C3=O)/C1=O)Cl
PALRSQOHFLRWDH-UHFFFAOYSA-N     CCCCN1C2=CC=C(C)C=C2C(C3=C(C(=O)N(C)C3=O)NC4=CC=C(C=C4)OC)C1=O
KBFODZMDSAFLFR-UHFFFAOYSA-N     CN1C(=O)C(=C(C1=O)NC2=CC(=CC=C2)Cl)C3C4=CC(=CC=C4N(CC5=CC=CC=C5)C3=O)Cl
JCGAVVZYXDJPBU-GFMRDNFCSA-N     CC1=C(C=CC=C1)NC/C(=C\2/C3=C(C=CC=C3)N(CC4=CC=CC=C4)C2=O)/C#N
DZFPCPDEQGLPLY-UHFFFAOYSA-N     CCCCN1C2=CC=C(C)C=C2C(C3=C(C(=O)N(C)C3=O)NC4=CC=C(C)C=C4)C1=O
XMRNJCJUOXYXJU-DAFNUICNSA-N     CC1=CC=C(C=C1)NC/C(=C\2/C3=CC(=CC=C3N(CC4=CC=CC=C4)C2=O)C)/C#N
SSDSNBBHEUUKGI-UHFFFAOYSA-N     CC1=CC=C2C(=C1)C(C3=C(C(=O)N(C)C3=O)N(C)C4=CC=CC=C4)C(=O)N2CC5=CC=CC=C5
USFYPRDMNXMWPO-UHFFFAOYSA-N     CCCCN1C2=CC=C(C)C=C2C(C3=C(C(=O)N(C)C3=O)NC4=CC=C(C=C4)Br)C1=O
XYHTWFULRHTEAG-MUGXBBEHSA-N     CCCCN1C2=CC=C(C)C=C2/C(=C(/C#N)\C=P(C3=CC=CC=C3)(C4=CC=CC=C4)C5=CC=CC=C5)/C1=O
XALDZIBHNNIVAM-UHFFFAOYSA-N     CCCCN1C2=CC=C(C)C=C2C(C3=C(C(=O)N(C)C3=O)NC4=C(C=CC=C4)O)C1=O
TUTWQHBRQPMLME-OAPYJULQSA-N     COC(=O)/C(=C\1/C2=CC(=CC=C2N(CC3=CC=CC=C3)C1=O)Cl)/C=P(C4=CC=CC=C4)(C5=CC=CC=C5)C6=CC=CC=C6
IYEHFTMZZMIPRU-UHFFFAOYSA-N     CC1=CC=C(C=C1)NC2=C(C3C4=CC(=CC=C4N(CC5=CC=CC=C5)C3=O)Cl)C(=O)N(C)C2=O
KBSDGNPLIPXCEX-UHFFFAOYSA-N     CCCCN1C2=CC=C(C)C=C2C(C3=C(C(=O)N(C)C3=O)NCC4=CC=CC=C4)C1=O
BQGIUMITIGHBSD-UHFFFAOYSA-N     CCCCNC1=C(C2C3=CC(=CC=C3N(CC4=CC=CC=C4)C2=O)C)C(=O)N(C)C1=O
PNSOLOPHIVUPOZ-MNDPQUGUSA-N     CCCCNC/C(=C\1/C2=CC(=CC=C2N(CCCC)C1=O)C)/C#N
HLTBKJRJOIZCMJ-PYCFMQQDSA-N     CCCCN1C2=CC=C(C)C=C2/C(=C(\C#N)/CN(C)C3=CC=CC=C3)/C1=O
FFLHFLUBMRBQTB-UHFFFAOYSA-N     CCCCN1C2=CC=C(C=C2C(C3=C(C(=O)N(C)C3=O)NC4=CC=C(C)C=C4)C1=O)F
FOQOVOLYYARWPA-NKFKGCMQSA-N     C1=CC=C(C=C1)CN2C3=C(C=CC=C3)/C(=C(\C#N)/CNC4=CC(=CC=C4)Cl)/C2=O
KLEPCAQFOXJLNV-UHFFFAOYSA-N     CC1=C(C=CC=C1)NC2=C(C3C4=CC(=CC=C4N(CC5=CC=CC=C5)C3=O)Cl)C(=O)N(C)C2=O
```

That also made me realize that there are not chemical names in the annotation. That would be really useful to move things
forward. Then again, PubChem will likely just generate the IUPAC name, since they have access to such software anyway.
They have teamed up with PubChem which will index it, but I will be interested in seeing how to use this for
`main subject` annotation in [Wikidata](https://www.wikidata.org/wiki/Wikidata:WikiProject_Chemistry).

A final note for now, the model they use is annotate the article with chemical substances (`ChemicalSubstance`) with
(one or more?) molecular entities (`MolecularEntity'). That is a model that scales well to their other journal,
the [Beilstein Journal of Nanotechnology](https://scholia.toolforge.org/venue/Q814756). But scraping that is for another post.
