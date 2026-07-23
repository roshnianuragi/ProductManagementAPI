# Product Management API

A professional RESTful Backend API built using **Spring Boot** for managing products with complete CRUD operations and image upload functionality using **Cloudinary**.

This project follows a clean layered architecture using **Controller, DTO, Service, Mapper, Repository, and Entity layers** to make the application scalable and maintainable.

---

# Features

- Create Product
- Get All Products
- Get Product By ID
- Update Product
- Delete Product
- Upload Product Images using Cloudinary
- Store Image URL and Public ID
- DTO based Request and Response Handling
- Entity to DTO Conversion using Mapper
- Global Exception Handling
- Request Validation
- MySQL Database Integration

---

# Technology Stack

## Backend

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

## Database

- MySQL

## Tools & Services

- Maven
- Postman
- Cloudinary
- Git
- GitHub

---

# Project Architecture

```
Controller
    |
    ↓
DTO
    |
    ↓
Service
    |
    ↓
Mapper
    |
    ↓
Entity
    |
    ↓
Repository
    |
    ↓
Database
```

---

# API Endpoints

## Create Product

### POST

```
/products
```

Request Type:

```
multipart/form-data
```

Parameters:

```
name        : Product Name
description : Product Description
price       : Product Price
file        : Product Image
```

---

## Get All Products

### GET

```
/products
```

Returns all available products.

---

## Get Product By ID

### GET

```
/products/{id}
```

Example:

```
/products/1
```

---

## Update Product

### PUT

```
/products/{id}
```

Parameters:

```
name
description
price
file(optional)
```

---

## Delete Product

### DELETE

```
/products/{id}
```

Example:

```
/products/1
```

---

# Database Configuration

This project uses **MySQL Database** for storing product details.

Configure database properties in:

```
application.properties
```

Required properties:

```
spring.datasource.url
spring.datasource.username
spring.datasource.password
```

---

# Cloudinary Configuration

Cloudinary is used for product image upload and management.

Required properties:

```
cloudinary.cloud-name
cloudinary.api-key
cloudinary.secret-key
```

---

# Exception Handling

Centralized exception handling is implemented using:

- @RestControllerAdvice
- ResourceNotFoundException

Handled exceptions:

- Product Not Found Exception
- Runtime Exceptions

---

# Validation

Bean Validation is implemented for request validation.

Used annotations:

- @NotBlank
- @Positive

---

# Project Structure

```
ProductManagementAPI
│
├── src/main/java
│   │
│   └── com.product.api
│       │
│       ├── config
│       ├── controller
│       ├── dto
│       ├── exception
│       ├── mapper
│       ├── model
│       ├── repository
│       └── service
│
├── src/main/resources
│
├── pom.xml
├── README.md
└── .gitignore
```

---

# How To Run The Project

### Step 1: Clone Repository

```
git clone <repository-url>
```

### Step 2: Configure Database

Update MySQL credentials in:

```
application.properties
```

### Step 3: Configure Cloudinary

Add Cloudinary credentials:

```
cloudinary.cloud-name
cloudinary.api-key
cloudinary.secret-key
```

### Step 4: Run Application

Using Maven:

```
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

# Future Improvements

- Add Spring Security
- Add JWT Authentication
- Add Swagger API Documentation
- Add Pagination and Sorting

---

# Author

**Roshni Anuragi**

Java Backend Developer | Spring Boot Developer# Product Management API

A RESTful Backend API developed using **Spring Boot** for managing products with complete CRUD operations and image upload functionality using **Cloudinary**.

This project follows a clean layered architecture using **Controller, DTO, Service, Mapper, Repository, and Entity layers**.

---

# Features

- Create Product
- Get All Products
- Get Product By ID
- Update Product
- Delete Product
- Upload Product Images using Cloudinary
- Store Image URL and Public ID
- DTO based Request and Response Handling
- Entity to DTO Mapping
- Global Exception Handling
- Input Validation
- MySQL Database Integration

---

# Technology Stack

## Backend

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate

## Database

- MySQL

## Tools

- Maven
- Postman
- Git
- GitHub

## Third Party Service

- Cloudinary (Image Storage)

---

# Project Architecture

```
Controller Layer
        |
        ↓
DTO Layer
        |
        ↓
Service Layer
        |
        ↓
Mapper Layer
        |
        ↓
Entity Layer
        |
        ↓
Repository Layer
        |
        ↓
Database
```

---

# API Endpoints

## 1. Create Product

**POST**

```
/products
```

Request Type:

```
multipart/form-data
```

Request Parameters:

```
name        : Product name
description : Product description
price       : Product price
file        : Product image
```

---

## 2. Get All Products

**GET**

```
/products
```

Returns all products from database.

---

## 3. Get Product By ID

**GET**

```
/products/{id}
```

Example:

```
/products/1
```

---

## 4. Update Product

**PUT**

```
/products/{id}
```

Request Parameters:

```
name
description
price
file(optional)
```

---

## 5. Delete Product

**DELETE**

```
/products/{id}
```

Example:

```
/products/1
```

---

# Database Configuration

This project uses **MySQL** database for storing product information.

Database configuration is managed through:

```
application.properties
```

Required properties:

```
spring.datasource.url
spring.datasource.username
spring.datasource.password
```

---

# Cloudinary Configuration

Cloudinary is integrated for uploading and storing product images.

Required configuration:

```
cloudinary.cloud-name
cloudinary.api-key
cloudinary.secret-key
```

---

# Exception Handling

The application uses centralized exception handling.

Implemented using:

- `@RestControllerAdvice`
- Custom `ResourceNotFoundException`

Handled cases:

- Product not found
- Runtime exceptions

---

# Validation

Request validation is implemented using Spring Boot Bean Validation.

Used annotations:

- `@NotBlank`
- `@Positive`

---

# Project Structure

```
ProductManagementAPI
│
├── src/main/java
│   │
│   └── com.product.api
│       │
│       ├── config
│       ├── controller
│       ├── dto
│       ├── exception
│       ├── mapper
│       ├── model
│       ├── repository
│       └── service
│
├── src/main/resources
│
├── pom.xml
├── README.md
└── .gitignore
```

---

# How To Run The Project

### 1. Clone Repository

```
git clone <repository-url>
```

### 2. Configure MySQL Database

Update database credentials in:

```
application.properties
```

### 3. Configure Cloudinary

Add Cloudinary credentials:

```
cloudinary.cloud-name
cloudinary.api-key
cloudinary.secret-key
```

### 4. Run Application

Using Maven:

```
mvn spring-boot:run
```

Application runs on:

```
http://localhost:8080
```

---

# Author

**Roshni Anuragi**

Java Backend Developer | Spring Boot Developer