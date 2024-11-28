package org.example.corejava.thread.threadclass;

public class B extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread" + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception Occurs" + e);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 122; i++) {
            System.out.println("Task2");
            B b = new B();
            b.start();
        }
    }
}
