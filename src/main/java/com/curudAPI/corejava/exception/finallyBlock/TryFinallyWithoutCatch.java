package org.example.corejava.exception.finallyBlock;

public class TryFinallyWithoutCatch {
    int i=10;

    public static void main(String[] args) {
        try{
            Integer.parseInt("xyz");
        }finally {
            System.out.println(1);
        }
        System.out.println(2);
    }
}
