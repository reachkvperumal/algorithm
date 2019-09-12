package com.kv.algorithm.day08;

public class MergeSort {

    static void mergeSort(int[] input, int start, int end) {
        if (start < end) {
            int middle = start + (end - start) / 2;
            mergeSort(input, start, middle);
            mergeSort(input, middle + 1, end);
            merge(input, start, middle, end);
        }
    }

    static void merge(int[] input, int start, int middle, int end) {
        int[] aux = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            aux[i] = input[i];
        }

        int i = start, j = middle + 1, k = start;

        while (i <= middle && j <= end) {
            if (aux[i] <= aux[j]) {
                input[k] = aux[i];
                i++;
            } else {
                input[k] = aux[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            input[k] = aux[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] input = {8, 4, 7, 77, 23, 76, 11, 7, -3, -90};
        for (int i : input)
            System.out.print(i + " ");
        System.out.println();
        mergeSort(input, 0, input.length - 1);
        for (int i : input)
            System.out.print(i + " ");
    }

}
