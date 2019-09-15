package com.kv.algorithm.day08;

public class BubbleSort {
    /**
     * https://mathbits.com/MathBits/Java/arrays/Bubble.htm
     * In the bubble sort,as elements are sorted they gradually "bubble"(or rise) to their proper location in the array,
     * like bubbles rising in a glass of soda. The bubble sort repeatedly compares adjacent elements of an array.
     * The first and second elements are compared and swapped if out of order.
     * Then the second and third elements are compared and swapped if out of order.
     * This sorting process continues until the last two elements of the array are compared and swapped if out of order.
     *
     * @param input
     * @return
     */
    static char[] bubbleSort(char[] input) {

        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    char c = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = c;
                    flag = true;
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
