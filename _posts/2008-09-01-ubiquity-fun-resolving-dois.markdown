---
layout: post
title:  "Ubiquity fun: resolving DOIs"
date:   2008-09-01
blogger-link: https://chem-bla-ics.blogspot.com/2008/09/ubiquity-fun-resolving-dois.html
doi: 10.59350/gfjz7-ykc12
tags: javascript web doi
---

Now, I'm really after something else, but here's my first [Ubiquity](https://wiki.mozilla.org/Labs/Ubiquity)
[scripts](http://blueobelisk.sourceforge.net/people/egonw/ubiquity.html). It allow you to select a DOI on any
web page (which really only makes sense if it is not already a hyperlink), you hit ALT-SPACE (Linux), CTRL-SPACE (Windows),
or whatever the shortcut is on your operating system, and type *resolve-doi* and it will automatically convert the DOI
into a hyperlink to look up the paper.

What I am actually interested in, is being able to use this command in a blog editing environment; however, I
have not managed to get that working in one command. And because I am apparently not able to put in two ubiquity
commands in blog items, you need to go to [this page](http://blueobelisk.sourceforge.net/people/egonw/ubiquity.html).

Second warning. I have only tried them with Ubiquity 0.1, not 0.1.1, or even later.

For the curious, the script looks like:

```javascript
CmdUtils.CreateCommand({
  name: "resolve-doi",
  homepage: "http://chem-bla-ics.blogspot.com/",
  author: { name: "Egon Willighagen", email: "egon.willighagen@gmail.com"},
  description: "Resolves a DOI into a URL",
  license: "GPL",
  takes: {"doi": noun_arb_text},

  preview: function( pblock, doi ) {
    var msg = 'Inserts a URL for the DOI: ${doi}';
    var d = doi.text || CmdUtils.getSelection();
    pblock.innerHTML = CmdUtils.renderTemplate(msg, {doi: d});
  },

  execute: function( doi ) {
    var msg = '<a href="http://dx.doi.org/${doi}">${doi}</a>';
    var d = doi.text || CmdUtils.getSelection();
    var newText = CmdUtils.renderTemplate(msg, {doi: d});
    CmdUtils.setSelection(newText);
  }
})
```

Comments on this code most welcome! It's [GPL](http://www.gnu.org/copyleft/gpl.html). Details can be found in
[this tutorial](https://wiki.mozilla.org/Labs/Ubiquity/Ubiquity_0.1_Author_Tutorial) and examples in
[Rajarshi's blog](http://rguha.wordpress.com/2008/08/30/ubiquity-and-chemical-information/).
