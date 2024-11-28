package org.example.corejava.duplicateTypeCodingQuestion.collection.HashSet;
/*
     Remove duplicates from an array:
     Use a HashSet to store unique elements while iterating through the array.
      Convert the HashSet back to an array if needed.

 */


import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 5, 3, 8, 10, 15};

        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }
        System.out.println("Array removing duplicates:"+set);


        int[] uniqueNumbers = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueNumbers[index++] = num;
        }

        System.out.println("Array after removing duplicates:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}