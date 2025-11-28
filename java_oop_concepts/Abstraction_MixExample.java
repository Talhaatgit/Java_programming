interface Movable {
    void move();
}

abstract class Vehicle {
    abstract void fuelType();
}

class Car extends Vehicle implements Movable {
    void fuelType() {
        System.out.println("Petrol");
    }

    public void move() {
        System.out.println("Car is moving");
    }
}

public class Abstraction_MixExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.fuelType();
        c.move();
    }
}
