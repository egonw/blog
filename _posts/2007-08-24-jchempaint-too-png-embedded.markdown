---
layout: post
title:  "JChemPaint too: PNG embedded connectivity tables"
date:   2007-08-24
doi: 10.59350/rxpr6-t1772
blogger-link: https://chem-bla-ics.blogspot.com/2007/08/jchempaint-too-png-embedded.html
tags: jchempaint cheminf inchikey:RWCCWEUUXYIKHB-UHFFFAOYSA-N
image: /assets/images/jcpPNGmolfile.png
---

Rich blogged about Firefly [embedding MDL molfiles in PNG images](http://depth-first.com/articles/2007/08/01/never-draw-the-same-molecule-twice-image-metadata-for-cheminformatics),
which I found [really](http://depth-first.com/articles/2007/08/08/never-draw-the-same-molecule-twice-viewing-image-metadata) cool.
Rich and Noel later showed how that metadata [can be retrieved again](http://depth-first.com/articles/2007/08/08/never-draw-the-same-molecule-twice-viewing-image-metadata),
possibly [with Python](http://baoilleach.blogspot.com/2007/08/access-embedded-molecular-information.html).

But I did not like that [Firefly](http://depth-first.com/articles/tag/firefly) could do this, and [JChemPaint](http://www.mdpi.org/molecules/html/50100093.htm) not.
So, I started hacking. First I discovered I had to get rid of the use of [JAI](http://java.sun.com/javase/technologies/desktop/media/jai/); then I had to adapt the
JChemPaintPanel `takeSnaphot()` API to return a `RendererImage`; and finally, I had to figure out how to write the extra metadata. Now, Firefly is not opensource
(yet), so it took me some time to figure out how that was done, and this is how:

```java
ImageWriter writer = ImageIO.getImageWriters(
  new ImageTypeSpecifier(awtImage), "png"
).next();
ImageTypeSpecifier specifier = new ImageTypeSpecifier(awtImage);
IIOMetadata meta = writer.getDefaultImageMetadata( specifier, null );

Node node = meta.getAsTree( "javax_imageio_png_1.0" );
IIOMetadataNode tExtNode = new IIOMetadataNode("tEXt");
IIOMetadataNode tExtEntryNode = new IIOMetadataNode("tEXtEntry");
tExtEntryNode.setAttribute( "keyword", "molfile" );
tExtEntryNode.setAttribute( "value", mdlMolfile);
tExtNode.appendChild(tExtEntryNode);
node.appendChild(tExtNode);
meta.mergeTree("javax_imageio_png_1.0", node);
ImageOutputStream ios = ImageIO.createImageOutputStream(
  new FileOutputStream(filename)
);
writer.setOutput(ios);
writer.write( meta, new IIOImage(awtImage, null, meta), null );
```

Now I can create my own test files for the [Strigi's ability to extract chemical metadata from PNG images](http://neksa.blogspot.com/2007/08/strigi-now-extracts-chemical.html).
Here is the JChemPaint generator PNG image for [benzophenone](http://en.wikipedia.org/wiki/Benzophenone):

![](/assets/images/mdlTest.png)

Another issue, unrelated to this patch, is that writing PNG images changes the location of the structure in the JChemPaint editor,
and that the placing of the element symbol in image writing is seriously broken. But that will soon be solved with
[Niels' new renderer](https://progz-jchem.blogspot.com/).

The metadata looks like:

![](/assets/images/jcpPNGmolfile.png)

(Newlines are lost in the XML display.)

JChemPaint does not yet write InChIs, and it also does not open PNG images for input yet (as Firefly does).
