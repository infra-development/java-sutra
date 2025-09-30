package com.vidhyoday.ds.algo.udemy.ek.array.theory;

import java.util.Arrays;

public class ArrayCreation {
    public static void main(String[] args) {
        // Method 1: Declare and then allocate memory for 5 integers
        // Timespace complexity: O(n) (we are doing linear allocation of memory)
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Method 2: Declare, allocate memory and initialize
        // Timespace complexity: O(n) (compiler doing linear allocation of memory)
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr2));
    }
}
