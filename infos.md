### Spring

Framework für Enterprise-Anwendungen.

* Inversion of Control (IoC) / Dependency Injection (DI):

&nbsp;	Objekte (z. B. Controller) werden nicht manuell instanziiert, sondern von Spring
 	verwaltet. Nicht mehr dein Code entscheidet, wie Objekte gebaut und verbunden
 	werden – das Framework übernimmt die Kontrolle (IoC). Zudem werden die Objekte
	von Klassen von außen "injiziert" (DI).

* Spring MVC - Web-Framework (Controller, Routing usw.)
* Spring Data - einfacher Datenbankzugriff
* Spring Security - Authentifizierung, Autorisierung

...



### Spring Boot

Framework basierend auf dem Spring Framework.

* Auto-Konfiguration - erkennt automatisch, was du brauchst (z.B. Datenbank, Webserver)
* Eingebetteten Server (Tomcat, Jetty, Undertow) - man muss keinen Server mehr manuell deployen
* Starter Dependencies
* Defaults - gute Standardeinstellungen, ohne endlos Konfiguration

...



[Spring Initializr](https://start.spring.io/?utm_source=chatgpt.com)



### Weitere Informationen



##### Application Programming Interface (API)

Eine API legt fest wie Programme und Funktionen austauschen dürfen. (z.B. Wenn du X schickst, bekommst du Y zurück.)



###### Arten von APIs

* Programminterne APIs - z. B. Java Collections API (List.add()).
* System-APIs - z. B. Windows- oder Android-APIs (Dateizugriff, Kamera öffnen).
* Library-APIs -Schnittstellen in externen Bibliotheken (z. B. OpenCV für Bildverarbeitung).
* Web-APIs – Schnittstellen übers Netzwerk, die über HTTP erreichbar sind.



###### REST-API (Representational State Transfer)

* Eine REST-API ist eine Architektur für Web-APIs, die auf den Prinzipien von HTTP basiert. Sie ist die am meisten genutzte Form von Web-APIs.
* Grundprinzipien: Client-Server-Trennung, Stateless, Ressourcen-basiert (Alles wird als Ressource betrachtet mit einer eindeutigen URL (Uniform Resource Locator)), HTTP-Methoden entsprechen CRUD (GET, POST, PUT/PATCH \& DELETE).



##### Tomcat

Servlet-Container von Apache. Ein Servlet-Container ist ein spezieller Webserver, der Java-Webanwendungen ausführen kann.

* Anfragen (HTTP-Requests) entgegennehmen.
* Diese Requests in Servlet-Objekte übersetzen (Java-Standard für Web).
* Deinen Code (Controller in Spring Boot) ausführen.

Ergebnisse zurück an den Browser liefern (HTTP-Response).



##### Maven

Build-Management-Tool für Java-Projekte.

* Build-Prozess automatisieren (kompilieren, testen, paketieren, z. B. .jar oder .war).
* Dependencies verwalten (automatisches Herunterladen von Bibliotheken).
* Projektstandardisierung (einheitliche Ordnerstruktur, z. B. src/main/java).
* Plugins bereitstellen (z. B. Tests, Deployments, Reports).



##### Git

Versionskontrollsystem. Mit Git kannst du deine Änderungen versionieren (commiten), jederzeit zu alten Versionen zurückspringen und Änderungen nachvollziehen.

* git init
* git add .
* git commit -m "Nachricht"
* git push
* git status
* git log



*Offene Fragen:*

1. *Was ist Angular?*
2. *Was ist NodeJS?*
3. *Was ist Hibernate?*
4. *Wie funktioniert Scrum oder Kanban?*



*Grundkenntnisse auffrischen:*

1. *Allgemeines um Java*
2. *Klassen / Methoden - Konstruktoren, Annotationen usw.*
3. *Abstrakte Klassen \& Interfaces*
4. *TCP / UDP*
