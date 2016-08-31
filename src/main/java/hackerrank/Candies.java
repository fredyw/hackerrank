package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/candies
 */
public class Candies {
    private static int candies(int[] ratings) {
        int i = 0;
        int[] candies = new int[ratings.length];
        List<Integer> toBeUpdated = new ArrayList<>();
        while (i < ratings.length) {
            int j = i;
            int count = 1;
            boolean allSame = true;
            while (j + 1 < ratings.length && ratings[j] > ratings[j + 1]) {
                if (ratings[j] > ratings[j + 1]) {
                    count++;
                    allSame = false;
                }
                j++;
            }
            if (!allSame) {
                int x = i;
                while (x <= j) {
                    candies[x] = count;
                    if (x + 1 <= j && ratings[x] != ratings[x + 1]) {
                        count--;
                    }
                    x++;
                }
            } else {
                for (int x = i; x <= j; x++) {
                    toBeUpdated.add(x);
                }
            }
            i = j + 1;
        }
        System.out.println("before: " + Arrays.toString(candies));
        System.out.println(toBeUpdated);
        for (int idx : toBeUpdated) {
            if (idx - 1 < 0) {
                candies[idx] = 1;
            } else {
                if (ratings[idx] == ratings[idx - 1]) {
                    candies[idx] = 1;
                } else {
                    candies[idx] = candies[idx - 1] + 1;
                }
            }
        }
        System.out.println("after:  " + Arrays.toString(candies));
        int result = 0;
        for (int candy : candies) {
            result += candy;
        }
        // TODO
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = in.nextInt();
        }
        System.out.println(candies(ratings));
    }
}
