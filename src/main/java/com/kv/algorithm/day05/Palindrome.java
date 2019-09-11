package com.kv.algorithm.day05;

import java.util.stream.IntStream;

public class Palindrome {

    static boolean compute(String src) {

        String string = src.replace("\\s+", "").toLowerCase();
        int totalLength = string.length() - 1;

        int reverse = totalLength;

        for (int i = 0; i < totalLength; i++) {
            if (string.charAt(i) != string.charAt(reverse--)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrome = "RADAR";
        System.out.println(compute(palindrome));
        int size = palindrome.length();
        System.out.println(IntStream.range(0, size)
                .allMatch(i -> palindrome.charAt(i) == palindrome.charAt(size - 1 - i)));


    }
}
