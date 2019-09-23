package com.kv.algorithm.day13;

public class Brackets {
    static String[] compute(char str[], int pos, int n, int open, int close) {
        if (close == n || open > n) {
            String[] result = new String[str.length];
            for (int i = 0; i < str.length; i++)
                result[i] = String.valueOf(str[i]);

            return result;
        } else {
            if (open > close) {
                str[pos] = ')';
                return compute(str, pos + 1, n, open, close + 1);
            }

            str[pos] = '(';
            return compute(str, pos + 1, n, open + 1, close);

        }
    }

    static String[] find_all_well_formed_brackets(int n) {

        char[] str = new char[n * 2];
        return compute(str, 0, n, 0, 0);
    }

    public static void main(String[] args) {
        for (String s : find_all_well_formed_brackets(3)) {
            System.out.println(s);
        }
    }
}
