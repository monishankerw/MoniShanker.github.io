package org.example.corejava.string;

public class PermutationString {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "";
        permun(s1, s2);
    }

    private static void permun(String s1, String s2) {
        if (s1.length() == 0) {
            System.out.print(s2 + " ");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i); // Get the character at index i
            String left_substr = s1.substring(0, i); // Get the left substring from the start to i (exclusive)
            String right_substr = s1.substring(i + 1); // Get the right substring from i+1 to the end
            String rest = left_substr + right_substr; // Combine the left and right substrings
            permun(rest, s2 + ch); // Recursive call with the new string and updated permutation
        }
    }
}
