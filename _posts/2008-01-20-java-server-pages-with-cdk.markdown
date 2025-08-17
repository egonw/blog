---
layout: post
title:  "Java Server Pages with CDK functionality"
date:   2008-01-20
modified_date: 2025-08-17
blogger-link: https://chem-bla-ics.blogspot.com/2008/01/java-server-pages-with-cdk.html
doi: 10.59350/3kvks-pdb73
tags: java cdk metware justdoi:10.59350/4gxzp-tds81
---

Setting up interactive web pages can be done in many way. [Java Server Pages](http://en.wikipedia.org/wiki/JavaServer_Pages) are just one of them.
They are quite similar to PHP pages or [Ruby <i class="fa-solid fa-recycle fa-xs"></i>](https://doi.org/10.59350/4gxzp-tds81),
and combine plain HTML (and likely any other output) code with fragments of code; Java source code in this case.

[Ubuntu](http://www.ubuntu.com/)'s [tomcat5.5](http://packages.ubuntu.com/gutsy/web/tomcat5.5) package installs quite easily, and sets up a server
at port 8180. I still have to figure out how to nicely integrate it with the Apache server on port 80, though. Suggestions much appreciated.

From then on, one can add new JSP pages by creating a 'webapp' in `/usr/share/tomcat5.5-webapps`. The basic structure looks like:

```shell
mb-examples.xml
mb-examples/index.jsp
mb-examples/WEB-INF/
mb-examples/WEB-INF/classes/
mb-examples/WEB-INF/lib/
```

Just copying the [large CDK jar](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/) (the one with all the third party libraries)
into `WEB-INF/lib/` did not work for me, but unjaring it into `WEB-INF/classes/` seem to work fine.

Then, you can just add Java code using the CDK library for what ever you like. The following (simple) example JSP page, takes one parameter,
a molecular formula. This could be the input given in a FORM, but the below page does not deal with that situation yet:

```xml
<%@ page import="java.util.*,org.openscience.cdk.*,org.openscience.cdk.tools.*" %>
<!doctype html public "-//w3c//dtd html 4.0 transitional//en">
<html>
<%
   String mf = request.getParameter( "mf" );
%>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
   <meta name="Author" content="E.L. Willighagen">
   <title>Metabolomics Examples</title>
</head>

<body bgcolor="#FFFFFF">

<table>
<tr>
<td>Molecular Formula:</td>
<td><%= mf %></td>
</tr>

<%
MFAnalyser analyser = new MFAnalyser(mf, new Molecule());
double accurateMass = Math.round(analyser.getMass()*10000.0)/10000.0;
%>

<tr>
<td>Mono-isotopic Accurate Mass:</td>
<td><%= accurateMass %></td>
</tr>
</table>

</body>
</html>
```

Now, a lot of improvement can be achieved. For example, the `<head>` stuff can be split out in a `header.include`. And, after proper integration with the
Apache server, [rewrites](http://httpd.apache.org/docs/2.0/misc/rewriteguide.html) could be used to create a REST service. But, the above is just to give you an idea.

In case you wonder, this work is related to the opensource [MetWare <i class="fa-solid fa-recycle fa-xs"></i>](https://chem-bla-ics.linkedchemistry.info/2007/11/22/metware-metabolomics-database-project.html)
database software development our group is involved in.
