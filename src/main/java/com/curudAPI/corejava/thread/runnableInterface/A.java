package org.example.corejava.thread.runnableInterface;

public class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 122; i++) {
            System.out.println("Task1");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);
        thread.start();
        for (int i = 0; i < 122; i++) {
            System.out.println("Task2");
        }
    }
}
