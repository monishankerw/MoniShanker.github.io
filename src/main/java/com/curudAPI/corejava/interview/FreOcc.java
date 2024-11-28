package org.example.corejava.interview;

import java.util.HashMap;
import java.util.Map;

public class FreOcc {
	public static void main(String[] args) {
		// Input array
		int arr[] = {1, 2, 3, 1, 23, 4, 2, 1, 2};

		// Get the frequency of occurrences
		Map<Integer, Integer> map = freqOccur(arr);

		// Print the result
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Number: " + entry.getKey() + " - Occurrences: " + entry.getValue());
		}
	}

	private static Map<Integer, Integer> freqOccur(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		// Count the occurrences of each number in the array
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		return map;
	}
}
