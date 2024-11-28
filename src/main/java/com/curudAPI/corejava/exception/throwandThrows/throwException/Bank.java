package org.example.corejava.exception.throwandThrows.throwException;

public class Bank {
    public static void main(String[] args) {
        int balance=5000,amount=10000;
        if(amount>balance){
            try{
                throw new InsufficientFunds();
            }catch (InsufficientFunds e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("Collect Funds!!");
        }
    }
}
