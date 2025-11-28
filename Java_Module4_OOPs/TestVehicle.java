import vehicles.*;

public class TestVehicle {
    public static void main(String[] args) {

        System.out.println(new Car().getClass().getName());

        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();

        v1.speed();
        v2.speed();
    }
}

