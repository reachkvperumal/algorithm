package com.kv.algorithm.day06;

public class WordReverseV2 {
    static String compute(String reverse) {
        char[] charArray = reverse.toCharArray();
        int loopTill = charArray.length / 2;
        String result = null;

        int k = 0;
        for (int i = charArray.length - 1; i >= loopTill; i--) {
            char tmp = charArray[i];
            charArray[i] = charArray[k];
            charArray[k] = tmp;
            k++;
        }


        return null;
    }

    public static void main(String[] args) {
        System.out.println(compute(" a good   example "));
    }
}
