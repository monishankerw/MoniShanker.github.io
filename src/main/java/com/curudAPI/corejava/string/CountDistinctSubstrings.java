package org.example.corejava.string;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSubstrings {
    public static void main(String[] args) {
        String str = "banana";
        System.out

.println("Distinct substrings count: " + countDistinctSubstrings(str));
    }

    private static int countDistinctSubstrings(String s) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substrings.add(s.substring(i, j));
            }
        }
        return substrings.size();
    }
}