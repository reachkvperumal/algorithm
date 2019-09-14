package com.kv.algorithm.day09;

public class QuickSort {

    static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    static int partition(int[] input, int start, int end) {
        int pivot = input[end];
        int i = start;

        for (int j = start; j < end; j++) {
            if (input[j] < pivot) {
                swap(input, i, j);
                i++;
            }
        }
        swap(input, i, end);
        return i;
    }

    static void sort(int[] input, int start, int end) {
        if (start < end) {
            int pivot = partition(input, start, end);
            sort(input, start, pivot - 1);
            sort(input, pivot + 1, end);
        }
    }


    public static void main(String[] args) {
        int[] input = {4, 3, 20, 13, 6, 7, 5, 11, 19, 2, 3};
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(input, 0, input.length - 1);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }
}
