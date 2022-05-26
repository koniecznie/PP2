package pl.projects.second;

import java.util.Random;

public class Main04 {
    public static void main(String[] args) {
        pl.projects.second.BinaryTree drzewo = new BinaryTree();
        Random los = new Random();
        for (int i = 0; i < los.nextInt(1, 20); i++) {
            drzewo.addNode(los.nextInt(-20, 20));
        }
        System.out.println("Wartości węzłów drzewa:" + drzewo.valOfNods(drzewo.getKorzeń()));
        System.out.println("Drzewo posiada " + drzewo.numberOfNods(drzewo.getKorzeń()) + " węzłów");
        System.out.println("Drzewo posiada " + drzewo.levelsOfTree(drzewo.getKorzeń()) + " poziomów");
        System.out.println("Całkowita wartość drzewa: " + drzewo.amountValOfNods());
        System.out.println("Najmniejsza wartość węzła w drzewie: " + drzewo.minValOfNode());
        System.out.println("Największa wartość węzła w drzewie: " + drzewo.maxValOfNode());
    }
}
