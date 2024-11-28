package org.example.corejava.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of people objects, use streams to create a map where the key is the person's name and the value is the person's age.
public class Person1 {
    private int age;
    private String name;

    public Person1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Person1> people = Arrays.asList(
                new Person1(30, "Alice"),
                new Person1(25, "Bob"),
                new Person1(35, "Charlie")
        );

        Map<String, Integer> nameToAgeMap = people.stream()
                .collect(Collectors.toMap(person -> person.name, person -> person.age));

        System.out.println(nameToAgeMap);
    }
}
