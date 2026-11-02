---
layout: post
title:  "ToxBank: a data warehouse for (computational) toxicology"
date:   2011-03-08
blogger-link: https://chem-bla-ics.blogspot.com/2011/03/toxbank-data-warehouse-for.html
doi: 10.59350/9zxcp-3yk93
tags: metabolomics metware nature nmr opendata publishing
---

Last week I was in sunny [Cascais](http://en.wikipedia.org/wiki/Cascais), and
in three days experienced -23<sup>o</sup>C and +18<sup>o</sup>C. The reason
I was there was the kick-off meeting of the EU FP7 cluster SEURAT, which includes
'our' [ToxBank](http://toxbank.net/) project.

[![](http://toxbank.net/sites/default/files/u6/ToxBank%20Components.png)](http://toxbank.net/sites/default/files/u6/ToxBank%20Components.png)

Data types we will host include many different types, including my favorite
metabolomics. Don't ask me what this will practically mean, but some keywords
we already know include RDF, [OpenTox](http://opentox.org/), and [ToxML](http://www.leadscope.com/toxml.php).
With metabolomics, I hope to squeeze in metabolomics.

And that data warehousing for metabolomics is important was only recently shown
be the retraction (via [RetractionWatch](http://retractionwatch.wordpress.com/))
of [this Nature paper](http://www.nature.com/nature/journal/v434/n7030/full/nature03356.html)
(doi:[10.1038/nature03356](http://dx.doi.org/10.1038/nature03356)). The reason
was that it critically depended on conclusions from another [retracted](http://pubs.acs.org/doi/abs/10.1021/jf902670b)
[paper](http://pubs.acs.org/doi/abs/10.1021/jf021166h) (doi:[10.1021/jf021166h](http://dx.doi.org/10.1021/jf021166h)),
from J. Agric. Food Chem. in 2009.

In this paper, they identified ten chemicals from arabidopsis: [butanoic acid](http://en.wikipedia.org/wiki/Butanoic_acid);
[trans-cinnamic acid](http://en.wikipedia.org/wiki/Trans-cinnamic_acid); o-[coumaric
acid](http://en.wikipedia.org/wiki/Coumaric_acid); p-coumaric acid; [ferulic
acid](http://en.wikipedia.org/wiki/Ferulic_acid); p-hydroxybenzamide; [methyl
p-hydroxybenzoate](http://en.wikipedia.org/wiki/Methyl_p-hydroxybenzoate); 3-indolepropanoic
acid; [syringic acid](http://en.wikipedia.org/wiki/Syringic_acid); and, [vanillic
acid](http://en.wikipedia.org/wiki/Vanillic_acid). I hope I have the links to
Wikipedia correct, as this was based on names only, as the paper does not seem
to list InChIs or even SMILESes. The ten chemical were identified with HPLC
and NMR. No experimental data seems to be given. What NMR data did they base
the identification on? I have seen pretty interesting assignments of chemical
identity in GC/MS and LC/MS, so was quite disappointed to not see the gory details
here.

But fortunately, I could look at the raw data. Yeah, sure! Dream on.

In fact, it seems the characterizations of the 10 chemicals was challenged,
causing the authors to look again at their data. Unfortunately, they could not
find experimental data anymore. The authors write in the [retraction](http://pubs.acs.org/doi/full/10.1021/jf902670b):



Now, readers of my blog I care about raw data (see [McPrinciple #1](http://chem-bla-ics.blogspot.com/2010/08/molecular-chemometrics-principles-1.html)).
For example, it was a key feature of our [MetWare](http://chem-bla-ics.blogspot.com/search?q=MetWare)
project. It is not entirely clear to me that they could no longer find the raw
data, or whether they were no longer able to correlate their extracted characteristics
with the know NMR for those ten compounds. This only strengthens the importance
of NMR databases in metabolite identification, something [Christoph](http://www.steinbeck-molecular.de/steinblog/)
would only agree with.

I am not sure we will see the bottom of this, and see if the authors could have
prevented this retraction. However, I do believe the paper was flawed in the
first place: it did not give experimental detail allowing the referees to judge
the metabolite identification. The referees failed, as the apparently did not
find this aspect important enough to have this data in the paper. And, the journal
failed clearly, by not having a good editorial requirement in place around availability
of data. This is not specific to this retracted paper, nor of this journal.
It's pretty much the community standard, despite many calling for years for
better standards, e.g. via minimal reporting standards.

Well, maybe journal editors will soon wake up, and make availability of experimental
data in papers of this kind (and any type, IMHO) a community standard, and strong
standard, such strong that referees can reject papers of papers do not provide
this minimal information.

Why? It would have saved a lot of people from doing the wrong thing. The original
paper was cited 54 times (according to WoS) and the Nature paper 52 times (up
one since the RetractionWatch post). We're bound to see a few more retractions
as a result of this, I guess.

So, where I failed to get MetWare going within the [Netherlands Metabolomics
Center](http://www.metabolomicscentre.nl/), let's hope ToxBank does better.
But given the list of ToxBank partners, I have no doubt about that.

<span style="float: left; padding-bottom: 5px; padding-left: 5px; padding-right: 5px; padding-top: 5px;"><a href="http://www.researchblogging.org/"><img alt="ResearchBlogging.org" src="http://www.researchblogging.org/public/citation_icons/rb2_tiny.png" style="border: 0;"></a></span><span class="Z3988" title="ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Ajournal&amp;rft.jtitle=Nature&amp;rft_id=info%3Adoi%2F10.1038%2Fnature03356&amp;rfr_id=info%3Asid%2Fresearchblogging.org&amp;rft.atitle=Mediation+of+pathogen+resistance+by+exudation+of+antimicrobials+from+roots&amp;rft.issn=0028-0836&amp;rft.date=2005&amp;rft.volume=434&amp;rft.issue=7030&amp;rft.spage=217&amp;rft.epage=221&amp;rft.artnum=http%3A%2F%2Fwww.nature.com%2Fdoifinder%2F10.1038%2Fnature03356&amp;rft.au=Bais%2C+H.&amp;rft.au=Prithiviraj%2C+B.&amp;rft.au=Jha%2C+A.&amp;rft.au=Ausubel%2C+F.&amp;rft.au=Vivanco%2C+J.&amp;rfe_dat=bpr3.included=1;bpr3.tags=Biology%2CChemistry%2CCheminformatics%2C+Bioinformatics">Bais, H., Prithiviraj, B., Jha, A., Ausubel, F., &amp; Vivanco, J. (2005). Mediation of pathogen resistance by exudation of antimicrobials from roots <span style="font-style: italic;">Nature, 434</span> (7030), 217-221 DOI: <a href="http://dx.doi.org/10.1038/nature03356" rev="review">10.1038/nature03356</a></span>

<span style="float: left; padding-bottom: 5px; padding-left: 5px; padding-right: 5px; padding-top: 5px;"><a href="http://www.researchblogging.org/"><img alt="ResearchBlogging.org" src="http://www.researchblogging.org/public/citation_icons/rb2_tiny.png" style="border: 0;"></a></span><span class="Z3988" title="ctx_ver=Z39.88-2004&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Ajournal&amp;rft.jtitle=Journal+of+Agricultural+and+Food+Chemistry&amp;rft_id=info%3Adoi%2F10.1021%2Fjf021166h&amp;rfr_id=info%3Asid%2Fresearchblogging.org&amp;rft.atitle=++++++++++++++Metabolic+Profiling+of+Root+Exudates+of%0D%0A++++++++++++++%0D%0A++++++++++++++%0D%0A++++++++++++&amp;rft.issn=0021-8561&amp;rft.date=2003&amp;rft.volume=51&amp;rft.issue=9&amp;rft.spage=2548&amp;rft.epage=2554&amp;rft.artnum=http%3A%2F%2Fpubs.acs.org%2Fdoi%2Fabs%2F10.1021%2Fjf021166h&amp;rft.au=Walker%2C+T.&amp;rft.au=Bais%2C+H.&amp;rft.au=Halligan%2C+K.&amp;rft.au=Stermitz%2C+F.&amp;rft.au=Vivanco%2C+J.&amp;rfe_dat=bpr3.included=1;bpr3.tags=Biology%2CChemistry%2CCheminformatics%2C+Bioinformatics">Walker, T., Bais, H., Halligan, K., Stermitz, F., &amp; Vivanco, J. (2003). Metabolic Profiling of Root Exudates of Arabidopsis thaliana, <span style="font-style: italic;">Journal of Agricultural and Food Chemistry, 51</span> (9), 2548-2554 DOI: <a href="http://dx.doi.org/10.1021/jf021166h" rev="review">10.1021/jf021166h</a></span>
