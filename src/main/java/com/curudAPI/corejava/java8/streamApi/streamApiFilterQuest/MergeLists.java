package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
You can merge two lists of integers and remove duplicates using Java 8 streams
 */

public class MergeLists {
    public static void main(String[] args) {
       List<Integer> list1= Arrays.asList(1,2,4,2,5,6,9);
        List<Integer> list2= Arrays.asList(1,3,4,5,6,9,3);

       List<Integer>mergeList= Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(mergeList);
    }
}
