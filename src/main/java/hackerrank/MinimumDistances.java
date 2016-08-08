package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/minimum-distances
 */
public class MinimumDistances {
    private static int minimumDistances(int[] array) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                map.put(array[i], newList);
            } else {
                map.get(array[i]).add(i);
            }
        }
        if (map.size() == array.length) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, List<Integer>> e :map.entrySet()) {
            List<Integer> indices = e.getValue();
            for (int i = 0; i < indices.size() - 1; i++) {
                min = Math.min(indices.get(i + 1) - indices.get(i), min);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }
        System.out.println(minimumDistances(A));
    }
}
