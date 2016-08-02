package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/priyanka-and-toys
 */
public class PriyankaAndToys {
    private static int priyankAndToys(int[] weights) {
        Arrays.sort(weights);
        int result = 1;
        int to = weights[0] + 4;
        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > to) {
                to = weights[i] + 4;
                result++;
            }
        }
        return result;
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
