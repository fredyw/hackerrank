package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/two-pluses
 */
public class EmmasSupercomputer {
    private static class Block {
        private final int value;
        private final List<String> rowsCols;

        public Block(int value, List<String> rowsCols) {
            this.value = value;
            this.rowsCols = rowsCols;
        }
    }

    private static int emmasSupercomputer(char[][] matrix, int maxRow, int maxCol) {
        List<Block> blocks = new ArrayList<>();
        for (int row = 0; row < maxRow; row++) {
            for (int col = 0; col < maxCol; col++) {
                if (matrix[row][col] == 'G') {
                    int tmpMax = 1;
                    int topRow = row;
                    int topCol = col;
                    int leftRow = row;
                    int leftCol = col;
                    int bottomRow = row;
                    int bottomCol = col;
                    int rightRow = row;
                    int rightCol = col;
                    List<String> rowsCols = new ArrayList<>();
                    rowsCols.add(topRow + "|" + topCol);
                    rowsCols.add(leftRow + "|" + leftCol);
                    rowsCols.add(bottomRow + "|" + bottomCol);
                    rowsCols.add(rightRow + "|" + rightCol);
                    blocks.add(new Block(1, new ArrayList<>(rowsCols)));
                    while (true) {
                        // top
                        topRow--;
                        if (topRow < 0 || matrix[topRow][topCol] != 'G') {
                            break;
                        }
                        // left
                        leftCol--;
                        if (leftCol < 0 || matrix[leftRow][leftCol] != 'G') {
                            break;
                        }
                        // bottom
                        bottomRow++;
                        if (bottomRow >= maxRow || matrix[bottomRow][bottomCol] != 'G') {
                            break;
                        }
                        // right
                        rightCol++;
                        if (rightCol >= maxCol || matrix[rightRow][rightCol] != 'G') {
                            break;
                        }
                        tmpMax += 4;
                        rowsCols.add(topRow + "|" + topCol);
                        rowsCols.add(leftRow + "|" + leftCol);
                        rowsCols.add(bottomRow + "|" + bottomCol);
                        rowsCols.add(rightRow + "|" + rightCol);
                        blocks.add(new Block(tmpMax, new ArrayList<>(rowsCols)));
                    }
                }
            }
        }
        return getMax(blocks);
    }

    private static int getMax(List<Block> blocks) {
        int max = 0;
        for (int i = 0; i < blocks.size(); i++) {
            outer:
            for (int j = i + 1; j < blocks.size(); j++) {
                Block a = blocks.get(i);
                Block b = blocks.get(j);
                // to make sure there's no intersection
                for (String x : a.rowsCols) {
                    for (String y : b.rowsCols) {
                        if (x.equals(y)) {
                            continue outer;
                        }
                    }
                }
                max = Math.max(max, a.value * b.value);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            matrix[i] = in.next().toCharArray();
        }
        System.out.println(emmasSupercomputer(matrix, n, m));
    }
}
