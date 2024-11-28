package org.example.corejava.oops.Interface;

public interface Bank {
    public void balance();
    public void transfer();
    public static class HDFCBank implements Bank{

        @Override
        public void balance() {
            System.out.println("Logic A");
        }

        @Override
        public void transfer() {
            System.out.println("Logic B");
        }
    }
    public static class ICICBank implements  Bank{

        @Override
        public void balance() {
            System.out.println("Logic C");
        }

        @Override
        public void transfer() {
            System.out.println("Logic D");
        }
    }
    public static class User{
        public static void main(String[] args) {
            HDFCBank bank=new HDFCBank();
            bank.balance();
            bank.transfer();
            ICICBank icicBank=new ICICBank();
            icicBank.balance();
            icicBank.transfer();
        }
    }
}
