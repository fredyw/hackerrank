package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-merge-sort
 */
public class CountingInversions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
        }
    }
}
