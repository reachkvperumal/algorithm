package com.kv.algorithm.day09;

public class QuickSort {

    static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    static void sort(int[] input, int min, int max) {

        if (min < max) {
            int pivot = partition(input, min, max);
            sort(input, min, pivot - 1);
            sort(input, pivot + 1, max);
        }

    }

    static int partition(int[] input, int min, int max) {
        int pivot = input[max];
        int i = min;
        for (int j = min; j < max; j++) {
            if (input[j] < pivot) {
                swap(input, i, j);
                i++;
            }
        }
        swap(input, i, max);
        return i;
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
