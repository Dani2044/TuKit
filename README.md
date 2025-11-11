# TuKit — Web Product Platform

TuKit is a tutor-matching platform built as an **undergraduate thesis project** at
Pontificia Universidad Javeriana, Bogotá. This repository contains the platform's
**web product site** — a server-rendered Spring Boot application with custom
Thymeleaf templates, styling and imagery.

> The word "TuKit" is inspired by *"tu kit"* (Spanish for *"your kit"*): the idea that
> every student can build their own learning kit with the right tutor.

## What's in this repository

| Page | Purpose |
| ---- | ------- |
| `index.html` | Landing page: product pitch, value proposals, first look at the app UI. |
| `caracteristicas.html` | Feature tour (quality, personalization, 24/7 availability, marketplace, etc.). |
| `planes.html` | Subscription plans. |
| `proyecto.html` | Thesis project page describing the platform rationale. |

Imagery and styles live in `src/main/resources/static/` (`images/`, `styles/`),
kept deliberately separate from the page markup.

## Architecture

- **Backend:** Spring Boot 3 (Java 17) exposes an embedded web server and serves
  the Thymeleaf templates.
- **Frontend:** server-rendered HTML with hand-written CSS — no client build step.
- **Testing:** Spring Boot test starter (`spring-boot-starter-test`).

```
src/main
├── java/com/example/demo
│   ├── DemoApplication.java      # Spring Boot entry point
│   └── controller/MainController.java   # Page routing
└── resources
    ├── templates/               # Thymeleaf pages (*.html)
    ├── static/styles/           # Custom CSS
    └── static/images/           # Product imagery
```

## Getting started

Requirements: **JDK 17+**. No database or external services are required.

```bash
# with the Maven wrapper
./mvnw spring-boot:run

# or with a system Maven
mvn spring-boot:run
```

Then open <http://localhost:8080>.

## Tests

```bash
./mvnw test
```

The default test verifies the Spring context loads correctly.

## License

[MIT](LICENSE) — see the license file for details.