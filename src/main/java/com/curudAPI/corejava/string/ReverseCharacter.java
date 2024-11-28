package org.example.corejava.string;

public class ReverseCharacter {
    public static void main(String[] args) {

        char[] chars = {'a', 'd', 'q', 'p', 'e'};
        reverseChars(chars);

        // Print the array in the desired format
        System.out.print("{");
        for (int i = 0; i < chars.length; i++) {
            System.out.print("'" + chars[i] + "'");
            if (i < chars.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    private static void reverseChars(char[] chars) {
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
