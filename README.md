# 🧑‍🎓 Student Management System

A full-stack Spring Boot application for managing student data using both MySQL and H2 databases.  
This project demonstrates CRUD operations, MVC architecture, dual database configuration, and basic Spring Boot features—ideal for beginners and portfolio showcase.

---

## 📌 Features

- Add, update, view, and delete students
- MVC (Model-View-Controller) architecture
- RESTful endpoints
- Dual database support: **MySQL** & **H2 (in-memory)**
- JSP-based frontend with Bootstrap
- Spring Data JPA for persistence
- Responsive and clean UI

---

## 🛠️ Technologies Used

| Layer     | Tools/Technologies                       |
|-----------|------------------------------------------|
| Backend   | Spring Boot, Spring MVC, Spring Data JPA |
| Frontend  | JSP, HTML, CSS, Bootstrap                |
| Database  | MySQL, H2                                |
| Tools     | Maven, IntelliJ IDEA / Eclipse, Git      |

---

## 📁 Project Structure

```
student-management/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── example/
        │           └── studentmanagement/
        │               ├── StudentManagementApplication.java
        │               ├── controller/
        │               ├── model/
        │               └── repository/
        └── resources/
            ├── application.properties
            ├── static/
            └── templates/
                ├── add-student.jsp
                ├── list-students.jsp
                └── update-student.jsp
```

---

## ✅ Prerequisites

- Java 17+
- Maven
- MySQL Server

---

## 🔧 Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/vaibhavNITW/student-management.git
cd student-management
```

### 2. Set Up MySQL Database

```sql
CREATE DATABASE student_db;
```

### 3. Configure `application.properties`

```properties
# MySQL Configuration (default)
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

# H2 Configuration (optional for testing)
spring.h2.console.enabled=true
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
```

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

### 6. Access the Application

- 🌐 UI: [http://localhost:8080/students](http://localhost:8080/students)  
- 🧪 H2 Console (for testing): [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
  - JDBC URL: `jdbc:h2:mem:testdb`

---

## 🧪 Screenshot Ideas

- Homepage displaying student list  
- Add student form  
- Update student page  
- Delete confirmation prompt  
- H2 console with database entries  

*(Add screenshots in `/resources/static/images/` and embed them if needed)*

---

## 📚 Folder Highlights

| Folder/File               | Description                                 |
|--------------------------|---------------------------------------------|
| `controller/`            | Handles web routes and logic                |
| `model/`                 | Contains the `Student` entity class         |
| `repository/`            | JPA interfaces for database operations      |
| `resources/templates/`   | JSP view pages                              |
| `application.properties` | DB and JPA configuration                    |

---

## 📌 Important Notes

- Project runs with **MySQL by default**. For quick testing or demos, switch to **H2 in-memory** by editing `application.properties`.
- ⚠️ Avoid using `spring.jpa.hibernate.ddl-auto=update` in production as it can alter your DB schema automatically.

---

## 🙋‍♂️ Author

**Vaibhav Kumar Mishra**  
- GitHub: [@vaibhavNITW](https://github.com/vaibhavNITW)  
- LinkedIn: [Vaibhav on LinkedIn](https://www.linkedin.com/in/vaibhav-kumar-mishra-a01892248/)

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

