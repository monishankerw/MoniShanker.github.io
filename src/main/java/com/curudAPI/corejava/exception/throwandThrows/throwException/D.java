package org.example.corejava.exception.throwandThrows.throwException;

public class D {
    public static void main(String[] args) {
        try{
            demoProc();
        }catch (NullPointerException e){
            System.out.println("ReCaught:::"+e);
        }
    }

    private static void demoProc() {
        try{
            throw new NullPointerException("demo");

        }catch (NullPointerException e){
            System.out.println("Cought inside demo proc>");
            throw e;
        }
    }
}
