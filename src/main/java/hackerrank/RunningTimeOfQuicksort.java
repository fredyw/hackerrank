package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort4
 */
public class RunningTimeOfQuicksort {
    private static int quicksortSwaps;
    private static int insertionSortShifts;

    private static int runningTime(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        quicksort(array);
        insertionSort(copy);
        return insertionSortShifts - quicksortSwaps;
    }

    public static void insertionSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int j = i;
            while (j >= 1 && ar[j] < ar[j - 1]) {
                swap(ar, j, j - 1);
                j--;
                insertionSortShifts++;
            }
        }
    }

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
                quicksortSwaps++;
                i++;
            }
        }
        quicksortSwaps++;
        swap(array, i, end);
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
        System.out.println(runningTime(array));
    }
}
