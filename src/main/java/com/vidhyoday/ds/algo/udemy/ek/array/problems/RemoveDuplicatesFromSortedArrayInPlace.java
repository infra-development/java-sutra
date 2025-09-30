package com.vidhyoday.ds.algo.udemy.ek.array.problems;

public class RemoveDuplicatesFromSortedArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(arr);
        System.out.println("Length of array after removing duplicates: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j=1; j< arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
