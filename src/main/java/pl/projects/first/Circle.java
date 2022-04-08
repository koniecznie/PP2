package pl.projects.first;

public class Circle extends Shape implements IShape{

    private static final double PI = 3.14159265;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {

    }

    @Override
    public double calculateArea() {
        return PI*(r*r);
    }

    @Override
    public double calculateCircuit() {
        return PI*r*2;
    }

    @Override
    public double biggerArea() {
        area = PI*(r*r)*2;
        return area;
    }

    @Override
    public double smallerArea() {
        area = (PI*(r*r))/2;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
