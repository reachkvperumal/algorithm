package com.kv.algorithm.day21;

public class DPMinPath {


    /*
        f(a) = min k(f(a-ck))+1
     */
    static int minPath(int amount, int[] coins) {
        int[] table = new int[amount + 1];

        table[0] = 0;

        for (int i = 1; i < table.length; i++)
            table[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (i - c >= 0) {
                    table[i] = Math.min(table[i], table[i - c] + 1);
                }
            }
        }
        return table[amount] == Integer.MAX_VALUE ? -1 : table[amount];
    }


    public static void main(String[] args) {
        int[] coins = {1, 5, 7};
        int amount = 10;
        System.out.println(minPath(amount, coins));

        System.out.println(0x80000000);
        System.out.println(0x7fffffff == 2147483647);
    }

}
