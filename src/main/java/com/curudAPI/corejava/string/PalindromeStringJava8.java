package org.example.corejava.string;

public class PalindromeStringJava8 {
    public static void main(String[] args) {
        String str="madam";
       boolean isPalindrome= str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("Palindrome String::"+isPalindrome);
    }
}
