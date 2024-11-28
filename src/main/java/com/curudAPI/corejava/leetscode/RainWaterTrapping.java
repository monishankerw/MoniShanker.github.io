package org.example.corejava.leetscode;

public class RainWaterTrapping {

    public static void main(String[] args) {
        RainWaterTrapping solution = new RainWaterTrapping();

        // Example 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped water for height1: " + solution.trap(height1)); // Output: 6

        // Example 2
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped water for height2: " + solution.trap(height2)); // Output: 9
    }
        public int trap(int[] height) {
            if (height == null || height.length == 0) {
                return 0; // No water can be trapped if the array is empty
            }

            int left = 0, right = height.length - 1; // Initialize two pointers
            int leftMax = 0, rightMax = 0; // Initialize max height on both sides
            int waterTrapped = 0; // Variable to store the total trapped water

            while (left < right) {
                if (height[left] < height[right]) {
                    // Move the left pointer
                    if (height[left] >= leftMax) {
                        leftMax = height[left]; // Update leftMax
                    } else {
                        waterTrapped += leftMax - height[left]; // Water can be trapped
                    }
                    left++; // Move the left pointer to the right
                } else {
                    // Move the right pointer
                    if (height[right] >= rightMax) {
                        rightMax = height[right]; // Update rightMax
                    } else {
                        waterTrapped += rightMax - height[right]; // Water can be trapped
                    }
                    right--; // Move the right pointer to the left
                }
            }

            return waterTrapped; // Return the total water trapped
        }
    }



