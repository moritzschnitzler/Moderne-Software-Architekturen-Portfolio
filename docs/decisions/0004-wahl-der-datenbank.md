# Wahl der Datenbank

* Status: proposed
* Date: 2023-04-04

Technical Story: Entscheidung für das Projekt zwischen der am besten geeignete Datenbank

## Context and Problem Statement

Die Wahl der richtigen Datenbank ist entscheidend für eine effiziente und zuverlässige Implementierung des Simulationswerkzeugs. Es stellt sich die Frage, ob eine relationale Datenbank wie MySQL oder eine NoSQL Datenbank besser geeignet ist, um die komplexen Zusammenhänge zwischen den verschiedenen Datenpunkten zu speichern und abzurufen. Zudem müssen Faktoren wie Skalierbarkeit, Performance und Datenintegrität berücksichtigt werden, um ein reibungsloses Funktionieren des Simulationswerkzeugs zu gewährleisten.

## Decision Drivers

* Richtigkeit
* Zeitverhalten
* Stabilität

## Considered Options

* relationale Datenbank (MySQL)
* NoSQL-Datenbanken

## Decision Outcome

Chosen option: "relationale Datenbank (MySQL)", because Eine relationale Datenbank wie MySQL eignet sich besser für das Projekt, da die Datenstruktur gut definiert ist und die Datenbeziehungen zwischen den verschiedenen Entitäten klar und vorhersagbar sind.t best.

### Positive Consequences

* Richtigkeit: Relationale Datenbanken sind bekannt für ihre Fähigkeit, Daten konsistent und genau zu speichern und abzurufen, was für das Projekt der Gesetzgebung zu CO²-Emissionen von schweren Nutzfahrzeugen von entscheidender Bedeutung ist.
* Zeitverhalten: Relationale Datenbanken haben eine gute Leistung bei der Ausführung von Abfragen und die Verwendung von Indizes kann die Geschwindigkeit weiter verbessern.
* Stabilität: Relationale Datenbanken haben in der Regel eine hohe Stabilität und Verfügbarkeit, was in diesem Projekt wichtig ist, da es eine kontinuierliche und zuverlässige Verarbeitung von Daten erfordert.

### Negative Consequences

* Skalierbarkeit: Relationale Datenbanken können schwierig zu skalieren sein, insbesondere wenn das Datenvolumen sehr groß wird. Dies könnte ein Problem darstellen, wenn das Projekt in Zukunft wachsen und mehr Daten verarbeiten muss.
* Komplexität: Relationale Datenbanken erfordern in der Regel mehr Aufwand bei der Erstellung und Wartung der Datenbankstruktur und der Beziehungen zwischen den Tabellen. Dies kann zu einer höheren Komplexität und einer längeren Entwicklungszeit führen.

## Pros and Cons of the Options

### NoSQL-Datenbanken

Eine NoSQL-Datenbank ist eine nicht-relationale Datenbank, die zur Speicherung und Verwaltung von großen Datenmengen eingesetzt wird und im Vergleich zu relationalen Datenbanken flexiblere und skalierbare Datenspeicherungsmöglichkeiten bietet.

* Good, because Skalierbarkeit: NoSQL-Datenbanken können horizontal skaliert werden, um mit der Datenmenge umzugehen, was für ein Projekt, das sich mit großen Mengen an Daten beschäftigt, von Vorteil ist.
* Good, because Flexibilität: NoSQL-Datenbanken haben eine flexible Datenmodellierung, die sich an die spezifischen Anforderungen des Projektes anpassen lässt.
* Good, because Geschwindigkeit: Da NoSQL-Datenbanken keine komplexe Struktur aufweisen und einfachere Abfragen unterstützen, können sie Daten schneller verarbeiten.
* Bad, because Datenkonsistenz: NoSQL-Datenbanken haben eine lockere Konsistenzgarantie, was bedeutet, dass es möglicherweise nicht immer eine 100%ige Gewährleistung gibt, dass alle Daten konsistent sind.
* Bad, because Datenintegrität: NoSQL-Datenbanken haben möglicherweise weniger eingebaute Funktionen zur Gewährleistung der Datenintegrität.
* Bad, because Anforderungen an Entwickler: Da NoSQL-Datenbanken eine andere Datenmodellierung aufweisen, können Entwickler möglicherweise spezielle Kenntnisse und Fähigkeiten benötigen, um die Datenbank effektiv zu nutzen.

## Links

* https://dev.mysql.com/doc/
* https://www.mongodb.com/nosql-explained/nosql-vs-sql
