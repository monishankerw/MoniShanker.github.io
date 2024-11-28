package org.example.corejava.string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        String s = "aabcddeff";
        Map<Character, Integer> x = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            x.put(ch, x.getOrDefault(ch, 0) + 1);
        }
        System.out.println(x);
    }
}