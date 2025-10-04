Lernprojekt als Vorbereitung auf den Techstack von adesso SE.

Im folgenden wird mein Projekt mit den zugehörigen Klassen / Methoden usw. erklärt.


Tage 1–2 – Grundlagen & Projektgerüst
Java 17/21, Maven, Spring Boot verstehen (Controller, IoC/DI, Beans, Profiles).
Repo anlegen: adesso-demo
Module: backend/ (Spring Boot) und optional client/ (Mini-UI).

Tage 3–4 – CRUD-API
Beispiel-Domain: Task (id, title, description, status).
Endpunkte: GET /api/tasks, POST /api/tasks, DELETE /api/tasks/{id}.
Schichten: controller → service → repository; DTO+Mapper (manuell).

Tage 5–6 – Persistenz (Postgres) & Docker
JPA/Hibernate + Flyway (Schema-Migrationen).
docker-compose für Postgres (+ optional pgAdmin).
Profile dev (H2) und prod (Postgres).

Tage 7–8 – Security mit Spring Security + JWT
Endpunkte: POST /auth/register, POST /auth/login.
Stateless Security Config, JWT-Filter, PasswordEncoder (BCrypt), Rollen.

Tag 9 – Swagger/OpenAPI & Qualität
springdoc-openapi anbinden → Swagger-UI.
Exception-Handling, Validation, Logging, Tests (ein, zwei @SpringBootTest).

Tag 10 – Mini-Frontend & Dockerfile
Sehr einfache HTML/JS-Seite zum Aufrufen von GET/POST/DELETE mit Bearer-Token.
Dockerfile fürs Backend.
README mit “How to run” und Interview-Argumentation.


Laufzeit – was passiert Schritt für Schritt?

- Start der App
- IntelliJ startet main()
- SpringApplication.run(...) bootet Tomcat und erstellt den Spring Context
- Component Scan
- Spring sucht nach Klassen mit Annotationen wie @RestController, @Service, @Repository.
- Diese Klassen werden instanziert und in den Container gelegt.
- Registrierung der Routen
- Spring merkt: HelloController hat @GetMapping("/hello").
- Es speichert: „Wenn jemand /hello aufruft, führe hello() aus.“
- Request an die API
- Du gibst im Browser http://localhost:8080/hello ein.
- Der Request geht an Tomcat → Spring → Controller.
- Spring ruft hello() auf.
- Response zurück
- Ergebnis von hello() (String) wird automatisch zur HTTP-Antwort.
- Browser zeigt den Text an.


ProjectApplication.java

@SpringBootApplication
- Kombination aus mehreren Annotationen (@Configuration, @EnableAutoConfiguration, @ComponentScan).
- Bedeutet: „Hier startet die Spring-Welt – bitte scanne alle Klassen in diesem Paket und lade sie in den IoC Container.“

SpringApplication.run(...)
- Startet den eingebauten Tomcat Webserver auf Port 8080.
- Baut den Spring-Kontext auf: alle Klassen mit speziellen Annotationen (@RestController, @Service, @Repository, …) werden instanziiert und verwaltet.


Controller.java

@RestController
- Spring macht daraus automatisch eine Komponente im IoC Container.
- Jeder Methodenaufruf wird direkt in eine HTTP-Antwort umgewandelt (JSON oder Text).

@GetMapping("/hello")
- Verknüpft eine HTTP GET Anfrage mit deiner Methode.
- Beispiel: Aufruf im Browser http://localhost:8080/hello → führt hello() aus.

