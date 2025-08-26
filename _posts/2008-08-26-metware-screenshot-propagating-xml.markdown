---
layout: post
title:  "MetWare screenshot: propagating XML Schema data types"
date:   2008-08-26
modified_date: 2025-08-26
blogger-link: https://chem-bla-ics.blogspot.com/2008/08/metware-screenshot-propagating-xml.html
doi: 10.59350/9se4x-ewm11
tags: metware xml skos doi:10.1186/1471-2105-8-487
image: /assets/images/boolDataType.png
---

Just a quick screenshot. Remember our use of [SKOS in MetWare <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/05/16/metware-status-report.html)?
[Steffen <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/08/26/metware-screenshot-propagating-xml.html) has been working on creating integrated
[JSF pages](http://en.wikipedia.org/wiki/JavaServer_Faces), while I am focusing on autogeneration of blobs. The below screenshot is
such a blob, called a UI component in JSF, which allows easy embedding the the aggregations Steffen is working on.

Autogeneration of web content benefits greatly from well defined input, including data types.
[MetWare](http://www.metware.org/) uses [XML Schema Data Types](http://en.wikipedia.org/wiki/XML_Schema_(W3C)#Data_Types)
for this, as [mentioned ealier <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2008/08/21/metware-screenshot-spectrum-support-2.html) when I briefly
mentioned generation of search pages. That example showed the creation of range input on `xsd:integer` types. The below screenshot
shows the different output for `xsd:string` (input text box) and `xsd:boolean`:

![](/assets/images/boolDataType.png)

Now, this example is not really shocking, but MetWare defines additional types, for example an InChI data type:

```xml
<simpleType name="inchi">
  <restriction base="string">
    <pattern value="InChI=1/.*"/>
  </restriction>
</simpleType>
```

This allows me to tweak the HTML output created by the JSF pages to include [microformats](http://microformats.org/) to support
the [Sechemtic <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/05/05/cb-comments-for-inchis.html) userscript (see also
doi:[10.1186/1471-2105-8-487](https://doi.org/10.1186/1471-2105-8-487)).

Or, to provide a drop down box, listing the allowed values:

```xml
<simpleType name="deviceVendor">
  <restriction base="string">
    <enumeration value="BioCrates"/>
    <enumeration value="Bruecker"/>
  </restriction>
</simpleType>
```
