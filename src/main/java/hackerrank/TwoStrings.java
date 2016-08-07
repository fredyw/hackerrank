package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/two-strings
 */
public class TwoStrings {
    private static String twoStrings(String a, String b) {
        char[] chars = new char[26];
        for (int i = 0; i < a.length(); i++) {
            chars[a.charAt(i) - 'a'] = 1;
        }
        for (int i = 0; i < b.length(); i++) {
            if (chars[b.charAt(i) - 'a'] == 1) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            String a = in.next();
            String b = in.next();
            System.out.println(twoStrings(a, b));
        }
    }
}
