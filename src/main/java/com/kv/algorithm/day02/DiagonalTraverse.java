package com.kv.algorithm.day02;

public class DiagonalTraverse {

    /**
     * [
     * [ 1, 2, 3 ],
     * [ 4, 5, 6 ],
     * [ 7, 8, 9 ]
     * ]
     */

    static int[] compute(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];

        int maxRow = matrix.length;
        int maxCol = matrix[0].length;
        int[] result = new int[maxRow * maxCol];
        int row = 0, col = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[row][col];
            if ((row + col) % 2 == 0) {
                if (col == maxCol - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    col++;
                    row--;
                }
            } else {
                if (row == maxRow - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    col--;
                    row++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//Output:  [1,2,4,7,5,3,6,8,9]
// Output:  [1,2,6,11,7,3,4,8,12,16,17,13,9,5,10,14,18,19,15,20]

        for (int i : compute(matrix1))
            System.out.print(i + ",");

        System.out.println();

        for (int i : compute(matrix))
            System.out.print(i + ",");
    }
}
