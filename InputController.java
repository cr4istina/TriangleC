import java.util.Scanner;

public class InputController {

    public static Triangle createTriangle() {
        System.out.println("Please, enter 3 numbers to be the sides of your triangle, here:");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double c = new Scanner(System.in).nextDouble();
        Triangle triangle  = new Triangle(a, b, c);

        return triangle;
    }

    public static Square createSquare() {
        System.out.println("Please, enter a number for the side of the square:");
        double d = new Scanner(System.in).nextDouble();
        System.out.println(d);
        Square square = new Square(d);
        return square;
    }

    public static Circle createCircle() {
        System.out.println("Please, enter the radius for the side of the square:");
        double r = new Scanner(System.in).nextDouble();
        System.out.println(r);
        Circle circle = new Circle(r);
        return circle;
    }

}
