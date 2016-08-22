package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams
 */
public class SherlockAndAnagrams {
    private static int sherlockAndAnagrams(String str) {
        int count = 0;
        int n = str.length();
        for (int step = 1; step < n; step++) {
            for (int i = 0; i < n; i++) {
                if (i + step > n) {
                    break;
                }
                char[] sub1 = str.substring(i, i + step).toCharArray();
                Arrays.sort(sub1);
                for (int j = i + 1; j < n; j++) {
                    if (j + step > n) {
                        break;
                    }
                    char[] sub2 = str.substring(j, j + step).toCharArray();
                    Arrays.sort(sub2);
                    if (Arrays.equals(sub1, sub2)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            String str = in.next();
            System.out.println(sherlockAndAnagrams(str));
        }
    }
}
