package org.example.corejava.interview;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Initialize the result list to store all the rows of Pascal's triangle
        List<List<Integer>> result = new ArrayList<>();

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            // Create a new row for the current iteration
            List<Integer> row = new ArrayList<>();

            // First element of each row is always 1
            row.add(1);

            // Fill the row with appropriate values except the first and last which are always 1
            for (int j = 1; j < i; j++) {
                // Current element is the sum of two elements from the previous row
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }

            // If the row has more than 1 element, last element is always 1
            if (i > 0) {
                row.add(1);
            }


            // Add the current row to the result
            result.add(row);
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: numRows = 5
        System.out.println(solution.generate(5));

        // Test Case 2: numRows = 1
        System.out.println(solution.generate(1));
    }
}
