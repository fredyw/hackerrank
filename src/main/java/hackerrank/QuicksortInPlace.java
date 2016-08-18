package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort3
 */
public class QuicksortInPlace {
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
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = begin;
        for (int j = begin; j <= end - 1; j++) {
            if (array[j] <= pivot) {
                swap(array, i, j);
                i++;
            }
        }
        swap(array, i, end);
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
        System.out.println();
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
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
