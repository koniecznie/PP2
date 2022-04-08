package pl.projects.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main00 {
    public static void main(String[] args) {

        IShape square01 = Figure.createFigure(Shapes.Square);
        IShape rectangle01 = Figure.createFigure(Shapes.Rectangle);
        IShape circle01 = Figure.createFigure(Shapes.Circle);

        System.out.println("*".repeat(30));

        System.out.println(square01);
        System.out.println(rectangle01);
        System.out.println(circle01);

        System.out.println("*".repeat(30));



        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        String command = "";
        int chosen;

        List<Figure> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Figure.createFigure(random.nextDouble(3)));
        }


        System.out.println("""
                List - type this to see a list of figures
                Show - type this to see chosen figure
                Add - type this add chosen figure
                Remove -  type this to remove chosen figure
                Decrease - type this to decrease chosen figure
                Increase - type this to increase chosen figure
                Quit - type this to exit 
                """);

        while (true) {
            command = scanner.next();


            if (command.equalsIgnoreCase("list")) {
                System.out.println(list);

            } else {
                if (command.equalsIgnoreCase("show")) {


                }
            }
        }
    }
}