package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/pangrams
 */
public class Pangrams {
    private static boolean isPangram(String str) {
        String newString = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char c : newString.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                set.add(c);
            }
        }
        // there are 26 characters in an alphabet
        return set.size() == 26;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isPangram(str) ? "pangram" : "not pangram");
    }
}
