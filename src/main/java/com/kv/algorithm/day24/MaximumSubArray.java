package com.kv.algorithm.day24;

import static java.lang.Math.max;

public class MaximumSubArray {

    private static int findMaxSubArraySum(int[] input) {
        if (input.length == 0)
            return 0;

        int sum = input[0];
        int maxSum = input[0];

        for (int i = 1; i < input.length; i++) {
            if (sum < 0)
                sum = input[i];
            else
                sum = sum + input[i];

            maxSum = max(sum, maxSum);
        }

        return maxSum;
    }

    private static int kadaneSum(int[] input) {

        int curVal = input[0];
        int maxVal = input[0];

        for (int i = 1; i < input.length; i++) {
            curVal = max(input[i], curVal + input[i]);
            maxVal = max(curVal, maxVal);
        }


        return maxVal;

    }


    public static void main(String[] args) {
        int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(findMaxSubArraySum(input));

        System.out.println(kadaneSum(input));
    }

}
