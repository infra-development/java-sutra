package com.vidhyoday.ds.algo.udemy.ek.array.theory;

import java.util.Arrays;

public class TowDimensionalArray {
    public static void main(String[] args) {
        int[][] int2DArray = new int[2][2];
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        System.err.println(Arrays.deepToString(int2DArray));

        String[][] s2DArray = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(s2DArray));
    }
}
