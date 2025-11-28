class Transport {
    void deliver() {
        System.out.println("Generic delivery");
    }
}

class Truck extends Transport {
    void deliver() {
        System.out.println("Delivered by Truck");
    }
}

class Ship extends Transport {
    void deliver() {
        System.out.println("Delivered by Ship");
    }
}

class Airplane extends Transport {
    void deliver() {
        System.out.println("Delivered by Airplane");
    }
}

public class LogisticsDemo {
    public static void main(String[] args) {
        Transport t;

        t = new Truck();
        t.deliver();  // Truck version executes

        t = new Ship();
        t.deliver();

        t = new Airplane();
        t.deliver();
    }
}
