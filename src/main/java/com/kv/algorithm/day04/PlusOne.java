package com.kv.algorithm.day04;

public class PlusOne {
    static int[] plusOne(int[] digits) {
        int size = digits.length;

        int carryOver = 0;
        int initial = 1;
        for (int i = size - 1; i > -1; i--) {
            int current = digits[i] + carryOver + initial;
            initial = 0;
            if (current > 9) {
                digits[i] = 0;
                carryOver = 1;
            } else {
                digits[i] = current;
                carryOver = 0;
            }
        }

        if (carryOver > 0) {
            int[] nArr = new int[size + 1];
            nArr[0] = carryOver;
            for (int i = 1; i < nArr.length; i++) {
                nArr[i] = digits[i - 1];
            }
            return nArr;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9, 9, 9, 9, 9, 9};
        for (int i : plusOne(digits)) {
            System.out.print(i + " ");
        }
    }
}
