package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kaprekar-numbers
 */
public class ModifiedKaprekarNumbers {
    private static void kaprekarNumbers(int p, int q) {
        List<Long> numbers = new ArrayList<>();
        for (long i = p; i <= q; i++) {
            int digit = Long.toString(i).length();
            long square = i * i;
            String squareStr = Long.toString(square);
            String leftStr = squareStr.substring(0, squareStr.length() - digit);
            int left = (leftStr.isEmpty()) ? 0 : Integer.parseInt(leftStr);
            String rightStr = squareStr.substring(squareStr.length() - digit);
            int right = (rightStr.isEmpty()) ? 0 : Integer.parseInt(rightStr);
            if (left + right == i) {
                numbers.add(i);
            }
        }
        if (numbers.size() == 0) {
            System.out.println("INVALID RANGE");
        } else {
            for (long n : numbers) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        kaprekarNumbers(p, q);
    }
}
