package exercise3;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Car car;
        System.out.println("Functions of a Car: ");
        (new Car()).startEngine();
        (new Car()).accelerate();
        (new Car()).brake();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1:BMW X5");
        System.out.println("2:Volkswagen T-Cross");
        System.out.println("3:Skoda Kodiaq");
        System.out.println("Enter your option: ");
        int ch = scanner.nextInt();

        switch (ch) {

            case 1:
                car = new BMW("X5", 6);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            case 2:
                car = new Volkswagen("T-Cross", 1);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            case 3:
                car = new Skoda("Kodiaq", 4);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            default:
                System.out.println("Enter Valid Choice.");

        }
    }
}
