package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/camelcase
 */
public class CamelCase {
    private static int camelCase(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                result++;
            }
        }
        return result + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(camelCase(s));
    }
}
