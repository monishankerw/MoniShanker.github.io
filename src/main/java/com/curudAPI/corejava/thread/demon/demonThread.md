1. What is Demon Thread?
A Demon Thread is a background service which run as a low priority thread 
and performs background operation like garbage collection.

Ex: If main thread runs with low memory then jvm calls garbage collector to destroyed useless objects so that 
number of bytes of free memory will improve so that main thread will continue its execution.

2. How can we check the demon nature of a thread?
using Daemon() method
public Boolean isDaemon()

3. How can we convert a normal thread into demon thread?
We can make a thread demon thread by using SetDemon() method of thread class.
public void SetDemon(Boolean b)
But changing demon nature is possible before starting of a thread only.
After starting a thread if we are trying to change the demon nature then we will get illegal thread start execution.


Here are some multiple-choice questions (MCQs) based on the concept of daemon threads in Java:

### MCQs

1. **What is a daemon thread in Java?**
    - A) A thread that is set to run at the highest priority
    - B) A background service thread that runs at low priority and performs background operations
    - C) A thread that runs forever without stopping
    - D) A thread that cannot be terminated

   **Answer**: B) A background service thread that runs at low priority and performs background operations

2. **Which of the following is an example of a daemon thread in Java?**
    - A) Main thread
    - B) User-defined thread
    - C) Garbage collector thread
    - D) Any thread created with `new Thread()`

   **Answer**: C) Garbage collector thread

3. **How can you check if a thread is a daemon thread?**
    - A) Using `isDaemon()` method
    - B) Using `isAlive()` method
    - C) Using `isBackground()` method
    - D) Using `getDaemon()` method

   **Answer**: A) Using `isDaemon()` method

4. **Which of the following methods is used to convert a normal thread into a daemon thread?**
    - A) `setDaemon(boolean b)`
    - B) `setPriority(int p)`
    - C) `setBackground(boolean b)`
    - D) `setThreadType(boolean b)`

   **Answer**: A) `setDaemon(boolean b)`

5. **When must a thread be converted to a daemon thread in order to avoid an `IllegalThreadStateException`?**
    - A) Before the thread is created
    - B) Before the thread starts running
    - C) After the thread starts running
    - D) After the thread completes execution

   **Answer**: B) Before the thread starts running

6. **What happens to daemon threads when the Java Virtual Machine (JVM) stops?**
    - A) Daemon threads continue running in the background.
    - B) Daemon threads are terminated immediately.
    - C) Daemon threads throw an exception and continue running.
    - D) Daemon threads finish their tasks and then terminate.

   **Answer**: B) Daemon threads are terminated immediately.

7. **What is the output of `isDaemon()` method if a thread is a user thread?**
    - A) `true`
    - B) `false`
    - C) `1`
    - D) `0`

   **Answer**: B) `false`

8. **Which of the following statements is true about daemon threads?**
    - A) Daemon threads are always created by the JVM and cannot be created by the user.
    - B) Daemon threads must always complete execution before the JVM terminates.
    - C) Daemon threads are used for background operations and terminate automatically when no user threads are running.
    - D) Daemon threads run at the highest priority in the JVM.

   **Answer**: C) Daemon threads are used for background operations and terminate automatically when no user threads are running.

9. **What will happen if we attempt to set a thread as a daemon after it has started?**
    - A) The thread will be successfully set as a daemon.
    - B) The daemon status of the thread will not change.
    - C) An `IllegalThreadStateException` will be thrown.
    - D) The thread will terminate immediately.

   **Answer**: C) An `IllegalThreadStateException` will be thrown.

10. **Which of the following methods can be used to start a thread after setting it as a daemon?**
    - A) `setDaemon()` method
    - B) `start()` method
    - C) `run()` method
    - D) `setBackground()` method

    **Answer**: B) `start()` method