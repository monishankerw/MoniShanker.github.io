package org.example.corejava.string;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "unique";
        System.out.println("Unique characters: " + findUniqueCharacters(str));
    }

    private static String findUniqueCharacters(String str) {
        StringBuilder unique = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (unique.indexOf(String.valueOf(ch)) == -1) {
                unique.append(ch);
            }
        }
        return unique.toString();
    }
}