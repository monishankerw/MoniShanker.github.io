


/*
A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
 For example, 6 is a perfect number because its divisors (excluding 6 itself) are 1, 2, and 3, and 1 + 2 + 3 = 6.
 However, the number 48 that you're using is not a perfect number, so the result will always be false. Here's a small improvement in your code to clarify the output:

Display whether the number is perfect or not with a meaningful message.
Use a number that is actually a perfect number for testing (e.g., 6, 28, 496, etc.).
 */
package org.example.corejava.interview;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;  // Use a perfect number like 6, 28, or 496
        int sum = 0;

        // Loop to find the sum of proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }



        // Check if the number is perfect
        if (num == sum) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
/*
Explanation:
num = 28: I used 28, which is a perfect number.
The loop checks for divisors up to half of the number (num / 2).
If the sum of divisors equals the number, it prints that the number is perfect; otherwise, it prints that it's not.
You can change num to test other numbers (e.g., 6, 496, etc.).
 */
