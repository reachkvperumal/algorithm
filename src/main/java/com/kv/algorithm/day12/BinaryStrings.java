package com.kv.algorithm.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryStrings {

    static void bruteForce() {
        for (int i = 0; i <= 1; i++)
            for (int j = 0; j <= 1; j++)
                for (int k = 0; k <= 1; k++)
                    System.out.print(i + "" + j + "" + k + " ");
    }


    static List<String> iterative(int n) {
        List<String> result = Stream.of("0", "1").collect(Collectors.toCollection(ArrayList::new));

        for (int i = 2; i <= n; i++) {
            ArrayList<String> list = new ArrayList<>();
            for (String s : result) {
                list.add(s + "0");
                list.add(s + "1");
            }
            result = list;
        }
        return result;
    }

    /**
     * - depth first search
     * - space complexity o(n)
     * - Time complexity o(2^n*n)
     */
    static void recursiveBinary(String slate, int n) {
        if (n == 0)
            System.out.print(slate + " ");
        else {
            for (int i = 0; i < 2; i++)
                recursiveBinary(slate + i, n - 1);
        }
    }

    public static void main(String[] args) {
        bruteForce();
        System.out.println();
        recursiveBinary("", 3);
        System.out.println();
        System.out.println(iterative(3));


    }

}
