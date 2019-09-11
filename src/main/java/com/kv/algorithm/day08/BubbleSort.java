package com.kv.algorithm.day08;

public class BubbleSort {

    static char[] bubbleSort(char[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = input.length - 1; j > i; j--) {
                if (input[i] > input[j]) {
                    char temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        // String input = "SORTEXAMPLE";
        String input = "Processfinishedwithexitcode0";
        char[] result = bubbleSort(input.toCharArray());
        System.out.println(result);
        System.out.println("0Pccddeeeefhhiiiinoorsssttwx".equals(new String(result)));
    }
}
