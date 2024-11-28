package org.example.corejava.arrays.sorthingAlgorithm.bubbleSorting;

import java.util.Arrays;

public class BubbleSortJava8 {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2,8};
      int[] sortedArray=  Arrays.stream(arr)
                .sorted().toArray();
        System.out.println("Sorted Array:");
        Arrays.stream(sortedArray).forEach(e-> System.out.println(e+" "));
    }
}
