package org.example.corejava.collection.map.HashMap.logicQuestion;

import java.util.*;

public class MostFrequentElements {
    public static List<Integer> findMostFrequentElements(int[] nums) {
        // HashMap to store frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int count : frequencyMap.values()) {
            if (count > maxFrequency) {
                maxFrequency = count;
            }
        }

        // Collect all elements with maximum frequency
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 2, 3, 4, 1, 5};
        int[] nums2 = {3, 1, 2, 2, 3, 4, 4, 2, 5,3};

        System.out.println("Most frequent elements in nums1: " + findMostFrequentElements(nums1)); // Output: [2]
        System.out.println("Most frequent elements in nums2: " + findMostFrequentElements(nums2)); // Output: [2, 3]
    }
}
