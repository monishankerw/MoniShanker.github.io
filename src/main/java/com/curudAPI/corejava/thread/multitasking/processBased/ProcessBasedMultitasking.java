package org.example.corejava.thread.multitasking.processBased;

import java.io.IOException;


//Process-Based Multitasking
//In process-based multitasking.md, each task runs in a separate process. This example runs multiple commands in parallel:


public class ProcessBasedMultitasking {

    public static void main(String[] args) {
        try {
            Process process1 = Runtime.getRuntime().exec("open -a TextEdit");
            Process process2 = Runtime.getRuntime().exec("open -a Calculator");
            process1.waitFor();
            process2.waitFor();
            System.out.println("Both Task finised ::");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
