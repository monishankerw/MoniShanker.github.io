package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
You can filter a list of numbers to only include those greater than 10 and
 then find their average using Java 8 streams.
 */
public class FilterAndAverage {

    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(12,10,6,12,35,35,22,33);
       OptionalDouble number= num.stream().filter(n->n>10).mapToInt(x->x).average();
        System.out.println(number);
    }

}
