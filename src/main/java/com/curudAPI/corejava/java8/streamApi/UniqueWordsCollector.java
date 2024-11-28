package org.example.corejava.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueWordsCollector {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "hello world",
                "world of streams",
                "hello from the other side",
                "streams are powerful"
        );

        Set<String> uniqueWords = sentences.stream()
                .map(sentence -> sentence.split("\\s+")) // Split each sentence into words
                .flatMap(Arrays::stream)                // Flatten the stream of word arrays to a stream of words
                .map(String::toLowerCase)               // Optional: Convert words to lowercase for case-insensitive uniqueness
                .collect(Collectors.toSet());           // Collect the words into a Set for uniqueness

        // Print the unique words
        System.out.println(uniqueWords);
    }
}
