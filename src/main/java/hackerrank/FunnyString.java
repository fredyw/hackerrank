package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/funny-string
 */
public class FunnyString {
    private static String funnyString(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() - 1; i++, j--) {
            int a = Math.abs(str.charAt(i) - str.charAt(i + 1));
            int b = Math.abs(str.charAt(j) - str.charAt(j - 1));
            if (a != b) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int t = 0; t < testCases; t++) {
            String str = in.next();
            System.out.println(funnyString(str));
        }
    }
}
