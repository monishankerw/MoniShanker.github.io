package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementsRemoves {
    public static void main(String[] args) {
        List<Integer> x=Arrays.asList(1,2,1,3,4,2,1);
       List<Integer>duplicateElemns= x.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicateElemns);
    }
}
