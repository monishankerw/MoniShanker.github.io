package org.example.corejava.java8.streamApi.streamApiFilterQuest;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Intermediate operations are those that return a stream, allowing method chaining. Common intermediate operations include filter(), map(), sorted(), etc.
public class IntermidateOperation {
    public static void main(String[] args) {
        List<Integer>list =Arrays.asList(1,2,3,4,5,6);
        List<Integer>evenSqare=list.stream().filter(x->x%2==0)
                .map(x->x*x)
                .collect(Collectors.toList());
        System.out.println(evenSqare);
    }
}
