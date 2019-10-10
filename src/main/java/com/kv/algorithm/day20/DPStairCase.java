package com.kv.algorithm.day20;

import java.util.stream.Stream;

public class DPStairCase {

    static void compute(int n) {

        if (n < 0)
            return;
        int[] table = {1, 2, 3};

        if (n <= 3)
            System.out.print(n + " ");
        else {
            for (int i = 3; i < n; i++) {
                table[i % 3] = table[(i - 1) % 3] + table[(i - 2) % 2];
                System.out.printf("I = %d, Value = %d%n", i, table[i % 3]);
            }

            for (int i = 0; i < table.length; i++)
                System.out.printf("Current Position: %d Value I : %d%n", i, table[i]);

            System.out.printf("N = %d, Value = %d%n", n, table[n % 3]);

            System.out.print(table[(n - 1) % 3] + " ");
        }
    }

    public static void main(String[] args) {
        compute(4);
        System.out.println();
        int count = 6;
        int j = 1;
        for (int i = count; i > 0; i--) {
            System.out.printf("%1$" + i + "s", "");
            Stream.generate(() -> "#").limit(j).forEach(System.out::print);
            j++;
            System.out.println();
        }


    }
}
