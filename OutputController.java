public class OutputController {

public static void printTriangleAreaAndPerimeter(Triangle triangle){
    System.out.println("The perimeter of the triangle is:");
    Triangle.getPerimeter(triangle);
    System.out.println("The area of the triangle is:");
    Triangle.getArea(triangle);
}

}
