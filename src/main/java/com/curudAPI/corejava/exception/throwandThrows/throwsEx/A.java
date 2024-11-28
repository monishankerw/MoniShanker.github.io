package org.example.corejava.exception.throwandThrows.throwsEx;

//Throws keyword written down in the front of method.
//Throws keyword can not be written down in the front of variable and class.
public class A {
    public static void test() throws Exception{
        int i=10/0;
    }

    public static void main(String[] args) {
        A a1=new A();
        try{
            a1.test();
        }catch (Exception e){
            System.out.println(e);

        }
    }
}
