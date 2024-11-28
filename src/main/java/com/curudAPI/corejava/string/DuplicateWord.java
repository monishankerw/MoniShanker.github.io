package org.example.corejava.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args) {
        String str = "This is new word is This new word";

        // Remove punctuation (except spaces) and convert to lower case
        String input = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = input.split("\\s+");

        // Use a HashMap to count the occurrences of each word
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Print the duplicate words
        System.out.println("Duplicate Words::::");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
