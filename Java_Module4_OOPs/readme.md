# 🧬 Java Module 4 – Inheritance and OOP Concepts

This repository contains **Java programs** that demonstrate the principles of **Object-Oriented Programming (OOP)** — specifically **inheritance**, **method overriding**, and **hierarchical relationships** between classes.

Each program is designed to clearly show how **classes** and **objects** interact through inheritance and polymorphism.

---

## 📘 Overview

| # | Program Title | Concept Covered |
|:-:|----------------|----------------|
| 1 | Employee → Manager | Single Inheritance |
| 2 | Shape → Circle, Rectangle | Hierarchical Inheritance & Method Overriding |
| 3 | Transport → Bus, Truck | Hierarchical Inheritance |
| 4 | Doctor → Dentist, Cardiologist, Surgeon | Method Overriding / Polymorphism |

---

## 🧩 Program Details

### 1️⃣ Employee → Manager (Single Inheritance)

**Description:**  
Demonstrates **single inheritance** — the subclass `Manager` inherits attributes and methods from the base class `Employee`.

**Output Example:**


Enter manager name: Talha
Enter salary: 65000
Enter department: Physics

--- Employee Info ---
Name: Talha
Salary: 65000.0
Department: Physics



---

### 2️⃣ Shape → Circle, Rectangle (Hierarchical Inheritance)

**Description:**  
Shows **hierarchical inheritance** where multiple subclasses (`Circle`, `Rectangle`) extend a common base class `Shape`.  
Each subclass overrides the `displayShape()` method and has its own `area()` method.

**Output Example:**


Enter circle radius: 5
This is a Circle.
Circle area = 78.53981633974483

Enter rectangle length: 6
Enter rectangle width: 4
This is a Rectangle.
Rectangle area = 24.0


---

### 3️⃣ Transport → Bus, Truck (Hierarchical Inheritance)

**Description:**  
Illustrates hierarchical inheritance again — both `Bus` and `Truck` extend `Transport`.  
Each subclass adds its own functionality, demonstrating method extension.

**Output Example:**


Enter number of passengers for bus: 45
Transport is moving.
Bus carrying 45 passengers.

Enter goods weight in tons for truck: 12
Transport is moving.
Truck carrying 12.0 tons of goods.




---

### 4️⃣ Doctor → Dentist, Cardiologist, Surgeon (Method Overriding)

**Description:**  
Demonstrates **runtime polymorphism** by overriding the `consultationFee()` method in each subclass.  
The correct method is called depending on the object type created.

**Output Example:**


Choose doctor type:

1.Dentist

2.Cardiologist

3.Surgeon
Enter choice (1-3): 2
Consultation Fee: ₹1200.0


---

## ⚙️ How to Run the Programs

1. Save each file with its respective class name (e.g., `ManagerDemo.java`, `ShapeDemo.java`, etc.)  
2. Open a terminal in the folder location.  
3. Compile the Java file:
   ```bash
   javac FileName.java
    java FileName
