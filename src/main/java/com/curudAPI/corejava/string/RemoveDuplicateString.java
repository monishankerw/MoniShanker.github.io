package org.example.corejava.string;

//Remove duplicate characters from a string using Java 8 Streams.

import java.util.stream.Collectors;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "programmming";
        String res = str.chars().mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(res);
    }
    }
