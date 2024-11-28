package org.example.corejava.oops.Interface;

public interface A {
    public void test();

    public static class B implements A{

        @Override
        public void test() {
            System.out.println(100);
        }

        public static void main(String[] args) {
            B b=new B();
            b.test();
        }
    }
}
