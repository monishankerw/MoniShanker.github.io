package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.List;

public class SquareSumOfEvenNumber {
    public static void main(String[] args) {
        List<Integer>x= Arrays.asList(1,2,3,4,5,6);
//        int sumEven=x.stream().filter(n->n%2==0)
//                .mapToInt(n->n*n)
//                .sum();
//        System.out.println(sumEven);
        // Print even numbers
        System.out.println("Even numbers:");
        x.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // Print squares of even numbers
        System.out.println("Squares of even numbers:");
        x.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);

        // Calculate and print the sum of the squares of even numbers
        int sumEvenSquares = x.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println("Sum of squares of even numbers: " + sumEvenSquares);
    }
    }

