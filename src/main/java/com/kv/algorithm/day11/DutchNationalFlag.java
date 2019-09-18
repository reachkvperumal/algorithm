package com.kv.algorithm.day11;

public class DutchNationalFlag {
    public static void dutch_flag_sort(char[] balls) {
        int size = balls.length;
        int start = 0;
        int end = size - 1;
        int mid = 0;
        char tmp = '\0';
        while (mid <= end) {
            switch (balls[mid]) {
                case 'R': {
                    tmp = balls[start];
                    balls[start] = balls[mid];
                    balls[mid] = tmp;
                    start++;
                    mid++;
                    break;
                }
                case 'G': {
                    mid++;
                    break;
                }
                case 'B': {
                    tmp = balls[mid];
                    balls[mid] = balls[end];
                    balls[end] = tmp;
                    end--;
                    break;
                }
            }
        }
    }


}
