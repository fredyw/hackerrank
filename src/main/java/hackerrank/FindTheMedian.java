package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/find-the-median
 */
public class FindTheMedian {
    private static int median(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(median(array));
    }
}
