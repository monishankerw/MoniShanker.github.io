package org.example.corejava.string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Reversed words: " + reverseEachWord(str));
    }

    private static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            reversed.append(wordBuilder.reverse().toString()).append(" ");
        }
        return reversed.toString().trim();
    }
}