package com.kv.algorithm.day02;

public class PivotIndex {

    static int compute(int[] nums){

        if(nums == null || nums.length == 0) return -1;

        int leftSum = 0, sum = 0;

        for(int i : nums)
            sum+=i;

        for(int i =0; i< nums.length; i++){
            if(leftSum == sum - leftSum - nums[i] )
                return i;
            leftSum+=nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-3,1,2,3,4,3,5,9};
        System.out.println(compute(nums));
    }

}
