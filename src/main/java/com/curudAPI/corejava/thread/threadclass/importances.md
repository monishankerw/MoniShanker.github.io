Here’s the information in Markdown format, along with some multiple-choice questions (MCQs) based on the content.

```markdown
# Java Thread Basics

## 1. Can We Restart a Dead Thread in Java?
- **No**, once a thread has completed execution and is in a dead state, it cannot be restarted. 
- Attempting to restart a dead thread by calling the `start()` method will throw a **RuntimeException** as the thread is no longer alive.

## 2. Can One Thread Block Another Thread in Java?
- **No**, one thread cannot directly block another thread in Java.
- However, a thread can block itself or be in a blocked state due to certain conditions (e.g., waiting for a lock).

## 3. Can We Restart a Thread That Has Already Started in Java?
- A thread in Java can be started only once by calling the `start()` method.
- **If the `start()` method is called a second time** on a thread that has already started, it will cause a **RuntimeException**.
- Once a thread is in a runnable or dead state, it cannot be restarted.
```

---

### MCQs

1. **Can a dead thread be restarted in Java?**
    - A) Yes, using the `start()` method.
    - B) No, trying to restart a dead thread will cause a RuntimeException.
    - C) Yes, using the `run()` method.
    - D) Only if the thread is in a waiting state.

   **Answer**: B) No, trying to restart a dead thread will cause a RuntimeException.

2. **What happens if you try to call `start()` on a thread that has already started?**
    - A) It will restart the thread from the beginning.
    - B) It will throw a RuntimeException.
    - C) It will pause the thread.
    - D) It will have no effect.

   **Answer**: B) It will throw a RuntimeException.

3. **In Java, can one thread block another thread directly?**
    - A) Yes, one thread can block any other thread.
    - B) No, one thread cannot directly block another thread.
    - C) Only if both threads are part of the same thread group.
    - D) Only if one thread has a higher priority.

   **Answer**: B) No, one thread cannot directly block another thread.

4. **Which method is used to start a thread in Java?**
    - A) `run()`
    - B) `execute()`
    - C) `start()`
    - D) `init()`

   **Answer**: C) `start()`

5. **What state is a thread in if it has finished execution?**
    - A) Runnable
    - B) Blocked
    - C) Dead
    - D) Waiting

   **Answer**: C) Dead

6. **If a thread is in the dead state, which of the following is true?**
    - A) It can be restarted by calling `run()`.
    - B) It can be restarted by calling `start()`.
    - C) It cannot be restarted.
    - D) It can be paused and resumed.

   **Answer**: C) It cannot be restarted.

7. **What exception is thrown if `start()` is called twice on the same thread?**
    - A) `InterruptedException`
    - B) `IllegalArgumentException`
    - C) `RuntimeException`
    - D) `IllegalThreadStateException`

   **Answer**: D) `IllegalThreadStateException`

8. **Which statement is true about a thread that has started execution?**
    - A) It can be restarted using `start()`.
    - B) It can be put back to the new state.
    - C) It can be stopped permanently after execution.
    - D) It can be restarted only if in the waiting state.

   **Answer**: C) It can be stopped permanently after execution.

9. **Which of the following will happen if we try to block a thread using another thread?**
    - A) The other thread will go into a deadlock state.
    - B) The blocking operation will succeed.
    - C) One thread cannot block another directly.
    - D) Both threads will terminate.

   **Answer**: C) One thread cannot block another directly.

10. **What is the effect of calling `run()` directly instead of `start()` on a thread?**
    - A) It will execute the thread in a new thread context.
    - B) It will throw an exception.
    - C) It will execute the thread code in the current thread context.
    - D) It will restart the thread if it’s already started.

    **Answer**: C) It will execute the thread code in the current thread context.