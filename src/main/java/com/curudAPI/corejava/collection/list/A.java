package org.example.corejava.collection.list;

import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<String>x =Arrays.asList("a","b","a"," ","c","h");
        for (String k:x){
            System.out.println(k);
        }
    }
}
