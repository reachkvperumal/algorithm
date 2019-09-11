package com.kv.algorithm.day06;

public class ReverseString {
    static void reverseString(char[] s) {
        int k = 0;
        int len = s.length / 2;
        for (int i = s.length - 1; i >= len; i--) {
            char tmp = s[i];
            s[i] = s[k];
            s[k] = tmp;
            k++;


        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        reverseString("ABCD EFG HIJK".toCharArray());

    }
}
