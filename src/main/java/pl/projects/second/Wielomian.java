package pl.projects.second;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Wielomian {
    private int n;
    private ArrayList<Integer> współczynniki = new ArrayList<>();

    Wielomian(int n){
        this.n = n;
    }
    public void wypełnijLos(){
        Random los = new Random();
        for (int i = 0; i < n + 1; i++) {
            współczynniki.add(los.nextInt(-101, 101));
        }
    }

    public void wypełnijRęcznie(int x, int y){
        if(współczynniki.isEmpty()){
            for (int i = 0; i < n + 1; i++) {
                współczynniki.add(0);
            }
        }else {
            współczynniki.set(x, y);
        }
    }
    public int oblicz(int x){
        int wynik = x * współczynniki.get(n) + współczynniki.get(n-1);
        for (int i = n - 2; i >= 0; i--) {
            wynik = x * wynik + współczynniki.get(i);
        }
        return wynik;
    }

    public ArrayList<Integer> getWspółczynniki() {
        return współczynniki;
    }
}
