package com.kv.algorithm.day07;

public class SelectionSort {

    static char[] selectionSort(char[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    char temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }
        return input;
    }
    public static void main(String[] args) {
        String chars = "SORTEXAMPLE";
        //String chars = "Process finished with exit code 0";
        char[] result = selectionSort(chars.toCharArray());
        System.out.println(result);
        System.out.println("AEELMOPRSTX".equals(new String(result)));
    }
}
