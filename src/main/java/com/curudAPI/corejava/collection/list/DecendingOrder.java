package org.example.corejava.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DecendingOrder {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("abf","afd","acd","gbf");
        System.out.println("Unsorted Order::"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending Order::"+list);
    }
}
