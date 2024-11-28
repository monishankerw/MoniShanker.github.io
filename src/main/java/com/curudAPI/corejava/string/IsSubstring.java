package org.example.corejava.string;

public class IsSubstring {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ell";
        System.out.println("Is substring: " + isSubstring(str1, str2));
    }

    private static boolean isSubstring(String str1, String str2) {
        return str1.contains(str2);
    }
}