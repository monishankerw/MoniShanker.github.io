package org.example.corejava.exception.customException;

public class CustomsException extends Exception{
    public CustomsException(String message){
        super(message);
    }
    public static class Test{
        public static void main(String[] args) {
            try{
                throw new CustomsException("Test");
            }catch (CustomsException customsException){
                System.out.println("expt:"+ customsException.getMessage());
            }
        }
    }
}
