package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sansa-and-xor
 */
public class SansaAndXOR {
    private static int sansaAndXOR(int[] array) {
        if (array.length % 2 == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result ^= array[i];
            }
        }
        return result;
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
            System.out.println(sansaAndXOR(array));
        }
    }
}
