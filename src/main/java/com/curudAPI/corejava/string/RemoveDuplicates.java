package org.example.corejava.string;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbccdef";
        System.out.println("String without duplicates: " + removeDuplicates(str));
    }

    private static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}