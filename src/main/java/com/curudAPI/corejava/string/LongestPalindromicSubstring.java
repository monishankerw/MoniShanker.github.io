package org.example.corejava.string;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Longest palindromic substring: " + longestPalindromicSubstring(str));
    }

    private static String longestPalindromicSubstring(String s) {
        if (s.isEmpty()) return "";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expandAroundCenter(s, i, i);
            String even = expandAroundCenter(s, i, i + 1);
            String max = odd.length() > even.length() ? odd : even;
            if (max.length() > longest.length()) {
                longest = max;
            }
        }
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}