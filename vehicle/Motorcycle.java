package vehicle;

public class Motorcycle implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Accelerating motocycle...");
    }

    @Override
    public void brake() {
        System.out.println("breaking motocycle...");
    }

}
