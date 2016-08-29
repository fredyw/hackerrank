package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sansa-and-xor
 */
public class SansaAndXOR {
    private static int sansaAndXOR(int[] array) {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int[] array = new int[n];
            System.out.println(sansaAndXOR(array));
        }
    }
}
