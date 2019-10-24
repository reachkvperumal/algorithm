package com.kv.algorithm.day21;

import java.util.ArrayList;
import java.util.List;

public class DPStairCaseRobot {

    enum Pos {
        LEFT,
        RIGHT,

    }

    static int[][] helper(int row, int col, Pos p) {
        int[][] table = new int[row][col];

        if (p == Pos.LEFT) {
            for (int i = 0; i < table.length; i++)
                table[i][0] = 1;
        } else {
            for (int i = 0; i < table.length; i++)
                table[i][col - 1] = 1;
        }

        for (int i = 0; i < table[0].length; i++)
            table[0][i] = 1;

       /* print(table);
        System.out.println();*/
        return table;
    }

    /**
     * f(row-1, col) + f(row,col-1)
     *
     * @param row rows
     * @param col cols
     * @return paths to reach the given co ordinates with left and down options
     */
    static int countPathTopLeftToBottomRight(int row, int col, int[][] table) {
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = table[i - 1][j] + table[i][j - 1];
            }
        }
        print(table);
        return table[row - 1][col - 1];
    }

    //f(m+n-2)(m-1) top right to bottom left
    static int countPathTopRightToBottomLeft(int row, int col, int[][] table) {

        for (int i = 1; i < table.length; i++) {
            for (int j = table[i].length - 2; j > -1; j--) {
                table[i][j] = table[i - 1][j] + table[i][j + 1];
            }
        }

        print(table);
        return table[row - 1][col - 1];
    }

    static void print(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++)
                System.out.print(table[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] table = helper(2, 2, Pos.LEFT);

        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < table.length; i++) {
            List<Integer> inner = new ArrayList<>();
            for (int j = 0; j < table[i].length; j++) {
                inner.add(j, table[i][j]);
            }
            outer.add(i, inner);
        }

        System.out.println(outer);
        int i = countPathTopLeftToBottomRight(2, 2, table);
        System.out.println();

        table = helper(4, 5, Pos.RIGHT);
        //System.out.println(countPathTopRightToBottomLeft(4, 4, table));

    }


}
