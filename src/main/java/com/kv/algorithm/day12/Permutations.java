package com.kv.algorithm.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    //All subsets of a set

    static void computeWihtIdx(List<Integer> slate, int[] input, int index) {

        if (input.length == index)
            System.out.println(slate);
        else {
            computeWihtIdx(slate, input, index + 1);
            slate.add(input[index]);
            computeWihtIdx(slate, input, index + 1);
            slate.remove(slate.size() - 1);
        }
    }

    //With reference getting updated
    static void compute(List<Integer> slate, int[] input) {
        if (input.length == 0)
            System.out.println(slate);
        else {
            int[] copy = Arrays.copyOfRange(input, 1, input.length);
            compute(slate, copy);
            slate.add(input[0]);
            compute(slate, copy);
            slate.remove(slate.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        compute(new ArrayList<Integer>(), input);
        System.out.println();
        computeWihtIdx(new ArrayList<Integer>(), input, 0);


    }

}
