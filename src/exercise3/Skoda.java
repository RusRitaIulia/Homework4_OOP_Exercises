package exercise3;

public class Skoda extends Car {
    public Skoda(String carName, int cylinders) {
        super(carName, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("SKODA KODIAQ started!");
    }

    @Override
    public void accelerate() {
        System.out.println("ŠKODA KODIAQ  Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("ŠKODA KODIAQ stopped, Brakes applied");
    }
}
