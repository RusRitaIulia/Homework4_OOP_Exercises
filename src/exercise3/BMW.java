package exercise3;

public class BMW extends Car {
    public BMW(String carName, int cylinders) {
        super(carName, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW X5 started!");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW X5  Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("BMW X5 stopped, Brakes applied");
    }
}
