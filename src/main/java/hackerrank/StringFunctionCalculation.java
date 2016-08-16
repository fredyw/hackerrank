package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/string-function-calculation
 */
public class StringFunctionCalculation {
    private static int stringFunctionCalculation(String t) {
        Map<String, Integer> memo = new HashMap<>();
        return stringFunctionCalculation(t, 0, t.length() - 1, memo);
    }


    private static int stringFunctionCalculation(String t, int i, int j,
                                                 Map<String, Integer> memo) {
        if (i >= t.length() || j < 0 || i > j) {
            return 0;
        }
        String key = i + "|" + j;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        String sub = t.substring(i, j + 1);
        int count = substringCount(t, sub);
        int f = (j - i + 1) * count;
        int a = stringFunctionCalculation(t, i, j - 1, memo);
        int b = stringFunctionCalculation(t, i + 1, j, memo);
        int c = stringFunctionCalculation(t, i + 1, j - 1, memo);
        int max = Math.max(Math.max(f, a), Math.max(b, c));
        memo.put(key, max);
        return max;
    }

    private static int substringCount(String t, String sub) {
        int count = 0;
        int idx = 0;
        while (idx < t.length()) {
            int subIdx = t.indexOf(sub, idx);
            if (subIdx < 0) {
                break;
            }
            idx = subIdx + 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.next();
        // TODO
        System.out.println(stringFunctionCalculation(t));
    }
}
