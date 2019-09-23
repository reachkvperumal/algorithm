package com.kv.algorithm.day13;

public class Combination {
    static String check(long sum, long previous, String digits, long target, String expr) {
        if (digits.length() == 0) {
            if (sum + previous == target) {
                System.out.println(expr + " = " + target);
            }
        } else {
            for (int i = 1; i <= digits.length(); i++) {
                long current = Long.parseLong(digits.substring(0, i));
                String remaining = digits.substring(i);
                check(sum + previous, current, remaining, target, expr + " + " + current);
                check(sum, previous * current, remaining, target, expr + " * " + current);
                check(sum, previous / current, remaining, target, expr + " / " + current);
                check(sum + previous, -current, remaining, target, expr + " - " + current);
            }
        }
        return null;
    }

    static String[] generate_all_expressions(String s, long target) {
        String[] result = new String[s.length()];
        for (int i = 1; i <= s.length(); i++) {
            String current = s.substring(0, i);
            check(0, Long.parseLong(current), s.substring(i), target, current);
        }
        return result;
    }

    public static void main(String[] args) {
        generate_all_expressions("222", 24);
        String expr = "22";
        String current = "2";
        System.out.println();
        System.out.printf("\"%s+%s\"", expr, current);
    }

}
