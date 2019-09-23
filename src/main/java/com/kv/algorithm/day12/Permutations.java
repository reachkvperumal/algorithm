package com.kv.algorithm.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    //All subsets of a set

    static void compute(List<Integer> slate, int[] input) {
        if (input.length == 0) {
            System.out.println(slate);
        } else {
            int[] copy = Arrays.copyOfRange(input, 1, input.length);
            compute(slate, copy);
            slate = new ArrayList<>();
            slate.add(input[0]);
            compute(slate, copy);
        }

    }


    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        compute(new ArrayList<Integer>(), input);


    }

}
