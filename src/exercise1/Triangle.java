package exercise1;

public class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return triangleArea;
    }

    @Override
    public double perimeter() {
        double trianglePerimeter = a + b + c;
        return trianglePerimeter;
    }
}
