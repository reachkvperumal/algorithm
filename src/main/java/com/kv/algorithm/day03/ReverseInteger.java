package com.kv.algorithm.day03;

public class ReverseInteger {

    static int compute(int input) {
        long reverse = 0;

        while (input > 0) {

            reverse = reverse * 10 + input % 10;
            input = input / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return -1;
            }

        }

        return (int) reverse;
    }

    public static void main(String[] args) {
        System.out.println(compute(123456789));
    }
}
