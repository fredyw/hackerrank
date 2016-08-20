package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams
 */
public class SherlockAndAnagrams {
    private static int sherlockAndAnagrams(String str) {
        // TODO
        return 0;
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
