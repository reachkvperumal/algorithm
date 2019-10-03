package com.kv.algorithm.day17;

public class Paranthesis2D {
    static int count = 0;

    static void compute(String[] input, int size, int pos, int start, int end) {
        if (end == size) {
            System.out.println(count++);
            for (String s : input)
                System.out.print(s);
            System.out.println();
        } else {
            if (start < size) {
                input[pos] = "{";
                compute(input, size, pos + 1, start + 1, end);
            }
            if (start > end) {
                input[pos] = "}";
                compute(input, size, pos + 1, start, end + 1);
            }
        }
    }

    public static void main(String[] args) {
        int size = 3;
        compute(new String[size * 2], size, 0, 0, 0);
    }


}
