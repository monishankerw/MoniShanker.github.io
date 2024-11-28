package org.example.corejava.java8.streamApi.streamApiFilterQuest;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Terminal operations produce a result or a side effect, such as collect(), forEach(), reduce(), etc. They are necessary to trigger the execution of the stream pipeline.
public class StartingWith {
    public static void main(String[] args) {
        List<String> lists=Arrays.asList("abc","mno","qwe","asq","azs");
       List<String>x= lists.stream().filter(list->list.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(x);
    }
}
