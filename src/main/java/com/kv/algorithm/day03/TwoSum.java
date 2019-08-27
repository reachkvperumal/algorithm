package com.kv.algorithm.day03;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] compute(int[] sum, int target) {

        Map<Integer, Integer> lookup = new HashMap<>();

        for (int i = 0; i < sum.length; i++) {
            int delta = target - sum[i];

            if (!lookup.isEmpty() && lookup.containsKey(delta)) {
                return new int[]{lookup.get(delta), i};
            }
            lookup.put(sum[i], i);
        }
        System.out.println(lookup);
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 7, 4, 8};
        int[] result = compute(input, 7);
        System.out.println(result[0] + " " + result[1]);
    }
}
