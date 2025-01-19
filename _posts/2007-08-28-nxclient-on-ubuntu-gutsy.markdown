---
layout: post
title:  "NXClient on Ubuntu Gutsy"
date:   2007-08-28
blogger-link: https://chem-bla-ics.blogspot.com/2007/08/nxclient-on-ubuntu-gutsy.html
tags: linux kde
---

If you, like me, already upgrade to [Ubuntu](http://www.ubuntu.com/) [Gutsy](https://wiki.ubuntu.com/GutsyGibbon),
and use [nxclient](http://www.nomachine.com/download.php) for remote login (highly recommended, though proprietary code),
you might run into the problem that the login no longer works, returning the message "Cannot find KDE environment.". Ubuntu's
[Lauchpad](http://www.launchpad.net/) (generally an excellent service) was rather uncooperative and disregarded a bug report
about the problem, I found the solution with `grep -ri kde /usr/NX`:

```
/usr/NX/etc/node.cfg:CommandStartKDE="/usr/bin/dbus-launch --exit-with-session startkde"
```

The solution was to:

```shell
sudo aptitude install dbus-x11
```

which contains the `dbus-launch` executable, formerly found in the *dbus* package itself. I assume it works for
"Cannot find GNOME environment" too.
