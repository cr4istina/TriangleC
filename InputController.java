import java.util.Scanner;

public class InputController {

    public static Triangle createTriangle() {
        System.out.println("Please, enter 3 numbers to be the sides of your triangle, here:");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        double c = new Scanner(System.in).nextDouble();
        System.out.println("The sides of the triangle are: ");
        Triangle triangle  = new Triangle(a, b, c);

        return triangle;
    }

}
