package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/stockmax
 */
public class StockMaximize {
    private static int maxProfit(int[] array) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            System.out.println(maxProfit(array));
        }
    }
}
