// Demonstrates encapsulation using constructor (no setters)

class Car {
    private String brand;
    private int year;

    // Constructor to initialize data
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter methods only (read-only)
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

public class Encapsulation_ConstructorBased {
    public static void main(String[] args) {
        Car c = new Car("Tesla", 2023);
        System.out.println("Car Brand: " + c.getBrand());
        System.out.println("Manufacture Year: " + c.getYear());
    }
}

