// Demonstrates calling methods using an object

class Student {
    String name;

    void setName(String n) {
        name = n;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class ClassObject_MethodCall {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aisha");
        s.display();
    }
}
