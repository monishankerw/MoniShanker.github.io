package org.example.corejava.string;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "edcab";
        System.out.println(sortingString(s));
    }

    private static String sortingString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}