package exercise1;

public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double circleArea = pi * Math.pow(radius, 2);
        return circleArea;
    }

    public double perimeter() {
        double circlePerimeter = 2 * pi * radius;
        return circlePerimeter;
    }
}
