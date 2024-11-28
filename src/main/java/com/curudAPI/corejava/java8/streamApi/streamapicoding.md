Here are some Java 8 Stream API coding questions for practice:

1. **Find Maximum and Minimum:**
    - Given a list of integers, write a program to find the maximum and minimum values using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
   int max = numbers.stream()
                    .max(Integer::compareTo)
                    .get();
   
   int min = numbers.stream()
                    .min(Integer::compareTo)
                    .get();
   ```

2. **Find All Strings with a Specific Prefix:**
    - Given a list of strings, write a program to find all strings that start with a specific prefix (e.g., "pre") and collect them into a new list using the Stream API.

   ```java
   List<String> words = Arrays.asList("prefix", "predicate", "prelude", "process", "preach");
   List<String> result = words.stream()
                              .filter(word -> word.startsWith("pre"))
                              .collect(Collectors.toList());
   ```

3. **Concatenate Strings:**
    - Given a list of strings, write a program to concatenate them into a single string separated by commas using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", "banana", "cherry");
   String result = words.stream()
                        .collect(Collectors.joining(", "));
   ```

4. **Group Strings by Their First Character:**
    - Write a program to group a list of strings by their first character using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", "banana", "cherry", "apricot", "blueberry");
   Map<Character, List<String>> groupedByFirstChar = words.stream()
                                                          .collect(Collectors.groupingBy(word -> word.charAt(0)));
   ```

5. **Sum of Square of Even Numbers:**
    - Given a list of integers, write a program to calculate the sum of squares of even numbers using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
   int sumOfSquares = numbers.stream()
                             .filter(n -> n % 2 == 0)
                             .map(n -> n * n)
                             .mapToInt(Integer::intValue)
                             .sum();
   ```

6. **Find Second Highest Number:**
    - Given a list of integers, write a program to find the second highest number using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(5, 3, 9, 2, 8, 7);
   int secondHighest = numbers.stream()
                              .sorted(Comparator.reverseOrder())
                              .distinct()
                              .skip(1)
                              .findFirst()
                              .get();
   ```

7. **Find Duplicate Elements:**
    - Given a list of integers, write a program to find all duplicate elements using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8);
   Set<Integer> uniqueNumbers = new HashSet<>();
   Set<Integer> duplicates = numbers.stream()
                                    .filter(n -> !uniqueNumbers.add(n))
                                    .collect(Collectors.toSet());
   ```

8. **Partition a List:**
    - Given a list of integers, write a program to partition the list into two lists: one containing all even numbers and the other containing all odd numbers using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
   Map<Boolean, List<Integer>> partitioned = numbers.stream()
                                                    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
   List<Integer> evens = partitioned.get(true);
   List<Integer> odds = partitioned.get(false);
   ```

9. **Find the Longest String:**
    - Given a list of strings, write a program to find the longest string using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry");
   String longestWord = words.stream()
                             .max(Comparator.comparingInt(String::length))
                             .get();
   ```

10. **Convert a List of Strings to a List of Integers:**
    - Given a list of strings representing numbers, write a program to convert them into a list of integers using the Stream API.

    ```java
    List<String> numbersAsString = Arrays.asList("1", "2", "3", "4", "5");
    List<Integer> numbers = numbersAsString.stream()
                                           .map(Integer::parseInt)
                                           .collect(Collectors.toList());
    ```

Here are 30+ more Java 8 Stream API coding questions for practice:

### Basic Stream Operations

1. **Find Odd Numbers:**
   - Given a list of integers, write a program to filter out all odd numbers using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   List<Integer> oddNumbers = numbers.stream()
                                     .filter(n -> n % 2 != 0)
                                     .collect(Collectors.toList());
   ```

2. **Convert List of Strings to Uppercase:**
   - Write a program to convert all strings in a list to uppercase using the Stream API.

   ```java
   List<String> words = Arrays.asList("java", "stream", "api");
   List<String> upperCaseWords = words.stream()
                                      .map(String::toUpperCase)
                                      .collect(Collectors.toList());
   ```

3. **Find Length of Each String:**
   - Given a list of strings, write a program to find the length of each string and collect the results into a list using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", "banana", "cherry");
   List<Integer> lengths = words.stream()
                                .map(String::length)
                                .collect(Collectors.toList());
   ```

4. **Remove Null Values:**
   - Given a list of strings, write a program to remove all null values using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", null, "banana", null, "cherry");
   List<String> nonNullWords = words.stream()
                                    .filter(Objects::nonNull)
                                    .collect(Collectors.toList());
   ```

5. **Sort in Reverse Order:**
   - Given a list of integers, write a program to sort them in reverse order using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1);
   List<Integer> sortedNumbers = numbers.stream()
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());
   ```

### Intermediate Stream Operations

6. **Count Strings with Length Greater Than 4:**
   - Write a program to count the number of strings in a list that have a length greater than 4 using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", "banana", "fig", "kiwi");
   long count = words.stream()
                     .filter(word -> word.length() > 4)
                     .count();
   ```

7. **Find Distinct Elements:**
   - Given a list of integers, write a program to find all distinct elements using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
   List<Integer> distinctNumbers = numbers.stream()
                                          .distinct()
                                          .collect(Collectors.toList());
   ```

8. **Concatenate Strings with Prefix:**
   - Given a list of strings, write a program to concatenate them into a single string with a specific prefix (e.g., "Prefix: ") using the Stream API.

   ```java
   List<String> words = Arrays.asList("java", "stream", "api");
   String result = words.stream()
                        .collect(Collectors.joining(", ", "Prefix: ", ""));
   ```

9. **Find the Shortest String:**
   - Given a list of strings, write a program to find the shortest string using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", "banana", "cherry", "fig");
   String shortestWord = words.stream()
                              .min(Comparator.comparingInt(String::length))
                              .get();
   ```

10. **Generate a Sequence of Numbers:**
   - Write a program to generate a sequence of the first 10 even numbers using the Stream API.

    ```java
    List<Integer> evenNumbers = Stream.iterate(2, n -> n + 2)
                                      .limit(10)
                                      .collect(Collectors.toList());
    ```

### Advanced Stream Operations

11. **Partition by String Length:**
   - Write a program to partition a list of strings into two groups: those with length less than or equal to 4 and those with length greater than 4 using the Stream API.

    ```java
    List<String> words = Arrays.asList("apple", "fig", "banana", "kiwi");
    Map<Boolean, List<String>> partitioned = words.stream()
                                                  .collect(Collectors.partitioningBy(word -> word.length() <= 4));
    ```

12. **Find Average of Numbers:**
   - Given a list of integers, write a program to find the average of all elements using the Stream API.

    ```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    double average = numbers.stream()
                            .mapToInt(Integer::intValue)
                            .average()
                            .getAsDouble();
    ```

13. **Group Strings by Length:**
   - Write a program to group a list of strings by their length using the Stream API.

    ```java
    List<String> words = Arrays.asList("apple", "banana", "fig", "cherry");
    Map<Integer, List<String>> groupedByLength = words.stream()
                                                      .collect(Collectors.groupingBy(String::length));
    ```

14. **Calculate Factorials:**
   - Write a program to calculate the factorial of a given number using the Stream API.

    ```java
    int n = 5;
    long factorial = LongStream.rangeClosed(1, n)
                               .reduce(1, (a, b) -> a * b);
    ```

15. **Convert List of Strings to List of Integers:**
   - Given a list of strings representing numbers, write a program to convert them into a list of integers using the Stream API.

    ```java
    List<String> numbersAsString = Arrays.asList("1", "2", "3", "4");
    List<Integer> numbers = numbersAsString.stream()
                                           .map(Integer::parseInt)
                                           .collect(Collectors.toList());
    ```

### Advanced Stream Usage

16. **Convert List to Map:**
   - Given a list of strings, write a program to convert it into a map where the key is the string and the value is its length using the Stream API.

    ```java
    List<String> words = Arrays.asList("apple", "banana", "cherry");
    Map<String, Integer> wordLengthMap = words.stream()
                                              .collect(Collectors.toMap(word -> word, String::length));
    ```

17. **Skip and Limit:**
   - Given a list of integers, write a program to skip the first 2 elements and limit the result to the next 3 elements using the Stream API.

    ```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    List<Integer> result = numbers.stream()
                                  .skip(2)
                                  .limit(3)
                                  .collect(Collectors.toList());
    ```

18. **Check if All Elements Match a Condition:**
   - Write a program to check if all elements in a list of integers are positive using the Stream API.

    ```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    boolean allPositive = numbers.stream()
                                 .allMatch(n -> n > 0);
    ```

19. **Check if Any Element Matches a Condition:**
   - Write a program to check if any element in a list of integers is negative using the Stream API.

    ```java
    List<Integer> numbers = Arrays.asList(-1, 2, 3, 4, 5);
    boolean anyNegative = numbers.stream()
                                 .anyMatch(n -> n < 0);
    ```

20. **Find the Sum of Squares of Numbers:**
   - Given a list of integers, write a program to calculate the sum of squares of all elements using the Stream API.

    ```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int sumOfSquares = numbers.stream()
                              .map(n -> n * n)
                              .mapToInt(Integer::intValue)
                              .sum();
    ```

### Complex Stream Operations

21. **Find Second Smallest Element:**
   - Given a list of integers, write a program to find the second smallest element using the Stream API.

    ```java
    List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 8, 3);
    int secondSmallest = numbers.stream()
                                .sorted()
                                .distinct()
                                .skip(1)
                                .findFirst()
                                .get();
    ```

22. **Join Strings with a Delimiter:**
   - Write a program to join all strings in a list with a delimiter (e.g., ", ") using the Stream API.

    ```java
    List<String> words = Arrays.asList("apple", "banana", "cherry");
    String result = words.stream()
                         .collect(Collectors.joining(", "));
    ```

23. **Find the Sum of a Nested List:**
   - Given a list of lists of integers, write a program to calculate the sum of all elements using the Stream API.

    ```java
    List<List<Integer>> listOfLists = Arrays.asList(


        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9)
    );
    int sum = listOfLists.stream()
                         .flatMap(List::stream)
                         .mapToInt(Integer::intValue)
                         .sum();
    ```

24. **Create a Map of Word Frequencies:**
   - Write a program to create a map where the key is a word and the value is the frequency of that word in a list of strings using the Stream API.

    ```java
    List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
    Map<String, Long> wordFrequencies = words.stream()
                                             .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    ```

25. **Remove Duplicates from a List:**
   - Given a list of integers, write a program to remove all duplicate elements using the Stream API.

    ```java
    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
    List<Integer> uniqueNumbers = numbers.stream()
                                         .distinct()
                                         .collect(Collectors.toList());
    ```

26. **Find the First Non-Repeating Character in a String:**
   - Write a program to find the first non-repeating character in a string using the Stream API.

    ```java
    String input = "swiss";
    Character firstNonRepeating = input.chars()
                                       .mapToObj(c -> (char) c)
                                       .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                                       .findFirst()
                                       .orElse(null);
    ```

27. **Count the Number of Words in a String:**
   - Write a program to count the number of words in a string using the Stream API.

    ```java
    String sentence = "Java 8 Stream API provides functional-style operations on streams of elements.";
    long wordCount = Arrays.stream(sentence.split("\\s+"))
                           .count();
    ```

28. **Sort a List of Strings by Their Length:**
   - Given a list of strings, write a program to sort them by their length using the Stream API.

    ```java
    List<String> words = Arrays.asList("apple", "banana", "fig", "cherry");
    List<String> sortedByLength = words.stream()
                                       .sorted(Comparator.comparingInt(String::length))
                                       .collect(Collectors.toList());
    ```

29. **Create a Map from a List of Objects:**
   - Given a list of objects (e.g., `Person` with fields `id` and `name`), write a program to create a map where the key is the `id` and the value is the `name` using the Stream API.

    ```java
    class Person {
        int id;
        String name;
        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    List<Person> people = Arrays.asList(new Person(1, "Alice"), new Person(2, "Bob"), new Person(3, "Charlie"));
    Map<Integer, String> personMap = people.stream()
                                           .collect(Collectors.toMap(person -> person.id, person -> person.name));
    ```

30. **Check if a List is Sorted:**
   - Write a program to check if a list of integers is sorted in ascending order using the Stream API.

    ```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    boolean isSorted = IntStream.range(0, numbers.size() - 1)
                                .allMatch(i -> numbers.get(i) <= numbers.get(i + 1));
    ```

31. **FlatMap Example:**
   - Given a list of lists of strings, write a program to flatten the list and collect all strings into a single list using the Stream API.

    ```java
    List<List<String>> listOfLists = Arrays.asList(
        Arrays.asList("a", "b", "c"),
        Arrays.asList("d", "e", "f"),
        Arrays.asList("g", "h", "i")
    );
    List<String> flattenedList = listOfLists.stream()
                                            .flatMap(List::stream)
                                            .collect(Collectors.toList());
    ```

