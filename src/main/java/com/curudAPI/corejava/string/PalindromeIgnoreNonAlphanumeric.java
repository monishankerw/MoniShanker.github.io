package org.example.corejava.string;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}