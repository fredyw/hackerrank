package hackerrank.ctci;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-find-the-running-median
 */
public class FindTheRunningMedian {
    private static double median(PriorityQueue<Integer> maxQ,
                                 PriorityQueue<Integer> minQ,
                                 int val) {
        if (minQ.isEmpty()) {
            minQ.add(val);
        } else {
            if (minQ.size() - maxQ.size() == 1) {
                if (val > minQ.peek()) {
                    Integer poll = minQ.poll();
                    maxQ.add(poll);
                    minQ.add(val);
                } else {
                    maxQ.add(val);
                }
            } else {
                if (val > maxQ.peek()) {
                    minQ.add(val);
                } else {
                    Integer poll = maxQ.poll();
                    minQ.add(poll);
                    maxQ.add(val);
                }
            }
        }
        if (minQ.size() > maxQ.size()) {
            return minQ.peek();
        }
        int min = minQ.peek();
        int max = maxQ.peek();
        return (min + max) / 2.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            System.out.println(median(maxQ, minQ, val));
        }
    }
}
