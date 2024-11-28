package org.example.corejava.exception.throwandThrows.throwException;

public class C {
    public static void main(String[] args) {
        try{
            fun();
        }catch (NullPointerException e){
            System.out.println("Caugth in main:::");
        }
    }

    private static void fun() {
        try{
            throw  new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("Caught inside fun().");
            throw e;
        }
    }
}
