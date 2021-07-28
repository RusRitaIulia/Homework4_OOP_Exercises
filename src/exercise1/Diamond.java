package exercise1;

public class Diamond extends Shape {
    private final double diagonal1, diagonal2;

    public Diamond(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double area() {
        double diamondArea = (diagonal1 * diagonal2) / 2;
        return diamondArea;
    }

    @Override
    public double perimeter() {
        double x = Math.sqrt((diagonal1 * diagonal1) + (diagonal2 * diagonal2));
        double diamondPerimeter = 2 * x;
        return diamondPerimeter;
    }
}
