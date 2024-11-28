Here's a comprehensive overview of the Java thread life cycle, focusing on the key concepts and methods involved:

### **Thread Life Cycle in Java**

1. **New State**
   - **Description**: When a thread is created, it's in the new state. The thread hasn’t started executing yet.
   - **Code Example**: `Thread t = new Thread();`

2. **Active State**
   - **Description**: After calling the `start()` method, the thread moves to the active state. It includes two sub-states:
     - **Runnable**: The thread is ready to run and waiting for CPU time. The thread is in this state if it's ready to run but not yet running.
     - **Running**: The thread is actively executing.
   - **Thread Scheduler**: The Java component that decides which thread gets CPU time.
   - **Code Example**:
     ```java
     t.start(); // Moves thread to Runnable state
     ```

3. **Blocked/Waiting State**
   - **Description**: A thread enters this state when it is waiting for a resource or another thread to perform a particular action.
   - **Causes**:
     - **Blocked**: Waiting for a monitor lock.
     - **Waiting**: Calling `wait()`, `join()`, or `sleep()` methods.
   - **Code Example**:
     ```java
     synchronized(object) {
        t.wait(); // Thread waits here
     }
     ```

4. **Timed Waiting State**
   - **Description**: The thread is waiting for another thread to perform an action, but with a specified waiting time.
   - **Code Example**:
     ```java
     t.sleep(5000); // Wait for 5 seconds
     ```

5. **Terminated State**
   - **Description**: The thread has completed its execution.
   - **Causes**:
     - Normal termination after completing the task.
     - **Abnormal Termination**: Due to an exception or error.
   - **Code Example**:
     ```java
     System.out.println("Thread is terminated");
     ```

### **Thread Methods**

1. **`yield()` Method**
   - **Description**: Causes the currently executing thread to pause and allow other threads of the same or higher priority to execute.
   - **Behavior**: The yielded thread goes back to the runnable state, but it's up to the thread scheduler to decide when it will run again.

2. **`join()` Method**
   - **Description**: Waits for a thread to die. If `t1` calls `t2.join()`, `t1` will wait until `t2` finishes.
   - **Code Example**:
     ```java
     t2.join(); // t1 waits until t2 finishes
     ```

3. **`sleep()` Method**
   - **Description**: Causes the thread to sleep for the specified time.
   - **Code Example**:
     ```java
     Thread.sleep(1000); // Sleep for 1 second
     ```

4. **`wait()` Method**
   - **Description**: Makes the current thread wait until another thread calls `notify()` or `notifyAll()` on the same object.
   - **Code Example**:
     ```java
     synchronized(object) {
        object.wait(); // Wait for notify()
     }
     ```

5. **`notify()` and `notifyAll()` Methods**
   - **`notify()`**: Wakes up one thread waiting on the object's monitor.
   - **`notifyAll()`**: Wakes up all the threads waiting on the object's monitor.
   - **Code Example**:
     ```java
     synchronized(object) {
        object.notify(); // Wakes up one waiting thread
     }
     ```

### **Key Concepts**

- **Thread Scheduler**: Determines the order of thread execution.
- **Thread Communication**: Achieved through `wait()`, `notify()`, and `notifyAll()` methods.
- **Deadlock**: Occurs when two or more threads are blocked forever, waiting for each other.

### **Example of Thread Life Cycle**

```java
public class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();
        System.out.println(thread.getState()); // NEW
        thread.start();
        System.out.println(thread.getState()); // RUNNABLE

        try {
            Thread.sleep(1000); // Wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getState()); // TERMINATED
    }
}
```

This example demonstrates how a thread transitions through different states, from creation to termination.