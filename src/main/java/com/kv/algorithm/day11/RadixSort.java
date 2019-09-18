package com.kv.algorithm.day11;

public class RadixSort {

    static int getMax(int[] input) {
        int max = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] > max)
                max = input[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int input[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int result = getMax(input);
        System.out.println(result);
        for (int i = 1; result / i > 0; i *= 10)
            System.out.println(i);

        int[] count = new int[10];
        //  Arrays.fill(count,0);
        System.out.println("Array Size: " + count.length);
        for (int i : count)
            System.out.println(i);


    }

}
