---
layout: post
title:  "Weka Decision Trees to Java Conversion"
date:   2007-05-30 00:10
blogger-link: https://chem-bla-ics.blogspot.com/2007/05/weka-decision-trees-to-java-conversion.html
tags: java cheminf cdk
---

Some time ago I wrote a small Perl script to convert a decision tree created with [Weka](http://www.cs.waikato.ac.nz/~ml/weka/) in the
[ARFF format](http://www.cs.waikato.ac.nz/~ml/weka/arff.html) to Java source code, for use in the
[ionization potential prediction](http://cheminfo.informatics.indiana.edu/~rguha/code/java/nightly/api/org/openscience/cdk/qsar/descriptors/molecular/IPMolecularDescriptor.html)
in [CDK](http://cdk.sf.net/). The advantage is that Weka is no longer used are runtime, and that there is no model that needs to be loaded and interpreted. Instead, it is simple Java code that does the work, much faster.

This is the code:

```perl
#!/usr/bin/perl
#
# Copyright 2007 (C) Egon Willighagen
# License: GPL

use diagnostics;
use strict;

my $filename = $ARGV[0];

print "double result = 0.0;\n";
open(INPUT, "<$filename");
my $level = 0;
my $prevLevel = -1;
while (my $line = <INPUT>) {
  $line =~ s/\n//g;
  $level = 0;
  while ($line =~ /^\|\s*(.*)/) {
    $level++;
    $line = $1;
  }
  my $else = "";
  if ($prevLevel == $level) {
    $else = "else ";
  } elsif ($prevLevel < $level) {
    # we increase one level at a time
    for (my $i=0; $i<($level-1); $i++) { print "  "; };
    print "{\n";
    $prevLevel = $level;
  } else {
    # this is a bit more tricky: we possibly need more than
    # one end bracket
    my $diff = $prevLevel - $level;
    for (my $closes=0; $closes<$diff; $closes++) {
      for (my $i=0; $i<($prevLevel-$closes-1); $i++) { print "  "; };
      print "}\n";
    }
    $prevLevel = $level;
  }
  if ($line =~ /:/) {
    my ($if, $then) = split(":",$line);
    for (my $i=0; $i<$level; $i++) { print "  "; };
    # FIXME: java-fy $then
    if ($then =~ /([\d|_]*)\s*\(([^\)]*)\)/) {
      my $result = $1;
      my $stats = $2;
      $result =~ s/_/\./g;
      print $else . "if ($if) { result = $result; // $stats }\n";
    } else {
      print $else . "if ($if) { result = $then; }\n";
    }
  } else {
    for (my $i=0; $i<$level; $i++) { print "  "; };
    print $else . "if ($line)\n";
  }
}

# OK, now add the rest of the closing brackets
for (my $closes=$prevLevel; $closes>0; $closes--) {
  for (my $i=0; $i<($closes-1); $i++) { print "  "; };
  print "}\n";
}
```
