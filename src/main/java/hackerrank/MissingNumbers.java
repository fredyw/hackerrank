package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * https://www.hackerrank.com/challenges/missing-numbers
 */
public class MissingNumbers {
    private static void missingNumbers(Map<Integer, Integer> mapA, Map<Integer, Integer> mapB) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entryB : mapB.entrySet()) {
            if (!mapA.containsKey(entryB.getKey())) {
                set.add(entryB.getKey());
            } else {
                int countA = mapA.get(entryB.getKey());
                if (countA != entryB.getValue()) {
                    set.add(entryB.getKey());
                }
            }
        }
        set.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> mapA = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if (!mapA.containsKey(val)) {
                mapA.put(val, 1);
            } else {
                mapA.put(val, mapA.get(val) + 1);
            }
        }
        int m = in.nextInt();
        Map<Integer, Integer> mapB = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int val = in.nextInt();
            if (!mapB.containsKey(val)) {
                mapB.put(val, 1);
            } else {
                mapB.put(val, mapB.get(val) + 1);
            }
        }
        missingNumbers(mapA, mapB);
    }
}
