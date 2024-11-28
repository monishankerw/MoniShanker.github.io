package org.example.corejava.string;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        String str = "aaabaccddee";
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}