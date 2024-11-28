package org.example.corejava.collection.set.hashSet.logicquestion;
/*
 Longest Substring Without
Repeating Characters
Given a string s, find the length of the longest
substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc"
, with a length of 3.
 */


import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        String str = "abcabcbb";
        int maxLength = longestSubstring.longestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
    }

    public int longestSubstring(String str) {
        /*
 Set<Character> set: This HashSet is used to store characters of the current window.
 It helps in checking whether a character is repeated within the current window.
int left: This pointer indicates the start of the current window of characters.
int right: This pointer indicates the end of the current window of characters (inclusive).
int maxLength: This variable keeps track of the maximum length of substrings found that do not contain repeating characters.

         */
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        /*
        This loop continues as long as right is within the bounds of the string.
         The right pointer expands the window to include new characters.
         */
        while (right < str.length()) {

            /*
            If the character at the right pointer is not already in the set,
            it means the current substring is still unique.
            The character can be added to the current window.
             */
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);


                /*
                If the character at the right pointer is already in the set (i.e., the window contains a duplicate character):
set.remove(str.charAt(left)): Remove the character at the left pointer from the set. This is because the left pointer will move to the right, effectively shrinking the window from the left side.
left++: Move the left pointer to the right to shrink the window and remove the duplicate character, ensuring the substring is unique.
                 */
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
