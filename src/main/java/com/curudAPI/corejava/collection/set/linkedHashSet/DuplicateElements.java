package org.example.corejava.collection.set.linkedHashSet;

import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer>a=new ArrayList<>(Arrays.asList(1,2,3,5,1,2,3,5,4));
        System.out.println("Elements are:"+a);
        Set<Integer>set=new LinkedHashSet<>();
        set.addAll(a);
        a.clear();
        a.addAll(set);
        System.out.println("Remove Duplicate Elements:"+a);
    }
}
