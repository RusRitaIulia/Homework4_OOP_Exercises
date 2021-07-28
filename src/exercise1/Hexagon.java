package exercise1;

public class Hexagon extends Shape {
    private final double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double hexagonArea = (3 * 1.73) / 2 * side * side;
        return hexagonArea;
    }

    @Override
    public double perimeter() {
        double rectanglePerimeter = 6 * side;
        return rectanglePerimeter;
    }
}
