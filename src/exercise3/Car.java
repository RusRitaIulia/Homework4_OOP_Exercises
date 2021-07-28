package exercise3;

public class Car {
    private String carName;
    private int cylinders, wheels;
    private boolean engine;

    Car() {
    }

    public Car(String carName, int cylinders) {
        this.carName = carName;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return carName;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car engine started!");
    }

    public void accelerate() {
        System.out.println("Car accelerated!");
    }

    public void brake() {
        System.out.println("Car stopped, brakes applied!");
    }
}
