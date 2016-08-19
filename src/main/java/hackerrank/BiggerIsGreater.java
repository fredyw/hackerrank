package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bigger-is-greater
 */
public class BiggerIsGreater {
    private static String nextPermutation(String str) {
        char[] chars = str.toCharArray();
        int i = chars.length - 1;
        for (; i >= 1; i--) {
            if (chars[i - 1] < chars[i]) {
                for (int j = chars.length - 1; j > i - 1; j--) {
                    if (chars[i - 1] < chars[j]) {
                        swap(chars, i - 1, j);
                        break;
                    }
                }
                for (int x = i, y = chars.length - 1; x < y; x++, y--) {
                    swap(chars, x, y);
                }
                break;
            }
        }
        String newString = new String(chars);
        if (newString.equals(str)) {
            return "no answer";
        }
        return newString;
    }

    private static void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            String str = in.next();
            System.out.println(nextPermutation(str));
        }
    }
}
