// Demonstrates basic encapsulation using getter and setter

class Student {
    private String name; // private variable (data hiding)

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class Encapsulation_BasicExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul"); // setting data using setter
        System.out.println("Student Name: " + s.getName());
    }
}
