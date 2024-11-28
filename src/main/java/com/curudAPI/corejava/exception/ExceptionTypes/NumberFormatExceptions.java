package org.example.corejava.exception.ExceptionTypes;

//When an invalid string to number conversion is done we get number format in the exception.
/*
 try{
            String x="122";
            int val=Integer.parseInt(x);
            System.out.println(val);
        }
         try{
            String x="122";
            float val=Float.parseFloat(x);
            System.out.println(val);
        }
         try{
            String x="true";
            boolean val=Boolean.parseBoolean(x);
            System.out.println(val);
        }
 */
public class NumberFormatExceptions {
    public static void main(String[] args) {
        try{
            String x="xyz";
            int val=Integer.parseInt(x);
            System.out.println(val);
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
        System.out.println("welcome");
    }
}
