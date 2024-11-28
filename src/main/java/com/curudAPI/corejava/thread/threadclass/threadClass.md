 Thread:
       MultiTasking done at program level is called as thread.
       -> Threads are light weight.
       -> Threads share same address space.
       -> Separate part of execution in program.
       ->Interthread communication is less expensive.
       -> Context switching between thread is low cost.

       Process
       -> A Process is a program is execution.
       ->Process are heavy weight.
       ->Process required Separate address space.
       ->Interthread communication is expensive.
       -> Context switching between thread is costly.

       ADVANTAGE OF THREAD:
       1. Thread can be utilized to free up the main thread.
       2. Thread can be used to breakup a task into smaller unit that can be executed concurrently.

       DISVANTAGE OF THREAD:
       1. When more threads, the code becomes difficult to debug and maintain.
       2. Thread creation put a load on the system memory and cpu.

       TWO types of created by using:
       1. extending the Thread Class.
       2. implementing the Runnable Interface.

       1. extending the Thread Class.
       -> Here we inherited run method from thread we override user defined class.
       -> To start run Thread we use start method of thread class.

       exp: 1
       public class A extends Thread{
           @Override
           public void run() {
               for(int i=0;i<899;i++){
                   System.out.println("Task1");
               }
           }

           public static void main(String[] args) {
               A a1=new A();
               a1.start();
               for (int i=0;i<788;i++){
                   System.out.println("Task2");
               }
           }
       }


       2. public class MultiThreadingDemo extends Thread{
           @Override
           public void run() {
               try{
                   System.out.println("Thread"+Thread.currentThread().getId()+"is running");
               }catch (Exception e){
                   System.out.println("Exception occurred");
               }
           }

           public static void main(String[] args) {
               for (int i=0;i<8;i++){
                   MultiThreadingDemo ob=new MultiThreadingDemo() ;
                   ob.start();
               }
           }
       }

       public class Test extends Thread{
           @Override
           public void run() {
               System.out.println("Test");
           }

           public static void main(String[] args) {
               Test test=new Test();
               test.run();
               test.start();
           }
       }Test
       Test

       public class ThreadExp extends Thread{
           @Override
           public void run() {
               System.out.println("Hello!!!!...");
           }

           public static void main(String[] args) {
               ThreadExp threadExp=new ThreadExp();
               threadExp.start();
               threadExp.stop();
               threadExp.start();
           }//Exception in thread "main" java.lang.IllegalThreadStateException
          // at java.base/java.lang.Thread.start
           //Thread cannot be started twice
       }

Here are some multiple-choice questions (MCQs) based on the information provided:

### 1. Which of the following statements is true about threads?
- A. Threads are heavyweight compared to processes.
- B. Threads require separate address spaces.
- C. Threads share the same address space.
- D. Threads have high context-switching costs.

**Answer:** C. Threads share the same address space.

### 2. What is one main advantage of using threads?
- A. Threads are always easier to debug than single-threaded programs.
- B. Threads allow tasks to be broken down and executed concurrently.
- C. Threads require less memory and CPU resources than processes.
- D. Threads always run independently of each other.

**Answer:** B. Threads allow tasks to be broken down and executed concurrently.

### 3. In Java, which of the following methods starts the execution of a thread?
- A. `run()`
- B. `execute()`
- C. `start()`
- D. `init()`

**Answer:** C. `start()`

### 4. Which of the following is NOT true about processes?
- A. Processes are heavyweight.
- B. Processes require separate address spaces.
- C. Inter-process communication is inexpensive.
- D. Context switching between processes is costly.

**Answer:** C. Inter-process communication is inexpensive.

### 5. Which of the following will happen if you try to start a thread more than once?
- A. The thread will restart successfully.
- B. The thread will wait in a queue to start again.
- C. An `IllegalThreadStateException` will be thrown.
- D. The thread will stop automatically.

**Answer:** C. An `IllegalThreadStateException` will be thrown.

### 6. Which of the following ways can be used to create a thread in Java?
- A. Extending the `Thread` class.
- B. Implementing the `Runnable` interface.
- C. Extending the `Runnable` class.
- D. Both A and B.

**Answer:** D. Both A and B.

### 7. What is the disadvantage of creating too many threads?
- A. It reduces debugging and maintenance complexity.
- B. It makes the code easier to read and maintain.
- C. It puts a load on system memory and CPU.
- D. It uses less memory than a process.

**Answer:** C. It puts a load on system memory and CPU.

### 8. Which method is overridden when extending the `Thread` class in Java?
- A. `execute()`
- B. `run()`
- C. `init()`
- D. `start()`

**Answer:** B. `run()`

