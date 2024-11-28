

### 1. Lambda Expressions

1. **Which of the following is a valid lambda expression?**
   - A) `(int x) -> { return x + 1; }`
   - B) `x -> return x + 1;`
   - C) `(int x, y) -> x + y;`
   - D) `() -> System.out.println("Hello")`
   - **Answer:** A, D

2. **Lambda expressions can be used only with:**
   - A) Functional interfaces
   - B) Any interface
   - C) Abstract classes
   - D) Concrete classes
   - **Answer:** A

3. **What is the syntax for declaring a lambda expression that takes two integers and returns their sum?**
   - A) `(a, b) -> a + b`
   - B) `() -> a + b`
   - C) `(a) -> { return a + b; }`
   - D) `(int a, int b) => a + b`
   - **Answer:** A

4. **Which of these lambda expressions is invalid?**
   - A) `() -> 5`
   - B) `x -> System.out.println(x)`
   - C) `(x, y) -> x + y`
   - D) `(x, y) -> return x + y;`
   - **Answer:** D

5. **In Java, lambda expressions were introduced in:**
   - A) Java 6
   - B) Java 7
   - C) Java 8
   - D) Java 9
   - **Answer:** C

---

### 2. Functional Interfaces

6. **Which of the following is a functional interface?**
   - A) `Comparable`
   - B) `Cloneable`
   - C) `Comparator`
   - D) `Runnable`
   - **Answer:** A, C, D

7. **How many abstract methods can a functional interface have?**
   - A) 1
   - B) 2
   - C) Any number
   - D) 0
   - **Answer:** A

8. **Which functional interface is used to supply a value with no input?**
   - A) `Supplier`
   - B) `Function`
   - C) `Predicate`
   - D) `Consumer`
   - **Answer:** A

9. **Which functional interface has a method that returns a boolean value?**
   - A) `Function`
   - B) `Predicate`
   - C) `Supplier`
   - D) `Consumer`
   - **Answer:** B

10. **What is the method in the `Function` interface?**
    - A) `apply`
    - B) `test`
    - C) `accept`
    - D) `get`
    - **Answer:** A

---

### 3. Stream API

11. **Which of the following is an intermediate operation in streams?**
    - A) `map()`
    - B) `collect()`
    - C) `forEach()`
    - D) `reduce()`
    - **Answer:** A

12. **What does `filter()` do in the Stream API?**
    - A) Filters null values
    - B) Filters elements based on a condition
    - C) Maps values to a new type
    - D) Merges streams
    - **Answer:** B

13. **What is the purpose of `flatMap()`?**
    - A) Flatten a stream of streams
    - B) Filters elements
    - C) Performs an action on each element
    - D) Reduces elements
    - **Answer:** A

14. **Which method collects elements into a `List`?**
    - A) `collect(Collectors.toList())`
    - B) `mapToList()`
    - C) `collectList()`
    - D) `reduceToList()`
    - **Answer:** A

15. **What does `Stream.of("a", "b", "c").count()` return?**
    - A) 0
    - B) 1
    - C) 3
    - D) 2
    - **Answer:** C

---

### 4. Optional Class

16. **Which method in `Optional` returns a value if present, or a default if not?**
    - A) `orElse()`
    - B) `get()`
    - C) `ifPresent()`
    - D) `empty()`
    - **Answer:** A

17. **How do you create an empty `Optional` object?**
    - A) `Optional.empty()`
    - B) `Optional.of(null)`
    - C) `Optional.ofEmpty()`
    - D) `Optional.ofNullable()`
    - **Answer:** A

18. **What does `Optional.of(null)` throw?**
    - A) `NullPointerException`
    - B) `IllegalArgumentException`
    - C) Returns an empty Optional
    - D) Returns null
    - **Answer:** A

19. **Which of these will not throw an exception if the Optional is empty?**
    - A) `get()`
    - B) `orElseThrow()`
    - C) `orElse()`
    - D) `getIfPresent()`
    - **Answer:** C

20. **What does `Optional.ofNullable(null).orElse("default")` return?**
    - A) `null`
    - B) `"default"`
    - C) Throws an exception
    - D) Optional.empty()
    - **Answer:** B

---

### 5. Date and Time API

21. **What is `LocalDate.now()` used for?**
    - A) Get current date and time
    - B) Get only the current date
    - C) Get only the current time
    - D) Get date and timezone
    - **Answer:** B

22. **How do you get the current date and time in Java 8?**
    - A) `LocalDateTime.now()`
    - B) `LocalTime.now()`
    - C) `DateTime.now()`
    - D) `Calendar.getInstance()`
    - **Answer:** A

23. **What is the difference between `LocalDate` and `ZonedDateTime`?**
    - A) `LocalDate` has no timezone, `ZonedDateTime` has timezone
    - B) `LocalDate` includes time, `ZonedDateTime` does not
    - C) `ZonedDateTime` has no timezone
    - D) `LocalDate` includes milliseconds
    - **Answer:** A

24. **Which method adds days to a `LocalDate`?**
    - A) `addDays()`
    - B) `plusDays()`
    - C) `incrementDays()`
    - D) `addTo()`
    - **Answer:** B

25. **What does `Period.between(date1, date2)` return?**
    - A) Duration in milliseconds
    - B) Days between dates
    - C) Period of days, months, years
    - D) Hours between dates
    - **Answer:** C

---

### 6. Method References

26. **What is a method reference?**
    - A) A new way to call methods
    - B) A shortcut for creating lambda expressions
    - C) A reference to another class
    - D) Used only in abstract classes
    - **Answer:** B

27. **What is the correct syntax for a method reference to a static method?**
    - A) `ClassName::methodName`
    - B) `methodName::ClassName`
    - C) `ClassName.methodName()`
    - D) `ClassName->methodName`
    - **Answer:** A

28. **Which method reference type would `System.out::println` represent?**
    - A) Static method reference
    - B) Instance method of a particular object
    - C) Instance method of an arbitrary object of a particular type
    - D) Constructor reference
    - **Answer:** B

29. **What does `String::toUpperCase` represent?**
    - A) Static method reference
    - B) Instance method of an arbitrary object of a particular type
    - C) Constructor reference
    - D) Class method reference
    - **Answer:** B

30. **Which method reference type can be used for creating new objects?**
    - A) Constructor reference
    - B) Instance method reference
    - C) Static method reference
    - D) Arbitrary instance method reference
    - **Answer:** A

---

### 7. Collectors API

31. **What does `Collectors.toList()` do?**
    - A) Collects elements into a `List`
    - B) Collects elements into a `Map`
    - C) Converts elements to a string
    - D) Aggregates numbers
    - **Answer:** A

32. **Which of these collects elements into a `Map`?**
    - A) `Collectors.toMap()`
    - B) `Collectors.groupingBy()`
    - C) `Collectors.partitioningBy()`
    - D) `Collectors.toList()`
    - **Answer:** A

33. **How can you join a list of strings into a

 single string with commas?**
    - A) `Collectors.joining(", ")`
    - B) `Collectors.join(",")`
    - C) `Collectors.toString(",")`
    - D) `Collectors.combine(",")`
    - **Answer:** A

34. **What does `Collectors.groupingBy()` do?**
    - A) Groups elements by a classifier
    - B) Collects elements into a list
    - C) Filters elements by condition
    - D) Combines elements into a string
    - **Answer:** A

35. **How does `Collectors.partitioningBy()` differ from `groupingBy()`?**
    - A) `partitioningBy()` divides elements into two groups
    - B) `partitioningBy()` does not collect elements
    - C) `partitioningBy()` collects elements into sets
    - D) `partitioningBy()` only works with numeric values
    - **Answer:** A

---

### 8. Parallel Streams

36. **Which of these methods creates a parallel stream?**
    - A) `stream().parallel()`
    - B) `Stream.parallelStream()`
    - C) `parallel()`
    - D) `stream().toParallel()`
    - **Answer:** B

37. **Parallel streams can be beneficial for:**
    - A) Small data sets
    - B) Large data sets with independent operations
    - C) Operations with dependencies
    - D) Simple print statements
    - **Answer:** B

38. **Which of the following is not recommended with parallel streams?**
    - A) Sorting elements
    - B) Calculating independent sums
    - C) Modifying shared state
    - D) Collecting results in a list
    - **Answer:** C

39. **Parallel streams can be created using:**
    - A) `parallel()`
    - B) `Stream.parallelStream()`
    - C) `toParallelStream()`
    - D) `Stream.ofParallel()`
    - **Answer:** B

40. **Which of these can be negatively impacted by parallel streams?**
    - A) Performance for very small collections
    - B) Performance for large collections
    - C) Operations without side effects
    - D) None of the above
    - **Answer:** A

---

### 9. Concurrency Enhancements

41. **What is `CompletableFuture` used for?**
    - A) Handling synchronous computations
    - B) Asynchronous programming
    - C) Managing threads directly
    - D) Creating new processes
    - **Answer:** B

42. **What method can be used to complete a `CompletableFuture` manually?**
    - A) `complete()`
    - B) `finish()`
    - C) `resolve()`
    - D) `done()`
    - **Answer:** A

43. **What is `CompletableFuture.supplyAsync()` used for?**
    - A) Returns a completed future
    - B) Completes a future with a value
    - C) Executes a computation asynchronously
    - D) Creates an empty future
    - **Answer:** C

44. **Which of these is not a concurrency enhancement in Java 8?**
    - A) `ForkJoinPool`
    - B) `CompletableFuture`
    - C) `Semaphore`
    - D) `Stream.parallelStream()`
    - **Answer:** C

45. **What does `CompletableFuture.thenApply()` do?**
    - A) Applies a function after the future completes
    - B) Creates a new thread
    - C) Waits for multiple futures
    - D) None of the above
    - **Answer:** A

---

### 10. Miscellaneous Java 8 Features

46. **Default methods in interfaces were introduced to:**
    - A) Add new methods to interfaces without breaking existing implementations
    - B) Remove methods from classes
    - C) Allow constructors in interfaces
    - D) Enforce multiple inheritance
    - **Answer:** A

47. **Static methods in interfaces are:**
    - A) Callable without an instance
    - B) Callable only with an instance
    - C) Not allowed
    - D) Only allowed in abstract classes
    - **Answer:** A

48. **What method in a functional interface has a body in Java 8?**
    - A) `default` method
    - B) `static` method
    - C) `abstract` method
    - D) Both A and B
    - **Answer:** D

49. **The `Predicate` interface is typically used for:**
    - A) Checking a condition and returning a boolean
    - B) Supplying values
    - C) Consuming values
    - D) Applying functions
    - **Answer:** A

50. **Which Java 8 feature helps avoid `NullPointerException` when dealing with null values?**
    - A) `Optional`
    - B) `Consumer`
    - C) `CompletableFuture`
    - D) `Function`
    - **Answer:** A

---

