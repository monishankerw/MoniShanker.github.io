1. **Difference Between Collection and Collections?**
2. **Difference Between Arrays and Collections?**
3. **Collections Hierarchically?**
4. **List Hierarchically?**
5. **Difference Between Arrays and ArrayList?**
6. **Difference Between ArrayList and LinkedList?**
7. **Difference Between ArrayList and Vector?**



### Basic ArrayList Operations

1. **How do you initialize an ArrayList in Java?**
    - Example: `ArrayList<Integer> list = new ArrayList<>();`

2. **How can you add elements to an ArrayList?**
    - Example: `list.add(10); list.add(20);`

3. **How do you access an element in an ArrayList by its index?**
    - Example: `Integer element = list.get(0);`

4. **How do you remove an element from an ArrayList by its index or value?**
    - Example: `list.remove(0);` or `list.remove(Integer.valueOf(10));`

5. **How do you update or replace an element at a specific index in an ArrayList?**
    - Example: `list.set(0, 30);`

6. **How can you check if an ArrayList contains a specific element?**
    - Example: `boolean exists = list.contains(10);`

### Advanced ArrayList Operations

7. **How do you sort an ArrayList in ascending or descending order?**
    - Example for ascending: `Collections.sort(list);`
    - Example for descending: `Collections.sort(list, Collections.reverseOrder());`

8. **How can you convert an ArrayList to an array?**
    - Example: `Integer[] array = list.toArray(new Integer[0]);`

9. **How can you convert an array to an ArrayList?**
    - Example: `ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));`

10. **What is the difference between `ArrayList` and `LinkedList` in Java?**
    - `ArrayList` is backed by a dynamic array, while `LinkedList` is backed by a doubly linked list, which affects their performance in operations like insertions and deletions.

### Performance and Capacity Management

11. **How does ArrayList manage its capacity, and how can you optimize it?**
    - `ArrayList` grows dynamically, usually doubling its size when full. Use `ArrayList(int initialCapacity)` for optimization if size is known.

12. **What is the default capacity of an ArrayList?**
    - The default capacity is 10 when an ArrayList is created with the no-argument constructor.

13. **How can you trim an ArrayList's size to match the number of elements in it?**
    - Example: `list.trimToSize();`

14. **What is the complexity of various ArrayList operations?**
    - For example: `get` and `set` have `O(1)`, while `add` and `remove` have `O(n)` in the worst case.

### ArrayList Manipulations and Functional Programming

15. **How can you iterate over an ArrayList using different methods?**
    - Examples: `for` loop, `forEach` loop, iterator, `forEach` with lambda expressions.

16. **How can you filter elements of an ArrayList based on a condition using Streams?**
    - Example: `list.stream().filter(x -> x > 10).collect(Collectors.toList());`

17. **How do you remove all elements from an ArrayList?**
    - Example: `list.clear();`

18. **How to merge two ArrayLists into a single ArrayList?**
    - Example: `list1.addAll(list2);`

### Concurrency and Synchronization

19. **Is ArrayList synchronized, and how can you make it thread-safe?**
    - `ArrayList` is not synchronized. You can use `Collections.synchronizedList(list);` to make it thread-safe.

20. **What is `CopyOnWriteArrayList`, and how is it different from `ArrayList`?**
    - `CopyOnWriteArrayList` is a thread-safe variant of `ArrayList` that creates a new copy of the list for every write operation.

### Interview Scenarios and Problem-Solving

21. **How would you remove duplicates from an ArrayList?**
    - Solution: Convert to a `Set` or use a `Stream` with `distinct()`.

22. **How can you reverse an ArrayList?**
    - Example: `Collections.reverse(list);`

23. **How do you find the index of the first and last occurrence of an element?**
    - Example: `list.indexOf(10);` and `list.lastIndexOf(10);`

24. **How do you find the maximum and minimum values in an ArrayList?**
    - Example: `Collections.max(list);` and `Collections.min(list);`

25. **Write a method to check if two ArrayLists are equal.**
    - Example: `list1.equals(list2);`



Here are some multiple-choice questions (MCQs) covering various aspects of collections in Java:

Basic Concepts

	1.	What is the main difference between Collection and Collections in Java?
	•	A. Collection is a class, and Collections is an interface.
	•	B. Collection is an interface, and Collections is a class with utility methods.
	•	C. Both are classes.
	•	D. Both are interfaces.
Answer: B. Collection is an interface, and Collections is a class with utility methods.
2.	What is the main difference between an array and a Collection in Java?
•	A. Arrays are dynamic, while Collections are fixed in size.
•	B. Arrays only store homogeneous data, whereas collections can store both homogeneous and heterogeneous data.
•	C. Arrays are less memory-efficient than collections.
•	D. Arrays have an underlying data structure, while collections do not.
Answer: B. Arrays only store homogeneous data, whereas collections can store both homogeneous and heterogeneous data.
3.	Which of the following is an interface?
•	A. ArrayList
•	B. HashSet
•	C. Collection
•	D. Collections
Answer: C. Collection
4.	Which class is part of the List hierarchy?
•	A. HashSet
•	B. LinkedList
•	C. TreeSet
•	D. PriorityQueue
Answer: B. LinkedList

ArrayList Operations

	5.	How do you add an element to an ArrayList?
	•	A. list.insert(10);
	•	B. list.add(10);
	•	C. list.put(10);
	•	D. list.push(10);
Answer: B. list.add(10);
6.	Which method is used to remove an element by value from an ArrayList?
•	A. list.delete(10);
•	B. list.remove(0);
•	C. list.drop(10);
•	D. list.erase(10);
Answer: B. list.remove(0);
7.	What is the complexity of accessing an element by index in an ArrayList?
•	A. O(1)
•	B. O(n)
•	C. O(log n)
•	D. O(n^2)
Answer: A. O(1)
8.	What is the output of list.contains(10); if 10 is in the list?
•	A. false
•	B. true
•	C. -1
•	D. null
Answer: B. true

Advanced ArrayList Operations

	9.	How do you sort an ArrayList in ascending order?
	•	A. Collections.sort(list);
	•	B. list.sortAscending();
	•	C. list.order();
	•	D. Arrays.sort(list);
Answer: A. Collections.sort(list);
10.	Which method converts an ArrayList to an array?
•	A. list.convertToArray()
•	B. list.toArray(new Integer[0])
•	C. Arrays.asArray(list)
•	D. list.makeArray()
Answer: B. list.toArray(new Integer[0])
11.	Which of the following correctly converts an array to an ArrayList?
•	A. new ArrayList<>(array);
•	B. Arrays.asList(array);
•	C. ArrayList.fromArray(array);
•	D. new ArrayList(Arrays.asList(array));
Answer: D. new ArrayList<>(Arrays.asList(array));

Performance and Capacity

	12.	What is the default initial capacity of an ArrayList?
	•	A. 5
	•	B. 10
	•	C. 15
	•	D. 20
Answer: B. 10
13.	Which method trims an ArrayList to its actual size?
•	A. list.trim()
•	B. list.trimToSize()
•	C. list.resize()
•	D. list.compress()
Answer: B. list.trimToSize()

ArrayList vs. LinkedList

	14.	Which data structure is more efficient for inserting and deleting elements in the middle?
	•	A. ArrayList
	•	B. LinkedList
	•	C. HashSet
	•	D. Stack
Answer: B. LinkedList
15.	What is a key difference between ArrayList and LinkedList?
•	A. ArrayList is thread-safe, while LinkedList is not.
•	B. ArrayList uses a dynamic array, and LinkedList uses a doubly linked list.
•	C. ArrayList can only store homogeneous data.
•	D. LinkedList has a fixed size.
Answer: B. ArrayList uses a dynamic array, and LinkedList uses a doubly linked list.

Concurrency and Synchronization

	16.	Which of the following makes an ArrayList thread-safe?
	•	A. Collections.synchronizedList(list);
	•	B. list.makeThreadSafe();
	•	C. ThreadSafeArrayList(list);
	•	D. list.sync();
Answer: A. Collections.synchronizedList(list);
17.	What is a CopyOnWriteArrayList?
•	A. A variant of ArrayList that removes duplicates.
•	B. A thread-safe list that creates a copy for each write operation.
•	C. An array-backed list with a fixed size.
•	D. An extension of LinkedList.
Answer: B. A thread-safe list that creates a copy for each write operation.

Functional Programming and Streams

	18.	Which of the following is correct for filtering elements in an ArrayList?
	•	A. list.stream().filter(x -> x > 10).collect(Collectors.toList());
	•	B. list.filter(x -> x > 10);
	•	C. list.filterAll(x -> x > 10);
	•	D. list.stream().collect(Collectors.filter(x -> x > 10));
Answer: A. list.stream().filter(x -> x > 10).collect(Collectors.toList());

Problem-Solving and Utilities

	19.	Which method removes all elements from an ArrayList?
	•	A. list.deleteAll();
	•	B. list.clear();
	•	C. list.removeAll();
	•	D. list.reset();
Answer: B. list.clear();
20.	How do you find the maximum value in an ArrayList of integers?
•	A. Collections.max(list);
•	B. list.max();
•	C. list.getMax();
•	D. ArrayList.max(list);
Answer: A. Collections.max(list);

