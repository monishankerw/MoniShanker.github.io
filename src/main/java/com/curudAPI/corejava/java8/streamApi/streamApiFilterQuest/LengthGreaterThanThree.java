package org.example.corejava.java8.streamApi.streamApiFilterQuest;

import java.util.Arrays;
import java.util.List;

public class LengthGreaterThanThree {
    public static void main(String[] args) {
        List<String> strings=Arrays.asList("mnop","pwerr","qwe","sa","wqsder");
        long count=strings.stream().filter(s -> s.length()>4).count();
        System.out.println(count);
    }
}
