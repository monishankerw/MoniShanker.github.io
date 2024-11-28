package org.example.corejava.duplicateTypeCodingQuestion.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<String>x=new ArrayList<>();
        x.add("a");
        x.add("b");
        x.add("c");
        x.add("a");
        x.add("b");
        x.add("a");
        System.out.println("All Elements:"+x);
       List<String> x1= x.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove Duplicate:"+x1);
    }
}
