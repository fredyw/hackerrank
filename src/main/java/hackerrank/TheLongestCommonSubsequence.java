package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/dynamic-programming-classics-the-longest-common-subsequence
 */
public class TheLongestCommonSubsequence {
    private static void longestCommonSubsequence(int[] array1, int[] array2) {
        LCS lcs = longestCommonSubsequence(array1, array2, 0, 0, new HashMap<>());
        List<Integer> list = lcs.list;
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private static class LCS {
        private int max;
        private List<Integer> list = new ArrayList<>();

        private LCS(int max) {
            this.max = max;
        }
    }

    private static LCS longestCommonSubsequence(int[] array1, int[] array2, int i, int j,
                                                Map<String, LCS> memo) {
        if (i == array1.length || j == array2.length) {
            return new LCS(0);
        }
        String key = i + "|" + j;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (array1[i] == array2[j]) {
            LCS lcs = longestCommonSubsequence(array1, array2, i + 1, j + 1, memo);
            lcs.list.add(array1[i]);
            lcs.max++;
            memo.put(key, lcs);
            return lcs;
        }
        LCS a = longestCommonSubsequence(array1, array2, i, j + 1, memo);
        LCS b = longestCommonSubsequence(array1, array2, i + 1, j, memo);
        if (a.max < b.max) {
            LCS lcs = new LCS(b.max);
            lcs.list.addAll(b.list);
            memo.put(key, lcs);
            return lcs;
        }
        LCS lcs = new LCS(a.max);
        lcs.list.addAll(a.list);
        memo.put(key, lcs);
        return lcs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = in.nextInt();
        }
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = in.nextInt();
        }
        longestCommonSubsequence(array1, array2);
    }
}
