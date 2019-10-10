package com.kv.algorithm.day20;

public class PascalTriangleReTry {

    static int compute(int i, int j) {
        if (i <= 1 || i == j || j == 0)
            return 1;
        else
            return compute(i - 1, j) + compute(i - 1, j - 1);
    }

    static int[] comput(int i) {
        if (i == 0)
            return new int[]{1};

        int[] current = {1, 1};
        if (i == 1)
            return current;

        for (int j = 2; j <= i; j++) {
            int[] next = new int[j + 1];
            next[0] = 1;
            for (int k = 1; k < j; k++)
                next[k] = current[k - 1] + current[k];
            next[j] = 1;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        int input = 5;
        int count = input;
        for (int i = 0; i < input; i++) {
            System.out.printf("%1$" + count + "s", "");
            count--;
            for (int j = 0; j <= i; j++)
                System.out.print(compute(i, j) + " ");
            System.out.println();
        }

        count = input;
        for (int i = 0; i < input; i++) {
            System.out.printf("%1$" + count + "s", "");
            count--;
            for (int j : comput(i))
                System.out.print(j + " ");
            System.out.println();
        }
    }

}
