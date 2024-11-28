package org.example.corejava.exception.throwandThrows.throwsEx;

//Whether, It is printing from B because exception handle by the program but exception give jvm to main jvn will not happen.

public class C {
    public static void test() throws Exception{
        int i=10/0;
    }

    public static void main(String[] args) {
        C c=new C();
        try {
            c.test();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("From Main::");
    }
}
