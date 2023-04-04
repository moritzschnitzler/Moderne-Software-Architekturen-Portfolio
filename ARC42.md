# 

# Einführung und Ziele {#section-introduction-and-goals}

    Zugrunde liegende Geschäftsziele: Die Software muss den Dokumentendruck, die Fahrzeugentwicklung, die Logistik und die Library-Verwaltung integrieren, um eine nahtlose Zusammenarbeit aller Beteiligten zu ermöglichen. Die Geschäftsziele beinhalten auch die Erfüllung der gesetzlichen Anforderungen und die Gewährleistung der Datensicherheit.

    Wesentliche Aufgabenstellungen: Die Software muss in der Lage sein, individuelle Simulationsergebnisse für jedes Fahrzeug zu generieren und diese in die Dokumente einzufügen, die gedruckt werden sollen. Außerdem müssen die Messdaten der Fahrzeugkomponenten den Konfigurationen zugeordnet werden, um eine präzise Dokumentation zu ermöglichen. Die Gewichte und Abmessungen müssen aus den Konfigurationen berechnet werden können, um eine effektive Logistik zu gewährleisten.

    Wesentliche funktionale Anforderungen: Die Software muss in der Lage sein, die Daten der verschiedenen Akteure zu integrieren und zu verarbeiten. Dazu gehören die Messdaten der Fahrzeugentwicklung, die Konfigurationsdaten des Dokumentendrucks, die Gewichte und Abmessungen der Logistik sowie die Library-Verwaltung.

    Qualitätsziele für die Architektur: Die Software muss robust, stabil und skalierbar sein, um den Anforderungen einer wachsenden Nutzerbasis gerecht zu werden. Die Architektur sollte auch flexibel genug sein, um zukünftige Erweiterungen und Anpassungen zu ermöglichen.

    Relevante Stakeholder und deren Erwartungshaltung: Die Stakeholder umfassen die Nutzer der Software sowie die Hersteller der Library. Die Nutzer erwarten eine einfache Bedienbarkeit, eine schnelle Verarbeitung der Daten und eine hohe Zuverlässigkeit. Die Hersteller der Library erwarten eine problemlose Integration der Software mit ihrer Library und eine effektive Zusammenarbeit. Es ist wichtig, die Erwartungen der Stakeholder zu verstehen und in der Architektur der Software zu berücksichtigen.

## Aufgabenstellung {#_aufgabenstellung}

Inhalt

Die Aufgabe besteht darin, eine Software zu entwickeln, die alle beteiligten Akteure miteinander verbindet. Dazu gehören der Dokumentendruck, die Fahrzeugentwicklung, die Logistik und der Hersteller der Library. Jeder Akteur hat spezifische Anforderungen und Erwartungen, die in der Entwicklung berücksichtigt werden müssen. Wesentliche Anforderungen und treibende Kräfte sind:

    Geschäftsziele: Die Software soll die Effizienz und Produktivität der beteiligten Akteure verbessern und zur Erreichung der Geschäftsziele beitragen.
    Funktionale Anforderungen: Die Software soll alle relevanten Daten sammeln, speichern, verarbeiten und bereitstellen, um eine reibungslose Kommunikation und Zusammenarbeit zwischen den Akteuren zu gewährleisten.
    Qualitätsziele: Die Software muss sicher, zuverlässig, skalierbar und wartbar sein, um eine langfristige Nutzung zu gewährleisten.
    Stakeholder und deren Erwartungshaltung: Die beteiligten Akteure haben unterschiedliche Anforderungen und Erwartungen an die Software.

Motivation

Die Motivation für die Entwicklung der Software liegt darin, die Zusammenarbeit und Kommunikation zwischen den beteiligten Akteuren zu verbessern und somit zur Erreichung der Geschäftsziele beizutragen. Die Software soll eine effiziente und reibungslose Zusammenarbeit ermöglichen und somit zur Steigerung der Produktivität beitragen.

Form

Dokumentendruck	- Drucken von Fahrzeugdokumenten
    Berechnung von individuellen Simulationsergebnissen für jedes Fahrzeug
    Einhaltung der Rechtsgrundlagen
    Fahrzeugentwicklung	- Zuordnung von Messdaten zu einer Fahrzeugkonfiguration 
    Austausch von Daten mit anderen Akteuren
Logistik	
    Berechnung von Gewichten und Abmessungen aus einer Konfiguration
    Austausch von Daten mit anderen Akteuren
Hersteller der Library	
    Bereitstellung und Weiterentwicklung der Library
    Unterstützung als externer Support
    Einschränkung des Zugriffs auf bestimmte Daten
System	
    Sammeln, Speichern, Verarbeiten und Bereitstellen von Daten aller Akteure
    Sicherheit, Zuverlässigkeit, Skalierbarkeit und Wartbarkeit der Software
    Effiziente und reibungslose Zusammenarbeit der beteiligten Akteure

## Qualitätsziele {#_qualit_tsziele}

Die Top-3 bis Top-5 der Qualitätsanforderungen für die Architektur sind:
Nr.	Qualitätsanforderung	Priorität	Szenario
1	Performance	            hoch	    Die Anwendung muss innerhalb von wenigen Sekunden eine Simulationsergebnis bereitstellen.
2	Zuverlässigkeit     	hoch	    Das System darf maximal einen Ausfall pro Woche haben, der innerhalb von wenigen Minuten behoben werden kann.
3	Sicherheit	            mittel	    Die Datenübertragung zwischen den Akteuren muss verschlüsselt sein, um unbefugten Zugriff zu verhindern.
4	Skalierbarkeit	        niedrig	    Das System muss in der Lage sein, weitere Zukünftige Probleme zu bewältigen
5	Benutzerfreundlichkeit	niedrig	    Die Benutzeroberfläche muss intuitiv gestaltet sein, um eine kurze Einarbeitungszeit für neue Benutzer zu ermöglichen.

Motivation

Qualitätsziele sind für die Architektur von entscheidender Bedeutung, da sie die Architekturentscheidungen beeinflussen und die Erfüllung der Anforderungen sicherstellen. Die Kenntnis der für die Stakeholder relevanten Qualitätsziele ist daher wichtig, um die richtigen Entscheidungen zu treffen.

## Stakeholder {#_stakeholder}

    Dokumentendruck (print)
        Erwartet, dass das System die Rechtsgrundlage für das Drucken von Fahrzeugdokumenten erfüllt
        Benötigt für jedes Fahrzeug zum Zeitpunkt des Drucks ein individuelles Simulationsergebnis

    Fahrzeugentwicklung (vehicle-data)
        Erwartet, dass das System alle Messdaten der Komponenten enthält und diese einer Fahrzeugkonfiguration zuordnen kann
        Nutzt die Daten und Schnittstellen des Systems für die Fahrzeugentwicklung

    Logistik (logistics)
        Erwartet, dass das System aus einer Konfiguration die Gewichte und Abmessungen eines gesamten Fahrzeugs berechnen kann
        Nutzt die Daten und Schnittstellen des Systems für die Planung und Organisation der Fahrzeuglogistik

    Hersteller der Library
        Stellt eine Bibliothek zur Verfügung, die von der Software genutzt wird
        Erwartet, dass das System die Bibliothek korrekt und effizient nutzt
        Kann als Unternehmensexterner ggf. nicht alle verwendeten Daten zugreifen

    Entwickler-Team
        Benötigt eine klare Architektur, die die Umsetzung der funktionalen und nicht-funktionalen Anforderungen ermöglicht
        Erwartet eine gute Lesbarkeit und Wartbarkeit des Codes

    Projektmanager
        Verantwortlich für die Planung, Überwachung und Steuerung des Projekts
        Erwartet, dass das System innerhalb des vorgegebenen Zeit- und Kostenrahmens fertiggestellt wird und die definierten Anforderungen erfüllt

    Qualitätsmanager
        Verantwortlich für die Definition und Überwachung der Qualitätsziele
        Erwartet, dass die definierten Qualitätsziele erfüllt werden

    Endnutzer
        Benötigt eine intuitiv bedienbare Benutzeroberfläche
        Erwartet, dass das System schnell und zuverlässig arbeitet

Motivation

Eine klare Identifikation der Stakeholder und ihrer Erwartungen ist wichtig, um die Architektur des Systems gezielt auf ihre Bedürfnisse ausrichten und die Akzeptanz des Systems bei allen Beteiligten sicherstellen zu können.

# Randbedingungen {#section-architecture-constraints}

Randbedingung	    Erläuterung
Technologie-Stack	Es muss der bestehende 
                    Technologie-Stack des Unternehmens verwendet werden. Dies umfasst die Verwendung von bestimmten Programmiersprachen, Frameworks und Datenbanken.
Dokumentationsrichtlinien	Die Dokumentation muss gemäß den
                     internen Vorgaben erstellt werden. Dies beinhaltet bestimmte Templates, Strukturen und Inhalte, die in der Dokumentation abgedeckt werden müssen.
Einhaltung von Standards	Der Code und die Architektur müssen 
                    bestimmten internen und externen Standards entsprechen, einschließlich Sicherheits- und Datenschutzrichtlinien sowie Coding-Richtlinien.
Zeitplan	Das System muss innerhalb des geplanten Zeitrahmens 
                    fertiggestellt werden.
Budget	            Das Projekt darf das zugewiesene Budget nicht
                     überschreiten.
Kompatibilität mit bestehenden Systemen	Das System muss mit anderen
                     bestehenden Systemen des Unternehmens kompatibel sein und mit diesen kommunizieren können.
Verfügbarkeit von Ressourcen	Es können nur begrenzte Ressourcen
                     für das Projekt bereitgestellt werden, einschließlich Personal, Hardware und Infrastruktur.
Betriebsbedingungen	Das System muss unter bestimmten
                     Betriebsbedingungen funktionieren, wie z.B. hoher Verfügbarkeit, Skalierbarkeit und Leistung.

Diese Randbedingungen sind festgelegt durch die Englische Dokumentation und Schätzungen wo ein solches Programm erstellt werden könnte

# Kontextabgrenzung {#section-system-scope-and-context}

// noch nichts 

## Fachlicher Kontext {#_fachlicher_kontext}

**\<Diagramm und/oder Tabelle>**

**\<optional: Erläuterung der externen fachlichen Schnittstellen>**



## Technischer Kontext {#_technischer_kontext}

    Dokumentendruck (print):
        Technische Schnittstellen: Drucker, Datenbank für Konfigurations- und Simulationsergebnisse.
        Mapping: Konfigurationsdaten und Simulationsergebnisse werden aus der Datenbank abgerufen und zum Drucker gesendet.
    Fahrzeugentwicklung (vehicle-data):
        Technische Schnittstellen: Messdatenerfassungssystem, Datenbank für Messdaten.
        Mapping: Messdaten werden vom Messdatenerfassungssystem in die Datenbank gespeichert und können von der Fahrzeugentwicklung zur Fahrzeugkonfiguration zugeordnet werden.
    Logistik (logistics):
        Technische Schnittstellen: Konfigurationsdaten, Gewichts- und Abmessungsrechner.
        Mapping: Konfigurationsdaten werden an den Gewichts- und Abmessungsrechner gesendet, der daraus die Gewichte und Abmessungen des Fahrzeugs berechnet.
    Hersteller der Library:
        Technische Schnittstellen: API zur Nutzung der Library.
        Mapping: Die API wird verwendet, um auf die Funktionalität der Library zuzugreifen. Der Hersteller der Library hat eventuell eingeschränkten Zugriff auf Daten außerhalb des Unternehmens.

Die Dokumentation der technischen Schnittstellen des Systems und ihrer Umwelt ist für viele Stakeholder von entscheidender Bedeutung, da dies die Grundlage für viele Architekturentscheidungen bildet. Insbesondere bei der Entwicklung von Infrastruktur oder Hardware sind die technischen Schnittstellen oft von großer Bedeutung. Eine klare Darstellung der technischen Schnittstellen und ihrer fachlichen Ein- und Ausgaben kann dazu beitragen, dass alle Beteiligten ein besseres Verständnis für das System und seinen Kontext entwickeln und somit bessere Entscheidungen treffen können


# Lösungsstrategie {#section-solution-strategy}

Hierfür benötigen wir mehr verständnis der Basis, sowie verständnis für was ich Lösungen finden soll

# Bausteinsicht {#section-building-block-view}



Überblick


Die Bausteineinsicht zeigt die wichtigsten Komponenten des Systems und ihre Zusammenarbeit im Kontext der Fahrzeugdokumentation. Das System besteht aus vier Hauptbausteinen: Dokumentendruck, Fahrzeugentwicklung, Logistik und Hersteller der Library.


Bausteine

    Dokumentendruck (print): Dieser Baustein ist für den Druck von Fahrzeugdokumenten verantwortlich, die den gesetzlichen Anforderungen entsprechen müssen. Der Baustein benötigt für jedes Fahrzeug zum Zeitpunkt des Drucks eine gültige Konfiguration sowie ein individuelles Simulationsergebnis.

    Fahrzeugentwicklung (vehicle-data): Dieser Baustein enthält alle Messdaten für die verschiedenen Komponenten des Fahrzeugs. Er kann die Messdaten einer Fahrzeugkonfiguration zuordnen und diese dem Dokumentendruck-Baustein zur Verfügung stellen.

    Logistik (logistics): Dieser Baustein hat Zugriff auf alle Gewichts- und Abmessungsdaten für die verschiedenen Kombinationen von Code, Baumuster und Produktionsdatum. Er kann aus einer Fahrzeugkonfiguration das Gesamtgewicht und die Gesamtabmessungen berechnen und diese Informationen dem Dokumentendruck-Baustein zur Verfügung stellen.

    Hersteller der Library: Dieser Baustein stellt eine Library zur Verfügung, die von anderen Bausteinen im System verwendet wird. Der Hersteller der Library kann als externer Support angefragt werden, hat aber möglicherweise nicht Zugriff auf alle verwendeten Daten, da er ein Unternehmensexterner ist.


Abhängigkeiten


Der Dokumentendruck-Baustein hängt von den anderen Bausteinen ab, um alle notwendigen Informationen zu sammeln und das Dokument zu erstellen. Insbesondere benötigt er die Fahrzeugkonfiguration vom Fahrzeugentwicklung-Baustein und die Gewichts- und Abmessungsdaten vom Logistik-Baustein. Der Hersteller der Library-Baustein wird von allen anderen Bausteinen verwendet, um auf die Bibliothek zuzugreifen.


Beziehungen


Die Beziehungen zwischen den Bausteinen sind wie folgt:

    Der Dokumentendruck-Baustein verwendet Informationen von den anderen Bausteinen, um ein Fahrzeugdokument zu erstellen.

    Der Fahrzeugentwicklung-Baustein kann die Messdaten einer Fahrzeugkonfiguration zuordnen und dem Dokumentendruck-Baustein zur Verfügung stellen.

    Der Logistik-Baustein kann das Gesamtgewicht und die Gesamtabmessungen aus einer Fahrzeugkonfiguration berechnen und diese Informationen dem Dokumentendruck-Baustein zur Verfügung stellen.

    Der Hersteller der Library-Baustein stellt eine Bibliothek zur Verfügung, die von allen anderen Bausteinen im System verwendet wird.


## Whitebox Gesamtsystem {#_whitebox_gesamtsystem}

a) unbewusst was ich hier tun muss weil ist das hier nicht ähnlich wie die Bausteine? 
b) Ohne den fertigen Code , welcher nicht fertig ist, komme ich hier nicht mehr weiter leider

Insgesamt ist dieses ARC 42 Diagramm unter bestem Wissen und Gewissen entstanden aber es war nicht alles ausfüllbar. 