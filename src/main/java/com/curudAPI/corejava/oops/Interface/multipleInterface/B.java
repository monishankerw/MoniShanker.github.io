package org.example.corejava.oops.Interface.multipleInterface;

public interface B {
    public void test1();
    public static interface C{
        public void test2();
        public static class D implements B,C{

            @Override
            public void test1() {
                System.out.println(2);
            }

            @Override
            public void test2() {
                System.out.println(1);
            }

            public static void main(String[] args) {
                D d=new D();
                d.test1();
                d.test2();
            }
        }
    }
}
