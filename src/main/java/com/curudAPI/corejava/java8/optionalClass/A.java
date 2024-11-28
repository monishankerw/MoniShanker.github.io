package org.example.corejava.java8.optionalClass;

import java.util.Optional;

public class A {
    int x=10;
    static A a;

    public static void main(String[] args) {
        Optional<A>a1=Optional.ofNullable(a);
        System.out.println(a1.isPresent());
        System.out.println(100);
    }
}
