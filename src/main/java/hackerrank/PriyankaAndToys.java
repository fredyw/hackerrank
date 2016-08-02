package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/priyanka-and-toys
 */
public class PriyankaAndToys {
    private static int priyankAndToys(int[] weights) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = in.nextInt();
        }
        System.out.println(priyankAndToys(weights));
    }
}
