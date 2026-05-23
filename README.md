---# Document Editor - Java OOP Project

A simple document editor built using core Java and Object-Oriented Programming concepts.

This project demonstrates how different document elements such as text and images can be managed, rendered, and saved using clean OOP design principles.

---

## Features

- Add text elements
- Add image elements
- Render complete document
- Save document to a file
- Interface-based design
- Polymorphism and composition
- File handling using Java IO

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections
- File Handling
- Git & GitHub

---

## Project Structure
documenteditor/
│
├── Document.java
├── DocumentEditor.java
├── DocumentElement.java
├── TextElement.java
├── ImageElement.java
├── Persistence.java
├── SavetoFile.java
├── Main.java
└── .gitignore

## OOP Concepts Used

### Abstraction
Interfaces define common behavior:
- DocumentElement
- Persistence

### Polymorphism
Different implementations of the same interface:
- TextElement
- ImageElement

### Composition
Document contains multiple elements:
- List<DocumentElement>

### Dependency Injection
DocumentEditor receives dependencies via constructor:
- Persistence is injected into DocumentEditor

---

## How to Run

### Compile
```bash
javac *.java
