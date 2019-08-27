package com.kv.algorithm.day02;

import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {

    /**
     * [
     * [ 1, 2, 3 ],
     * [ 4, 5, 6 ],
     * [ 7, 8, 9 ]
     * ]
     */

    static void compute(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int[] nArray = new int[r * c];

        int currentRow = 0;
        int currentColumn = 0;
        List<Integer> diagonal = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            diagonal.add(matrix[currentRow][currentColumn]);
            if (currentColumn < c)
                currentColumn++;

            diagonal.add(matrix[currentRow][currentColumn]);

            if (currentRow < r)
                currentRow++;

            diagonal.add(matrix[currentRow][currentColumn]);


        }


    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

//Output:  [1,2,4,7,5,3,6,8,9]

    }
}
