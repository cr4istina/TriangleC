public class Main {
    public static void main(String[] args) {

        Triangle triangle =  InputController.createTriangle();
        OutputController.printDetails(triangle);

        System.out.println(" ");
        Square square = InputController.createSquare();
        OutputController.printDetails(square);

        System.out.println(" ");
        Circle circle = InputController.createCircle();
        OutputController.printDetails(circle);
    }
}
