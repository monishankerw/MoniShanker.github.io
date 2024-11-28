package org.example.corejava.exception.ExceptionTypes;
//dividing a number by zero
public class ArithmeticsException extends Throwable {
    public static void main(String[] args) {
        try{
            System.out.println("Testing..");
            int a=10,b=0,z;
            z=a/b;
            System.out.println(z);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("welcome");
    }
}
