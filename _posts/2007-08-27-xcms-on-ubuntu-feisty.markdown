---
layout: post
title:  "XCMS on Ubuntu Feisty"
date:   2007-08-27
modified_date: 2025-02-15
doi: 10.59350/3j307-5v841
blogger-link: https://chem-bla-ics.blogspot.com/2007/08/xcms-on-ubuntu-feisty.html
tags: linux metabolomics
---

I just installed [XCMS 1.9.2](http://metlin.scripps.edu/download/packages/xcms_1.9.2.tar.gz) on my Ubuntu system.
[XCMS](http://metlin.scripps.edu/download/) is a GPL-ed [R](http://www.r-project.org/) package for metabolomics data analysis.
Just for the record, you need to install the [Feisty](http://ubuntuguide.org/wiki/Ubuntu:Feisty) packages for
[NetCDF](http://packages.ubuntu.com/feisty/source/netcdf):

```shell
sudo aptitude install netcdfg-dev libnetcdf3
R CMD INSTALL --library=/usr/local/lib/R/site-library xcms_1.9.2.tar.gz
```
