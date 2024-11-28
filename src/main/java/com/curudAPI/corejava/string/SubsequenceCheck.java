package org.example.corejava.string;

public class SubsequenceCheck {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";
        System.out.println("Is subsequence: " + isSubsequence(s1, s2));
    }

    private static boolean isSubsequence(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) == s2.charAt(index2)) {
                index1++;
            }
            index2++;
        }
        return index1 == s1.length();
    }
}