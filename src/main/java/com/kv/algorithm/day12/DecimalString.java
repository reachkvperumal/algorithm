package com.kv.algorithm.day12;

public class DecimalString {

    static void compute(String slate, int n) {
        if (n == 0)
            System.out.printf("%s%n", slate);
        else {
            for (int i = 0; i < 10; i++)
                compute(slate + i, n - 1);
        }
    }

    public static void main(String[] args) {
        compute("", 2);
    }
}
