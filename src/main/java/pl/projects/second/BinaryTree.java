package pl.projects.second;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinaryTree {
    private BinaryNode korzeń = null;

    public void addNode(int a) {
        BinaryNode węzeł = new BinaryNode(a);
        ArrayDeque<BinaryNode> kolejkaSprawdznia = new ArrayDeque<>();
        if (korzeń == null) {
            korzeń = węzeł;
            return;
        } else {
            kolejkaSprawdznia.add(korzeń);
        }
        while (true) {
            BinaryNode zdjęty = kolejkaSprawdznia.poll();
            if ((zdjęty.getLewy() != null) && (zdjęty.getPrawy() != null)) {
                kolejkaSprawdznia.add(zdjęty.getLewy());
                kolejkaSprawdznia.add(zdjęty.getPrawy());
            } else if ((zdjęty.getLewy() == null) || (zdjęty.getPrawy() == null)) {
                if (zdjęty.getLewy() == null) {
                    zdjęty.setLewy(węzeł);
                    return;
                } else {
                    zdjęty.setPrawy(węzeł);
                    return;
                }
            }
        }
    }

    public BinaryNode getKorzeń() {
        return korzeń;
    }

    ArrayList<Integer> wartości = new ArrayList<>();

    public ArrayList<Integer> valOfNods(BinaryNode węzeł) {
        wartości.add(węzeł.getWartość());
        if (węzeł.getLewy() != null) {
            valOfNods(węzeł.getLewy());
        }
        if (węzeł.getPrawy() != null) {
            valOfNods(węzeł.getPrawy());
        }
        return wartości;
    }

    int licznikWęzłów = 0;

    public int numberOfNods(BinaryNode węzeł) {
        licznikWęzłów++;
        if (węzeł.getLewy() != null) {
            numberOfNods(węzeł.getLewy());
        }
        if (węzeł.getPrawy() != null) {
            numberOfNods(węzeł.getPrawy());
        }
        return licznikWęzłów;
    }

    int licznikPoziomów = 0;

    public int levelsOfTree(BinaryNode węzeł) {
        licznikPoziomów++;
        if (węzeł.getLewy() != null) {
            levelsOfTree(węzeł.getLewy());
        }
        return licznikPoziomów;
    }

    public int amountValOfNods() {
        int suma = 0;
        for (int i = 0; i < wartości.size(); i++) {
            suma += wartości.get(i);
        }
        return suma;
    }

    public int minValOfNode() {
        Collections.sort(wartości);
        return wartości.get(0);
    }

    public int maxValOfNode() {
        Collections.sort(wartości);
        return wartości.get(wartości.size() - 1);
    }
}
