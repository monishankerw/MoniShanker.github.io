package org.example.corejava.exception.throwandThrows.throwException;
//Throwing unchecked Exception

public class B {
    public static void main(String[] args) {
        validateAge(12);
        System.out.println("abc");
    }

    private static void validateAge(int i) {
        if(i<19) {
            throw new ArithmeticException("Not Eligible ");
        }else{
            System.out.println("Eligible");





        }
    }
}

