package org.example.corejava.oops.Interface.multipleInterface;

public interface A {
    public void test1();
    public static interface B{
        public void test2();
        public static interface C extends A,B{
            public void test3();
        }

    public static class D implements C {

        @Override
        public void test3() {

        }

        @Override
        public void test1() {

        }

        @Override
        public void test2() {

        }

        public static void main(String[] args) {
            D d=new D();
            d.test1();
            d.test2();
            d.test3();
        }
    }
    }
}
