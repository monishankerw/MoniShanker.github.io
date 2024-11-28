package org.example.corejava.collection.map.HashMap.logicQuestion;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static int firstNonRepeating(int[] nums) {
        // HashMap to store frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the first non-repeating number
        for (int i = 0; i < nums.length; i++) {
            if (frequencyMap.get(nums[i]) == 1) {
                return i;
            }
        }

        // If no non-repeating number found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 2, 4};
        int[] nums2 = {3, 5, 3, 5, 2, 4, 4,2};

        System.out.println("First non-repeating index in nums1: " + firstNonRepeating(nums1)); // Output: 1
        System.out.println("First non-repeating index in nums2: " + firstNonRepeating(nums2)); // Output: 0
    }
}
