public class Circle {
    double radius;
    public Circle(double radius){
        this.radius = radius;
        System.out.println("The radius of the circle is: " + radius + ";");
    }

    public double getPerimeter(){
        return radius * Math.PI * 2;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
