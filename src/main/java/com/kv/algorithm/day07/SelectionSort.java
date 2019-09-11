package com.kv.algorithm.day07;

public class SelectionSort {

    static char[] compute(char[] chars) {
        char[] result = new char[chars.length - 1];
        int pos = 1;
        do {
            char min = chars[pos - 1];
            for (int i = pos; i < chars.length; i++) {
                if (min >= chars[i]) {
                    char temp = chars[i];
                    chars[i] = min;
                    min = temp;
                }

            }
            result[pos - 1] = min;

            pos++;

        } while (pos < chars.length);

        return result;
    }

    public static void main(String[] args) {

        String chars = "SORTEXAMPLE";
        char[] result = compute(chars.toCharArray());
        System.out.println(result);
        System.out.println("AEELMOPRST".equals(new String(result)));
    }
}
