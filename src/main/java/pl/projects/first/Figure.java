package pl.projects.first;

import java.util.HashMap;

public class Figure {
    private static HashMap<Shapes, ShapeFactory> dictionary = new HashMap<>();
    static {
        dictionary.put(Shapes.Square, new SquareFactory());
        dictionary.put(Shapes.Rectangle, new RectangleFactory());
        dictionary.put(Shapes.Circle, new CircleFactory());
    }
    public static IShape createFigure(Shapes factories)
    {
        return dictionary.get(factories).Create();
    }
}