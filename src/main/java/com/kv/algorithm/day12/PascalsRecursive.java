package com.kv.algorithm.day12;

public class PascalsRecursive {

    //return c(n-1,k) + c(n-1,k-1)  , if( n<=1  or n == k or k == 0) then 1
    static int compute(int i, int j) {

        if (i <= 1 || i == j || j == 0)
            return 1;
        else
            return compute(i - 1, j) + compute(i - 1, j - 1);

    }

    static int[] compute(int row) {

        if (row == 0)
            return new int[]{1};

        if (row == 1)
            return new int[]{1, 1};

        int[] current = {1, 1};

        for (int r = 2; r <= row; r++) {
            int[] next = new int[r + 1];
            next[0] = 1;
            for (int i = 1; i < r; i++)
                next[i] = current[i - 1] + current[i];
            next[r] = 1;
            current = next;

        }

        return current;
    }


    public static void main(String[] args) {
        int count = 5;
        for (int i = 0; i < 5; i++) {
            System.out.printf("%1$" + count + "s", " ");
            count--;
            for (int j : compute(i))
                System.out.print(j + " ");
            System.out.println();
        }

        count = 5;
        for (int i = 0; i < 5; i++) {
            System.out.printf("%1$" + count + "s", " ");
            count--;
            for (int j = 0; j <= i; j++)
                System.out.print(compute(i, j) + " ");
            System.out.println();

        }


    }
}
