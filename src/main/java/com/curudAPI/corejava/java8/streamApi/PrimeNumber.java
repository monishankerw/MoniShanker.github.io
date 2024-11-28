package org.example.corejava.java8.streamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Question: Implement a method using streams to return the first n prime numbers.
public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> primes = getPrimes(10);
        System.out.println(primes); // Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    }

    public static List<Integer> getPrimes(int n) {
        return IntStream.iterate(2, i -> i + 1)
                .filter(PrimeNumber::isPrime)
                .limit(n)
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
}
