package com.kv.algorithm.day08;

public class BubbleSort {

    static char[] bubbleSort(char[] input) {

        for (int i = input.length - 1; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    char temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
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
