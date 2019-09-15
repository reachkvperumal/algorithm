package com.kv.algorithm.day11;

public class Intersection {

    static int[] compute(int[] inputA, int[] inputB) {
        int i = 0, j = 0;
        int[] aux = {};
        int counter = 0;
        while (i <= inputA.length - 1 && j <= inputB.length - 1) {
            if (inputA[i] < inputB[j])
                i++;
            else if (inputA[i] > inputB[j])
                j++;
            else {
                if (counter == 0) {
                    counter++;
                    aux = new int[counter];
                    aux[counter - 1] = inputB[j];
                } else {
                    int tmpValue = inputB[j];
                    boolean flag = false;
                    for (int e = 0; e < counter; e++) {
                        if (aux[e] == tmpValue) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        int temp = counter + 1;
                        int[] tmpArray = new int[temp];
                        for (int k = 0; k < counter; k++) {
                            tmpArray[k] = aux[k];
                        }
                        tmpArray[temp - 1] = inputB[j];
                        counter++;
                        aux = tmpArray;
                    }
                }
                i++;
                j++;
            }
        }

        for (int z : aux)
            System.out.print(z + " ");

        return aux;

    }

    public static void main(String[] args) {
        int[] a = {2, 3, 3, 5, 5, 6, 7, 7, 8, 12};
        int[] b = {5, 5, 6, 8, 8, 9, 10, 10};
        compute(a, b);
    }

}
