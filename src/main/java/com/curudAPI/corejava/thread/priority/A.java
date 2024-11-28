package org.example.corejava.thread.priority;

public class A extends Thread{
    public void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        A a=new A();
        a.start();
        a.setPriority(NORM_PRIORITY);
        System.out.println(a.getPriority());

        a.setPriority(MAX_PRIORITY);
        System.out.println(a.getPriority());

        a.setPriority(MIN_PRIORITY);
        System.out.println(a.getPriority());
    }
}
