package org.example.corejava.interview;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 3, 7, 87, 4, 76};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + second);
        }
    }
}
