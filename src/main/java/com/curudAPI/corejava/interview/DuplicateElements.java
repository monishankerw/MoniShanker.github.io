package org.example.corejava.interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 4, 5};

        // Use a Set to track unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!uniqueElements.contains(arr[i])) {
                uniqueElements.add(arr[i]);
                arr[j++] = arr[i];
            }
        }

        // Print the array without duplicates
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
