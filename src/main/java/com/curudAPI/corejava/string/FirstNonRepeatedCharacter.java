package org.example.corejava.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


//Write a Java program to find the first non-repeated character in a string using Java 8 Streams.


/*
Explanation
Convert the String to IntStream: str.chars() converts the string to an IntStream of characters.
Map each character to an object: mapToObj(c -> (char) c) maps each integer character to a Character object.
Group by characters and count occurrences: collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())) collects the characters into a LinkedHashMap with characters as keys and their counts as values. The LinkedHashMap maintains the insertion order.
Filter entries with a count of 1: entrySet().stream().filter(entry -> entry.getValue() == 1) filters the entries to keep only those with a count of 1.
Extract the first non-repeated character: map(Map.Entry::getKey).findFirst() maps the filtered entries to their keys (characters) and finds the first one.
Print the result: ifPresent prints the first non-repeated character if it exists.
 */
public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";

        Optional<Character> firstNonRepeated = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();

        firstNonRepeated.ifPresent(character -> System.out.println("First non-repeated character: " + character));
    }
}
