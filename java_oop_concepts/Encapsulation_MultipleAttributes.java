// Demonstrates encapsulation of multiple private variables in a class

class Employee {
    private String name;
    private int id;
    private double salary;

    // Setter method for all attributes
    public void setEmployee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display data
    public void showEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Encapsulation_MultipleAttributes {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployee("Aisha", 101, 55000);
        e.showEmployee();
    }
}

