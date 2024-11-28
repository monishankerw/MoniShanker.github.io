package org.example.corejava.thread.outputQuestion.ThreadLifeCycle;


public class B extends Thread{
    public void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.getState());
        b.start();
        System.out.println(b.getState());
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(b.getState());
    }
}
