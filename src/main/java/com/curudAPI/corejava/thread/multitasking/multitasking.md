MultiTasking: Executing(ˈए᠎̮क्सिक्‍यूट्‌) server tasks simultaneously is concepts of Multitasking.
                          Two Types:
                            1. Process Based MultiTasking
                            2. Thread Based Multitasking
       Its main purpose to improve the performance of the system by readucing the response time.


       Process-Based Multitasking
       In process-based multitasking, each task runs in a separate process. This example runs multiple commands in parallel:


       import java.io.IOException;

       public class ProcessBasedMultitasking {
           public static void main(String[] args) {
               try {
                   // Create and start processes on macOS
                   Process process1 = Runtime.getRuntime().exec("open -a TextEdit");
                   Process process2 = Runtime.getRuntime().exec("open -a Calculator");

                   // Wait for processes to complete (if desired)
                   process1.waitFor();
                   process2.waitFor();

                   System.out.println("Both processes have finished execution.");
               } catch (IOException | InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }



       Thread-Based Multitasking
       In thread-based multitasking, multiple threads run within the same process. Here’s an example using threads:
class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

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

Q. What is the main purpose of multitasking?
Its main purpose is to improve the performance of the system by reducing the response time.



