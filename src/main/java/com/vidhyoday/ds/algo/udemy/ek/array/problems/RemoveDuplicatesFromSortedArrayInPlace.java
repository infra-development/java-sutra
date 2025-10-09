package com.vidhyoday.ds.algo.udemy.ek.array.problems;

public class RemoveDuplicatesFromSortedArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5,5,5,5,5};
        int[] newArr = removeDuplicates(arr);
//        System.out.println("Length of array after removing duplicates: " + length);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    static int[] removeDuplicates(int[] arr) {
        int[] newArr = new int[10];
        int i = 0;
        newArr[0] = arr[0];
        for (int j=1; j< arr.length; j++) {
            if (newArr[i] != arr[j]) {
                i++;
                newArr[i] = arr[j];
            }
        }
        return newArr;
    }
}
