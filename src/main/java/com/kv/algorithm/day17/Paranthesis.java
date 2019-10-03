package com.kv.algorithm.day17;

public class Paranthesis {

    static int count = 0;

    static void compute(String[] input, int size, int pos, int start, int end) {
        if (end == size) {
            count = count + 1;
            for (String v : input)
                System.out.print(v);
            System.out.println(pos);
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

        int size = 8;
        String[] input = new String[size * 2];
        compute(input, size, 0, 0, 0);

        System.out.println(count);

    }
}
