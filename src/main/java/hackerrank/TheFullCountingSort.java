package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/countingsort4
 */
public class TheFullCountingSort {
    private static void countingSort(NumWord[] numWords) {
        int[] counts = new int[100];
        for (int i = 0; i < numWords.length; i++) {
            counts[numWords[i].num]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (i == 0) {
                counts[i] = counts[i];
            } else {
                counts[i] = counts[i - 1] + counts[i];
            }
        }

        NumWord[] output = new NumWord[numWords.length];
        // Build the output character array
        for (int i = numWords.length - 1; i >= 0; --i) {
            NumWord val = numWords[i];
            if (i < numWords.length / 2) {
                val.word = "-";
            }
            counts[val.num]--;
            int idx = counts[val.num];
            output[idx] = val;
        }
        StringBuilder sb = new StringBuilder();
        for (NumWord numWord : output) {
            sb.append(numWord.word + " ");
        }
        System.out.println(sb.toString());
    }

    private static class NumWord {
        private int num;
        private String word;

        public NumWord(int num, String word) {
            this.num = num;
            this.word = word;
        }

        @Override
        public String toString() {
            return num + " " + word;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        NumWord[] numWords = new NumWord[n];
        for (int i = 0; i < n; i++) {
            numWords[i] = new NumWord(in.nextInt(), in.next());
        }
        countingSort(numWords);
    }
}
