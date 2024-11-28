package org.example.corejava.interview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6,4,3,1,5,7};
        Set<Integer>set=new HashSet<>();
        for (int num:arr){
            set.add(num);
        }


        System.out.println(set);
    }
}
//