# Art der Request

* Status: proposed
* Deciders: Linus Plewa, Moritz Schnitzler, Nicolas Braunbarth
* Date: 2023-04-04

Technical Story: Entscheidung für das Projekt zwischen der am besten geeigneten Request Art

## Context and Problem Statement

Die Wahl der richtigen Request Art ist entscheidend, um die Kommunikation zwischen den beteiligten Akteuren und Systemen effizient und sicher zu gestalten. Es müssen individuelle Simulationsergebnisse für jedes Fahrzeug zur Verfügung gestellt werden, um den Dokumentendruck zu ermöglichen. Die Fahrzeugentwicklung benötigt Zugriff auf die Messdaten und muss diese den Fahrzeugkongurationen zuordnen können. Die Logistik muss aus einer Konguration die Gewichte und Abmessungen eines gesamten Fahrzeugs berechnen können. Die Wahl der richtigen Request Art hängt auch von den Anforderungen der neuen Änderungsverordnung ab, die nur batterieelektrisch angetriebene Fahrzeuge betrifft und die Einführung einer neuen VECTO-Version auf Java-Basis mit vereinfachten Eingabe- und Ausgabeformaten vorsieht.

## Decision Drivers

* Richtigkeit
* Zeitverhalten
* Stabilität

## Considered Options

* REST
* SOAP
* WebSockets
* GraphQL

## Decision Outcome

Chosen option: "REST", because einfach zu implementieren ist, HTTP-Methoden verwendet und eine breite Unterstützung durch Frameworks und Bibliotheken bietet, um auf Ressourcen wie die Datenbank zuzugreifen.t best.

### Positive Consequences

* RESTful APIs sind leichtgewichtig und benötigen wenig Ressourcen, was zur besseren Skalierbarkeit beiträgt.
* RESTful APIs können von fast jeder Programmiersprache genutzt werden.
* RESTful APIs sind zustandslos, was die Wartbarkeit und Flexibilität erhöht.

### Negative Consequences

* RESTful APIs sind auf CRUD-Operationen beschränkt und können nicht komplexe Datenstrukturen abbilden.
* RESTful APIs haben keine eingebaute Sicherheit und müssen manuell abgesichert werden.
* RESTful APIs sind nicht geeignet für synchronisierte Kommunikation, da sie asynchron funktionieren.

## Pros and Cons of the Options

### SOAP

SOAP (Simple Object Access Protocol) ist ein XML-basiertes Protokoll zur Kommunikation zwischen Anwendungen über das Internet. Es wird hauptsächlich zur Übertragung von strukturierten Daten wie XML und JSON verwendet. SOAP wird häufig in Unternehmensanwendungen eingesetzt, die eine zuverlässige und sichere Kommunikation

* Good, because Es bietet einen formalen Standard für die Nachrichtenübertragung zwischen Anwendungen, der es ermöglicht, eine große Anzahl von Programmen und Programmiersprachen zu unterstützen.
* Good, because SOAP ist plattformunabhängig und kann auf verschiedenen Betriebssystemen und Programmiersprachen implementiert werden.
* Bad, because Im Vergleich zu REST ist SOAP weniger performant, da es ein umfangreicheres Nachrichtenformat verwendet und mehr Overhead erzeugt.
Es ist ein komplexeres Protokoll als REST, was zu einer höheren Komplexität der Implementierung führen kann.
* Bad, because SOAP ist nicht so weit verbreitet wie REST und kann möglicherweise nicht von allen Systemen und Anwendungen unterstützt werden.

### WebSockets

WebSockets sind eine fortlaufende bidirektionale Kommunikationstechnologie, die es einem Webbrowser oder einer Anwendung ermöglicht, eine dauerhafte Verbindung zu einem Server aufrechtzuerhalten, um Echtzeitdaten in hoher Geschwindigkeit auszutauschen. Eine WebSocket-Verbindung ermöglicht eine schnelle und effiziente Übertragung von Daten in Echtzeit zwischen Client und Server.

* Good, because WebSockets ermöglichen eine bidirektionale Kommunikation zwischen Client und Server, was in Echtzeit aktualisierte Informationen ermöglicht.
* Good, because Durch die Verwendung von WebSockets können Server Push-Benachrichtigungen an Clients gesendet werden, ohne dass der Client ständig Anfragen stellen muss, was zu einer schnelleren Antwortzeit führt.
* Good, because WebSockets bieten eine hohe Stabilität und Zuverlässigkeit, da sie auf TCP aufbauen, was eine verbindungsorientierte Protokollschicht ist.
* Bad, because Im Vergleich zu REST und SOAP erfordern WebSockets mehr Overhead und sind möglicherweise langsamer, wenn sie in Szenarien mit wenigen Datenpunkten verwendet werden.
* Bad, because Die Verwendung von WebSockets kann zu höheren Ressourcenanforderungen führen, da Server und Client aufrechterhalten werden müssen, um eine offene Verbindung aufrechtzuerhalten.
* Bad, because WebSockets sind möglicherweise nicht die beste Wahl, wenn das Ziel darin besteht, Daten von einer Vielzahl von Clients mit unterschiedlichen Zugriffsrechten zu erhalten, da sie keine eingebaute Authentifizierung und Autorisierung haben.

### GraphQL

GraphQL ist eine Abfragesprache für APIs und eine serverseitige Laufzeit für Ausführungen von Abfragen durch eine API-Abfrage. Im Gegensatz zu REST, wo für jede Datenanfrage eine separate URL angefordert werden muss, kann GraphQL mehrere Ressourcen mit einer einzigen Anfrage abfragen und nur die benötigten Daten zurückgeben.

* Good, because Hohe Flexibilität bei der Datenabfrage und -manipulation
* Good, because Gute Skalierbarkeit durch Delegation von Datenbankoperationen an spezialisierte Services
* Good, because Unterstützung von Realtime-Updates durch Subscriptions
* Bad, because Komplexeres Lern- und Entwicklungsprozess als bei REST oder SOAP
* Bad, because Eingeschränkte Unterstützung für komplexe Datenbeziehungen
* Bad, because Potenzielle Sicherheitsrisiken durch erlaubte dynamische Abfragen und Zugriffssteuerung
* Bad, because Möglicher Overhead bei der Implementierung von Caching-Strategien, um wiederholte Abfragen zu minimieren

## Links

* https://restfulapi.net/
* https://developer.mozilla.org/en-US/docs/Web/HTTP/Overview
* https://www.soapui.org/learn/soap/what-is-soap/
* https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API
* https://graphql.org/
