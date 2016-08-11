package hackerrank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://www.hackerrank.com/challenges/manasa-and-stones
 */
public class ManasaAndStones {
    private static void manasaAndStones(int n, int a, int b) {
        Set<Integer> set = new TreeSet<>();
        manasaAndStones(n, a, b, 0, set);
        set.forEach(val -> {
            System.out.print(val + " ");
        });
        System.out.println();
    }

    private static void manasaAndStones(int n, int a, int b, int accu, Set<Integer> set) {
        if (n == 1) {
            set.add(accu);
            return;
        }
        manasaAndStones(n - 1, a, b, accu + a, set);
        manasaAndStones(n - 1, a, b, accu + b, set);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            manasaAndStones(n, a, b);
        }
    }
}
