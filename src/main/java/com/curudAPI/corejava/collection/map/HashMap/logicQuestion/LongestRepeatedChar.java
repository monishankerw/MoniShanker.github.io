package org.example.corejava.collection.map.HashMap.logicQuestion;

/*
Longest Repeating Character
Replacement

You are given a string s and an integer k. You can choose any
character of the string and change it to any other uppercase
English character. You can perform this operation at most k times.
Return the length of the longest substring containing the same
letter you can get after performing the above operations.
Input: s = "ABAB"
, k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa
 */


import java.util.HashMap;
import java.util.Map;

public class LongestRepeatedChar {
    public static void main(String[] args) {
        LongestRepeatedChar longestRepeatedChar = new LongestRepeatedChar();
        String str = "ABAB";
        int k = 2;
        int maxLength = longestRepeatedChar.longestRepCha(str, k);
        System.out.println(maxLength); // Print the length of the longest substring
    }

    public int longestRepCha(String str, int k) {
        Map<Character, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) { // Fixed variable name from s to str
            char currentChar = str.charAt(right);
            countMap.put(currentChar, countMap.getOrDefault(currentChar, 0) + 1);

            maxCount = Math.max(maxCount, countMap.get(currentChar));

            // Window size is (right - left + 1)
            // Number of characters to replace is (window size - count of the most frequent character)
            if (right - left + 1 - maxCount > k) {
                char leftChar = str.charAt(left);
                countMap.put(leftChar, countMap.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}


