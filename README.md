# Learning Service

Employee training and learning hours tracking service built with Spring Boot 2.7.18 and Java 11.

## Features

- REST API endpoints for learning hours and training categories
- Employee and EmployeeLearning entities with JPA/Hibernate
- Oracle database integration
- CORS configuration for Angular frontend integration
- Comprehensive learning data management system

## Environment Variables

The following environment variables must be set:

```
DB_URL=jdbc:oracle:thin:@localhost:1521:XE
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password
```

## API Endpoints

- `GET /api/learning/employees/{id}/hours` - Get learning hours for specific employee
- `GET /api/learning/training-summary` - Get training summary data
- `GET /api/learning/categories` - Get training categories

## Running the Service

```bash
mvn spring-boot:run
```

The service will start on port 8081.

## Database Schema

Requires Oracle database with Employee and EmployeeLearning tables.
