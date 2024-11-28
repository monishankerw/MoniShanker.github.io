package org.example.corejava.duplicateTypeCodingQuestion.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<Integer>removeDup= Arrays.asList(1,2,1,3,4,2,1,4,5,6,5,6);
   List<Integer>x    = removeDup.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove Duplicate Elements:"+x);
    }
}
