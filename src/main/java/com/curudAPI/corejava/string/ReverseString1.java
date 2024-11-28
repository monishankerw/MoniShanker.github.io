package org.example.corejava.string;

public class ReverseString1 {
    public static void main(String[] args) {
        String str = "testing";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse String: " + rev);
    }
}
