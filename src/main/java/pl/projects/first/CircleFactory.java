package pl.projects.first;

import java.util.Random;

public  class CircleFactory extends ShapeFactory{
    @Override
    public IShape Create() {
        Random random = new Random();
        return new Circle(random.nextDouble(11)+1);
    }
}
