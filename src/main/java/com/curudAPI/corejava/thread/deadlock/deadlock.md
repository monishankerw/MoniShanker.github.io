1. What is DeadLock?
--> When two thread are waiting for each other to release the lock and neither thread releasing the lock then these
then these thread has gone into deadlock state.
-->Synchronized keyword is the only reason for deadlock situation.
2. Deadlock vs Starvation?
--> Long waiting of a thread where waiting never end is called deadlock.
---> Long waiting of a thread where waiting ends at a certain point is called  Starvation.


Here are some multiple-choice questions (MCQs) based on the concepts of deadlock and starvation in Java multithreading:

### MCQs

1. **Which of the following best describes a deadlock in a multithreaded environment?**
    - A) A situation where a thread is waiting for an object that is never released by any thread.
    - B) A situation where threads run without any issues.
    - C) A situation where all threads complete execution without any waiting.
    - D) A situation where threads execute concurrently without any synchronization.

   **Answer**: A) A situation where a thread is waiting for an object that is never released by any thread.

2. **Which keyword in Java can potentially lead to a deadlock if not handled properly?**
    - A) `volatile`
    - B) `final`
    - C) `synchronized`
    - D) `static`

   **Answer**: C) `synchronized`

3. **Which of the following statements is correct regarding deadlock and starvation?**
    - A) In deadlock, waiting never ends, but in starvation, waiting can end eventually.
    - B) In both deadlock and starvation, waiting never ends.
    - C) Starvation always leads to deadlock.
    - D) Deadlock occurs only in single-threaded programs.

   **Answer**: A) In deadlock, waiting never ends, but in starvation, waiting can end eventually.

4. **What is the primary difference between deadlock and starvation in thread synchronization?**
    - A) Deadlock is caused by synchronized blocks, while starvation is caused by unsynchronized blocks.
    - B) Deadlock occurs when threads wait indefinitely for each other, while starvation occurs when a thread waits for a long time but eventually gets resources.
    - C) Deadlock and starvation are the same; both result in indefinite waiting.
    - D) Deadlock and starvation are not related to thread synchronization.

   **Answer**: B) Deadlock occurs when threads wait indefinitely for each other, while starvation occurs when a thread waits for a long time but eventually gets resources.

5. **Which of the following is a necessary condition for a deadlock to occur?**
    - A) Threads execute without synchronization.
    - B) Threads do not require any shared resources.
    - C) Threads acquire and hold locks while waiting for other locks.
    - D) Threads release locks immediately after acquiring them.

   **Answer**: C) Threads acquire and hold locks while waiting for other locks.

6. **In a deadlock situation, how many threads are involved at a minimum?**
    - A) 1
    - B) 2
    - C) 3
    - D) 4

   **Answer**: B) 2

7. **What is a common cause of starvation in a multithreaded environment?**
    - A) A thread constantly acquiring a lock and never releasing it.
    - B) A thread with higher priority constantly preempting lower-priority threads.
    - C) Threads not having any locks.
    - D) Threads executing independently without shared resources.

   **Answer**: B) A thread with higher priority constantly preempting lower-priority threads.

8. **Which of the following is an approach to avoid deadlock in a multithreaded program?**
    - A) Avoid using `synchronized` blocks.
    - B) Use a fixed ordering of resource acquisition for all threads.
    - C) Use infinite loops to wait for resources.
    - D) Use multiple threads to access shared resources simultaneously.

   **Answer**: B) Use a fixed ordering of resource acquisition for all threads.

9. **Which condition is not necessary for a deadlock to occur?**
    - A) Mutual exclusion
    - B) Circular wait
    - C) Preemption
    - D) Hold and wait

   **Answer**: C) Preemption

10. **Which Java concept can lead to both deadlock and starvation if not managed properly?**
    - A) Collections framework
    - B) Exception handling
    - C) Thread synchronization
    - D) Serialization

    **Answer**: C) Thread synchronization