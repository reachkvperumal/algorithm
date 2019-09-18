package com.kv.algorithm.day11;

public class MergeArrayOneToTwo {
    static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    static int hoarespartitioning(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start - 1, j = end + 1;

        while (true) {
            do {
                i++;
            } while (input[i] < pivot);

            do {
                j--;
            } while (input[j] > pivot);

            if (i >= j)
                return j;

            swap(input, i, j);
        }
    }

    static void sort(int[] input, int start, int end) {

        if (start < end) {
            int pivot = hoarespartitioning(input, start, end);
            sort(input, start, pivot);
            sort(input, pivot + 1, end);
        }

    }

    static void merge(int[] arr1, int[] arr2) {

        int mid = arr2.length / 2;
        int counter = 0;
        for (int i = mid; i < arr2.length; i++) {
            arr2[i] = arr1[counter++];
        }
        sort(arr2, 0, arr2.length - 1);

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 0, 0, 0};
        merge(arr1, arr2);
        for (int i : arr2)
            System.out.print(i + " ");
    }
}
