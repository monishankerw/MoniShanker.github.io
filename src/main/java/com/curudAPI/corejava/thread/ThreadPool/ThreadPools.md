Here is the information in Markdown format:

```markdown
# Thread Pool in Java

## 1. What is a Thread Pool?
- A **thread pool** is a collection of pre-created threads that handle tasks. Using threads for multitasking gives users the impression that tasks are being processed simultaneously.
- A thread pool is essentially a pool of already created threads that are ready to execute tasks as they come in.
- The thread pool framework in Java is also known as the **executor framework**.

## 2. What is a Fixed Thread Pool, and How is it Created?
- A **fixed thread pool** has a predetermined number of threads.
- You can create a fixed thread pool in Java using `Executors.newFixedThreadPool(int n)`, where `n` is the number of threads.
  
  ```java
  ExecutorService pool = Executors.newFixedThreadPool(3);
  ```

This code creates a pool with 3 threads, meaning only 3 tasks can run at the same time, while other tasks wait in line.

## 3. How Does a Thread Pool Help Prevent an Application from Hanging or Crashing?
- A thread pool limits the number of threads created at any given time, preventing resource overload.
- If more tasks come in than the pool can handle, they are placed in a queue and processed one by one, maintaining application stability.

  **Example**: In a restaurant, if more customers arrive than there are waiters, the extra customers wait in line until a waiter is free, helping the restaurant manage resources effectively and avoid chaos.

## 4. How Does a Thread Pool Reduce the Overhead of Thread Creation?
- Thread pools reduce the **overhead of thread creation** by reusing a set of threads for multiple tasks.
- Without a thread pool, each task would require creating a new thread, which consumes time and system resources.
- By maintaining a pool of reusable threads, the pool minimizes the costly operations associated with creating and destroying threads repeatedly.

## 5. How Does a Thread Pool Enable Loosely Coupled Design?
- A thread pool separates the task creation from task execution. Developers submit tasks to the pool, and it manages their execution, allowing for a more modular and loosely coupled design.

  **Example**: A manager (task creator) assigns tasks to available waiters (thread pool) instead of hiring and managing each waiter directly. This separation keeps the manager’s role distinct from the actual serving work.
```
```
Here are some multiple-choice questions (MCQs) based on the concept of thread pools in Java:

### MCQs

1. **What is a thread pool in Java?**
    - A) A collection of tasks that are waiting to be executed.
    - B) A set of threads created to manage memory allocation.
    - C) A collection of pre-created threads that handle tasks as they come in.
    - D) A framework that handles database connections.

   **Answer**: C) A collection of pre-created threads that handle tasks as they come in.

2. **What is the main advantage of using a thread pool?**
    - A) It reduces the cost of repeatedly creating and destroying threads.
    - B) It increases the total number of threads indefinitely.
    - C) It limits the number of tasks an application can perform.
    - D) It prevents tasks from waiting in a queue.

   **Answer**: A) It reduces the cost of repeatedly creating and destroying threads.

3. **How do you create a fixed thread pool in Java?**
    - A) `ExecutorService pool = new ThreadPool(3);`
    - B) `ExecutorService pool = Executors.newFixedThreadPool(3);`
    - C) `ExecutorService pool = Thread.newFixedThreadPool(3);`
    - D) `ExecutorService pool = Executors.newCachedThreadPool();`

   **Answer**: B) `ExecutorService pool = Executors.newFixedThreadPool(3);`

4. **How does a fixed thread pool improve application stability?**
    - A) By allowing unlimited threads to be created for tasks.
    - B) By limiting the number of threads created at a time and queuing additional tasks.
    - C) By executing tasks in a random order to save resources.
    - D) By preventing tasks from waiting in the queue.

   **Answer**: B) By limiting the number of threads created at a time and queuing additional tasks.

5. **What is the relationship between task creation and task execution in a thread pool?**
    - A) They are tightly coupled, and both are managed by the thread pool.
    - B) Task creation is managed by the application, while execution is managed by the thread pool.
    - C) Task execution always happens before task creation.
    - D) Both are managed entirely by the developer without help from the thread pool.

   **Answer**: B) Task creation is managed by the application, while execution is managed by the thread pool.

6. **Which of the following describes a scenario where a thread pool is beneficial?**
    - A) A situation where a few tasks require immediate execution without waiting.
    - B) An application where tasks are independent and short-lived.
    - C) A system where tasks are numerous and might overwhelm resources if run concurrently.
    - D) A system that processes a single task at a time.

   **Answer**: C) A system where tasks are numerous and might overwhelm resources if run concurrently.

7. **What does the `Executors.newFixedThreadPool(int n)` method do?**
    - A) Creates a pool of exactly `n` threads that can run multiple tasks simultaneously.
    - B) Creates a pool of up to `n` tasks that will each be run by a single thread.
    - C) Creates `n` tasks in the queue to be processed.
    - D) Creates a pool with a maximum of `n` tasks but only one thread.

   **Answer**: A) Creates a pool of exactly `n` threads that can run multiple tasks simultaneously.

8. **Why is a thread pool considered to provide a loosely coupled design?**
    - A) Because it tightly couples task creation and task execution.
    - B) Because it forces the developer to manage each thread individually.
    - C) Because it allows tasks to be submitted independently of their execution.
    - D) Because it requires a fixed number of threads to run.

   **Answer**: C) Because it allows tasks to be submitted independently of their execution.

9. **Which of the following methods is used to submit tasks to a thread pool in Java?**
    - A) `submitTask()`
    - B) `newTask()`
    - C) `execute()`
    - D) `run()`

   **Answer**: C) `execute()`

10. **What happens to tasks submitted to a fixed thread pool when all threads are busy?**
    - A) They are executed immediately in the main thread.
    - B) They are rejected and discarded.
    - C) They are placed in a queue and executed when a thread becomes available.
    - D) They create additional threads automatically.

    **Answer**: C) They are placed in a queue and executed when a thread becomes available.