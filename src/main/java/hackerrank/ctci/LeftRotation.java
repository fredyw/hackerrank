package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 */
public class LeftRotation {
    private static void leftRotation(int[] array, int k) {
        int modK = k % array.length;
        int[] rotated = new int[array.length];
        for (int i = 0, j = modK; i < array.length; i++, j++) {
            if (j == array.length) {
                j = 0;
            }
            rotated[i] = array[j];
        }
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        leftRotation(a, k);
    }
}
