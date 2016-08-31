package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/candies
 */
public class Candies {
    private static int candies(int[] ratings) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = in.nextInt();
        }
        System.out.println(candies(ratings));
    }
}
