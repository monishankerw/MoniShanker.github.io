package org.example.corejava.string;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations: " + generatePermutations(str));
    }

    private static List<String> generatePermutations(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        permute("", s, result);
        return result;
    }

    private static void permute(String prefix, String s, List<String> result) {
        int n = s.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1), result);
            }
        }
    }
}
