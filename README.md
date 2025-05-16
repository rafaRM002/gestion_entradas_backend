# 🎟️ Backend - Gestión de Entradas

Este es el backend del sistema de gestión de entradas y productos para un museo o centro de eventos, desarrollado con **Java + Spring Boot**. Proporciona una **API REST** que permite gestionar entradas, productos, ventas y usuarios.

## 🚀 Tecnologías Utilizadas

- **Lenguaje:** Java
- **Framework:** Spring Boot
- **Base de datos:** MySQL
- **ORM:** Spring Data JPA (Hibernate)
- **API REST:** Sí
- **Autenticación (opcional):** Spring Security

---

## 🧱 Arquitectura del Proyecto

---

### 🎟️ 1. Entradas
- Alta de entradas (nombre, precio, tipo, fecha)
- Listado de entradas disponibles
- Añadir entradas a la venta

### 🛒 2. Productos
- Alta de productos (nombre, precio, stock)
- Listado de productos
- Añadir productos al carrito
- Actualización automática de stock tras venta

### 🧾 3. Ventas y Tickets
- Registrar cada venta (producto, entrada o ambos)
- Calcular total y registrar método de pago
- Historial de tickets

### 👥 4. Usuarios
- Login básico (con tabla `usuarios`)
- Asociación de ventas a usuarios (opcional)

---

## ⚙️ Configuración del Entorno

### 🔧 Requisitos Previos
- JDK 17+
- Maven
- MySQL Server

### 📁 Dependencias (Spring Initializr)
- Spring Web
- Spring Data JPA
- MySQL Driver
- (Opcional) Spring Security

### 🔧 `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gestion_entradas
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
