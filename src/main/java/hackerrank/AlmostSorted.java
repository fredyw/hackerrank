package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/almost-sorted
 */
public class AlmostSorted {
    private static void almostSorted(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        List<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != sorted[i]) {
                diffs.add(i);
            }
        }
        if (diffs.size() == 0) {
            System.out.println("yes");
        } else if (diffs.size() == 2) {
            System.out.println("yes");
            System.out.println("swap " + (diffs.get(0) + 1) + " " + (diffs.get(diffs.size() - 1) + 1));
        } else {
            for (int i = 0, j = diffs.size() - 1; i < diffs.size(); i++, j--) {
                if (sorted[diffs.get(i)] != array[diffs.get(j)]) {
                    System.out.println("no");
                    return;
                }
            }
            System.out.println("yes");
            System.out.println("reverse " + (diffs.get(0) + 1) + " " + (diffs.get(diffs.size() - 1) + 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        almostSorted(array);
    }
}
