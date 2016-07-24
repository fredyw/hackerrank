package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/reduced-string
 */
public class SuperReducedString {
    private static void superReducedString(String str) {
        boolean foundPairs = false;
        String newString = str;
        for (int i = 1; i < newString.length(); i++) {
            if (newString.charAt(i - 1) == newString.charAt(i)) {
                foundPairs = true;
                newString = newString.substring(0, i - 1) +
                    newString.substring(i + 1);
            }
        }
        while (foundPairs) {
            foundPairs = false;
            for (int i = 1; i < newString.length(); i++) {
                if (newString.charAt(i - 1) == newString.charAt(i)) {
                    foundPairs = true;
                    newString = newString.substring(0, i - 1) +
                        newString.substring(i + 1);
                }
            }
        }
        System.out.println(newString.isEmpty() ? "Empty String" : newString);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        superReducedString(str);
    }
}
