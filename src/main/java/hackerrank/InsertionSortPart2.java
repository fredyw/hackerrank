package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/insertionsort2
 */
public class InsertionSortPart2 {
    public static void insertionSortPart2(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int j = i;
            while (j >= 1 && ar[j] < ar[j - 1]) {
                swap(ar, j, j - 1);
                j--;
            }
            printArray(ar);
        }
    }

    private static void swap(int[] ar, int i, int j) {
        int tmp = ar[i];
        ar[i] = ar[j];
        ar[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);

    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
