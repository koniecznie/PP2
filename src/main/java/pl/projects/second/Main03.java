package pl.projects.second;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  n = 0, ws = 0, wartość = 0, p = 0, wr = 0, x = 0;
        while (true) {
            System.out.println("Jakiego stopnia ma być wielomian? Wpisz liczbę naturalną");
            n = scan.nextInt();
            if(n > 0){
                break;
            }
            System.out.println("Spróbuj jescze raz!");
        }
        Wielomian w = new Wielomian(n);
        w.wypełnijLos();
        System.out.println(w.getWspółczynniki());
        System.out.print("x = ");
        x = scan.nextInt();
        wartość = w.oblicz(x);
        System.out.println("W(x) = " + wartość);
        System.out.println("Wpisz ile współczynników chcesz wpisać. Liczba musi być mniejsza lub równa " + (n + 1));
        ws = scan.nextInt();
        for (int i = 0; i < ws; ) {
            System.out.println("Podaj pozycje współczynnika który chcesz zmienić (0-" + n + ")");
            p = scan.nextInt();
            if((p < 0) || (p > n)){
                System.out.println("Wyszedłeś poza zakres! Wpisz pozycję jeszcze raz.");
                continue;
            }
            System.out.println("Podaj wartość współczynnika który chcesz zmienić (od -100 do 100)");
            wr = scan.nextInt();
            if((wr < -100) || (wr > 100)){
                System.out.println("Wyszedłeś poza zakres! Wpisz wartość jeszcze raz.");
                continue;
            }
            w.wypełnijRęcznie(p, wr);
            i++;
        }
        System.out.println(w.getWspółczynniki());
        System.out.print("x = ");
        x = scan.nextInt();
        wartość = w.oblicz(x);
        System.out.println("W(x) = " + wartość);



    }
}
