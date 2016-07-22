package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/insertionsort1
 */
public class InsertionSortPart1 {
    public static void insertIntoSorted(int[] ar) {
        int tmp = ar[ar.length - 1];
        int i;
        for (i = ar.length - 2; i >= 0; i--) {
            if (ar[i] > tmp) {
                ar[i + 1] = ar[i];
                printArray(ar);
            } else {
                ar[i + 1] = tmp;
                printArray(ar);
                break;
            }
        }
        if (i == -1) {
            ar[i + 1] = tmp;
            printArray(ar);
        }
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
