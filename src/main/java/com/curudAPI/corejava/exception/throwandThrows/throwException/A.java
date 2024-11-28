package org.example.corejava.exception.throwandThrows.throwException;

public class A {
    public static void main(String[] args) {
        try{
            checkAge(15);
        }catch (Exception e){
            System.out.println("Caught Exception::"+e.getMessage());
        }
    }

    private static void checkAge(int age) throws Exception {

        if(age<18){
            throw new Exception("Age much be greate than 18 or 23");
        }else {
            System.out.println("Age is Valid");
        }
    }

}
