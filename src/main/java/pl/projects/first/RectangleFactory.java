package pl.projects.first;

import java.util.Random;

public class RectangleFactory extends ShapeFactory {
    @Override
    public IShape Create() {
        Random random = new Random();
        return new Rectangle(random.nextDouble(11)+1,random.nextDouble(10)+1);
    }
}
