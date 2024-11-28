
---

1. **What is the initial state of a thread when it is created but not yet started?**

    - A) RUNNABLE
    - B) NEW
    - C) BLOCKED
    - D) TERMINATED

   **Answer**: **B) NEW**

---

2. **Which method is used to start the execution of a thread?**

    - A) `run()`
    - B) `init()`
    - C) `start()`
    - D) `begin()`

   **Answer**: **C) start()**

---

3. **What will be the state of a thread after calling the `start()` method if the thread is ready to run?**

    - A) NEW
    - B) TERMINATED
    - C) WAITING
    - D) RUNNABLE

   **Answer**: **D) RUNNABLE**

**When a thread invokes the `start()` method, it moves from the New state to which state?**
- A) Runnable
- B) Active
- C) Blocked
- D) Terminated  
**Answer:** B) Active

---
**The Java component responsible for determining the execution order of multiple threads on a CPU is called:**
- A) Thread Pool
- B) Executor Service
- C) Thread Scheduler
- D) Thread Manager  
**Answer:** C) Thread Scheduler

4. **Which of the following methods puts a thread in the `TIMED_WAITING` state?**

    - A) `wait()`
    - B) `join()`
    - C) `sleep(long millis)`
    - D) `notify()`

   **Answer**: **C) sleep(long millis)**

---
**If a thread is inactive temporarily, it enters which state?**
- A) New
- B) Running
- C) Terminated
- D) Blocked/Waiting  
**Answer:** D) Blocked/Waiting

5. **In the code example, if `threadLifeCycle.join()` is called in the `main` method, what will be the state of the `main` thread while waiting for `threadLifeCycle` to finish?**

    - A) RUNNABLE
    - B) WAITING
    - C) BLOCKED
    - D) TERMINATED

   **Answer**: **B) WAITING**

---
**Which method in Java is used to pause the execution of the current thread to allow other threads with the same or higher priority to execute?**
- A) `sleep()`
- B) `join()`
- C) `wait()`
- D) `yield()`  
**Answer:** D) `yield()`

6. **What is the final state of a thread after the `run()` method completes execution?**

    - A) RUNNABLE
    - B) NEW
    - C) TERMINATED
    - D) BLOCKED

   **Answer**: **C) TERMINATED**

---

7. **Which method can be used to ensure that the main thread waits for another thread to complete?**

    - A) `wait()`
    - B) `notify()`
    - C) `join()`
    - D) `sleep()`

   **Answer**: **C) join()**
   **What will happen if a thread calls `join()` on itself?**
    - A) The thread will terminate immediately.
    - B) The program will be stuck in an infinite wait.
    - C) The thread will move to the Terminated state.
    - D) The thread will yield to other threads.  
      **Answer:** B) The program will be stuck in an infinite wait.

---
**What is the effect of the `join()` method when called on a thread?**
- A) Pauses the thread for a specified time.
- B) Allows a thread to yield to other threads.
- C) Causes the current thread to wait until the thread it joined completes.
- D) Terminates the current thread.  
**Answer:** C) Causes the current thread to wait until the thread it joined completes.

8. **What will happen if you call `start()` on a thread that has already been started?**

    - A) The thread will start again from the beginning.
    - B) A new thread will be created.
    - C) An `IllegalThreadStateException` will be thrown.
    - D) The thread will continue from where it left off.

   **Answer**: **C) An IllegalThreadStateException will be thrown.**

---

9. **Which of the following is true about the `run()` method in Java threads?**

    - A) `run()` must be called explicitly to start a thread.
    - B) `run()` is automatically invoked after calling `start()`.
    - C) `run()` is used to block the thread.
    - D) `run()` makes the thread go into `TIMED_WAITING`.

   **Answer**: **B) run() is automatically invoked after calling start().**

---

10. **What does the `Thread.sleep(long millis)` method do to the current thread?**

    - A) Terminates the thread immediately.
    - B) Puts the current thread into the `WAITING` state for a specified time.
    - C) Puts the current thread into the `TIMED_WAITING` state for a specified time.
    - D) Makes the thread go to the `BLOCKED` state.

    **Answer**: **C) Puts the current thread into the TIMED_WAITING state for a specified time.**

11**Which of the following methods can be used to communicate between threads in Java?**
    - A) `sleep()`, `join()`, `yield()`
    - B) `wait()`, `notify()`, `notifyAll()`
    - C) `yield()`, `run()`, `sleep()`
    - D) `notifyAll()`, `join()`, `yield()`  
      **Answer:** B) `wait()`, `notify()`, `notifyAll()`

12. **Which method causes a thread to wait for a specified time without releasing any locks?**
    - A) `sleep()`
    - B) `wait()`
    - C) `join()`
    - D) `yield()`  
      **Answer:** A) `sleep()`

13. **Where are `wait()`, `notify()`, and `notifyAll()` methods defined in Java?**
    - A) Thread class
    - B) Runnable interface
    - C) Object class
    - D) Executor Service  
      **Answer:** C) Object class

---

