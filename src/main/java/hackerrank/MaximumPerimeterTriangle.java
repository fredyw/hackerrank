package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maximum-perimeter-triangle
 */
public class MaximumPerimeterTriangle {
    private static void maxPerimeterTriangle(int[] array) {
        Arrays.sort(array);
        int i = array.length;
        while (i - 3 >= 0 && array[i - 3] + array[i - 2] <= array[i - 1]) {
            i--;
        }
        if (i - 3 >= 0) {
            System.out.println(array[i - 3] + " " + array[i - 2] + " " + array[i - 1]);
        } else {
            System.out.println("-1");
        }
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
