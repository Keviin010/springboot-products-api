# springboot-products-api

API REST para gestionar productos desarrollada con Spring Boot, Spring Data JPA y MySQL.

## Endpoints

| Método | URL | Descripción |
|--------|-----|-------------|
| GET | /products | Lista todos los productos |
| GET | /products/{id} | Busca un producto por id |
| POST | /products | Crea un nuevo producto |
| PUT | /products/{id} | Actualiza un producto |
| DELETE | /products/{id} | Elimina un producto |

## Tecnologías

- Java 21
- Spring Boot 3.4.3
- Spring Data JPA
- MySQL

## Requisitos

- Java 21
- Maven
- MySQL

## Configuración

Crear la base de datos y configurar `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_springboot_backend
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
```

## Ejecución
```bash
mvn spring-boot:run
```

API disponible en `http://localhost:8080`
