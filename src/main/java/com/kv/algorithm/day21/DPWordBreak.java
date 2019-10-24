package com.kv.algorithm.day21;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DPWordBreak {

    static boolean compute(String word, List<String> dictionary) {
        boolean[] table = new boolean[word.length() + 1];
        table[0] = true;

        Set<String> dict = dictionary.stream().collect(Collectors.toSet());

        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dict.contains(word.substring(j, i)) && table[j])
                    table[i] = true;

            }
        }


        return table[word.length()];
    }

    public static void main(String[] args) {
        String s = "LEETCODE";
        System.out.println(s.length());
        String[] dic = {"LEET", "CODE"};
        System.out.println(compute(s, Arrays.asList(dic)));

        s = "applepenapple";
        dic = new String[]{"apple", "pen"};
        System.out.println(compute(s, Arrays.asList(dic)));
        s = "catsandog";
        dic = new String[]{"cats", "dog", "sand", "and", "cat"};
        System.out.println(compute(s, Arrays.asList(dic)));
    }

}
