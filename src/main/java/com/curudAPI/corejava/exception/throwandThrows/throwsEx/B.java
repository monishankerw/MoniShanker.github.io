package org.example.corejava.exception.throwandThrows.throwsEx;


//Whether exception happen in method or not surrounding calling statement in try catch become mandatory if throws keyword is used.

public class B {
public static void test() throws Exception{
    int i=10/2;
    System.out.println(i);
}
}
