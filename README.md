# Gestión de Alumnos con Hibernate y MySQL

Este proyecto es una aplicación de consola en Java desarrollada como parte del módulo de **Acceso a Datos (AD)** del ciclo formativo **DAM (Desarrollo de Aplicaciones Multiplataforma)** en CESUR Andalucía. Su objetivo principal es la gestión de alta de alumnos en una base de datos MySQL, utilizando Hibernate como ORM (Object-Relational Mapping).

## Sobre el Proyecto

Esta aplicación permite interactuar con una base de datos MySQL para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una tabla de `alumnos`. La interacción con el usuario se realiza a través de la consola, solicitando datos como nombre, apellidos, curso, edad y número de asignaturas matriculadas de cada alumno.

El proyecto está estructurado para demostrar la integración de Java con bases de datos relacionales utilizando un ORM, simplificando la gestión de datos sin necesidad de escribir código SQL de forma manual.

## Características

* **Alta de Alumnos:** Permite registrar nuevos alumnos en la base de datos.
* **Consulta de Alumnos:** Posibilidad de buscar alumnos por ID.
* **Actualización de Datos:** Permite modificar la información de alumnos existentes.
* **Eliminación de Alumnos:** Funcionalidad para borrar registros de alumnos.
* **Persistencia de Datos:** Utiliza MySQL como sistema gestor de base de datos.
* **Mapeo Objeto-Relacional:** Implementado con Hibernate para un manejo eficiente de los datos.

## Tecnologías Utilizadas

* **Java:** Lenguaje de programación principal.
* **Maven:** Herramienta de gestión de proyectos y dependencias.
* **MySQL:** Base de datos relacional para el almacenamiento de información.
* **Hibernate ORM:** Framework para el mapeo objeto-relacional.
* **IntelliJ IDEA Ultimate:** Entorno de Desarrollo Integrado (IDE) utilizado para el desarrollo.

## Instalación y Uso

Sigue estos pasos para configurar y ejecutar el proyecto localmente:

### 1. Configuración de la Base de Datos MySQL

Primero, asegúrate de tener MySQL instalado y en funcionamiento. Luego, crea la base de datos y la tabla `alumnos` ejecutando el siguiente script SQL:

```sql
CREATE DATABASE academia;
USE academia;

CREATE TABLE alumnos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(150) NOT NULL,
    curso VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    num_asignaturas INT NOT NULL
);
