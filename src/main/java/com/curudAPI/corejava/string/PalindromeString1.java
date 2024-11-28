package org.example.corejava.string;

public class PalindromeString1 {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();

        String result = str.equals(rev) ? "Palindrome String" : "Not Palindrome String";
        System.out.println(result);
    }
}