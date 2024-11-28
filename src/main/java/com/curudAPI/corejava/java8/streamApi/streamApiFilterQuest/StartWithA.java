package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question: Use the Stream API to filter out all strings from a list that start with the letter 'a' and print them.
public class StartWithA {
    public static void main(String[] args) {
        List<String > x= Arrays.asList("Hello","apple","anop");
        List<String>x1=x.stream().filter(a->a.startsWith("a")).collect(Collectors.toList());
        System.out.println(x1);
    }
}
