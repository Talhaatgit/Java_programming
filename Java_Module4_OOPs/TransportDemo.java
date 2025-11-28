import java.util.Scanner;

class Transport {
    void move() {
        System.out.println("Transport is moving.");
    }
}

class Bus extends Transport {
    void carryPassengers(int count) {
        System.out.println("Bus carrying " + count + " passengers.");
    }
}

class Truck extends Transport {
    void carryGoods(double tons) {
        System.out.println("Truck carrying " + tons + " tons of goods.");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bus bus = new Bus();
        Truck truck = new Truck();

        // Demonstrate Bus
        System.out.print("Enter number of passengers for bus: ");
        int passengers = sc.nextInt();
        bus.move();
        bus.carryPassengers(passengers);

        // Demonstrate Truck
        System.out.print("Enter goods weight in tons for truck: ");
        double tons = sc.nextDouble();
        truck.move();
        truck.carryGoods(tons);

        sc.close();
    }
}

