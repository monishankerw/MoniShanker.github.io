package org.example.corejava.java8.DefaultKeyword;

@FunctionalInterface
public interface B {
    public int add(int x, int y);

    default void add(int x, int y, int z) {
        System.out.println("SUM: " + (x + y + z));
    }

    default void multiply(int x, int y, int z) {
        System.out.println("MULTIPLY: " + (x * y * z));
    }
}
