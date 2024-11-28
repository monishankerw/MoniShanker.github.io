package org.example.corejava.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest substring length: " + longestSubstringWithoutRepeating(str));
    }

    private static int longestSubstringWithoutRepeating(String s) {
        Set<Character> chars = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            while (chars.contains(s.charAt(right))) {
                chars.remove(s.charAt(left++));
            }
            chars.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}