package com.vidhyoday.java.sutra.algo.neetcode.array.hash;

public class ValidAnagrams {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t)); // Output: true

        String s2 = "rata";
        String t2 = "rat";
        System.out.println(isAnagram(s2, t2)); // Output: false
    }

    private static boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to count the frequency of each character
        int[] charCount = new int[26]; // Assuming only lowercase letters a-z

        // Count the characters in the first string
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Subtract the counts based on the second string
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return false; // More occurrences in t than in s
            }
        }

        return true; // All counts are zero, so they are anagrams
    }
}
