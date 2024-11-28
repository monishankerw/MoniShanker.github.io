package org.example.corejava.collection.map.HashMap.logicQuestion;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOccurency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 4, 5, 6, 5, 4};
        Map<Integer, Integer> frequencyOcc = frequencyOcc(arr);
        System.out.println("Frequency Occurence:" + frequencyOcc);
    }

    private static Map<Integer, Integer> frequencyOcc(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}
