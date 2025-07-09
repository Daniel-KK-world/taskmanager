# 🧩 Task Manager API (Spring Boot)

A robust and scalable **Task Management REST API** built with **Spring Boot**, featuring full CRUD functionality for both **Tasks** and **Users**. This backend service follows clean architecture principles and uses an in-memory H2 database for rapid prototyping and testing.

---

## ⚙️ Features

- ✅ **User & Task CRUD**: Separate endpoints and logic layers for managing users and their associated tasks.
- 🧠 **Clean Architecture**: Decoupled `Controller → Service → Repository` structure for maintainability and scalability.
- 💡 **H2 Database**: Fast, in-memory database—ideal for dev and testing.
- 🔥 **Postman-Friendly**: All endpoints tested and confirmed via Postman.
- 🧪 **Extendable**: Easily switch to MySQL, add auth, or plug in a frontend.

---

## 📦 Tech Stack

| Layer         | Technology          |
|---------------|---------------------|
| Language      | Java 21             |
| Framework     | Spring Boot         |
| Database      | H2 (In-Memory)      |
| Build Tool    | Maven               |
| API Testing   | Postman             |

---

## 🧱 Entities

### 🧍‍♂️ User

json
{
  "id": 1,
  "name": "Daniel Kwabi",
  "email": "daniel@example.com"
}
✅ Task
json
{
  "id": 101,
  "title": "Finish portfolio",
  "description": "Complete all project README files",
  "status": "pending",
  "userId": 1
}

🌐 API Endpoints
🔹 Users
Method	Endpoint	Description
GET	/users	Get all users
GET	/users/{id}	Get user by ID
POST	/users	Create a new user
PUT	/users/{id}	Update user
DELETE	/users/{id}	Delete user

🔸 Tasks
Method	Endpoint	Description
GET	/tasks	Get all tasks
GET	/tasks/{id}	Get task by ID
GET	/users/{id}/tasks	Get tasks by user ID
POST	/tasks	Create new task
PUT	/tasks/{id}	Update task
DELETE	/tasks/{id}	Delete task

🖼️ Screenshots
Screenshots of Postman test cases coming soon...

🚀 Getting Started
Prerequisites
Java 17+

Maven

Run Locally
bash
Copy
Edit
# Clone the project
git clone https://github.com/Daniel-KK-world/task-manager.git

cd task-manager-api

# Start the Spring Boot server
./mvnw spring-boot:run
App runs on: http://localhost:8080

🛠 Configuration
Sample application.properties

properties

spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
🔧 Want to use MySQL instead? Swap out the datasource config above.

✨ Author
Daniel Kwabi
🔗 Portfolio
📫 Email
🌐 LinkedIn

📄 License
MIT License — free to use, fork, and improve.
