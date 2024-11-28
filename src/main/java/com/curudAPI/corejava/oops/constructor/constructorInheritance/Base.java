package org.example.corejava.oops.constructor.constructorInheritance;


//constructor call to super class must be the first statement in the constructor of the derived class.
public class Base {
    public static String s="superClass";
    public Base(){
        System.out.println("1");
    }
    public static class Derived extends Base{
        public Derived(){
            System.out.println("2");

        }

        public static void main(String[] args) {
            Derived obj=new Derived();
            System.out.println(5);
        }
    }
}
