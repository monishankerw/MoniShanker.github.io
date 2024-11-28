package org.example.corejava.oops.inheritance.singleLevel;

public class Two extends One{
    public void two(){
        System.out.println("Two");
    }

    public static void main(String[] args) {
        Two two =new Two();
        two.one();
        two.two();
    }
}
