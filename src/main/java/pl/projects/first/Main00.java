package pl.projects.first;

import java.util.ArrayList;
import java.util.List;
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

        Scanner scanner = new Scanner(System.in);
        String command;

        List<IShape> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(Figure.createFigure(Shapes.Square));
        }
        for (int i = 0; i < 3; i++) {
            list.add(Figure.createFigure(Shapes.Circle));
        }
        for (int i = 0; i < 3; i++) {
            list.add(Figure.createFigure(Shapes.Rectangle));
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
            int chosen;
            chosen = scanner.nextInt();
            command = scanner.next();

            if (command.equalsIgnoreCase("list")) {
                for (IShape i : list) {
                    System.out.println(i);
                }
            }
//            nie działa xD
            if (command.equalsIgnoreCase("show" + chosen)) {
                System.out.println("Your " + (chosen + 1) + " figure is: " + list.get(chosen));
            }
        }
    }
}


