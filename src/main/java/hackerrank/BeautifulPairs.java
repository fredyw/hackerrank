package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/beautiful-pairs
 */
public class BeautifulPairs {
    private static int beautifulPairs(int[] a, int[] b) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!countMap.containsKey(a[i])) {
                countMap.put(a[i], 1);
            } else {
                countMap.put(a[i], countMap.get(a[i]) + 1);
            }
        }
        int result = 0;
        for (int i = 0; i < b.length; i++) {
            if (countMap.containsKey(b[i])) {
                int count = countMap.get(b[i]);
                int newCount = count - 1;
                if (newCount == 0) {
                    countMap.remove(b[i]);
                } else {
                    countMap.put(b[i], newCount);
                }
                result++;
            }
        }
        if (countMap.size() == 0) {
            result--;
        } else {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        System.out.println(beautifulPairs(a, b));
    }
}
