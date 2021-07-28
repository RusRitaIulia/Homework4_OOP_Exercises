package exercise1;

public class TestShape {
    public static void main(String[] args) {
        // Rectangle: Area + Perimeter
        double width = 10, length = 20;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width and length: " + width + " and " + length);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter() + "\n");
        //Circle: Area + Perimeter
        double radius = 9;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter() + "\n");
        //Triangle: Area + Perimeter
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a, b, c);
        System.out.println("Triangle: " + " a= " + a + " b= " + b + " c= " + c);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter() + "\n");
        //Hexagon: Area + Perimeter
        double side = 4;
        Shape hexagon = new Hexagon(side);
        System.out.println("Hexagon: " + " side = " + side);
        System.out.println("Hexagon Area: " + hexagon.area());
        System.out.println("Hexagon Perimeter: " + hexagon.perimeter() + "\n");
        //Hexagon: Area + Perimeter
        double diagonal1 = 4, diagonal2 = 8;
        Shape diamond = new Diamond(diagonal1, diagonal2);
        System.out.println("Diamond: " + " diagonal1 = " + diagonal1 + " diagonal2= " + diagonal2);
        System.out.println("Diamond Area: " + diamond.area());
        System.out.println("Diamond Perimeter: " + diamond.perimeter() + "\n");
    }
}


