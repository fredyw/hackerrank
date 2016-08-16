package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort1
 */
public class QuickSort1Partition {
    private static void partition(int[] array) {
        int pivot = 0;
        int left = pivot + 1;
        int right = array.length - 1;
        while (true) {
             while (left < array.length && array[left] < array[pivot]) {
                 left++;
             }
             if (left >= array.length) {
                 break;
             }
             while (right >= 0 && array[pivot] < array[right]) {
                 right--;
             }
             if (right < 0) {
                 break;
             }
             if (left >= right) {
                 break;
             }
             swap(array, left, right);
        }
        swap(array, pivot, right);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
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
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        partition(array);
    }
}
