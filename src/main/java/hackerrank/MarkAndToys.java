package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys
 */
public class MarkAndToys {
    private static int maxToys(int[] prices, int money) {
        Arrays.sort(prices);
        int numToys = 0;
        for (int i = 0; i < prices.length; i++) {
            if (money - prices[i] < 0) {
                break;
            }
            money -= prices[i];
            numToys++;
        }
        return numToys;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        System.out.println(maxToys(prices, k));
    }
}
