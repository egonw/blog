---
layout: post
title:  "My FOAF network #3: My publications"
date:   2008-03-10
blogger-link: https://chem-bla-ics.blogspot.com/2008/03/my-foaf-network-3-my-publications.html
doi: 10.59350/3qtf0-89n45
tags: foaf
---

[As promised](http://chem-bla-ics.blogspot.com/2008/03/my-foaf-network-2-xslt-for-html-gui.html), I'll write a bit about using
*Bibliographic Ontology Specification* (BIBO) over as [bibliontology.com](http://bibliontology.com/). I have written a
[basic XSLT](http://blueobelisk.sourceforge.net/people/egonw/bibo2xhtml.xsl) to create a HTML GUI (open the
[RDF source](http://blueobelisk.sourceforge.net/people/egonw/biblio.xml) in e.g. Firefox). Really basic: it only converts articles,
and even assumes some conventions I found in examples in the [BIBO wiki](http://wiki.bibliontology.com/index.php/Examples).
I have not spotted a BIBO validator yet, so guessing a bit. The BibTeX mapping examples are under discussion, but provide some
insight to those who are used to using that ([JabRef](http://jabref.sourceforge.net/) users, for example).

So, if I understood the specs enough, the following should be valid BIBO (at least it is
[valid RDF](http://www.w3.org/RDF/Validator/ARPServlet?URI=http%3A%2F%2Fblueobelisk.sourceforge.net%2Fpeople%2Fegonw%2Fbiblio.xml&PARSE=Parse+URI%3A+&TRIPLES_AND_GRAPH=PRINT_TRIPLES&FORMAT=PNG_EMBED)):

```xml
<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet type="text/xsl"
                 href="http://blueobelisk.sourceforge.net/people/egonw/bibo2xhtml.xsl"
                 ?>
<rdf:RDF
      xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
      xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
      xmlns:bibo="http://purl.org/ontology/biblio/"
      xmlns:dc="http://purl.org/dc/elements/1.1/"
      xmlns:dcterms="http://purl.org/dc/terms/"
      xmlns:foaf="http://xmlns.com/foaf/0.1/"
>

  <bibo:Journal rdf:about="urn:issn:1471-2105">
    <dc:title>BMC Bioinformatics</dc:title>
  </bibo:Journal>

  <bibo:Article rdf:about="http://dx.doi.org/10.1186/1471-2105-8-59">
    <dc:title>Bioclipse: an open source workbench for chemo- and bioinformatics</dc:title>
    <dc:date>2007-02-22</dc:date>
    <dc:isPartOf rdf:resource="urn:issn:1471-2105"/>
    <bibo:volume>8</bibo:volume>
    <bibo:doi>10.1186/1471-2105-8-59</bibo:doi>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Ola Spjuth"/></bibo:contributor>
        <bibo:position>1</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Tobias Helmus"/></bibo:contributor>
        <bibo:position>2</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Egon Willighagen"/></bibo:contributor>
        <bibo:position>3</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Stefan Kuhn"/></bibo:contributor>
        <bibo:position>4</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Martin Eklund"/></bibo:contributor>
        <bibo:position>5</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Johannes Wagener"/></bibo:contributor>
        <bibo:position>6</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Peter Murray-Rust"/></bibo:contributor>
        <bibo:position>7</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Christoph Steinbeck"/></bibo:contributor>
        <bibo:position>8</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

    <bibo:contribution>
      <bibo:Contribution>
        <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
        <bibo:contributor><foaf:Person foaf:name="Jarl Wikberg"/></bibo:contributor>
        <bibo:position>9</bibo:position>
      </bibo:Contribution>
    </bibo:contribution>

  </bibo:Article>

</rdf:RDF>
```

There are some things notable about this markup:

1. It is **very** verbose, even for XML standards!
2. It's RDF from the ground up
3. it reuses many other ontologies

Particularly, the authors section is very verbose. However, it also nicely reuses [FOAF](http://www.foaf-project.org/)
here. This makes it really powerful. For example, I could have used this bit:

```xml
<bibo:contribution>
  <bibo:Contribution>
    <bibo:role rdf:resource="http://purl.org/ontology/bibo/roles/author" />
    <bibo:contributor rdf:resource="http://blueobelisk.sourceforge.net/people/egonw/foaf.xml#me"/>
    <bibo:position>3</bibo:position>
  </bibo:Contribution>
</bibo:contribution>
```

This would *semantically link* this publication to whatever information I have on myself published in my FOAF file.

Now, the reason why I have not done this yet, is that the XSLT did not properly load the XML from my foaf file:

```xml
<xsl:variable name="foafURI" select="substring-before(bibo:contributor/@rdf:resource, '#')"/>
<xsl:variable name="authorID" select="substring-after(bibo:contributor/@rdf:resource, '#')"/>
<xsl:variable name="foafDoc" select="document($foafURI)"/>
<xsl:value-of select="$foafDoc//foaf:Person[@rdf:ID=$authorID]"/>
```

The XSLT processor *xsltproc* (version 1.1.22 on Ubuntu 8.04) gives this error:
`warning: failed to load external entity "http://blueobelisk.sourceforge.net/people/egonw/foaf.xml"`.
But, if I make it a relative, it does work. Both with xsltproc as well as with Firefox online.

Another reason not to do it like that, is that one looses control of the citation content. What I will do soon, is use
this set up, making [researcherid.com](http://www.researcherid.com/) obsolete (see also
[these](http://plindenbaum.blogspot.com/2008/01/thomson-scientific-launches.html)
[three](http://nsaunders.wordpress.com/2008/01/17/researcher-id/)
[blogs](http://mndoci.com/blog/2008/01/17/researcherid-doesnt-seem-like-all-that/)):

```xml
<bibo:contributor>
  <foaf:Person foaf:name="Egon Willighagen">
    <rdfs:seeAlso rdf:resource="http://blueobelisk.sourceforge.net/people/egonw/biblio.xml#me"/>
  </foaf:Person>
</bibo:contributor>
```

Just in case you are wondering, *"why the ### does he not simply use BibTeX?"*, the answer is RDF.
No RDF, no SPARQL, no GLORY. Just thing how easy it will become to run a queries like:

* which of those I have published with, run a blog
* which of those I have published with are going to that conference in Boston in September?
* which of those I have published with have friends who published about topics around these keywords
* etc...

All that becomes very easy now.

BTW, this is how I link to my bibliography from my FOAF:

```xml
<foaf:publications rdf:resource="http://blueobelisk.sourceforge.net/people/egonw/biblio.xml"/>
```
