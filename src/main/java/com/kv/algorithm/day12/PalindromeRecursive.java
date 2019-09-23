package com.kv.algorithm.day12;

public class PalindromeRecursive {

    static boolean compute(String src) {
        if (src.length() <= 1)
            return true;

        if (src.charAt(0) != src.charAt(src.length() - 1))
            return false;
        return compute(src.substring(1, src.length() - 1));

    }

    public static void main(String[] args) {
        System.out.println("Is Palindrome :" + compute("RADAR"));
    }

}
