1. What happens if an exception is not caught in Java?

Here’s a point-to-point explanation of what happens if an exception is not caught in Java:

1. **Unchecked Exceptions (RuntimeExceptions)**:
    - The program stops immediately.
    - The error message (stack trace) is shown in the console.

2. **Checked Exceptions**:
    - You must either handle the exception or declare it with `throws` in the method.
    - If you don’t, the code will not compile.

3. **Program Crashes**:
    - If no one handles the exception, the program crashes.

4. **Resources Not Released**:
    - Resources like files or database connections may stay open, leading to problems later.

