Module 5 Java OOP Programs

This markup file contains all 5 Java OOP programs from Module 5 (Employee, Cellphone, Book, Cylinder, Main), along with  output screenshot.

📌 1. Employee.java
class Employee {
    private int salary;
    private String name;

    public int getSalary() { 
        return salary; 
    }

    public void setSalary(int salary) { 
        this.salary = salary; 
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }
}



📌 2. Cellphone.java
class Cellphone {
    void ring() {
        System.out.println("Ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void callFriend() {
        System.out.println("Calling friend...");
    }
}


📌 3. Book.java
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor (title + author)
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Parameterized constructor (title + author + price)
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}



📌 4. Cylinder.java
class Cylinder {
    private double radius;
    private double height;

    // Getters
    public double getRadius() { 
        return radius; 
    }

    public double getHeight() { 
        return height; 
    }

    // Setters
    public void setRadius(double radius) { 
        this.radius = radius; 
    }

    public void setHeight(double height) { 
        this.height = height; 
    }

    // Surface area calculation
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Volume calculation
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Default constructor
    Cylinder() {
        this.radius = 1;
        this.height = 1;
    }

    // Parameterized constructor
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
}



📌 5. Main.java
public class Main {
    public static void main(String[] args) {

        // Employee class test
        Employee e = new Employee();
        e.setName("Rahul");
        e.setSalary(45000);

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());

        // Cellphone class test
        Cellphone c = new Cellphone();
        System.out.println("\nCellphone Actions:");
        c.ring();
        c.vibrate();
        c.callFriend();

        // Book class test
        System.out.println("\nBook Objects:");
        Book b1 = new Book();
        Book b2 = new Book("Think and Grow Rich", "Napoleon Hill");
        Book b3 = new Book("Java Programming", "James Gosling", 499);

        System.out.println("Book 1 → Title: " + b1.title + ", Author: " + b1.author + ", Price: " + b1.price);
        System.out.println("Book 2 → Title: " + b2.title + ", Author: " + b2.author + ", Price: " + b2.price);
        System.out.println("Book 3 → Title: " + b3.title + ", Author: " + b3.author + ", Price: " + b3.price);

        // Cylinder using setters
        Cylinder cy1 = new Cylinder();
        cy1.setRadius(5);
        cy1.setHeight(10);

        System.out.println("\nCylinder 1 (using setters):");
        System.out.println("Radius: " + cy1.getRadius());
        System.out.println("Height: " + cy1.getHeight());
        System.out.println("Surface Area: " + cy1.surfaceArea());
        System.out.println("Volume: " + cy1.volume());

        // Cylinder using constructor
        Cylinder cy2 = new Cylinder(7, 14);

        System.out.println("\nCylinder 2 (using constructor):");
        System.out.println("Radius: " + cy2.getRadius());
        System.out.println("Height: " + cy2.getHeight());
        System.out.println("Surface Area: " + cy2.surfaceArea());
        System.out.println("Volume: " + cy2.volume());
    }
}
<img width="1920" height="1080" alt="Screenshot 2025-11-28 215839" src="https://github.com/user-attachments/assets/0046829c-93ea-4029-ba4a-bf8d05aa4b76" />


📘 Concepts Used in Module 5 OOP Programs
1️⃣ Employee.java — Concepts Used

Encapsulation

Private instance variables

Getter and Setter methods

Object interaction

2️⃣ Cellphone.java — Concepts Used

Method creation

Printing object actions

Calling object methods

3️⃣ Book.java — Concepts Used

Constructor overloading

Default constructor

Parameterized constructors

Assigning values to instance variables

4️⃣ Cylinder.java — Concepts Used

Encapsulation with getters and setters

Default + parameterized constructors

Constructor overloading

Mathematical computation using Math.PI

Surface area & volume calculation methods

5️⃣ Main.java — Concepts Used

Object creation for multiple classes

Calling functions & constructors

Displaying outputs

Testing different class behaviors

