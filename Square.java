
public class Square {
        double sideSquare;

        public Square(double sideSquare){
            this.sideSquare = sideSquare;
            System.out.println("The length of one side of the square is: " + sideSquare + ";");
        }

        public double getPerimeter(){
            return sideSquare * 4;
        }

        public double getArea(){
            return  Math.pow(sideSquare, 2);
        }
}
