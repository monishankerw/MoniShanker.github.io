package org.example.corejava.string;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(findLongestUniqueSubstring(str));
    }

    private static int findLongestUniqueSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left++));
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}