---
layout: post
title:  "Unfortunate (CDK) decisions"
date:   2011-03-13 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2011/03/unfortunate-cdk-decisions.html
doi: 10.59350/nhf0n-h5687
tags: cdk cheminf opensource
---

Sometimes you make decisions which turn out unlucky. [Christoph](http://www.steinbeck-molecular.de/steinblog/),
[Dan](http://www.openscience.org/blog/?author=2), and I made one about 10 years
ago (see [this photo](http://www.openscience.org/blog/?p=428) from Dan with
his whiteboard where we wrote down our thoughts). The one I am talking about
is not bad in itself, but the implementation is bad; bad in the sense that it
makes it easy for other toolkits to make a difference in size and performance
(see also [Quo vadis, CDK?](http://chem-bla-ics.blogspot.com/2010/09/quo-vadis-cdk.html)).

The reason why I bring this up, is that I am answering a [question on the CCL
mailing list](http://www.ccl.net/cgi-bin/ccl/message-new?2011+03+06+001) on
how to convert a XYZ file into an adjacency matrix, and my [Groovy Cheminformatics](http://chem-bla-ics.blogspot.com/2011/02/groovy-cheminformatics.html)
did not have a section on graph matrices yet. And I just ran into the issue
that the CDK [XYZReader](http://pele.farmbio.uu.se/nightly/cdk-javadoc-1.5.0.git/org/openscience/cdk/io/XYZReader.html)
only accepts an [IChemFile](http://pele.farmbio.uu.se/nightly/cdk-javadoc-1.5.0.git/org/openscience/cdk/interfaces/IChemFile.html).
Then I realized the book doesn't explain yet why that is either.

It basically comes down that chemical files can contain a wide variety of chemistry.
MDL molfiles can contain a single Molecule, but also a set of molecules. Chemical
documents in general, think [Jmol](http://www.jmol.org/), can also contain trajectories
for [cyclohexane](http://en.wikipedia.org/wiki/Cyclohexane) (see [this nice
animation by Bob](http://chemapps.stolaf.edu/jmol/docs/examples-12/jmol-flot-energy.htm?model=data/cyclohexaneFlip.jmol)),
etc, etc. And because the CDK is a general chemistry development toolkit, it
has to support all. So, we have the IChemFile concept which corresponds to a
chemical file, containing a sequence of one or more models, which may be if
a single molecules (e.g. geometry optimizations), or multiple models (e.g. MDL
SD files). Similarly, each model can contain a variety of objects: reactions,
set of molecules, and crystals. Well, you get the point.

Now, at some point, it was decided that being able to convert file formats from
one into another might in fact be interesting (think [OpenBabel](http://www.openbabel.org/)).
That's where it went wrong (and if you start [git blaming](http://www.kernel.org/pub/software/scm/git/docs/git-blame.html)
it would not surprise me if I am the center of all evil here). Just to keep
it simple, it made sense to have all IO classes at least support ChemFile, because
whatever the content, it could always be wrapped in an ChemFile.

So, the answer to the question on the CCL mailing list is a bit more involved
than I wanted:

<pre>import org.openscience.cdk.*;
import org.openscience.cdk.config.*;
import org.openscience.cdk.interfaces.*;
import org.openscience.cdk.io.*;
import org.openscience.cdk.graph.matrix.*;
import org.openscience.cdk.tools.manipulator.*;
import org.openscience.cdk.graph.rebond.*;
import java.io.File;

reader = new XYZReader(
  new File("data/ethanoicacid.xyz").newReader()
);
allContent = ChemFileManipulator.getAllAtomContainers(
  reader.read(new ChemFile())
)
ethanoicAcid = allContent.get(0)

factory = AtomTypeFactory.getInstance(
  "org/openscience/cdk/config/data/jmol_atomtypes.txt", 
  ethanoicAcid.getBuilder()
);
for (IAtom atom : ethanoicAcid.atoms()) {
  factory.configure(atom);
}
RebondTool rebonder = new RebondTool(2.0, 0.5, 0.5);
rebonder.rebond(ethanoicAcid);

int[][] matrix = AdjacencyMatrix.getMatrix(ethanoicAcid)

println "The adjaceny matrix:"
for (row=0;row&lt;ethanoicAcid.getAtomCount();row++) {
  for (col=0;col&lt;ethanoicAcid.getAtomCount();col++) {
    print matrix[row][col] + " "
  }
  println ""
}
</pre>

This code gives this output:

<pre>The adjaceny matrix:
0 1 1 1 1 0 0 0 
1 0 0 0 0 1 1 0 
1 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 
0 1 0 0 0 0 0 0 
0 1 0 0 0 0 0 1 
0 0 0 0 0 0 1 0 
</pre>

Note that the RebondTool didn't pick up the bond order, but that's not needed
for the adjacency matrix anyway.

Getting back on the unfortunate design decision: what would things have looked
liked if we had typed our IChemObject reading and writing classes, allowing
us to differentiate IChemObjectReader&lt;IAtomContaienr> from IChemObjectReader&lt;IChemFile>.
It would have greatly reduced the size of simple programs, or something like
the wished-for 50k [JChemPaint](http://jchempaint.sourceforge.net/) applet.
Right now, pulling in a single reader, will automatically pull in all IChemObject
classes. Rather, I would just pull in IAtomContainer, which in itself is too
large too. But that's for another blog post.

The key thing to remember is: **don't be afraid to add some complexity if that
allows you to make other things optional.**
