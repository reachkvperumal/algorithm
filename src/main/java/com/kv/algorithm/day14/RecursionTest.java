package com.kv.algorithm.day14;

public class RecursionTest {

    static int getInt() {
        return Integer.MIN_VALUE;
    }

    static boolean compute(long[] arr, long k, int start, boolean left) {

        if (left && k == 0)
            return true;

        if (arr.length == start)
            return false;
        else {
            if (arr[start] == k)
                return true;
            else
                return compute(arr, k, start + 1, left) || compute(arr, k - arr[start], start + 1, true);
        }
    }


    static boolean check_if_sum_possible(long[] arr, long k) {
        return compute(arr, k, 0, false);
    }


    public static void main(String[] args) {
        long[] input = {1l, 2l, 3l, 9l, 5l, 9l, 13l};

        System.out.println(check_if_sum_possible(input, 12l));
    }
}
