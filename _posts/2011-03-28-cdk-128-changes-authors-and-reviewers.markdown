---
layout: post
title:  "CDK 1.2.8: the changes, the authors, and the reviewers"
date:   2011-03-28
blogger-link: https://chem-bla-ics.blogspot.com/2011/03/cdk-128-changes-authors-and-reviewers.html
doi: 10.59350/y29eg-mw866
tags: cdk cheminf java
---

[CDK 1.2.8](https://sourceforge.net/projects/cdk/files/cdk/1.2.8/) is one more
bug fix release in the 1.2 series.

**The changes**  
The changes include another few new atom types and fixes of recognition of earlier
defined atom types, further widening the scope of chemistry recognized by the 1.2
series. It also has a few other minor fixes, as listed below.

* fixed pdb_atomtypes.xml errors mentioned in https://sourceforge.net/mailarchive/message.php?msg_id=27206678,
  including the nigly vdwRadius for GLN.CD [3ab7c25](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3ab7c25)
* whitespace-only: alignment of TYR-section [5b51e15](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=5b51e15)
* Added two new authors [f72be81](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=f72be81)
* Fixed a concurrency error, caused by the use of a static field which was not
  supposed to be static, as the classes are instantiated just to allow customization
  [9f54afc](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=9f54afc)
* Fixed the use of the proper Convertor [3ea9180](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=3ea9180)
* Added the Co(3+) atom type (fixes #3093644) [c368c3d](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=c368c3d)
* Added the unit test phosphine for bug #3190151 [851c1a6](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=851c1a6)
* Added a unit test for a phosphor without explicit or implicit hydrogens [b35f3bf](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=b35f3bf)
* Updated OrderQueryBond in SMARTS & isomorphism matching so that we correctly
  match when faced with aromatic bonds (rather than just looking at the bond
  order) [15f64ff](http://cdk.git.sourceforge.net/git/gitweb.cgi?p=cdk/cdk;a=commit;h=15f64ff)

**The authors**

<pre>4  Egon Willighagen 
2  Jules Kerssemakers 
1  Julio Peironcely 
1  Rajarshi Guha 
</pre>

**The reviewers**

<pre>5  Rajarshi  Guha 
3  Egon Willighagen 
</pre>
