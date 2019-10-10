package com.kv.algorithm.Day19;

public class RecursionTutorial {

    static int square(int n) {
        if (n == 0)
            return 0;
        else {
            int i = square(n - 1) + (2 * n) - 1;
            System.out.printf("N = %d, N - 1 = %d, 2 * N = %d, Ouput = %d, Value I = %d%n", n, n - 1, 2 * n, (n - 1) + (2 * n) - 1, i);

            return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(square(5));
    }

}
