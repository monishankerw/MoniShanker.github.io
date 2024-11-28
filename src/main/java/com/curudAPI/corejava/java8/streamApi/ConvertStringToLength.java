package org.example.corejava.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//7. How would you convert a stream of strings to a list of integers representing their lengths?
public class ConvertStringToLength {
    public static void main(String[] args) {
        List<String> x= Arrays.asList("Hellow","length","main");
       List<Integer>x2= x.stream().map(String::length).collect(Collectors.toList());
        System.out.println(x2);

    }
}
