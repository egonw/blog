---
layout: post
title:  "Using Wikipedia to recognize Molecules in Blogspace"
date:   2007-06-19
blogger-link: https://chem-bla-ics.blogspot.com/2007/06/using-wikipedia-to-recognize-molecules.html
tags:
---

Only few people are [using InChI's to indicate the molecules the blog about](http://chem-bla-ics.blogspot.com/2006/12/including-smiles-cml-and-inchi-in.html)
(prominent exceptions are [Useful Chemistry](http://usefulchem.blogspot.com/) and [Molecule of the Day](http://www.scienceblogs.com/moleculeoftheday/)).
Consequently, the number of detected molecules (without using OSCAR3) in [Chemical blogspace](http://cb.openmolecules.net/) has been low.

Fortunately, many more people use links to [Wikipedia](http://wikipedia.org/) to identify the molecules that talk about. And some of these pages
use the [ChemBox template](http://en.wikipedia.org/wiki/Template:Chembox) which actually might contain a
[PubChem](http://pubchem.ncbi.nlm.nih.gov/) CID or even an [InChI](http://www.iupac.org/inchi/). This has increased the
[molecular content of Chemical blogspace](http://cb.openmolecules.net/inchis.php) considerably.

There is also, however, a good list of molecules in Wikipedia for which no CID or InChI is given:

```
http://www.en.wikipedia.org/wiki/Hafnium(IV)_oxide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Cubane -> but no InChI/CID
http://www.en.wikipedia.org/wiki/water -> but no InChI/CID
http://www.en.wikipedia.org/wiki/oxidane -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Carminic_acid -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Alizarin -> but no InChI/CID
http://www.en.wikipedia.org/wiki/AIBN -> but no InChI/CID
http://www.en.wikipedia.org/wiki/piperidine -> but no InChI/CID
http://www.en.wikipedia.org/wiki/hydroxide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/tetrahydrocannabinol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Epibatidine -> but no InChI/CID
http://www.en.wikipedia.org/wiki/cortisone -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Eschenmoser%27s_salt -> but no InChI/CID
http://www.en.wikipedia.org/wiki/pyrrole -> but no InChI/CID
http://www.en.wikipedia.org/wiki/anthracene -> but no InChI/CID
http://www.en.wikipedia.org/wiki/benzylbromide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Skatole -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Teicoplanin -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Methyl_violet -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Penicillin -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Aspartame -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Splenda -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Sucrose -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Rhodamine -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Ascorbic_acid -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Tabun_(nerve_agent) -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Soman -> but no InChI/CID
http://www.wikipedia.org/wiki/Phosgene -> but no InChI/CID
http://www.en.wikipedia.org/wiki/AZD2171 -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Heavy_water -> but no InChI/CID
http://www.en.wikipedia.org/wiki/MTBE -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Biotin -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Spermine -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Silicon_carbide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/stilbene -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Methyl_salicylate -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Dmso -> but no InChI/CID
http://www.en.wikipedia.org/wiki/DMF -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Acetonitrile -> but no InChI/CID
http://www.en.wikipedia.org/wiki/HMPA -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Phenol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/TBHQ -> but no InChI/CID
http://www.en.wikipedia.org/wiki/MTBE -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Salvia_divinorum -> but no InChI/CID
http://www.en.wikipedia.org/wiki/salvinorin -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Tetrahydrocannabinol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Selenium_dioxide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Piperidine -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Resveratrol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/P4O10 -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Dimethyl_sulfide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Folate -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Hydroxybenzotriazole -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Hydrogen_cyanide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Peroxyacetic_acid -> but no InChI/CID
http://www.en.wikipedia.org/wiki/epothilone -> but no InChI/CID
http://www.en.wikipedia.org/wiki/paraquat -> but no InChI/CID
http://www.en.wikipedia.org/wiki/N-butyllithium -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Nafion -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Boron_nitride -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Triclosan -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Hydrogen_peroxide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Cholesterol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/DMAP -> but no InChI/CID
http://www.en.wikipedia.org/wiki/aniline -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Phenol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Ascorbic_acid -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Nicotine -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Tetra-ethyl_lead -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Acetophenone -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Ethanol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Acetaldehyde -> but no InChI/CID
http://www.en.wikipedia.org/wiki/EDTA -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Menthol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Formic_acid -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Octanitrocubane -> but no InChI/CID
http://www.en.wikipedia.org/wiki/VX_%28nerve_agent%29 -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Tetraazidomethane -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Lawesson%27s_reagent -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Hexafluoroisopropanol -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Cellulose -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Bremelanotide -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Cellulose -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Dimethicone#Applications -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Shikimic_acid -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Methyl_amine -> but no InChI/CID
http://www.en.wikipedia.org/wiki/Dimethyl_amine -> but no InChI/CID
http://www.en.wikipedia.org/wiki/DDT -> but no InChI/CID
```

I really would like to start adding InChI's for these molecules to Wikipedia, but someone needs to enlighten me about
the state of ChemBox? Can the InChI be added to the template, or should the InChI be given elsewhere on the page?
Adding such small bits is easier than [writing a full entry](http://mndoci.com/blog/2007/06/17/writing-something-on-wikipedia/).
