package org.example.corejava.string;

import java.util.stream.Collectors;

public class Reverse {
    public static void main(String[] args) {
        String str="reverse";
        String revString=revString(str);
        System.out.println("Revrse String::"+revString);
    }

    private static String revString(String str) {
        return new StringBuilder(
                str.chars()
                        .mapToObj(x -> (char) x)
                        .map(String::valueOf)
                        .collect(Collectors.joining()))
                .reverse()
                .toString();
    }
}
