package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/alternating-characters
 */
public class AlternatingCharacters {
    private static int alternatingChars(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (prev == chars[i]) {
                count++;
            }
            prev = chars[i];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            System.out.println(alternatingChars(in.next()));
        }
    }
}
