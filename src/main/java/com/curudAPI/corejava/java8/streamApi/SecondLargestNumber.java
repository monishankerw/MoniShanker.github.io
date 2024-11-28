package org.example.corejava.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Question: Write a Java program to find the second largest number in a list using streams.
public class SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 10, 6);

        Optional<Integer> secondLargest = numbers.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();

        secondLargest.ifPresent(System.out::println); // Output: 8
    }
}