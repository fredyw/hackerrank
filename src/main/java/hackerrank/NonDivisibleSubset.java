package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/non-divisible-subset
 */
public class NonDivisibleSubset {
    private static int nonDivisibleSubset(int[] array, int k) {
        int[] mods = new int[k];
        for (int i = 0; i < array.length; i++) {
            mods[array[i] % k]++;
        }
        System.out.println(Arrays.toString(mods));
        int max = mods[0];
        for (int i = 1, j = mods.length - 1; i < j; i++, j--) {
            max += Math.max(mods[i], mods[j]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(nonDivisibleSubset(array, k));
    }
}
