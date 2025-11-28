// Demonstrates creation of multiple independent objects

class Employee {
    String name;
    double salary;

    void setData(String n, double s) {
        name = n;
        salary = s;
    }

    void show() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class ClassObject_MultipleObjects {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setData("John", 45000);
        e2.setData("Sara", 52000);

        e1.show();
        e2.show();
    }
}
