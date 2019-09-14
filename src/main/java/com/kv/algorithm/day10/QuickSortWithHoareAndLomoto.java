package com.kv.algorithm.day10;

public class QuickSortWithHoareAndLomoto {

    private enum SortType {
        HOARES,
        LOMOTO;
    }

    static void print(int[] input) {
        for (int i : input)
            System.out.print(i + " ");
        System.out.println();
    }

    static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    static int lomotoPartitioning(int[] input, int start, int end) {
        int pivot = input[end];
        int i = start;
        for (int j = start; j < input.length; j++) {
            if (input[j] < pivot) {
                swap(input, i, j);
                i++;
            }
        }
        swap(input, i, end);
        return i;
    }

    static int hoaresPartitioning(int[] input, int start, int end) {
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

    static void sort(int[] input, int start, int end, SortType type) {
        if (start < end) {
            int pivot;
            if (type == SortType.LOMOTO) {
                pivot = lomotoPartitioning(input, start, end);
                sort(input, start, pivot - 1, type);
                sort(input, pivot + 1, end, type);
            } else {
                pivot = hoaresPartitioning(input, start, end);
                sort(input, start, pivot, type);
                sort(input, pivot + 1, end, type);
            }

        }
    }

    public static void main(String[] args) {
        int[] input = {11, 16, 2, 16, 1, 5, 2, 18, 6, 12, 3, 15, 4, 20, 3, 15, 5, 5, 2, 1};
        print(input);

        sort(input, 0, input.length - 1, SortType.LOMOTO);
        print(input);

        sort(input, 0, input.length - 1, SortType.HOARES);
        print(input);

    }

}
