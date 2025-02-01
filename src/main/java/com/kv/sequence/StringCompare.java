package com.kv.sequence;

public class StringCompare {

    private static String apply(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int len1 = s1.length();
        int len2 = s2.length();

        int size = 26;
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < Math.max(len1, len2); i++) {
            if (i < len1) arr1[s1.charAt(i) - 'a']++;
            if (i < len2) arr2[s2.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < Math.min(arr1[i], arr2[i]); j++) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(apply("Hello","World"));
    }
}
