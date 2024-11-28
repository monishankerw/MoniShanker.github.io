package org.example.corejava.collection.map.HashMap.logicQuestion;

/*
 Minimum Window Substring
Given two strings s and t of lengths m and n respectively, return
the minimum window substring of s such that every character in t
(including duplicates) is included in the window. If there is no such
substring, return the empty string ""
.
Input: s = "ADOBECODEBANC"
, t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A'
,
'B'
, and 'C' from string t.
 */



import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solution.minWindow(s, t);
        System.out.println(result); // Output: "BANC"
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> requiredCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            requiredCount.put(c, requiredCount.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowCount = new HashMap<>();
        int left = 0, right = 0, formed = 0;
        int minLength = Integer.MAX_VALUE;
        String minWindow = "";

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

            if (requiredCount.containsKey(c) &&
                windowCount.get(c).intValue() == requiredCount.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == requiredCount.size()) {
                c = s.charAt(left);
                
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minWindow = s.substring(left, right + 1);
                }

                windowCount.put(c, windowCount.get(c) - 1);
                if (requiredCount.containsKey(c) &&
                    windowCount.get(c).intValue() < requiredCount.get(c).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minWindow;
    }
}
