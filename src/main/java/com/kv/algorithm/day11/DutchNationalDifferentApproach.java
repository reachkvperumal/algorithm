package com.kv.algorithm.day11;

public class DutchNationalDifferentApproach {

    static void swap(char[] input, int start, int end) {
        char c = input[start];
        input[start] = input[end];
        input[end] = c;
    }

    static void compute(char[] input) {

        int end = input.length - 1;
        int start, mid;
        start = mid = 0;

        while (mid <= end) {
            char current = input[mid];
            switch (current) {
                case 'R': {
                    swap(input, start, mid);
                    start++;
                    mid++;
                    break;
                }
                case 'G': {
                    mid++;
                    break;
                }
                case 'B': {
                    swap(input, mid, end);
                    end--;
                    break;
                }

            }
        }

    }

    public static void main(String[] args) {
        char[] input = {'G', 'B', 'G', 'G', 'R', 'B', 'R', 'G'};
        compute(input);

        for (char c : input)
            System.out.print(c + " ");
    }
}
