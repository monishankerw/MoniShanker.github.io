package org.example.corejava.leetscode;

public class RemoveDuplicates {
public static int removeDuplicates(int[] nums) {
// If the array is empty, return 0
if (nums.length == 0) return 0;

         
// Start j at 1 since the first element is always unique
        int j = 1;

      
  // Traverse the array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];  // Move it to the position j
                j++;  // Increment j for the next unique element
            }
        }

     
   // Return the number of unique elements
        return j;
    }

  
  public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int result1 = removeDuplicates(nums1);
        System.out.println("Output: " + result1 + ", nums = " + java.util.Arrays.toString(nums1));

       
 int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result2 = removeDuplicates(nums2);
        System.out.println("Output: " + result2 + ", nums = " + java.util.Arrays.toString(nums2));
    }
}