package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort2
 */
public class Quicksort2Sorting {
    private static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int p = partition(array, begin, end);
        quicksort(array, begin, p - 1);
        quicksort(array, p + 1, end);
        for (int i = begin; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int partition(int[] array, int begin, int end) {
        // this is a bad implementation of partition since it's not in-place
        // but that's what the question expects
        int[] aux = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        int pivot = begin;
        int idx = begin;
        for (int i = begin + 1; i <= end; i++) {
            if (aux[i] < aux[pivot]) {
                array[idx] = aux[i];
                idx++;
            }
        }
        array[idx] = aux[pivot];
        int p = idx;
        idx++;
        for (int i = begin + 1; i <= end; i++) {
            if (aux[i] > aux[pivot]) {
                array[idx] = aux[i];
                idx++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        quicksort(array);
    }
}
