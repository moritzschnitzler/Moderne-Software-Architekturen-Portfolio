# Framework vs. Library

* Status: proposed
* Date: 2023-04-04

Technical Story: Entscheidung für das Projekt zwischen der Verwendung eines Framework oder einer Library

## Context and Problem Statement

Das Projekt zur Berechnung von CO²-Emissionen und Kraftstoffverbräuchen für schwere Nutzfahrzeuge erfordert eine effiziente Entwicklungsumgebung, um die Komplexität der Anforderungen zu handhaben.

Bei der Wahl zwischen einem Framework und einer Library für das Projekt stellt sich die Frage, welche Option die Entwicklung effizienter und kosteneffektiver gestalten würde. Eine falsche Wahl könnte sich negativ auf die Qualität und Leistung des Projekts auswirken.

## Decision Drivers

* Stabilität
* Zeitverhalten
* Richtigkeit

## Considered Options

* Library
* Framework

## Decision Outcome

Chosen option: "Framework", because Ein Framework ist besser für das Projekt geeignet im Bezug auf Richtigkeit, Zeitverhalten und Stabilität, da es ein umfassendes, standardisiertes und kohärentes System von Komponenten und Bibliotheken bietet, die speziell für das Projekt entworfen wurden. Dadurch wird sichergestellt, dass die verschiedenen Komponenten des Systems nahtlos zusammenarbeiten und dass das gesamte System stabiler und zuverlässiger ist. Außerdem kann ein Framework helfen, die Entwicklungszeit zu verkürzen, da es vorgefertigte Lösungen und Bausteine bietet, die wiederverwendet werden können.

### Positive Consequences

* Frameworks können durch ihre vorgefertigten Strukturen und Funktionen die Richtigkeit des Codes erhöhen, indem sie Best Practices und Konventionen implementieren.
* Frameworks können zur Optimierung der Laufzeit beitragen, indem sie bereits optimierte und effiziente Algorithmen und Strukturen bereitstellen.
* Frameworks können dazu beitragen, die Stabilität des Codes zu erhöhen, indem sie die Einhaltung von Standards und Best Practices erzwingen und so die Entwickler vor der Einführung von Fehlern bewahren.

### Negative Consequences

* Es besteht die Möglichkeit, dass das Framework nicht alle Anforderungen des Projekts abdeckt und daher Anpassungen oder Erweiterungen erforderlich sind.
* Frameworks können manchmal eine höhere Overhead-Kosten verursachen, insbesondere wenn sie sehr groß sind und viele Funktionen enthalten, die möglicherweise nicht alle benötigt werden.
* Ein Framework, das nicht gut getestet oder dokumentiert ist, kann zu instabilem Code führen. Auch ein zu starr strukturiertes Framework kann die Flexibilität des Projekts einschränken und so die Stabilität beeinträchtigen.

## Pros and Cons of the Options

### Library

Sammlung von vorgefertigtem Code, der spezielle Funktionalitäten bietet, die von anderen Programmen oder Projekten wiederverwendet werden können. Sie dient als eine Art Baustein, der in die eigene Software eingebunden werden kann.

* Good, because Eine Library bietet spezialisierte Funktionen und kann daher einfacher und schneller integriert werden als ein Framework, das mehrere Funktionen und Abhängigkeiten hat.
* Good, because Libraries können modular und flexibel sein und nur die benötigten Funktionen bereitstellen, was die Größe und Komplexität des Codes reduziert.
* Good, because Libraries können von vielen Entwicklern und der Community genutzt werden, was die Wiederverwendbarkeit erhöht und die Codequalität durch Peer-Review verbessert.
* Bad, because Eine Library kann beschränkte Funktionalität bieten, die nicht alle Anforderungen des Projektes abdeckt, was zusätzlichen Aufwand erfordert, um eigene Lösungen zu implementieren.
* Bad, because Libraries können Abhängigkeiten haben, die mit anderen Teilen des Projektes in Konflikt stehen oder zu Versionsinkompatibilität führen können.
* Bad, because Bei der Verwendung von Libraries muss darauf geachtet werden, dass diese sicher und zuverlässig sind, um Sicherheitsrisiken und potenzielle Abstürze zu vermeiden.

## Links

* https://de.wikipedia.org/wiki/Bibliothek_(Programmierung)
* https://www.freecodecamp.org/news/what-is-a-framework-in-programming/
