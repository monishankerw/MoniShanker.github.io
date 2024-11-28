package org.example.corejava.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
java 8 coding....
 */
public class StartWith {
    public static void main(String[] args) {
       List<String> str= Arrays.asList("Reflection","Relex","testing","Rose","apple");
    List<String>x=   str.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
        System.out.println("Enter a string:"+x);
    }
}
