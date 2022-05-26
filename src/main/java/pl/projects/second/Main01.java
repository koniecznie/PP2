package pl.projects.second;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static pl.projects.second.BubbleSort.bubbleSort;
import static pl.projects.second.QuickSort.quickSort;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę min: ");
        int min = scanner.nextInt();
        System.out.println("podaj liczbę max: ");
        int max = scanner.nextInt();

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(min, max);
        }

        System.out.println("Not Sorted Array: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Bubblesort: Sorted Array: " + Arrays.toString(arr));

        System.out.println("*".repeat(30));

        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Quicksort: Sorted array: " + Arrays.toString(arr));
    }

}


