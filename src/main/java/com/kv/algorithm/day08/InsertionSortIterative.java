package com.kv.algorithm.day08;

public class InsertionSortIterative {

    static void sort(int[] input) {
        if (input.length <= 1)
            return;

        for (int i = 1; i < input.length; i++) {

            int previousElement = input[i];
            int prevOfPrevIdx = i - 1;

            while (prevOfPrevIdx >= 0 && input[prevOfPrevIdx] > previousElement) {
                input[prevOfPrevIdx + 1] = input[prevOfPrevIdx];
                prevOfPrevIdx--;
            }
            input[prevOfPrevIdx + 1] = previousElement;
        }
    }

    public static void main(String[] args) {
        int[] input = {8, 4, 7, 77, 23, 76, 11, 7, -3, -90};
        for (int i : input)
            System.out.print(i + " ");
        sort(input);
        System.out.println();
        for (int i : input)
            System.out.print(i + " ");
    }
}
