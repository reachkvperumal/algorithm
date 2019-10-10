package com.kv.algorithm.day20;

import java.util.stream.Stream;

public class DPFibonacci {

    static void fib(int input) {
        if (input < 0)
            return;

        int[] table = {0, 1, 1};

        if (input < 3)
            System.out.print(table[input] + " ");
        else {
            for (int i = 2; i <= input; i++) {
                table[i % 3] = table[(i - 1) % 3] + table[(i - 2) % 3];
            }
            System.out.print(table[input % 3] + " ");
        }

    }


    public static void main(String[] args) {
        int input = 15;

        Stream
                .iterate(new Integer[]{0, 1}, p -> new Integer[]{p[0] + p[1], p[0]})
                .limit(input)
                .forEach(p -> System.out.print(p[0] + " "));
        System.out.println();
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < input; i++)
            fib(i);
    }


}
