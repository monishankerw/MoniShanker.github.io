package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8);
     List<Integer>evenNumber=   number.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("Even Number::"+evenNumber);
    }
}
