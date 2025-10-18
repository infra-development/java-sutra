package com.vidhyoday.ds.algo.udemy.ek.array.problems;

public class MaximumSumOfArray {
    public static void main(String[] args) {
        int[] arr = {-3, 4, -1, 7, -3};
        int sum1 = maximumSumSimple(arr);
        int sum2 = maximumSumImproved(arr);
        int sum3 = maximumSumBest(arr);
        int sum4 = maximumSumBestOther(arr);
        System.out.println("Maximum sum simple way O(n^3): "+sum1);
        System.out.println("Maximum sum improved O(n^2): "+sum2);
        System.out.println("Maximum sum best way O(n): "+sum3);
        System.out.println("Maximum sum best way O(n): "+sum4);
    }

    private static int maximumSumBest(int[] arr) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentMax + arr[i] > arr[i]) {
                currentMax  = currentMax + arr[i];
            } else {
                currentMax = arr[i];
            }

            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }
        return maxSoFar;
    }

    private static int maximumSumBestOther(int[] arr) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(currentMax + arr[i], arr[i]);
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }
        return maxSoFar;
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
