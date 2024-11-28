package org.example.corejava.oops.constructor;

public class A {
    A() {
        System.out.println(1);
    }

    A(int x) {
        System.out.println(x);
    }

    A(int x, int y) {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A(1);
        A a3 = new A(1, 2);
    }
}
