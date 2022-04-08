package pl.projects.first;

public class Square extends Shape implements IShape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double SquareArea() {
        return a*a;
    }

    public double SquareCircuit() {
        return a*4;
    }

    public Square(){}

//    metody nadpisane z klasy Shape

    @Override
    public double calculateArea() {
        area = a*a;
        return area;
    }

    @Override
    public double calculateCircuit() {
        circuit = a*4;
        return circuit;
    }

    @Override
    public double biggerArea() {
        area = (a*a)*2;
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
