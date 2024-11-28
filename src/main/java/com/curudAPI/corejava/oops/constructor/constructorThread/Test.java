package org.example.corejava.oops.constructor.constructorThread;

public class Test implements Runnable {

    // Constructor with sleep inside a try-catch block
    public Test() {
        try {
            Thread.sleep(5000);  // Pauses the constructor for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread Running:");
    }

    public static void main(String[] args) {
        Test test = new Test(); // Constructor will pause here for 5 seconds
        Thread thread = new Thread(test);
        thread.start();
        System.out.println("abc");
    }
}
