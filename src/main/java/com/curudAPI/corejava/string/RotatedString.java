package org.example.corejava.string;

public class RotatedString {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        System.out.println("Is rotated: " + isRotated(str1, str2));
    }

    private static boolean isRotated(String str1, String str2) {
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }
}