package pl.projects.first;

import java.util.Random;

public class SquareFactory extends ShapeFactory {

    @Override
    public IShape Create() {
        Random random = new Random();
        return new Square(random.nextDouble(11)+1);
    }
}
