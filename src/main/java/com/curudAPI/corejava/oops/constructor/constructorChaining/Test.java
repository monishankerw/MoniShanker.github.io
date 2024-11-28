package org.example.corejava.oops.constructor.constructorChaining;

public class Test {
    public Test(){
        System.out.println("1");
        new Test(10);
        System.out.println("5");

    }
    public Test(int x){
        System.out.println("2");
        new Test(10,21);
        System.out.println("4");
    }
    public Test(int data,int temp){
        System.out.println("3");
    }

    public static void main(String[] args) {
        Test x=new  Test();
    }
}
