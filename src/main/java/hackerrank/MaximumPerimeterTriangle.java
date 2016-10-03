package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maximum-perimeter-triangle
 */
public class MaximumPerimeterTriangle {
    private static void maxPerimeterTriangle(int[] array) {
        Arrays.sort(array);
        int a = array[0];
        int b = array[1];
        int c = array[array.length - 1];
        // TODO
        if (a + b > c) {
            System.out.println(a + " " + b + " " + c);
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
