---
layout: post
title:  "My PhD Thesis: in color and grayscale"
date:   2008-01-23
blogger-link: https://chem-bla-ics.blogspot.com/2008/01/my-phd-thesis-in-color-and-grayscale.html
doi: 10.59350/g3166-hv249
tags: latex phd
---

Wednesday is my regular day off from my metabolomics work, and today I am finalizing the layout of my thesis, which I'll
defend on April 2. The print version will feature grayscale images with some of them in color too. However, the PDF
version that will end up in our university repository should have color prints. So, while halfway creating suitable
grayscale versions of the image, I realized I was not doing it properly. I was replacing the images; so, I lost the
color version. Not good.

But wait, LaTeX can do more; why not have a color and a grayscale option? Here comes `optional.sty`. By adding
`\usepackage{optional}` I can add to the source (from `book.tex`):

```latex
\begin{figure}[bt]
\begin{center}
  \subfigure[]{
    \label{fig:benzene:a}
    \opt{color}{\includegraphics[width=0.4\textwidth]{intro/benzoCompounds_color}}
    \opt{grayscale}{\includegraphics[width=0.4\textwidth]{intro/benzoCompounds}}
  }
  \hspace{2cm}
  \subfigure[]{
    \label{fig:benzene:b}
    \includegraphics[width=0.18\textwidth]{intro/Ferrocene-2D}
  }
\end{center}
\caption{a) 2D diagrams of the two possible resonance structures of a compound
with a phenyl ring. Both diagrams refer to the same compounds, but the depicted
graph representations are not identical. b) 2D diagram of ferrocene, which,
like all organometallic compounds,
is difficult to represent with classical chemoinformatics approaches.}
\label{fig:benzene}
\end{figure}
```

Ferrocene was already black-and-white, so no worry about that. And, it is just the red colored hydroxyl group.
But it serves the point :)

Which then allows me to run pdflatex to create a color version and a grayscale version:

```shell
pdflatex "\def\UseOption{color}\input{book}"
pdflatex "\def\UseOption{grayscale}\input{book}"
```

/me is happy
