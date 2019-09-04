package com.kv.algorithm.day05;

public class SpiralMatrix {

    static int[] compute(int[][] matrix) {
        int row = matrix.length;
        if (row == 0)
            return new int[0];

        int col = matrix[0].length;
        int top = 0, left = 0, right = col - 1, bottom = row - 1;
        int direction = 0;
        int counter = 0;
        int[] result = new int[row * col];

        while (left <= right && top <= bottom) {
            if (direction == 0) {
                for (int k = left; k <= right; k++) {
                    result[counter] = matrix[top][k];
                    counter++;
                }
                top++;
            } else if (direction == 1) {
                for (int k = top; k <= bottom; k++) {
                    result[counter] = matrix[k][right];
                    counter++;
                }
                right--;
            } else if (direction == 2) {
                for (int k = right; k >= left; k--) {
                    result[counter] = matrix[bottom][k];
                    counter++;
                }
                bottom--;
            } else {
                for (int k = bottom; k >= top; k--) {
                    result[counter] = matrix[k][left];
                    counter++;
                }
                left++;
            }
            direction = (direction + 1) % 4;
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


        System.out.println("1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12,");
        for (int i : compute(matrix))
            System.out.print(i + ", ");

    }

}
