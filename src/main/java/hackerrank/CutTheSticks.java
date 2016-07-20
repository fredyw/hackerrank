package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cut-the-sticks
 */
public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(in.nextInt());
        }
        Collections.sort(l);
        LinkedList<Integer> ll = new LinkedList<>(l);
        System.out.println(ll.size());
        while (ll.size() > 0) {
            int min = ll.getFirst();
            int size = ll.size();
            for (int i = 0; i < size; i++) {
                int e = ll.getFirst();
                int val = e - min;
                if (val == 0) {
                    ll.removeFirst();
                }
            }
            if (ll.size() > 0) {
                System.out.println(ll.size());
            }
        }
    }
}
