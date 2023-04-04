# Architekturmuster

* Status: proposed
* Deciders: Linus Plewa, Nicolas Braunbarth. Moritz Schnitzler
* Date: 2023-04-04

Technical Story: Entscheidung über ein Architekturmuster für das Projekt

## Context and Problem Statement

Welches Architekturmuster bietet sich gemäß ISO 9126, besonders an und welche Vor- und Nachteile existieren?

## Decision Drivers

* Richtigkeit
* Zeitverhalten
* Stabilität

## Considered Options

* Schichtenarchitektur
* Blackboard
* Domain Driven Design

## Decision Outcome

Chosen option: "Domain Driven Design", because Domain Driven Design eignet sich besonders gut für das Projekt der CO2-Gesetzgebung für schwere Nutzfahrzeuge, da es sich bei dem Projekt um ein komplexes und fachlich anspruchsvolles Domänenmodell handelt. Durch die Anwendung von Domain Driven Design wird die Abstraktion und Kapselung der Domänenlogik ermöglicht, was zu einer besseren Wartbarkeit, Erweiterbarkeit und Skalierbarkeit der Software führt. Außerdem wird die fachliche Expertise und Sprache in den Vordergrund gestellt, was die Zusammenarbeit zwischen den beteiligten Akteuren und Teams erleichtert.

### Positive Consequences

* DDD kann helfen, die komplexe Domäne des Projekts besser zu verstehen und zu modellieren, was wiederum zu einer höheren Qualität und Flexibilität der Software führen kann.
* Durch die Fokussierung auf die Domäne kann das Team des Projekts eine gemeinsame Sprache und ein gemeinsames Verständnis der Domäne entwickeln, was die Kommunikation und Zusammenarbeit erleichtern kann.
* DDD unterstützt eine modularisierte Architektur, die dazu beitragen kann, die Komplexität der Software zu reduzieren und eine einfache Wartbarkeit und Erweiterbarkeit zu ermöglichen.

### Negative Consequences

* DDD erfordert eine gründliche Analyse der Domäne und eine sorgfältige Modellierung, was Zeit und Ressourcen erfordern kann.
* Eine zu komplexe Modellierung kann dazu führen, dass die Software schwer zu verstehen und zu warten ist, wenn das Modell nicht klar und einfach genug ist.
* DDD erfordert eine umfassende Schulung und Einarbeitung des Teams in die Konzepte und Praktiken von DDD, um die Vorteile des Ansatzes voll ausschöpfen zu können.

## Pros and Cons of the Options

### Schichtenarchitektur

Eine Schichtenarchitektur (englisch: layered architecture) ist ein Architekturmuster für Software-Systeme, bei dem das System in verschiedene Schichten oder Ebenen unterteilt wird, um eine klare Trennung von Aufgaben und Zuständigkeiten zu ermöglichen. Jede Schicht hat ihre eigenen spezifischen Funktionen und Dienste, die von den höheren Schichten genutzt werden können. Eine solche Architektur erleichtert die Wartbarkeit, Erweiterbarkeit und Testbarkeit von Software-Systemen.

Hier ist ein Link zu weiteren Informationen über Schichtenarchitekturen: https://de.wikipedia.org/wiki/Schichtenarchitektur_(Software)

* Good, because Klar definierte Trennung von Aufgaben und Zuständigkeiten innerhalb der Software, was die Wartbarkeit und Erweiterbarkeit erleichtern kann.
* Good, because Durch die Schichten können unabhängige Entwicklerteams parallel arbeiten, was die Entwicklungsgeschwindigkeit erhöhen kann.
* Good, because Die Schichtenarchitektur ermöglicht die einfache Integration von Bibliotheken und Frameworks, die spezifische Funktionalitäten bereitstellen.
* Bad, because Eine Schichtenarchitektur kann zu einem erhöhten Overhead führen, da jede Schicht ihren eigenen Code und ihre eigenen Mechanismen zur Datenübertragung und Kommunikation hat.
* Bad, because Die Trennung von Aufgaben und Zuständigkeiten kann manchmal zu einer unnötigen Komplexität führen, wenn Aufgaben zwischen den Schichten hin- und hergeschoben werden müssen.
* Bad, because Die Schichtenarchitektur kann dazu führen, dass die Software nicht optimal auf die Anforderungen des Projekts zugeschnitten ist, da die Schichten vorgeben, wie die Software organisiert werden muss.

### Blackboard

Das Blackboard-Pattern ist ein Architekturmuster, bei dem eine Gruppe von spezialisierten Subsystemen unabhängig voneinander arbeitet, um gemeinsam ein bestimmtes Problem zu lösen. Dabei kommunizieren die Subsysteme über ein gemeinsames Wissensspeicher, das Blackboard genannt wird. Das Blackboard wird von einem zentralen Kontrollmodul überwacht und koordiniert.

Hier ist ein Link zu mehr Informationen über das Blackboard-Pattern: https://en.wikipedia.org/wiki/Blackboard_system

* Good, because Blackboard erlaubt die Integration von unterschiedlichen Wissensquellen und ermöglicht so eine flexiblere Modellierung des Domänenwissens.
* Good, because Das Konzept von Blackboard erlaubt die parallele Ausführung von Subsystemen, was in diesem Projekt zur effizienten Berechnung von CO2-Emissionen und Kraftstoffverbräuchen beitragen kann.
* Good, because Blackboard erlaubt die Änderung von Teilkomponenten, ohne dass das Gesamtsystem beeinträchtigt wird.
* Bad, because Blackboard erfordert eine komplexe Integration von unterschiedlichen Subsystemen, was die Entwicklung und Wartung des Systems erschweren kann.
* Bad, because Durch die parallele Ausführung von Subsystemen kann die Konsistenz des Gesamtsystems beeinträchtigt werden.
* Bad, because Die Verwendung von Blackboard kann zu einer hohen Komplexität des Systems führen, was die Verständlichkeit und Wartbarkeit des Codes beeinträchtigen kann.
