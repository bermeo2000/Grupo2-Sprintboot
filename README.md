# CRUD de Estudiantes - Spring Boot

## Descripción
Proyecto CRUD para gestionar estudiantes usando **Spring Boot**.  
Permite crear, leer, actualizar y eliminar estudiantes con los siguientes campos:

- `id` (Long, autogenerado)
- `nombres` (String)
- `apellidos` (String)
- `correo` (String)

Los endpoints se pueden probar con **Insomnia**, **Postman**, o cualquier cliente HTTP.

---

## Requisitos

- Java 17 o superior
- Maven 3.6 o superior
- Base de datos H2, MySQL o PostgreSQL
- IDE (IntelliJ, Eclipse, VS Code)
- Spring Boot 3.x

---

## Configuración de la base de datos

application.properties

## Clonar el repositorio:

git clone https://github.com/bermeo2000/Grupo2-Sprintboot.git
cd Grupo2-Sprintboot

Ejecutar con Maven:
mvn spring-boot:run

### Estructura del proyecto

src/main/java/com/maestria/estudiante/
├── entity
│   └── Estudiante.java
├── repository
│   └── EstudianteRepository.java
├── controller
│   └── EstudianteController.java
└── EstudianteApplication.java

