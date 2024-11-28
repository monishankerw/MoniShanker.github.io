package org.example.corejava.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AccendingOrder {
    public static void main(String[] args) {
       List<String>list = Arrays.asList("fgh","abc","fde","req");
        System.out.println("Unsorted Order::"+list);
        Collections.sort(list);
        System.out.println("Accending Order::"+list);
    }
}
