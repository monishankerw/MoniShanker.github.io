package org.example.corejava.java8.streamApi;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
ou can partition a list of integers into even and odd numbers using Java 8 streams by utilizing the Collectors.partitioningBy method.
 This method partitions the elements of the stream into two groups based on a predicate.
 */
public class PartitionEvenOdd {
    public static void main(String[] args) {
       List<Integer> numbers= Arrays.asList(1,3,2,4,5,4,7,8,6);
// Partitioning the list into even and odd numbers
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even Number:"+partitionedNumbers.get(true));
        System.out.println("Odd Number:"+partitionedNumbers.get(false));

    }
}
