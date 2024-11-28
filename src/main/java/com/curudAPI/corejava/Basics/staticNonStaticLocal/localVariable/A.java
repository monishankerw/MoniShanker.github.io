package org.example.corejava.Basics.staticNonStaticLocal.localVariable;

public class A {
    //local variable access within method or block and constructor.
    public void display(){
        int x=2;//local variable must be initialize if not initialize give error.
        System.out.println("Local Variable:"+x);
    }

    public static void main(String[] args) {
        A a=new A();
        a.display();
    }
}
