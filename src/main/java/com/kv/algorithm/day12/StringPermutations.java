package com.kv.algorithm.day12;

public class StringPermutations {

    static String[] getArray(String[] input, String ele) {
        String[] result = new String[input.length - 1];
        int j = 0;

        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            if (current != ele)
                result[j++] = current;
        }
        return result;
    }

    static void compute(String slate, String[] input) {
        if (input.length == 0)
            System.out.print(slate + " ");
        else {
            for (int i = 0; i < input.length; i++) {
                compute(slate + input[i], getArray(input, input[i]));

            }


        }
    }


    public static void main(String[] args) {
        String[] input = {"a", "b", "c"};

        compute("", input);


    }

}
