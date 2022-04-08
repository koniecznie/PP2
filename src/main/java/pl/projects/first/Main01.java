package pl.projects.first;


public class Main01 {
    public static void main(String[] args) {

        Square square = new Square(2);

        Rectangle rectangle = new Rectangle(4,2);

        Circle circle = new Circle(3);




        System.out.println("*".repeat(10));
        System.out.println(square);
        System.out.println(square.SquareArea());
        System.out.println(square.SquareCircuit());
        System.out.println("4 = " + square.calculateArea());
        System.out.println("8 = " + square.calculateCircuit());

        System.out.println("*".repeat(10));
        System.out.println(rectangle);
        System.out.println("8 = " + rectangle.RectangleArea());
        System.out.println("12 = "+ rectangle.RectangleCircles());
        System.out.println("8 = "+ rectangle.calculateArea());
        System.out.println("12 = "+ rectangle.calculateCircuit());

        System.out.println("*".repeat(10));
        System.out.println(circle);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircuit());
        System.out.println(circle.biggerArea());
        System.out.println(circle.smallerArea());

        System.out.println("*".repeat(10));


    }
}
