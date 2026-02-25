# Gestión Empleados API

REST API para la gestión de empleados desarrollada con Spring Boot y MySQL. Permite realizar operaciones CRUD completas sobre una base de datos de empleados a través de endpoints HTTP.

---

## Descripción

Este proyecto implementa una API REST profesional siguiendo una arquitectura en capas (Controller - Service - Repository - Model). Fue desarrollado para aprender y demostrar conocimientos en desarrollo backend con Java y Spring Boot.

La API permite gestionar empleados de una empresa: crear nuevos registros, consultar empleados existentes, actualizar sus datos y eliminarlos de la base de datos.

---

## Tecnologías

- Java 21
- Spring Boot 4.0.3
- Spring Data JPA / Hibernate
- MySQL 9.6
- Maven 3.9

---

## Arquitectura

El proyecto sigue el patrón de arquitectura en capas estándar en desarrollo backend profesional:
```
src/main/java/com/nelson/gestionapi/
├── controller/    # Recibe las peticiones HTTP y devuelve respuestas
├── service/       # Lógica de negocio
├── repository/    # Comunicación con la base de datos mediante JPA
└── model/         # Entidades JPA que representan las tablas
```

Cada capa tiene una responsabilidad única y no conoce los detalles de implementación de las demás. Esto facilita el mantenimiento, las pruebas y la escalabilidad del proyecto.

---

## Requisitos previos

- Java 21 o superior
- MySQL 8.0 o superior
- Maven 3.9 o superior

---

## Instalación y configuración

1. Clona el repositorio:
```bash
git clone https://github.com/NUXX-G/Gestion-Empleados-API.git
cd Gestion-Empleados-API
```

2. Crea la base de datos en MySQL:
```sql
CREATE DATABASE gestionapi;
```

3. Crea el archivo `src/main/resources/application.properties` con tus credenciales:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gestionapi
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Compila y ejecuta el proyecto:
```bash
mvn spring-boot:run
```

5. La API estará disponible en `http://localhost:8080`

> Las tablas se crean automáticamente en la base de datos gracias a JPA/Hibernate.

---

## Endpoints

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | /api/empleados | Listar todos los empleados |
| GET | /api/empleados/{id} | Obtener empleado por ID |
| POST | /api/empleados | Crear un nuevo empleado |
| PUT | /api/empleados/{id} | Actualizar datos de un empleado |
| DELETE | /api/empleados/{id} | Eliminar un empleado |

---

## Ejemplo de uso

Crear un empleado (POST /api/empleados):
```json
{
  "nombre": "Carlos",
  "apellido": "García",
  "email": "carlos.garcia@empresa.com",
  "departamento": "Desarrollo",
  "salario": 35000
}
```

Respuesta:
```json
{
  "id": 1,
  "nombre": "Carlos",
  "apellido": "García",
  "email": "carlos.garcia@empresa.com",
  "departamento": "Desarrollo",
  "salario": 35000
}
```

---

## Estado del proyecto

Actualmente en desarrollo. Funcionalidades implementadas hasta ahora:

- Configuración del proyecto con Spring Boot
- Conexión con base de datos MySQL
- Modelo de datos con JPA
- Repositorio con Spring Data JPA

Próximamente:
- Endpoints CRUD completos
- Validación de datos
- Manejo de errores
- Deploy en VPS

---

## Autor

**Nelson Filipe Fardilha Karlsson**  
[GitHub](https://github.com/NUXX-G) · [LinkedIn](https://www.linkedin.com/in/nelson-filipe-fardilha-karlsson-93078931b/) · [Portfolio](https://nelsonffkarlsson.com)
```
