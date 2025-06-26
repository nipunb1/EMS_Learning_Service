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

### Employee Table
```sql
CREATE TABLE Employee (
    emp_id NUMBER(10) PRIMARY KEY,
    emp_name VARCHAR2(100) NOT NULL,
    emp_project VARCHAR2(100),
    emp_dept VARCHAR2(50) NOT NULL,
    emp_sal NUMBER(10,2) NOT NULL,
    emp_exp NUMBER(3) NOT NULL
);
```

### Employee_Learning Table
```sql
CREATE TABLE Employee_Learning (
    learning_id NUMBER(10) PRIMARY KEY,
    emp_id NUMBER(10) NOT NULL,
    training_name VARCHAR2(200) NOT NULL,
    learning_hours NUMBER(5,2) NOT NULL,
    completion_date DATE NOT NULL,
    training_category VARCHAR2(50),
    FOREIGN KEY (emp_id) REFERENCES Employee(emp_id)
);
```

### Sequences
```sql
CREATE SEQUENCE emp_seq START WITH 9 INCREMENT BY 1;
CREATE SEQUENCE learning_seq START WITH 11 INCREMENT BY 1;
```

### Sample Data

**Employee Records:**
- John Smith (IT, ERP Implementation) - 5 years experience, $75,000
- Sarah Johnson (IT, Mobile App Development) - 3 years experience, $68,000
- Mike Davis (Analytics, Data Analytics) - 7 years experience, $82,000
- Emily Brown (IT, Customer Portal) - 4 years experience, $71,000
- David Wilson (Operations, Infrastructure Upgrade) - 6 years experience, $79,000
- Lisa Garcia (Marketing, Marketing Automation) - 2 years experience, $65,000
- Robert Taylor (Security, Security Enhancement) - 8 years experience, $88,000
- Jennifer Lee (Analytics, Business Intelligence) - 5 years experience, $76,000

**Learning Records:**
- Java Advanced Programming (40 hours, Technical)
- Oracle Database Administration (32 hours, Database)
- Angular Framework (28 hours, Frontend)
- Mobile Development with React Native (45 hours, Mobile)
- Data Science with Python (60 hours, Analytics)
- Machine Learning Fundamentals (50 hours, Analytics)
- UI/UX Design Principles (24 hours, Design)
- Cloud Architecture (36 hours, Infrastructure)
- Digital Marketing Strategy (20 hours, Marketing)
- Cybersecurity Best Practices (48 hours, Security)
