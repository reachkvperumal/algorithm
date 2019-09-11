package com.kv.algorithm.day06;

public class WordReverse {
    static String reverse(char[] c, int size) {
        char[] result = new char[size];
        int j = 0;
        for (int i = size - 1; i > -1; i--) {
            char current = c[i];
            if (current != 32) {
                result[j] = c[i];
                j++;
            }
        }
        return new String(result);
    }

    static String compute(String str) {
        char[] input = str.toCharArray();
        int size = input.length - 1;
        char[] output = new char[size];
        int pos = 0;
        String result = null;
        for (int i = size; i > -1; i--) {
            char c = input[i];
            if (c != 32 && i > 0) {
                output[pos] = input[i];
                pos++;
            } else if (c == 32 && pos > 0) {
                result = result == null ? reverse(output, pos) : result + " " + reverse(output, pos);
                pos = 0;
            } else if (c != 32 && i == 0) {
                result = result + " " + input[i];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compute(" a good   example "));
    }

}
