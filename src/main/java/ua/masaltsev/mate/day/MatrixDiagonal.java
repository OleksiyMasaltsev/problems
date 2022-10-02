/**
 * Write implementation of methods:
 * <p>
 * getDiagonal()
 * getCounterDiagonal() The input parameter int[][] matrix represents square matrix,
 * so its height is always equals to its width. Example:
 * int[][] matrix = {{0, 1, 2}, {4, 5, 6}, {1, 1, 1}};
 * int[] diagonal = {0, 5, 1};
 * int[] counterDiagonal = {2, 5, 1};
 */

package ua.masaltsev.mate.day;

public class MatrixDiagonal {
    public int[] getDiagonal(int[][] matrix) {

        int[] diagonalArray = new int[matrix.length];
        int counter = diagonalArray.length;
        int x = 0;
        int y = 0;
        int index = 0;

        while (counter > 0) {
            diagonalArray[index] = matrix[x][y];
            x++;
            y++;
            counter--;
        }

        return diagonalArray;
    }

    public int[] getCounterDiagonal(int[][] matrix) {

        int[] counterDiagonalArray = new int[matrix.length];
        int counter = counterDiagonalArray.length;
        int x = matrix.length - 1;
        int y = 0;
        int index = 0;

        while (counter > 0) {
            counterDiagonalArray[index] = matrix[x][y];
            x--;
            y++;
            counter--;
        }

        return counterDiagonalArray;
    }
}