import java.text.DecimalFormat;

public class OutputController {

public static void printDetails(Triangle triangle){
    System.out.println("The perimeter of the triangle is:");
    System.out.println(triangle.getPerimeter());
    System.out.println("The area of the triangle is:");
    DecimalFormat ar = new DecimalFormat("0.##");
    System.out.println(ar.format(triangle.getArea()));

}

    public static void printDetails(Square square){
        System.out.println("The perimeter of the square is:");
        System.out.println(square.getPerimeter());
        System.out.println("The area of the square is:");
        System.out.println(square.getArea());;

    }

    public static void printDetails(Circle circle){
        System.out.println("The length of the circle is:");
        System.out.println(circle.getPerimeter());
        System.out.println("The area of the circle is:");
        DecimalFormat ar = new DecimalFormat("0.##");
        System.out.println(ar.format(circle.getArea()));

    }

}
