# Product Management API

## Overview

Product Management API is a RESTful backend application developed using Spring Boot. It provides CRUD operations for managing products with image upload support using Cloudinary. The project follows a layered architecture using Controller, Service, Repository, DTO, Mapper, and Entity.

---

## Features

- Create Product
- Get All Products
- Get Product By ID
- Update Product
- Delete Product
- Cloudinary Image Upload
- DTO (Request & Response)
- Mapper
- Global Exception Handling
- Request Validation
- MySQL Database Integration

---

## Technology Stack

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Cloudinary
- Maven
- Jakarta Validation

---

## Project Structure

```text
src
├── config
├── controller
├── dto
├── exception
├── mapper
├── model
├── repository
├── service
└── resources
```

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /products | Create Product |
| GET | /products | Get All Products |
| GET | /products/{id} | Get Product By ID |
| PUT | /products/{id} | Update Product |
| DELETE | /products/{id} | Delete Product |

---

## Configuration

Configure the following environment variables:

```properties
DB_URL=your_database_url
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password

CLOUDINARY_CLOUD_NAME=your_cloud_name
CLOUDINARY_API_KEY=your_api_key
CLOUDINARY_SECRET_KEY=your_secret_key
```

---

## Running the Project

```bash
git clone https://github.com/roshnianuragi/ProductManagementAPI.git

cd ProductManagementAPI

mvn spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```# Product Management API

## Overview

Product Management API is a RESTful backend application developed using Spring Boot. It provides complete CRUD operations for managing products with image upload support using Cloudinary. The project follows a clean layered architecture using Controller, Service, Repository, DTO, Mapper, and Entity. The application uses MySQL for data persistence and exposes REST APIs for product management.

---

## Features

- Create Product
- Get All Products
- Get Product By ID
- Update Product
- Delete Product
- Cloudinary Image Upload
- DTO (Request & Response)
- Mapper
- Global Exception Handling
- Request Validation
- MySQL Database Integration

---

## Technology Stack

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Cloudinary
- Maven
- Jakarta Validation

---

## Project Structure

```text
ProductManagementAPI
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.product.api
│   │   │       ├── config
│   │   │       ├── controller
│   │   │       ├── dto
│   │   │       ├── exception
│   │   │       ├── mapper
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       └── service
│   │   └── resources
│   │       └── application.properties
│   └── test
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/products` | Create Product |
| GET | `/products` | Get All Products |
| GET | `/products/{id}` | Get Product By ID |
| PUT | `/products/{id}` | Update Product |
| DELETE | `/products/{id}` | Delete Product |

---

## Configuration

Configure the following environment variables before running the application.

```properties
DB_URL=your_database_url
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password

CLOUDINARY_CLOUD_NAME=your_cloud_name
CLOUDINARY_API_KEY=your_api_key
CLOUDINARY_SECRET_KEY=your_secret_key
```

The application reads these values from `application.properties`.

---

## Running the Project

Clone the repository.

```bash
git clone https://github.com/roshnianuragi/ProductManagementAPI.git
```

Navigate to the project directory.

```bash
cd ProductManagementAPI
```

Run the application.

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

## Summary

This project demonstrates the implementation of a RESTful Product Management API using Spring Boot. It includes CRUD operations, Cloudinary image upload, DTO-based architecture, request validation, global exception handling, and MySQL database integration following a clean layered architecture.