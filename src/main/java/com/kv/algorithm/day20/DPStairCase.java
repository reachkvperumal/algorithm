package com.kv.algorithm.day20;

public class DPStairCase {

    static void compute(int n) {
        if (n < 0)
            return;
        int[] table = {1, 2, 3};

        if (n <= 3)
            System.out.print(n + " ");
        else {
            for (int i = 3; i < n; i++)
                table[i % 3] = table[(i - 1) % 3] + table[(i - 2) % 2];
            System.out.print(table[(n - 1) % 3] + " ");
        }
    }

    public static void main(String[] args) {
        compute(14);
    }
}
