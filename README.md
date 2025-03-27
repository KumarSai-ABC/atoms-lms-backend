# ATOMS LMS Backend

This is the backend for the ATOMS Learning Management System (LMS) mini-project, built with Spring Boot. It provides a REST API for user registration and uses an H2 in-memory database for local development.

## Features
- User registration via the `/api/users/register` endpoint.
- H2 in-memory database for storing user data during local development.
- Spring Security with CORS configuration to allow requests from the frontend (`http://localhost:3000`).
- Password encryption using `BCryptPasswordEncoder` for secure storage.

## Technologies Used
- **Spring Boot**: 3.4.4
- **Spring Data JPA**: For database operations
- **H2 Database**: In-memory database for local development
- **Spring Security**: For securing the API
- **Lombok**: To reduce boilerplate code
- **Java**: 21

## Prerequisites
- **Java 21**: Ensure Java 21 is installed (`java -version` to check).
- **Maven**: For building and running the project (`mvn -version` to check).

## Setup and Running Instructions
1. **Clone the Repository**:
   ```sh
   git clone https://github.com/KumarSai-ABC/atoms-lms-backend.git
   cd atoms-lms-backend

2. **Build the Project**:
   ```sh
   mvn clean install

3. **Run the Application**:
   ```sh
   mvn spring-boot:run

- The backend will start on http://localhost:8080.