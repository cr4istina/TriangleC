import java.text.DecimalFormat;

public class Triangle {
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println(side1 + " " + side2 + " " + side3);
    }

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

}
