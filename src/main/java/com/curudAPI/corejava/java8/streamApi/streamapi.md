Here are some Java 8 Stream API coding questions suitable for 0 to 3 years of experience:

1. **Filter and Collect:**
    - Given a list of integers, write a program to filter out all even numbers and collect them into a new list using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
   List<Integer> evenNumbers = numbers.stream()
                                      .filter(n -> n % 2 == 0)
                                      .collect(Collectors.toList());
   ```

2. **Map and Collect:**
    - Given a list of strings, write a program to convert each string to uppercase and collect them into a new list.

   ```java
   List<String> words = Arrays.asList("apple", "banana", "cherry");
   List<String> upperCaseWords = words.stream()
                                      .map(String::toUpperCase)
                                      .collect(Collectors.toList());
   ```

3. **Sum of Integers:**
    - Given a list of integers, write a program to calculate the sum of all elements using the Stream API.

   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   int sum = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
   ```

4. **Find First Element:**
    - Write a program to find the first string in a list that starts with the letter "A" using the Stream API.

   ```java
   List<String> names = Arrays.asList("Bob", "Alice", "Adam", "John");
   Optional<String> firstAName = names.stream()
                                      .filter(name -> name.startsWith("A"))
                                      .findFirst();
   ```

5. **Grouping By:**
    - Given a list of strings, write a program to group the strings by their length using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", "banana", "pear", "fig", "kiwi");
   Map<Integer, List<String>> groupedByLength = words.stream()
                                                     .collect(Collectors.groupingBy(String::length));
   ```

6. **Counting Elements:**
    - Write a program to count the number of strings in a list that have a length greater than 3 using the Stream API.

   ```java
   List<String> words = Arrays.asList("apple", "fig", "banana", "kiwi");
   long count = words.stream()
                     .filter(word -> word.length() > 3)
                     .count();
   ```

7. **FlatMap Example:**
    - Given a list of lists of integers, write a program to flatten the lists into a single list using the Stream API.

   ```java
   List<List<Integer>> listOfLists = Arrays.asList(
       Arrays.asList(1, 2, 3),
       Arrays.asList(4, 5),
       Arrays.asList(6, 7, 8)
   );
   List<Integer> flatList = listOfLists.stream()
                                       .flatMap(List::stream)
                                       .collect(Collectors.toList());
   ```

8. **Sort and Collect:**
    - Given a list of strings, write a program to sort them in alphabetical order and collect the result into a new list using the Stream API.

   ```java
   List<String> names = Arrays.asList("John", "Alice", "Bob");
   List<String> sortedNames = names.stream()
                                   .sorted()
                                   .collect(Collectors.toList());
   ```

These questions cover common operations such as filtering, mapping, collecting, and reducing, all of which are essential concepts when working with the Java 8 Stream API.