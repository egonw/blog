---
layout: post
title:  "Glueing BioMoby services together with JavaScript in Bioclipse"
date:   2007-11-05
blogger-link: https://chem-bla-ics.blogspot.com/2007/11/glueing-biomoby-services-together-with.html
doi: 10.59350/vkwhn-4tw77
tags: bioclipse javascript
---

[Ola](http://www.blogger.com/profile/10379047094508592338) has been doing a good job of integrating
[BioMoby](http://biomoby.org/) support into Bioclipse. Earlier he completed a GUI for running BioMOBY
services, and added more recently [a JavaScript wrapper too](http://bioclipse.blogspot.com/2007/11/scripting-biomoby-in-bioclipse.html),
using the [Rhino plugin](http://wiki.bioclipse.net/index.php?title=Bc_rhino) developed by Johannes.

For example:

```javascript
console = Packages.net.bioclipse.util.BioclipseConsole;
moby = Packages.net.bioclipse.biomoby.ui.scripts.MobyServiceScripting;
biojava = Packages.net.bioclipse.biojava.scripts.BioJavaScripting;

prot=moby.downloadGenbank("NCBI_GI","111076");
seq=biojava.parseString(prot);
fasta=biojava.toFasta(seq);

console.writeToConsole(fasta);
```

Today, he explained [how to create convenience JavaScript shortcuts](http://bioclipse.blogspot.com/2007/11/adding-scripting-commands-to-bioclipse.html),
to reduce the typing.

Screenshots and status of the Bioclipse-BioMoby work is [available from the wiki](http://wiki.bioclipse.net/index.php?title=BioMoby_plugin).
