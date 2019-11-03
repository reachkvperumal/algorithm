package com.kv.algorithm.day23;

public class MSB {

    static void msb(int n) {
        int count = 0;
        while (n > 1) {
            count++;
            n = n >> 1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("MSB");
        System.out.println(Math.abs(Math.abs(-10)));

    }

}
