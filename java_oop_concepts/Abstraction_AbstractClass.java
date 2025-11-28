abstract class Shape {
    abstract void draw(); // abstract method

    void display() { // concrete method
        System.out.println("Displaying Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstraction_AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.display();
    }
}
