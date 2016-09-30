package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-find-the-running-median
 */
public class FindTheRunningMedian {
    private static int median(int[] array) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(median(a));
    }
}
