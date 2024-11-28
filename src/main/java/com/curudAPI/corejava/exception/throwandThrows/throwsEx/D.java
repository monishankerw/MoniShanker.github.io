package org.example.corejava.exception.throwandThrows.throwsEx;

public class D {
    public static void test() throws Exception,NullPointerException{
        int i=10/0;
        System.out.println(i);
    }

    public static void main(String[] args) {
        D d=new D();
        try{
            d.test();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
