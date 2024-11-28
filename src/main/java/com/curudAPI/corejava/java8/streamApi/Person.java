package org.example.corejava.java8.streamApi;

import java.util.*;
import java.util.stream.Collectors;

//10. Describe how you would sort a list of objects by a specific field using streams.
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(30, "Alice"),
                new Person(25, "Bob"),
                new Person(35, "Charlie")
        );
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparingInt(person -> person.age))
                .collect(Collectors.toList());

        sortedPeople.forEach(System.out::println);
    }
}