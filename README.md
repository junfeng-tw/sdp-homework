# Project Title
## Description
This project is a Spring Boot application that manages products. It includes basic CRUD operations for products and uses Docker for containerization.

## Prerequisites
- Java 11 or higher
- Docker
- Docker Compose
- Gradle


## Getting Started

- Building and Running the Application
```
git clone <repository-url>
cd <repository-directory>
```
- Build the Docker image:
```
docker-compose build
```
- Run the application:
```
docker-compose up
```

## Accessing the Application
The application will be accessible at http://localhost:8080.
### API Endpoints
GET `/products`: Retrieve all products with page and size, default page=1,size=15,maxSize=30
