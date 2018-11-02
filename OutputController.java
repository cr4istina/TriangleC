import java.text.DecimalFormat;

public class OutputController {

public static void getPerimeter(Triangle triangle){
    double perimeter = triangle.side1 + triangle.side2 + triangle.side3;
    System.out.println(perimeter);
}

public static void getArea(Triangle triangle){
    double semiperimeter = (triangle.side1 + triangle.side2 + triangle.side3) / 2;
    double area = Math.sqrt(semiperimeter * (semiperimeter - triangle.side1) * (semiperimeter - triangle.side2) * (semiperimeter - triangle.side3));
    DecimalFormat ar = new DecimalFormat("0.##");
    System.out.println(ar.format(area));
}

public static void printTriangleAreaAndPerimeter(Triangle triangle){
    System.out.println("The perimeter of the triangle is:");
    getPerimeter(triangle);
    System.out.println("The area of the triangle is:");
    getArea(triangle);
}

}
