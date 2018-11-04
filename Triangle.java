public class Triangle {
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("The sides of the triangle are: " + side1 + ", " + side2 + " and " + side3 + ";");
    }

    public double getPerimeter(){
        return (side1 + side2 + side3);
    }

    public double getArea(){
        double semiperimeter = getPerimeter() / 2;
        double area = Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
        return area;
    }

}
