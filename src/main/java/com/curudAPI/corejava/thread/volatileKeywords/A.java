package org.example.corejava.thread.volatileKeywords;

//Volatile Keyword is used to modify the value of a variable by different threads
//It is also used to make classes thread safe.
//The volatile keyword can be used either with primitive type or object.
public class A {
    private volatile boolean isRunning = true;
//When a variable is used as a flag to indicate a state change (e.g., boolean isRunning)
    public void start() {  // Changed method to public to be accessible from main
        Thread x = new Thread(() -> {
            while (isRunning) {
                // Simulate work
            }
            System.out.println("Worker Stopped.");
        });
        x.start();
    }

    public void stop() {
        isRunning = false;
    }

    public static void main(String[] args) {
        A example = new A();
        example.start();  // Corrected to match the method name

        // Give the worker thread some time to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        example.stop(); // Corrected to match the method name
    }
}
