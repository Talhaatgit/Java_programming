class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Polymorphism_DynamicDispatch {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();

        s = new Square();
        s.draw();
    }
}
