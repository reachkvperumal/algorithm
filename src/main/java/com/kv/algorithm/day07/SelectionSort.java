package com.kv.algorithm.day07;

public class SelectionSort {

    /**
     * https://mathbits.com/MathBits/Java/arrays/SelectionSort.htm
     * <p>
     * The number of times the sort passes through the array is one less than the number of items in the array.
     * In the selection sort, the inner loop finds the next smallest (or largest) value and the outer loop places
     * that value into its proper location.
     *
     * @param input
     * @return
     */
    static char[] selectionSort(char[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[i]) {
                    char c = input[j];
                    input[j] = input[i];
                    input[i] = c;
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
