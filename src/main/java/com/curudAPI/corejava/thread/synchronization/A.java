package org.example.corejava.thread.synchronization;

public class A {
    private int balance;

    public static void main(String[] args) {
        A a1 = new A();
        a1.account();
        System.out.println("Final Balance: " + a1.balance);
    }

    private void account() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                add();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                add();
            }
        });

        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    // Synchronized method to prevent data corruption
    private synchronized void add() {
        for (int i = 0; i < 1000; i++) {
            balance++;
        }
    }
}
