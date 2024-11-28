package org.example.corejava.java8.streamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "hello world";

        Map<Character, Long> characterCount = input.chars()       // Convert the string to an IntStream of characters
                .mapToObj(c -> (char) c)                          // Convert the IntStream to a Stream<Character>
                .collect(Collectors.groupingBy(                   // Group by each character
                        Function.identity(),                      // Use the character as the key
                        Collectors.counting()                     // Count the occurrences
                ));

        // Print the character counts
        characterCount.forEach((character, count) -> 
                System.out.println(character + ": " + count));
    }
}
