package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/palindrome-index
 */
public class PalindromeIndex {
    private static int palindromeIndex(String str) {
        int idx = -1;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                boolean found = true;
                // remove left
                for (int left = i + 1, right = j; left < right; left++, right--) {
                    if (str.charAt(left) != str.charAt(right)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
                found = true;
                // remove right
                for (int left = i, right = j - 1; left < right; left++, right--) {
                    if (str.charAt(left) != str.charAt(right)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return j;
                }
            }
        }
        return idx;
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            String str = in.next();
            System.out.println(palindromeIndex(str));
        }
    }
}
