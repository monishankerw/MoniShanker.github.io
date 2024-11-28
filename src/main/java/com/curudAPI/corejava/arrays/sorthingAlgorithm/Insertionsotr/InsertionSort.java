package org.example.corejava.arrays.sorthingAlgorithm.Insertionsotr;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        // Traverse through the array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // The current element to be inserted into the sorted sublist
            int j = i - 1;

            // Move elements of the sorted sublist that are greater than the key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert the key into its correct position in the sorted sublist
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {12, 11, 13, 5, 6};

        // Print the original array
        System.out.println("Original Array:");
        printArray(arr);

        // Perform insertion sort
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
