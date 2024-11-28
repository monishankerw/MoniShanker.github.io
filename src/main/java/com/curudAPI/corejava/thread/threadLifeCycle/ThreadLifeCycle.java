package org.example.corejava.thread.threadLifeCycle;

public class ThreadLifeCycle extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(500); // Pauses the thread briefly
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
        System.out.println("Thread is completing execution");
    }

    public static void main(String[] args) {
        ThreadLifeCycle threadLifeCycle = new ThreadLifeCycle();

        // Step 1: New state - Thread is created but not started
        System.out.println("State after creation: " + threadLifeCycle.getState()); // NEW

        // Step 2: Runnable state - Thread is started
        threadLifeCycle.start();
        System.out.println("State after starting: " + threadLifeCycle.getState()); // RUNNABLE

        // Step 3: Timed Waiting - Pausing the main thread briefly
        try {
            Thread.sleep(100); // Main thread is in TIMED_WAITING state
            System.out.println("State during sleep: " + threadLifeCycle.getState()); // RUNNABLE or TIMED_WAITING (if still sleeping)
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // Step 4: Wait for thread to finish and check Terminated state
        try {
            threadLifeCycle.join(); // Main thread waits for threadLifeCycle to finish
        } catch (InterruptedException e) {
            System.out.println("Join interrupted");
        }
        System.out.println("State after completion: " + threadLifeCycle.getState()); // TERMINATED
    }
}
