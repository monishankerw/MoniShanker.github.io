package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfEvenOrOdd {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> sum = Collections.singletonList(list.stream().filter(x -> x % 2 == 0)
                .reduce(0, (ans, i) -> (ans + i)));
        System.out.println(sum);
    }
}
