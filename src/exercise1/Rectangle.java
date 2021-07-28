package exercise1;

public class Rectangle extends Shape {
    private final double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        double rectangleArea = width * length;
        return rectangleArea;
    }

    @Override
    public double perimeter() {
        double rectanglePerimeter = 2 * (width + length);
        return rectanglePerimeter;
    }
}
