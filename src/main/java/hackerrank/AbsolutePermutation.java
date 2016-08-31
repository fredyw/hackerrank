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
        List<Integer> result = absolutePermutation(n, k, 1, new ArrayList<>(), new HashSet<>());
        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // TODO
    }

    private static List<Integer> absolutePermutation(int n, int k, int i, List<Integer> accu,
                                            Set<Integer> set) {
        if (i == n + 1) {
            if (accu.size() == n) {
                return accu;
            }
            return new ArrayList<>();
        }
        if (i + k <= n) {
            List<Integer> newAccu = new ArrayList<>(accu);
            newAccu.add(i + k);
            Set<Integer> newSet = new HashSet<>(set);
            if (!newSet.add(i + k)) {
                return new ArrayList<>();
            }
            List<Integer> result = absolutePermutation(n, k, i + 1, newAccu, newSet);
            if (!result.isEmpty()) {
                return result;
            }
        }
        if (i - k >= 1) {
            List<Integer> newAccu = new ArrayList<>(accu);
            newAccu.add(i - k);
            Set<Integer> newSet = new HashSet<>(set);
            if (!newSet.add(i - k)) {
                return new ArrayList<>();
            }
            List<Integer> result = absolutePermutation(n, k, i + 1, newAccu, newSet);
            if (!result.isEmpty()) {
                return result;
            }
        }
        return new ArrayList<>();
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
