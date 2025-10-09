package com.vidhyoday.ds.algo.udemy.ek.array.problems;

public class MaximumSumOfArray {
    public static void main(String[] args) {
        int[] arr = {-3, 4, -1, 7, -3};
        int sum1 = maximumSumSimple(arr);
        int sum2 = maximumSumImproved(arr);
        int sum3 = maximumSumBest(arr);
        System.out.println("Maximum sum : "+sum1);
        System.out.println("Maximum sum : "+sum2);
        System.out.println("Maximum sum : "+sum3);
    }

    private static int maximumSumBest(int[] arr) {
        return 0;
    }

    private static int maximumSumImproved(int[] arr) {
        int maxSum = arr[0];
        for (int i =0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    private static int maximumSumSimple(int[] arr) {
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    if (maxSum < sum) {
                        maxSum = sum;
                    }

                }
            }
        }
        return maxSum;
    }
}
