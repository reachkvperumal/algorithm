package com.kv.algorithm.day12;

import java.util.stream.Stream;

public class Fibonacci {

    static int compute(int n) {
        if (n <= 1)
            return n;
        else
            return compute(n - 1) + compute(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++)
            System.out.print(compute(i) + " ");

        System.out.println();
        //Additive Sequence with always 3 arguments (n,a,b)
        //addSeq(n-1,b,a+b) for recursive way to solve the additive sequence
        Stream
                .iterate(new int[]{0, 1}, e -> new int[]{e[0] + e[1], e[0]})
                .limit(15)
                .forEach(o -> System.out.print(o[0] + " "));


    }


}
