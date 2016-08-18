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
        if (begin > end) {
            return;
        }
        int p = partition(array, begin, end);
        quicksort(array, begin, p - 1);
        quicksort(array, p + 1, end);
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = begin;
        int left = pivot + 1;
        int right = end;
        while (true) {
            while (left <= end && array[left] < array[pivot]) {
                left++;
            }
            if (left > end) {
                break;
            }
            while (right >= begin && array[pivot] < array[right]) {
                right--;
            }
            if (right < begin) {
                break;
            }
            if (left >= right) {
                break;
            }
            swap(array, left, right);
        }
        swap(array, pivot, right);
        return right;
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
