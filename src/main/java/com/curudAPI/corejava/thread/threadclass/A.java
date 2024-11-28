package org.example.corejava.thread.threadclass;

public class A extends Thread{
    @Override
    public void run() {
        for (int i=0;i<199;i++){
            System.out.println("Task1");
        }
    }

    public static void main(String[] args) {
        A a=new A();
        a.start();
        for (int i=0;i<122;i++){
            System.out.println("Task2");
        }
    }
}
