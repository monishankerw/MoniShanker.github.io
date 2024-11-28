package org.example.corejava.collection.list;

import java.util.ArrayList;

public class D {
           public static void main(String[] args) {
               ArrayList<Integer>a=new ArrayList<>();
               //add method for integer arraylist
               a.add(1);
               a.add(2);
               // index is zero based
               a.add(1,3);
               a.add(2,4);
               System.out.println(a);
           }
       }