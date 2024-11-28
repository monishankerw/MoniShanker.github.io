package org.example.corejava.string;

public class ReplaceSubstring {
    public static void main(String[] args) {
        String str = "Hello World, Hello Java";
        String target = "Hello";
        String replacement = "Hi";
        System.out.println("Replaced string: " + replaceSubstring(str, target, replacement));
    }

    private static String replaceSubstring(String str, String target, String replacement) {
        return str.replace(target, replacement);
    }
}