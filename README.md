# savics-medical-records

Spring Boot CRUD appliaction for Savics coding challenge.
It is demonstrating how to implement simple CRUD operations with a `Medical Record` entity.

## What's inside 
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Core
- Spring Data (Hibernate & MySQL)
- Spring MVC (Tomcat)
- [Thymleaf](https://thymeleaf.org)

## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

## Database configuration 

The application is configured to use H2 Database Engine.
H2 is an open-source lightweight Java database. It can be embedded in Java applications or run in the client-server mode. Mainly, H2 database can be configured to run as in-memory database, which means that data will not persist on the disk.
See configurations in `/resources/application.properties`.  

Preview :

```
spring.h2.console.enabled=true
# default path: h2-console
spring.h2.console.path=/h2-ui
 
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver 
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto= update
```

## Usage 
Run the project through the IDE and head out to [http://localhost:8080](http://localhost:8080)

or 

run this command in the command line:
```
mvn spring-boot:run
```
