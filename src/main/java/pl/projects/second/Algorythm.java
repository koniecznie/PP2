package pl.projects.second;

import java.util.Scanner;

public class Algorythm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = "";
        String pattern = "";
        char[] t;
        char[] w;
        boolean ok = false;
        int textLength = 0;
        int patternLength = 0;
        int pom = 0;
        System.out.println("wpisz coś mordeczko ");
        text = scan.nextLine();
        System.out.println("wpisz pojedynczy znak jaki chcesz znalezc");
        pattern = scan.nextLine();
        textLength = text.length();
        patternLength = pattern.length();
        t = text.toCharArray();
        w = pattern.toCharArray();
        for (int i = 0; i < textLength - patternLength; i++) {
            ok = true;
            for (int j = 0; j < patternLength; j++) {
                if (t[j + i] != w[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("Znaleziono szukany znak na " + (i + 1) + " pozycji");
                pom++;
            }
        }
        if (pom == 0) {
            System.out.println("Nie znaleziono wzorca");
        }
    }
}
