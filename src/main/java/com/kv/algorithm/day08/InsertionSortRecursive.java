package com.kv.algorithm.day08;

public class InsertionSortRecursive {
    static void sort(int[] input, int n) {

        if (n <= 1)
            return;

        sort(input, n - 1);

        int prevElement = input[n - 1];
        int prevOfPrevIdx = n - 2;

        while (prevOfPrevIdx >= 0 && input[prevOfPrevIdx] > prevElement) {
            input[prevOfPrevIdx + 1] = input[prevOfPrevIdx];
            prevOfPrevIdx--;
        }
        input[prevOfPrevIdx + 1] = prevElement;
    }

    public static void main(String[] args) {
        int[] input = {8, 4, 7, 77, 23, 76, 11, 7, -3, -90};
        for (int i : input)
            System.out.print(i + " ");
        sort(input, input.length);
        System.out.println();
        for (int i : input)
            System.out.print(i + " ");
    }

}
