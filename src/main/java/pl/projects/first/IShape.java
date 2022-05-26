package pl.projects.first;

public interface IShape {

    double calculateArea();

    double calculateCircuit();

    default double biggerArea() {
        return 2 * calculateArea();
    }

    default double smallerArea() {
        return calculateArea() / 2;
    }
}