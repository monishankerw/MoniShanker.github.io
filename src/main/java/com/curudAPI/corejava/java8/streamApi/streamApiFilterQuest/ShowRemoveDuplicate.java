package org.example.corejava.java8.streamApi.streamApiFilterQuest;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class ShowRemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 1, 3, 4, 5, 6, 7, 8);
        Set<Integer> set = new HashSet<>();

        Set<Integer> remDuplicate = nums.stream()
                .filter(num -> !set.add(num))
                .collect(Collectors.toSet());

        System.out.println(remDuplicate); // Output: [1, 2, 3]
    }

}
