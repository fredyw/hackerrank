package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maximum-perimeter-triangle
 */
public class MaximumPerimeterTriangle {
    private static void maxPerimeterTriangle(int[] array) {
        // TODO
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        maxPerimeterTriangle(array);
    }
}
