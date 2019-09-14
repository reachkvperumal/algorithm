package com.kv.algorithm.day08;

public class MergeSort {

    static void print(int[] input) {
        for (int i : input)
            System.out.print(i + " ");
        System.out.println();
    }

    static int[] mergeSort(int[] left, int[] right) {
        int[] aux = new int[left.length + right.length];

        int leftPointer, rightPointer, auxPointer;
        leftPointer = rightPointer = auxPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer])
                    aux[auxPointer++] = left[leftPointer++];
                else
                    aux[auxPointer++] = right[rightPointer++];
            } else if (leftPointer < left.length)
                aux[auxPointer++] = left[leftPointer++];
            else if (rightPointer < right.length)
                aux[auxPointer++] = right[rightPointer++];
        }
        return aux;
    }

    static int[] sort(int[] input) {
        int size = input.length;
        if (size <= 1)
            return input;
        int mid = input.length / 2;
        int[] left = new int[mid];
        int[] right = new int[size % 2 == 0 ? mid : mid + 1];

        for (int i = 0; i < left.length; i++)
            left[i] = input[i];

        for (int i = 0; i < right.length; i++)
            right[i] = input[mid + i];

        return mergeSort(sort(left), sort(right));
    }


    public static void main(String[] args) {
        int[] input = {4, 20, 13, 6, 7,
                5, 11, 19, 2, 3,
                20, 16, 15, 10, 5,
                1, 15, 6, 8, 18,
                3, 2, 9, 16, 12,
                7, 6, 16, 15, 5,
                15, 6, 14, 9, 19,
                19, 2, 10, 16, 18,
                16, 14, 12, 2, 6,
                11, 9, 4, 19, 10};
        print(input);
        print(sort(input));
    }

}
