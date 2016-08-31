package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/absolute-permutation
 */
public class AbsolutePermutation {
    private static void absolutePermutation(int n, int k) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int a = i - k;
            if (a >= 1) {
                if (set.add(a)) {
                    result.add(a);
                    continue;
                }
            }
            int b = i + k;
            if (b <= n) {
                if (set.add(b)) {
                    result.add(b);
                } else {
                    break;
                }
            }
        }
        if (result.size() != n) {
            System.out.println("-1");
        } else {
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = in.nextInt();
            int k = in.nextInt();
            absolutePermutation(n, k);
        }
    }
}
