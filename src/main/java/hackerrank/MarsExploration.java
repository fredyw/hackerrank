package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mars-exploration
 */
public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0;
        char[] word = new char[]{'S', 'O', 'S'};
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (idx == word.length) {
                idx = 0;
            }
            if (word[idx] != s.charAt(i)) {
                count++;
            }
            idx++;
        }
        System.out.println(count);
    }
}
