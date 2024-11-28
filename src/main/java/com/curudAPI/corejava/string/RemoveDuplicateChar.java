package org.example.corejava.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove duplicate characters  using Java 8 Streams.
public class RemoveDuplicateChar {
    public static void main(String[] args) {
       List<String>x = Arrays.asList("a","b","b","c","a");
        List<String>x1 = x.stream().distinct().collect(Collectors.toList());
        System.out.println(x1);
    }
}
