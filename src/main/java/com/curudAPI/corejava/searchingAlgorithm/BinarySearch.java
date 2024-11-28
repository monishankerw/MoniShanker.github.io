package org.example.corejava.searchingAlgorithm;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            // If target is smaller, ignore the right half
            if (arr[mid] > target) {
                high = mid - 1;
            }
            // If target is larger, ignore the left half
            else {
                low = mid + 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}