package com.vidhyoday.java.sutra.algo.neetcode.array.hash;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2)); // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums3)); // Output: true
    }

    private static boolean containsDuplicate(int[] nums3) {
        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int num : nums3) {
            // If the number is already in the set, return true
            if (set.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            set.add(num);
        }

        // If no duplicates were found, return false
        return false;
    }
}
