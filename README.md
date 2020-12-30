# Sail service CRUD

## General
CRUD service with "Sail" model. Used MVC software design pattern.

## Technologies
- Java 11
- Maven
- Spring Boot 2.4.0
- Thymeleaf
- Bootstrap(CSS)
- JQuery/JavaScript
- H2 DB
- JPA  

## Configuration
H2 DB application.properties:

    spring.h2.console.enabled=true

    spring.datasource.platform=h2
    spring.datasource.url=jdbc:h2:mem:dbSails
    spring.datasource.initialization-mode=always
    spring.datasource.data= classpath:/data.sql
    
    spring.jpa.hibernate.ddl-auto=update

## Screenshots

![home](./prtScr/1.png "Home")
![new](./prtScr/2.png "New Sail")
![edit](./prtScr/3.png "Edit Sail")
![delete](./prtScr/4.png "Delete Sail")
![validation](./prtScr/5.png "Validation")

