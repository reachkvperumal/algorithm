package com.kv.algorithm.day05;

import java.util.stream.Stream;

public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void compute(int i) {
        if (i > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            compute(i - 1);
        }

    }

    public static void main(String[] args) {
        int i = 10;
        System.out.print(n1 + " " + n2 + " ");
        compute(i - 2);
        System.out.println();

        Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]})
                .limit(i)
                .forEach(v -> System.out.print(v[0] + " "));


    }


}
