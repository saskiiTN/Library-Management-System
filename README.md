
# 📚 Library Management System

A simple and intuitive web application for managing books, authors, and their relationships. Built with **Spring Boot**, **Thymeleaf**, and **H2 Database** — perfect for small libraries or as a learning project.

![Java](https://img.shields.io/badge/Java-17-blue?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green?logo=springboot)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.x-yellowgreen?logo=thymeleaf)
![H2](https://img.shields.io/badge/H2-Database-orange?logo=h2)

---

## ✨ Features

- ➕ **Add Books** — Register new books with title, ISBN, and publication year.
- 👤 **Add Authors** — Register authors with name and biography.
- 🔗 **Relate Books & Authors** — Assign one or more authors to a book (Many-to-Many relationship).
- 📋 **View All Books** — See a list of all books with their associated authors.
- 📋 **View All Authors** — See a list of all authors with the books they've written.
- 🖥️ **User-Friendly UI** — Clean interface powered by Thymeleaf and Bootstrap.
- 🗄️ **In-Memory Database** — H2 database for quick setup and testing (with console access).

---

## 🛠️ Tech Stack

| Layer        | Technology                         |
|--------------|------------------------------------|
| Backend      | Java 17+, Spring Boot 4.x          |
| Database     | H2 (in-memory), Spring Data JPA    |
| Frontend     | Thymeleaf, HTML5                   |
| Build Tool   | Maven                              |
| ORM          | Hibernate (via Spring Data JPA)    |

---

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

- **Java 17** or higher → [Download](https://adoptium.net/)
- **Maven** → [Download](https://maven.apache.org/download.cgi)
- **Git** (optional, for cloning)

---

## 🚀 Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/library-management-system.git
   cd library-management-system
   ```

2. **Build the project** (downloads dependencies)
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   Or run the `main` method in `LibraryManagementApplication.java` from your IDE.

4. **Access the app**
   - Open your browser and go to: [http://localhost:8080](http://localhost:8080)

---

## 🗄️ H2 Database Console

You can view and manage the database directly via the H2 console:

- **URL**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL**: `jdbc:h2:mem:librarydb`
- **Username**: `sa`
- **Password**: *(leave empty)*

> ⚠️ Make sure your `application.properties` has H2 console enabled (it's enabled by default in this project).

---

## 📖 Usage Guide

### ➕ Add an Author
1. Click **"Add Author"** on the homepage.
2. Fill in the author's name and bio.
3. Click **Save** — the author appears in the author list.

### ➕ Add a Book
1. Click **"Add Book"** on the homepage.
2. Fill in the book title, ISBN, and publication year.
3. Select one or more authors from the multi-select dropdown.
4. Click **Save** — the book is saved and linked to the selected authors.

### 🔍 View Relationships
- The **Books** page displays each book with its associated authors.
- The **Authors** page displays each author with the books they've written.

---




## 📬 Contact

Have questions or suggestions?  
Open an [issue](https://github.com/saskiiTN/Library-Management-System/issues) or reach out!

---
