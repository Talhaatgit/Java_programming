class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    void drive() { System.out.println("Car drives"); }
}

class SportsCar extends Car {
    void turbo() { System.out.println("SportsCar turbo ON"); }
}

public class Inheritance_Multilevel {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start(); // from Vehicle
        sc.drive(); // from Car
        sc.turbo(); // from SportsCar
    }
}
