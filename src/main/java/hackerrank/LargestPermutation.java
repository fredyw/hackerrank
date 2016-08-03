package hackerrank;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * https://www.hackerrank.com/challenges/largest-permutation
 */
public class LargestPermutation {
    private static void largestPermutation(int[] a, int k, TreeMap<Integer, Integer> map) {
        int i = 0;
        Iterator<Entry<Integer, Integer>> iter = map.entrySet().iterator();
        while (i < k && i < a.length) {
            Entry<Integer, Integer> entry = iter.next();
            int num = entry.getKey();
            int idx = entry.getValue();
            if (a[i] < num) {
                swap(a, i, idx);
                map.put(a[i], idx);
            }
            i++;
        }
        for (int x = 0; x < a.length; x++) {
            if (x == a.length - 1) {
                System.out.print(a[x]);
            } else {
                System.out.print(a[x] + " ");
            }
        }
        System.out.println();
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>((x, y) -> Integer.compare(y, x));
        for (int i = 0; i < a.length; i++) {
            int num = in.nextInt();
            a[i] = num;
            map.put(num, i);
        }
        largestPermutation(a, k, map);
    }
}
