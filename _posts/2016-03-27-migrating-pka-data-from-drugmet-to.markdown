---
layout: post
title:  "Migrating pKa data from DrugMet to Wikidata"
date:   2016-03-27
blogger-link: https://chem-bla-ics.blogspot.com/2016/03/migrating-pka-data-from-drugmet-to.html
tags: wikidata chemistry doi:10.3897/RIO.1.E7573 doi:10.1371/JOURNAL.PONE.0025513
  justdoi:10.1093/DATABASE/BAW015 justdoi:10.1021/ED050P510 justdoi:10.1021/JA01489A008
image: /assets/images/pKa4.png
---

In 2010 [Samuel Lampa](https://twitter.com/smllmp) and I started a pet project:
collecting pK<sub>a</sub> data: he was working on RDF extension of MediaWiki and I like consuming
RDF data. We started [DrugMet](http://drugmet.rilspace.org/wiki/Main_Page).
When you read this post, this MediaWiki installation may already be down, which
is why I am migrating the data to [Wikidata](https://en.wikipedia.org/wiki/Wikidata).
Why? Because data curation takes effort, I like to play with Wikidata (see
[this H2020 proposal](http://rio.pensoft.net/articles.php?id=7573) by 
[Daniel Mietchen](https://twitter.com/EvoMRI) *et al.*), I like Open Data, and it still
[much needed](http://proteinsandwavefunctions.blogspot.nl/2016/03/generating-protonation-states-and.html).

We opted for a page with the minimal amount of information. To maximize the speed
at which we could add information. However, when it came to semantics, we tried
to be as explicit as possible, and, e.g. use [the CHEMINF ontology](https://doi.org/10.1371/journal.pone.0025513).
So, it collected:

1. InChIKey (used to show images)
2. the paper it was collected from (identified by a DOI)
3. the value, and where possible, the experimental error

A page typically looks something like this:

![](/assets/images/pKa.png)

While not used on all pages, at some point I even started using templates, and
I used these two, for molecules and papers:

```{% raw  %}
{{Molecule
  |Name=
  |InChIKey=
  |DOI=
  |Wikidata=
}}

{{Paper
  |DOI=
  |Year=
  |Wikidata=
}}
{% endraw  %}```

These templates, as well as the above screenshot, already contain a spoiler, but
more about that later. Using MediaWiki functionality it was now easy to make lists,
e.g. for all pK<sub>a</sub> data (more spoilers):

![](/assets/images/pKa1.png)

I find a database like this very important. It does not capture all the information
it should be capturing, though, as is clear from [the proposal](https://www.overleaf.com/read/wqfsxrgrrbzx)
some of use worked on a while back. However, this project got on hold; I don't
have time for it anymore, and it is not core to our department enough to spend
time on write grant proposals for it.

But I still do not want to get this data get lost. Wikidata is something I have
started using, as it is a machine readable CCZero database with an increasing
amount of scientific knowledge. More and more people are working on it, and you
must absolutely [read this paper](http://dx.doi.org/10.1093/database/baw015)
about this very topic (by [a great team](https://bitbucket.org/sulab/wikidatabots)
you should track, anyway). I am using it myself as source of identifier mappings
and more. So, migrating the previously collected data to Wikidata makes perfect
sense to me:

1. if a compound is missing, I can easily [create a new one using Bioclipse](http://chem-bla-ics.blogspot.nl/2016/03/adding-disclosures-to-wikidata-with.html)
2. if a paper is missing, I can easily [create a new one using Magnus Manske's QuickStatements](http://chem-bla-ics.blogspot.nl/2016/03/adding-disclosures-to-wikidata-with.html)
3. Wikidata has a pretty decent provenance model

I can annotate data with the data source (paper) it came from and also experimental conditions:

![](/assets/images/pKa2.png)

In fact, you'll note that the the book is a separate Wikidata entry in itself.
Better even, it's an 'edition' of the book. This is the whole point we make in
the above linked H2020 proposal: Wikidata is not a database specific for one
domain, it works for any (scholarly) domain, and seamlessly links all those
domains.

Now, to keep track of what data I have migrated, I am annotating DrugMet entries
with links to Wikidata: everything with a Wikidata Q-code is already migrated.
The above pK<sub>a</sub> table already shows Q-identifiers, but I also created them for all
data sources I have used (three of them are two books and
[one old paper without a DOI](https://twitter.com/JBiolChem/status/713779938969698305)):

![](/assets/images/pKa3.png)

I have still quite a number of entries to do, but all the protocols are set up now.

On the downstream side, Wikidata is also great because of
[their SPARQL end point](https://query.wikidata.org/). Something that I did not
get worked out some weeks ago, I did manage yesterday (after
[some encouragement from @arthursmith](https://twitter.com/arthursmith/status/713730159422095360)):
list all pK<sub>a</sub> statements, including literature source if available:

If you [run that query on the Wikidata endpoint](https://query.wikidata.org/#SELECT%20%3Fwikidata%20%3Fcompound%20%3FpKa%20%3Fsource%20%3Ftitle%20%3Fdoi%20WHERE%20%7B%0A%20%20%3Fwikidata%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2FP1117%3E%20%3Ffoo%20%3B%0A%20%20%20%20rdfs%3Alabel%20%3Fcompound%20.%0A%20%20%3Ffoo%20a%20wikibase%3ABestRank%20%3B%0A%20%20%20%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fstatement%2FP1117%3E%20%3FpKa%20.%0A%20%20OPTIONAL%20%7B%0A%20%20%20%20%3Ffoo%20prov%3AwasDerivedFrom%2F%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Freference%2FP248%3E%20%3Fsource%20.%0A%20%20%20%20%3Fsource%20rdfs%3Alabel%20%3Ftitle%20.%0A%20%20%20%20OPTIONAL%20%7B%20%3Fsource%20wdt%3AP356%20%3Fdoi%20.%20%7D%0A%20%20%20%20FILTER(lang(%3Ftitle)%20%3D%20%22en%22)%0A%20%20%7D%0A%20%20FILTER(lang(%3Fcompound)%20%3D%20%22en%22)%0A%7D),
you get a table like this:

![](/assets/images/pKa4.png)

We here see experimental data from two papers: [10.1021/ja01489a008](https://doi.org/10.1021/ja01489a008)
and [10.1021/ed050p510](https://doi.org/10.1021/ed050p510). This can all be
displayed a lot fancier, like make histograms, tables with 2D drawings of the
chemical structures, etc, but I leave that to the reader.
