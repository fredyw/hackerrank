package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulTriplets {
    private static int beautifulTriplets(int[] array, int d) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            boolean found = true;
            for (int j = 0; j < 2; j++) {
                a = a + d;
                if (!set.contains(a)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(beautifulTriplets(array, d));
    }
}
