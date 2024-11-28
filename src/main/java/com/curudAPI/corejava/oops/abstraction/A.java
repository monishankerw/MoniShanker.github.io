package org.example.corejava.oops.abstraction;

public abstract class A {
    int x = 10;

    public void test() {
        System.out.println(100);
    }

    public abstract void xyz();

    public static class B extends A {

        @Override
        public void xyz() {
            System.out.println(100);
        }

        public static void main(String[] args) {
            B b=new B();
            //A a=new A();
            b.test();
            System.out.println(b.x);
            b.xyz();
        }
    }
}