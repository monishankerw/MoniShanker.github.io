package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfEven {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7);
        List<Integer>sum= Collections.singletonList(nums.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum());
        System.out.println(sum);
    }
}
