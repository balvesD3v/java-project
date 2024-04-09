package vehicle;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Accelerating car...");
    }

    @Override
    public void brake() {
        System.out.println("breaking car...");
    }
}
