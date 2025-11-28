import java.util.Scanner;

class Shape {
    void displayShape() {
        System.out.println("This is a generic shape.");
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

    @Override
    void displayShape() {
        System.out.println("This is a Circle.");
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    @Override
    void displayShape() {
        System.out.println("This is a Rectangle.");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter circle radius: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.displayShape();
        System.out.println("Circle area = " + c.area());

        // Rectangle
        System.out.print("Enter rectangle length: ");
        double L = sc.nextDouble();
        System.out.print("Enter rectangle width: ");
        double W = sc.nextDouble();
        Rectangle rect = new Rectangle(L, W);
        rect.displayShape();
        System.out.println("Rectangle area = " + rect.area());

        sc.close();
    }
}
