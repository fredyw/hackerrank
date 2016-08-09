package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/service-lane
 */
public class ServiceLane {
    private static int serviceLane(int[] widths, int i, int j) {
        int min = Integer.MAX_VALUE;
        for (int x = i; x <= j; x++) {
            min = Math.min(widths[x], min);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int testCases = in.nextInt();
        int[] widths = new int[n];
        for (int i = 0; i < n; i++) {
            widths[i] = in.nextInt();
        }
        for (int t = 0; t < testCases; t++) {
            int i = in.nextInt();
            int j = in.nextInt();
            System.out.println(serviceLane(widths, i, j));
        }
    }
}
