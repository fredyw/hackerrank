package hackerrank.ctci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * https://www.hackerrank.com/challenges/ctci-ice-cream-parlor
 */
public class IceCreamParlor {
    private static void iceCream(int[] array, int money) {
        Map<Integer, TreeSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                TreeSet<Integer> set = new TreeSet<>();
                set.add(i + 1);
                map.put(array[i], set);
            } else {
                map.get(array[i]).add(i + 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int diff = money - array[i];
            if (map.containsKey(diff)) {
                TreeSet<Integer> set = map.get(diff);
                if (diff == array[i]) {
                    if (set.size() >= 2) {
                        System.out.println(set.pollFirst() + " " + set.pollFirst());
                        return;
                    }
                } else {
                    int idx = set.pollFirst();
                    System.out.println(Math.min(idx, i + 1) + " " + Math.max(idx, i + 1));
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            iceCream(a, m);
        }
    }
}
