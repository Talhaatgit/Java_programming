class Person {
    String name;
    Person(String name) { this.name = name; }
    void show() { System.out.println("Person: " + name); }
}

class Student extends Person {
    int roll;
    Student(String name, int roll) {
        super(name); // call parent constructor
        this.roll = roll;
    }
    @Override
    void show() {
        super.show(); // call parent method
        System.out.println("Student roll: " + roll);
    }
}

public class Inheritance_OverrideSuper {
    public static void main(String[] args) {
        Student s = new Student("Maya", 12);
        s.show();
    }
}
