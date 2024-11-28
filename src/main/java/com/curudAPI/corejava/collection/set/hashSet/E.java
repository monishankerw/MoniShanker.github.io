package org.example.corejava.collection.set.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E {
    public static void main(String[] args) {
        Set<Integer>a=new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer>b=new HashSet<>(Arrays.asList(2,3,4,5,7,8));
        System.out.println("Elements in a: " + a);
        System.out.println("Elements in b: " + b);

        //union
        Set<Integer>union=new HashSet<>(a);
        union.addAll(b);
        System.out.println("UNION:"+union);

        //intersection
        Set<Integer>intersection=new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("intersection:"+intersection);

        //SYMMETRIC DIFFERENCE
        Set<Integer>symmetricDifference=new HashSet<>(union);
        symmetricDifference.removeAll(intersection);
        System.out.println("symmetricDifference:"+symmetricDifference);




    }
}
