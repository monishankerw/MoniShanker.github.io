package org.example.corejava.java8.streamApi;

//Terminal operations produce a result or a side effect, such as collect(), forEach(), reduce(), etc. They are necessary to trigger the execution of the stream pipeline.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        List<Integer>sums= Collections.singletonList(list.stream().reduce(0, Integer::sum));
        System.out.println(sums);
    }
}
