package org.example.corejava.java8.DefaultKeyword;

public class Main {
    public static void main(String[] args) {
        A a1 = (int x) ->
                System.out.println(x);

        a1.test(10);
        a1.test1();
        a1.test2();
    }
}
