
### Basic TreeSet Operations

1. **What is a TreeSet?**
    - Explain that `TreeSet` is a collection in Java that implements the `Set` interface, backed by a **TreeMap**. It stores elements in **sorted** order, and does not allow duplicate elements.

2. **How does TreeSet maintain elements in sorted order?**
    - The elements are ordered according to their natural ordering or by a **Comparator** provided at the time of set creation.

3. **What is the time complexity of basic operations in a TreeSet?**
    - **Insertion, Removal, and Search** operations in a `TreeSet` have a time complexity of **O(log n)**, due to the underlying red-black tree structure.

4. **What is the difference between TreeSet and HashSet?**
    - `TreeSet` stores elements in **sorted order**, whereas `HashSet` does not guarantee any specific order of elements. `TreeSet` is slower than `HashSet` for insertion and lookup operations because of sorting, but it provides the advantage of ordering.

5. **Can a TreeSet contain duplicate elements?**
    - No, `TreeSet` does not allow duplicate elements. If you try to add a duplicate element, the add operation will return `false`.

6. **What will happen if you try to add `null` to a TreeSet?**
    - A `NullPointerException` will be thrown when you try to add `null` to a `TreeSet` if the set uses natural ordering, as `null` cannot be compared. If a custom comparator is used, it may or may not allow `null` elements depending on the comparator's implementation.

7. **How do you iterate through a TreeSet?**
    - You can iterate through a `TreeSet` using an enhanced `for` loop or by using an iterator:
      ```java
      TreeSet<Integer> treeSet = new TreeSet<>();
      for (Integer num : treeSet) {
          System.out.println(num);
      }
      ```

8. **How can you check if a TreeSet contains a specific element?**
    - You can use the `contains()` method:
      ```java
      treeSet.contains(10); // Returns true if 10 is present
      ```

### Advanced TreeSet Questions

9. **What is the difference between TreeSet and TreeMap?**
    - Both `TreeSet` and `TreeMap` are backed by a `Red-Black Tree`, but:
        - `TreeSet` is a set, so it stores only keys (unique elements).
        - `TreeMap` is a map, so it stores key-value pairs (unique keys with associated values).

10. **How would you use a custom Comparator in a TreeSet?**
    - A custom `Comparator` can be passed to the `TreeSet` constructor to define the ordering of elements. For example:
      ```java
      TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
      treeSet.add("apple");
      treeSet.add("banana");
      ```
      This will order the elements in reverse alphabetical order.

11. **Can TreeSet store elements of mixed types?**
    - No, `TreeSet` requires that all elements be **comparable** to each other. If elements of mixed types are added, a `ClassCastException` will be thrown unless a custom `Comparator` is used.

12. **How would you perform range-based operations in a TreeSet?**
    - You can use methods like `subSet()`, `headSet()`, and `tailSet()` to get subsets of the original set.
    - Example:
      ```java
      TreeSet<Integer> treeSet = new TreeSet<>();
      treeSet.add(10);
      treeSet.add(20);
      treeSet.add(30);
      
      // Get elements from 15 to 25
      SortedSet<Integer> range = treeSet.subSet(15, 25);
      ```

13. **What is the `ceiling()` method in TreeSet?**
    - The `ceiling(E e)` method returns the **least element** in the set greater than or equal to the specified element. If no such element exists, it returns `null`.
      ```java
      treeSet.ceiling(15);  // Returns the smallest element >= 15
      ```

14. **What is the `floor()` method in TreeSet?**
    - The `floor(E e)` method returns the **greatest element** in the set less than or equal to the specified element. If no such element exists, it returns `null`.
      ```java
      treeSet.floor(20);  // Returns the largest element <= 20
      ```

15. **How do you remove elements from a TreeSet?**
    - You can remove elements using the `remove()` method or by using `clear()` to remove all elements.
      ```java
      treeSet.remove(10);  // Removes element 10 from the set
      treeSet.clear();     // Clears all elements from the set
      ```

16. **How can you find the first and last elements in a TreeSet?**
    - You can use the `first()` and `last()` methods:
      ```java
      treeSet.first();  // Returns the first (smallest) element
      treeSet.last();   // Returns the last (largest) element
      ```

17. **How do you get the size of a TreeSet?**
    - Use the `size()` method:
      ```java
      treeSet.size();  // Returns the number of elements in the TreeSet
      ```

18. **What are the limitations of TreeSet?**
    - **Slower operations** compared to `HashSet` due to sorting (O(log n) vs O(1) for most operations).
    - Cannot store `null` if using natural ordering (unless using a custom comparator that supports null values).
    - All elements must be comparable to each other.

---

### 1. **Using Enhanced For Loop**
The enhanced `for` loop is the simplest way to iterate through a `TreeSet`. It internally uses an iterator to traverse through the set.

```java
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(20);
treeSet.add(30);

for (Integer num : treeSet) {
    System.out.println(num);
}
```

### 2. **Using Iterator**
You can explicitly use an `Iterator` to iterate through the elements of the `TreeSet`. This gives you more control, like the ability to remove elements during iteration.

```java
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(20);
treeSet.add(30);

Iterator<Integer> iterator = treeSet.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

### 3. **Using forEach (Java 8+)**
If you're using Java 8 or later, you can use the `forEach()` method with a lambda expression to iterate through the elements of the `TreeSet`.

```java
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(20);
treeSet.add(30);

treeSet.forEach(num -> System.out.println(num));
```

### 4. **Using a ListIterator (if applicable)**
A `ListIterator` can also be used for bidirectional iteration, but this is generally more useful for lists like `ArrayList` or `LinkedList`. `TreeSet` does not directly support bidirectional iteration, but it is still possible to convert it to a list and use a `ListIterator`.

```java
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(20);
treeSet.add(30);

List<Integer> list = new ArrayList<>(treeSet);
ListIterator<Integer> listIterator = list.listIterator();
while (listIterator.hasNext()) {
    System.out.println(listIterator.next());
}
```

### 5. **Using Streams (Java 8+)**
You can also convert the `TreeSet` to a stream and use stream operations, like `forEach`, to process the elements.

```java
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(20);
treeSet.add(30);

treeSet.stream().forEach(num -> System.out.println(num));
```

These are the most common ways to iterate over a `TreeSet`. The choice of iteration method depends on your needs, such as whether you need to modify the set during iteration, or if you are using features like Java 8's `forEach` or streams.