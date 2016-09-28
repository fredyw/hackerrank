package hackerrank.ctci;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets
 */
public class BalancedBrackets {
    private static String isBalanced(String expression) {
        // TODO
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println(isBalanced(expression));
        }
    }
}
