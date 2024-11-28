package org.example.corejava.java8.streamApi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Streams can be created from various data sources like collections, arrays, or even from individual values.
public class CreateStream {
    public static void main(String[] args) {
        // Creating a stream from a list
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> streamFromList = list.stream();

        // Creating a stream from an array
        String[] array = {"a", "b", "c"};
        Stream<String> streamFromArray = Arrays.stream(array);

        // Creating a stream from individual values
        Stream<String> streamOfValues = Stream.of("a", "b", "c");
    }}
