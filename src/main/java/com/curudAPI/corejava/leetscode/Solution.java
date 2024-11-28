package org.example.corejava.leetscode;

class CountNumbersWithUniqueDigits {
    // Function to count numbers with unique digits
    public int countNumbersWithUniqueDigits(int n) {
        // Base case: If n == 0, there's only one number (0)
        if (n == 0) {
            return 1;
        }

        // Initialize the result for n = 1
        int result = 10; // There are 10 unique numbers for n = 1 (0 through 9)
        int uniqueDigits = 9; // 9 options for the first digit (1-9)
        int availableDigits = 9; // 9 remaining digits for the second digit

        // For n = 2 to n, calculate the number of unique-digit numbers
        for (int i = 2; i <= n && availableDigits > 0; i++) {
            uniqueDigits = uniqueDigits * availableDigits; // Multiply by available digits
            result += uniqueDigits; // Add to the total result
            availableDigits--; // Decrease the available digits for the next place
        }

        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        CountNumbersWithUniqueDigits solution = new CountNumbersWithUniqueDigits();

        // Test case 1
        int n1 = 2;
        System.out.println("Input: " + n1);
        System.out.println("Output: " + solution.countNumbersWithUniqueDigits(n1)); // Expected: 91

        // Test case 2
        int n2 = 3;
        System.out.println("Input: " + n2);
        System.out.println("Output: " + solution.countNumbersWithUniqueDigits(n2)); // Expected: 739

        // Test case 3
        int n3 = 1;
        System.out.println("Input: " + n3);
        System.out.println("Output: " + solution.countNumbersWithUniqueDigits(n3)); // Expected: 10

        // Test case 4
        int n4 = 0;
        System.out.println("Input: " + n4);
        System.out.println("Output: " + solution.countNumbersWithUniqueDigits(n4)); // Expected: 1
    }
}
