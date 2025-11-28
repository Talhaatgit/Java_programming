# Module 5 Java Programs

Author: Mohammed Talha
Course: Java OOPs Module 4

---

## 1. Employee → Manager (Single Inheritance)

### **Concept Used:** Inheritance, Method Overriding, super keyword.

### **Program: EmployeeManagerDemo.java**

```java
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", 50000, "HR");
        m.displayInfo();
    }
}
```
<img width="1920" height="1080" alt="emlyoee" src="https://github.com/user-attachments/assets/6e167566-a3f7-42dd-914c-22c7db20c1dd" />



---

## 2. Shape → Circle & Rectangle (Method Overriding)

### **Concept Used:** Polymorphism, Method Overriding.

```java
class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.displayShape();
        System.out.println("Circle Area: " + c.area());

        r.displayShape();
        System.out.println("Rectangle Area: " + r.area());
    }
}
```
<img width="1920" height="1080" alt="shape" src="https://github.com/user-attachments/assets/93bbfa81-5723-4167-99bd-94071c835c29" />



---

## 3. Transport → Bus & Truck (Hierarchical Inheritance)

### **Concept Used:** Hierarchical inheritance.

```java
class Transport {
    void move() {
        System.out.println("Transport is moving");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Bus b = new Bus();
        Truck t = new Truck();

        b.move();
        b.carryPassengers();

        t.move();
        t.carryGoods();
    }
}
````
<img width="1920" height="1080" alt="transporyt" src="https://github.com/user-attachments/assets/93dfdf5f-2b0b-4a88-aa1f-d2a703172ee0" />



---

## 4. Doctor → Dentist, Cardiologist, Surgeon (Overriding)

### **Concept Used:** Runtime Polymorphism.

```java
class Doctor {
    void consultationFee() {
        System.out.println("General consultation fee: ₹300");
    }
}

class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist fee: ₹500");
    }
}

class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist fee: ₹1000");
    }
}

class Surgeon extends Doctor {
    void consultationFee() {
        System.out.println("Surgeon fee: ₹1500");
    }
}

public class DoctorDemo {
    public static void main(String[] args) {
        Doctor d;

        d = new Dentist();
        d.consultationFee();

        d = new Cardiologist();
        d.consultationFee();

        d = new Surgeon();
        d.consultationFee();
    }
}
```
<img width="1920" height="1080" alt="doctor0" src="https://github.com/user-attachments/assets/2cea4071-9c4f-4a99-b091-7336c515281e" />


---

## 5. Payment System – Polymorphism

### **Concept Used:** Dynamic Method Dispatch.

```java
class Payment {
    void pay() {
        System.out.println("Processing generic payment");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("Paid using UPI");
    }
}

class NetBankingPayment extends Payment {
    void pay() {
        System.out.println("Paid using Net Banking");
    }
}

public class PaymentDemo {
    static void processPayment(Payment p) {
        p.pay();
    }

    public static void main(String[] args) {
        processPayment(new CreditCardPayment());
        processPayment(new UPIPayment());
        processPayment(new NetBankingPayment());
    }
}
```


<img width="1920" height="1080" alt="payment" src="https://github.com/user-attachments/assets/53a5c98e-bbd4-47e6-b873-f72e1f562545" />

---

## 6. Logistics – Runtime Polymorphism

### **Concept Used:** Dynamic binding / method dispatch.

```java
class Transport {
    void deliver() {
        System.out.println("Generic delivery");
    }
}

class Truck extends Transport {
    void deliver() {
        System.out.println("Delivered by Truck");
    }
}

class Ship extends Transport {
    void deliver() {
        System.out.println("Delivered by Ship");
    }
}

class Airplane extends Transport {
    void deliver() {
        System.out.println("Delivered by Airplane");
    }
}

public class LogisticsDemo {
    public static void main(String[] args) {
        Transport t;

        t = new Truck();
        t.deliver();

        t = new Ship();
        t.deliver();

        t = new Airplane();
        t.deliver();
    }
}
```

<img width="1920" height="1080" alt="logistic" src="https://github.com/user-attachments/assets/cd383074-8ed8-4bfa-b67e-c400b2e15473" />

---

## 7. Final variable, final method, final class

### **Concept Used:** final keyword.

```java
class Account {
    final String accountNumber = "ACC12345";

    final void bankPolicy() {
        System.out.println("Bank policy: KYC mandatory.");
    }
}

final class CentralBankRules {
    void showRules() {
        System.out.println("Central bank rules applied.");
    }
}

class SavingsAccount extends Account {
}

public class BankingRulesDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.bankPolicy();

        CentralBankRules c = new CentralBankRules();
        c.showRules();
    }
}
```
<img width="1920" height="1080" alt="bankingrules" src="https://github.com/user-attachments/assets/0ecfd6f3-1665-4c25-96ee-3c16deec762d" />


---

## 8. toString(), equals(), hashCode()

### **Concept Used:** Object class method overriding.

```java
class Book {
    String title;
    int price;

    Book(String t, int p) {
        title = t;
        price = p;
    }

    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }
}

class Student {
    int roll;

    Student(int roll) {
        this.roll = roll;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student)o;
        return this.roll == s.roll;
    }

    public int hashCode() {
        return Integer.hashCode(roll);
    }
}
```


---

## 9. Interface Bank → SBI, HDFC

### **Concept Used:** Interface implementation.

```java
interface Bank {
    double rateOfInterest();
}

class SBI implements Bank {
    public double rateOfInterest() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double rateOfInterest() {
        return 7.2;
    }
}
```
<img width="1920" height="1080" alt="bankinginterface" src="https://github.com/user-attachments/assets/c125f857-50d5-4ff1-b8bc-d1b5d535b233" />



---

## 10. vehicles Package – Bike, Car

### **Concept Used:** Packages and interfaces.

```java
package vehicles;

public interface Vehicle {
    void speed();
}
```

```java
package vehicles;

public class Bike implements Vehicle {
    public void speed() {
        System.out.println("Bike speed: 80 km/h");
    }
}
```

```java
package vehicles;

public class Car implements Vehicle {
    public void speed() {
        System.out.println("Car speed: 120 km/h");
    }
}
```


<img width="1920" height="1080" alt="vehicle" src="https://github.com/user-attachments/assets/ae5af2f9-6568-4ff5-9ae5-b75af5197e8a" />

---

## 11. ArrayList Example

### **Concept Used:** Collections Framework.

```java
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Sneha");
        names.add("Kiran");
        names.add("Riya");

        names.remove("Amit");

        System.out.println("Final List: " + names);
    }
}
```
<img width="1920" height="1080" alt="arraylistdemo" src="https://github.com/user-attachments/assets/7afb3df4-b7ae-4270-a4e0-22821b3cf527" />


---

# End of Document
