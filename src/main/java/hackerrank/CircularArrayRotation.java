package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation
 */
public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int rotate = k % n;
        for (int i = 0; i < rotate; i++) {
            int last = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, last);
        }
        for (int i = 0; i < q; i++) {
            int m = in.nextInt();
            System.out.println(list.get(m));
        }
    }
}
