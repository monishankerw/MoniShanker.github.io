package org.example.corejava.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndexOfFirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println("Index of first non-repeating character: " + indexOfFirstNonRepeatingChar(str));
    }

    private static int indexOfFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return str.indexOf(entry.getKey());
            }
        }
        return -1; // No unique character found
    }
}