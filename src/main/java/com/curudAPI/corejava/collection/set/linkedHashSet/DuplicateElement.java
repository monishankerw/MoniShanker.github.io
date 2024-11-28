package org.example.corejava.collection.set.linkedHashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        String str = "JavaDeveloper";
        int r = 0;
        char[] x = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (x[i] == x[j]) {
                    System.out.print(x[j]);
                    r++;
                    break;
                }
            }
        }
    }
}