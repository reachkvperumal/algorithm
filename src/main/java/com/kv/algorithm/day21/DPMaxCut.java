package com.kv.algorithm.day21;

import java.util.Base64;

public class DPMaxCut {

    static long maxCut(int n) {

        long[] result = new long[n + 1];

        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            long max = Long.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                max = Math.max(max, Math.max(j * result[i - j], j * (i - j)));
            }
            result[i] = max;
        }

        for (long l : result)
            System.out.print(l + " ");
        System.out.println();
        return result[n];
    }


    public static void main(String[] args) {
        System.out.println(maxCut(4));
        System.out.println(Base64.getUrlEncoder().encodeToString(("http://www.google.com".getBytes())));
    }

}
