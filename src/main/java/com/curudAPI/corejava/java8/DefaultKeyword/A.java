package org.example.corejava.java8.DefaultKeyword;
@FunctionalInterface
public interface A {
    public void test(int x);
    default void test1(){
        System.out.println(1);
    }
    default void test2(){
        System.out.println(2);
    }
}
