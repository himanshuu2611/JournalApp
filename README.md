# JournalApp
📔 JournalApp – Secure Journal Management System

A Spring Boot based backend application that allows users to write, manage, and secure personal journal entries. The application uses Spring Security and JWT Authentication to ensure secure access.

The system provides two roles:

User → Manage personal journal entries

Admin → View users and all journal entries

🚀 Features
👤 User Features

User Registration

Secure Login using JWT Authentication

Create Journal Entry

Update Journal Entry

Delete Journal Entry

View Personal Journal Entries

🛡️ Admin Features

View all registered users

View all journal entries

Manage user accounts

🛠️ Tech Stack
Technology	Description
Java	Programming Language
Spring Boot	Backend Framework
Spring Security	Authentication & Authorization
JWT	Secure Token Authentication
MongoDB	Database
Maven	Build Tool
Lombok	Reduce Boilerplate Code
📂 Project Structure

Based on your GitHub project:

src/main/java/net/himanshutiwari/journalApp

config
 └── SpringSecurity.java

controller
 ├── AdminController.java
 ├── JournalEntryController.java
 ├── PublicController.java
 └── UserController.java

entity
 ├── JournalEntry.java
 └── User.java

repository
 ├── JournalEntryRepository.java
 └── UserRepository.java

service
 ├── JournalEntryService.java
 ├── UserDetailsServiceImpl.java
 └── UserService.java

JournalApplication.java
🔐 Security

This project uses Spring Security + JWT Authentication.

Authentication Flow

1️⃣ User registers
2️⃣ User logs in
3️⃣ Server generates JWT Token
4️⃣ Client sends token in request header

Authorization: Bearer <JWT_TOKEN>

Spring Security verifies the token before allowing access to protected APIs.

📡 API Endpoints
Public APIs
Method	Endpoint	Description
POST	/public/signup	Register new user
POST	/public/login	User login
User APIs
Method	Endpoint	Description
GET	/journal	Get all journal entries
POST	/journal	Create journal entry
PUT	/journal/{id}	Update journal entry
DELETE	/journal/{id}	Delete journal entry
Admin APIs
Method	Endpoint	Description
GET	/admin/users	View all users
GET	/admin/journals	View all journal entries
🗄️ Database Schema
User
User
 ├── id
 ├── username
 ├── password
 ├── roles
 └── journalEntries
Journal Entry
JournalEntry
 ├── id
 ├── title
 ├── content
 ├── createdDate
 └── user
▶️ Running the Application
1️⃣ Clone Repository
git clone https://github.com/himanshu2611/JournalApp.git
2️⃣ Go to project
cd JournalApp
3️⃣ Run project
mvn spring-boot:run

Application runs on:

http://localhost:8080
🧪 API Testing

You can test APIs using:

Postman

Swagger (if added)

cURL

📌 Future Improvements

Add Swagger API documentation

Add Refresh Token Authentication

Add Pagination

Add Frontend (React / Angular)

Deploy using Docker + AWS

👨‍💻 Author

Himanshu Tiwari
BBD University, Lucknow

Java Backend Developer
Spring Boot | MongoDB | REST APIs
