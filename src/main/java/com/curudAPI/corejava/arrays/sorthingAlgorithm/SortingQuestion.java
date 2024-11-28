package org.example.corejava.arrays.sorthingAlgorithm;

public class SortingQuestion {
    public static class SortColors {
        public void sortColors(int[] nums) {
            int low = 0, mid = 0, high = nums.length - 1;

            System.out.println("Starting sortColors with array: ");
            printArray(nums); // Print initial state of the array

            while (mid <= high) {
                if (nums[mid] == 0) {
                    // Swap nums[low] and nums[mid]
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    System.out.println("Swapped 0: ");
                    printArray(nums); // Print state after swapping 0
                } else if (nums[mid] == 1) {
                    // If it's 1, move mid forward
                    mid++;
                    System.out.println("Moved past 1: ");
                    printArray(nums); // Print state after moving past 1
                } else { // nums[mid] == 2
                    // Swap nums[mid] and nums[high]
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    System.out.println("Swapped 2: ");
                    printArray(nums); // Print state after swapping 2
                }
            }

            System.out.println("Final sorted array: ");
            printArray(nums); // Print final sorted state
        }

        public static void main(String[] args) {
            SortColors solution = new SortColors();

            int[] nums = {2, 0, 2, 1, 1, 0}; // Example input
            System.out.println("Original array:");
            printArray(nums);
            System.out.println(); // Extra newline for better readability

            // Sort colors
            solution.sortColors(nums);
            System.out.println(); // Extra newline for better readability
        }

        // Helper method to print array
        public static void printArray(int[] nums) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println(); // Print newline after the array
        }
    }

}
