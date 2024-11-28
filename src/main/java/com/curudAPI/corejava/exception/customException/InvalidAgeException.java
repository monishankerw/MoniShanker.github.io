package org.example.corejava.exception.customException;


public class InvalidAgeException extends Exception{
    private static Error e;
    private Message message;
    public InvalidAgeException(String message){
        super(message);
    }

    public static void main(String[] args) {
        try{
            int age=-5;
            if(age<0){
                throw new InvalidAgeException("Age can not be negative!!");
            }
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
