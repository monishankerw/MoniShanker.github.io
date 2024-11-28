package org.example.corejava.thread.multitasking.threadBased;

//Thread-Based Multitasking
//In thread-based multitasking.md, multiple threads run within the same process. Here’s an example using threads:

public class ThreadBasedMultitasking {
    public static void main(String[] args) {
        // Create and start threads
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        
        task1.start();
        task2.start();
        
        try {
            // Wait for threads to finish
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Both tasks have finished execution.");
    }
}