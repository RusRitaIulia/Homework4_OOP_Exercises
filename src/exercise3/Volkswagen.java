package exercise3;

public class Volkswagen extends Car {
    public Volkswagen(String carName, int cylinders) {
        super(carName, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Volkswagen T-Cross started!");
    }

    @Override
    public void accelerate() {
        System.out.println("Volkswagen T-Cross  Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Volkswagen T-Cross stopped, Brakes applied");
    }
}
