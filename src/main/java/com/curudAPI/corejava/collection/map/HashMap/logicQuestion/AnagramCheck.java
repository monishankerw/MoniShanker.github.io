package org.example.corejava.collection.map.HashMap.logicQuestion;

/*

Given two strings s and t, return true if t is an anagram of s, and
false otherwise.
An Anagram is a word or phrase formed by rearranging the letters
of a different word or phrase, typically using all the original letters
exactly once.
Input: s = "anagram"
, t = "nagaram"
Output: true
Input: s = "rat"
, t = "car"
Output: false
 */


/*
sol
Approach
Character Count Comparison: Use hash maps to count the frequency of characters in both strings and compare these counts.
Sorting Approach: Sort both strings and check if they are identical.
Method 1: Character Count Comparison
Count Frequencies: Use two hash maps to count the frequency of each character in both strings.
Compare Maps: Check if both hash maps are identical.
Method 2: Sorting
Sort Strings: Sort both strings.
Compare Strings: Check if the sorted versions of both strings are identical.
 */




import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {
        AnagramCheck check = new AnagramCheck();
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(check.isAnagram(s1, t1)); // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(check.isAnagram(s2, t2)); // Output: false
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countMapS = new HashMap<>();
        Map<Character, Integer> countMapT = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMapS.put(c, countMapS.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            countMapT.put(c, countMapT.getOrDefault(c, 0) + 1);
        }

        return countMapS.equals(countMapT);
    }
}
