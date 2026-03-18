# springboot-products-api

API REST para gestionar productos con validación de datos y manejo global de excepciones,
desarrollada con Spring Boot, Spring Data JPA y MySQL.

## Endpoints

| Método | URL    | Descripción               |
|--------|--------|---------------------------|
| GET    | /      | Lista todos los productos |
| GET    | /{id}  | Busca un producto por id  |
| POST   | /      | Crea un nuevo producto    |
| PUT    | /{id}  | Actualiza un producto     |
| DELETE | /{id}  | Elimina un producto       |

## Tecnologías

- Java 21
- Spring Boot 3.4.3
- Spring Data JPA
- MySQL
- Bean Validation

## Características

- Arquitectura en capas (entity, repository, service, controller).
- Inyección de dependencias por constructor.
- Validaciones con `@Valid` y Bean Validation.
- Manejo global de excepciones con `@RestControllerAdvice`.
- `ResponseEntity` para manejar respuestas HTTP correctamente.
- Respuestas de error en formato JSON.

## Ejemplo de error de validación
```json
{
  "name": "El nombre es obligatorio",
  "description": "La descripción es obligatoria"
}
```

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
