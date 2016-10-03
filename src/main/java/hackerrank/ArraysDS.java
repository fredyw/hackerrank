package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/arrays-ds
 */
public class ArraysDS {
    private static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        reverse(array);
    }
}
