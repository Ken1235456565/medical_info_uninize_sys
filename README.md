# Medical Information Unionize System (medicalSystem)

This is a full-stack Medical Information Management System built with Spring Boot. The system is designed to integrate and manage data for patients, doctors, clinics, and prescriptions, providing a unified platform for healthcare information.

## 🛠 Technology Stack

* Backend Framework: Spring Boot 3.2.1
* Persistence Layer: Spring Data JPA / Hibernate
* Database: MySQL 8.0+
* Build Tool: Maven
* Language: Java 17
* Web: Spring Web (RESTful APIs)

## 🚀 Core Features

1. User Authentication: Secure login and registration for different roles (e.g., Patients and Doctors).
2. Patient Management: Registration and maintenance of patient profiles, including contact information and history.
3. Medical Staff & Clinics: Management of doctor specialties, clinic assignments, and availability.
4. Visits & Medical Reports: Documentation of patient visits and the generation/sharing of detailed medical reports.
5. Prescription System: Allows doctors to issue prescriptions with detailed medication items, dosages, and durations.

## 🗄 Database Architecture

The project uses a MySQL database named `health_care`. Key tables include:

* `auth_user`: Credentials and roles for system access.
* `patient` & `doctor`: Detailed profiles for healthcare participants.
* `careteam`: Maps the relationship between patients and their assigned medical staff.
* `visit` & `report`: Records of medical encounters and findings.
* `prescription` & `prescriptionItem`: Complete tracking of prescribed medications.

## ⚙️ Quick Start

### 1. Prerequisites

* JDK 17 or higher
* MySQL 8.0+
* Maven 3.6+

### 2. Database Setup

Create the database and import the provided schema:
```bash
mysql -u your_username -p -e "CREATE DATABASE health_care;"
mysql -u your_username -p health_care < dump-health_care-202512131440.sql
```

### 3. Configuration

Update `src/main/resources/application.properties` with your local database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/health_care
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
```

### 4. Run the Application

Start the server using the Maven wrapper:
```bash
./mvnw spring-boot:run
```

The application will be available at http://localhost:8080.

## 📁 Project Structure

* `pojo/`: JPA Entities representing the data model.
* `repository/`: Data Access Object (DAO) interfaces.
* `service/`: Business logic implementation.
* `controller/`: REST API endpoints.
* `config/`: MVC and resource configurations.
