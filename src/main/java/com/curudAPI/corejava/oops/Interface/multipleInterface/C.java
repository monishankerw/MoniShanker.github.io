package org.example.corejava.oops.Interface.multipleInterface;

public interface C {
    public void test1();
    public static class D{
        public void test2(){
            System.out.println(2);
        }
        public static class E  extends D implements  C{

            @Override
            public void test1() {
                System.out.println(1);
            }

            public static void main(String[] args) {
                E e=new E();
                e.test1();
                e.test2();
            }
        }
    }
}
