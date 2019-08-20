package com.kv.algorithm.day01;

public class PascalTriangle {
    /**
     *
     * @param row
     * @return specific row for the Pascal Triangle
     */
    static int[] compute(int row){

        if(row == 0){
            int[] zero = {1};
            return zero;
        }

        int[] one = {1,1};
        if(row == 1){
            return one;
        }

        int[] previous = one;

        for(int r = 2; r <= row; r++ ){

            int[] next = new int[r+1];
            next[0] = 1;

            for(int i = 1; i< r; i++){
                next[i] = previous[i -1]+previous[i];
            }
            next[r] = 1;
            previous = next;
        }
        return  previous;
    }

    public static void main(String[] args) {
        int rows = 5;
        int count = 5;
        for(int i =0; i<rows; i++){
            System.out.format("%1$"+count+"s","");
            count--;
            for(int j : compute(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
