package pl.projects.first;

public class Rectangle extends Shape implements IShape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Rectangle(){}

    public double RectangleArea() {
        return a*b;
    }

    public double RectangleCircles() {

        return 2*a+2*b;
    }

    //    metody nadpisane z klasy Shape
    @Override
    public double calculateArea() {
        area = a*b;
        return area;
    }

    @Override
    public double calculateCircuit() {
        circuit = 2*a+2*b;
        return circuit;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

