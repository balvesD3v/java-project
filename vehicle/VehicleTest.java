package vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.accelerate();
        car.brake();

        motorcycle.accelerate();
        motorcycle.brake();

    }
}
