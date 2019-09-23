package com.kv.algorithm.day13;

import java.util.Arrays;

public class PossibleSum {

    static boolean compute(long[] arr, long k) {
        long result = 0l;
        for (long z : arr)
            result += z;

        if (result == k)
            return true;

        return check(arr, k);
    }

    static boolean check(long[] arr, long k) {

        if (arr.length == 0)
            return false;
        else {
            long src = arr[0];
            if (src == k)
                return true;

            for (int i = 1; i < arr.length; i++) {
                long r = src + arr[i];
                if (r == k)
                    return true;
            }
            check(Arrays.copyOfRange(arr, 1, arr.length), k);
        }

        return false;
    }

    public static void main(String[] args) {
        long[] arr = {-1l, 2l, 3l, 1l, -3l};
        System.out.println(compute(arr, 0l));
    }
}
