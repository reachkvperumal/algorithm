package com.kv.algorithm.day02;

public class LargestNumberOfTwiceOther {

    static int compute(int[] nums) {

        //get max number pos
        int pos = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[pos]) {
                pos = i;
            }
        }
        int max = nums[pos];
        for (int i = 0; i < nums.length; i++) {
            if (i != pos && nums[i] * 2 > max) {
                return -1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] nums = {-78, 1, 2, 3, 24, 33, 72, -89};
        System.out.println(compute(nums));
    }
}
