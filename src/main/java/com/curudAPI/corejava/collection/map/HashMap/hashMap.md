Here’s the Markdown version of the content you shared:

```markdown
# Java HashMap, HashSet, and HashTable FAQs

### Q. Difference between `HashMap` and `HashTable`.
- **HashMap**:
  1. Not synchronized, not thread-safe (better performance).
  2. Allows `null` for both key and value.(key use only one null and value use multiple)
  3. Non-legacy class.
  4. Introduced in JDK 1.2.

- **HashTable**:
  1. Synchronized, thread-safe (poor performance).
  2. Does not allow `null` for key or value.
  3. Legacy class.
  4. Introduced in JDK 1.1.

### Q. Difference between `HashMap` and `HashSet`.
- **HashMap**:
  1. Stores key-value pairs.
  2. Allows duplicate values.
  3. `put(k, v)` method is used.
  4. Requires two objects: key and value.

- **HashSet**:
  1. Only stores keys.
  2. Does not allow duplicate values.
  3. `add(obj)` method is used.
  4. Requires one object.

### Q. How does `HashMap` work internally?
- HashMap internally works similar to a `HashTable`.
- Example:
  ```java
  HashMap<String, Integer> map = new HashMap<>();
  map.put("xyz(key)", 32(value));
  ```

- In Java 8, `HashMap` replaces `LinkedList` with a binary tree when the number of elements in a bucket exceeds a threshold.
- While converting the list to a binary tree, the hash code is used as a branching variable.

    - **Initial Capacity (IC)** = 16
    - **Load Factor (LF)** = 0.75
    - **Hashing Calculation**: IC * LF = 16 * 0.75 = 12
    - At the 12th key-value pair, `HashMap`'s capacity will double to 32.

- [Reference: Internal Working of HashMap in Java](https://www.geeksforgeeks.org/internal-working-of-hashmap-java/)

### HashTable Internal Working
- **HashTable** is synchronized and thread-safe.
- Stores content as key-value pairs.
- Any non-null object can be used as a key or a value.

  Example:
  ```java
  class A {
      public static void main() {
          HashTable<Integer, String> h = new HashTable<>();
          h.put(100, "abc");
          h.put(101, "dbc");
          System.out.println(h);
      }
  }
  ```

- [Reference: Internal Working of HashTable in Java](https://www.geeksforgeeks.org/how-hashtable-works-internally-in-java/)

### Q. Time complexity of `put()` and `get()` operations in `HashMap`?
- Best case: O(1) for both `put()` and `get()`.
- Worst case: O(n) when many collisions occur (using a linked list).
- In Java 8+, collisions use a balanced tree, reducing time complexity to O(log n).

### Q. Difference between `HashMap` and `ConcurrentHashMap`?
- **HashMap** is not thread-safe and can lead to data inconsistency with concurrent access.
- **ConcurrentHashMap** is thread-safe, allowing concurrent access by multiple threads by locking portions of the map instead of the entire map.

### Q. Can you use `null` keys and values in `HashMap` and `TreeMap`?
- **HashMap** allows one `null` key and multiple `null` values.
- **TreeMap** does not allow `null` keys as it relies on sorting, which throws `NullPointerException` if the keys are `null`.

### Q. How do you iterate over a Map in Java?
1. **Using `entrySet()` for key-value pairs**:
   ```java
   for (Map.Entry<String, Integer> entry : map.entrySet()) {
       System.out.println(entry.getKey() + " : " + entry.getValue());
   }
   ```
2. **Using `keySet()` to iterate over keys**:
   ```java
   for (String key : map.keySet()) {
       System.out.println(key);
   }
   ```
3. **Using `values()` to iterate over values**:
   ```java
   for (Integer value : map.values()) {
       System.out.println(value);
   }
   ```

### Q. Difference between `keySet()`, `entrySet()`, and `values()` in a `Map`?
- `keySet()`: Returns a set of all keys.
- `entrySet()`: Returns a set of key-value pairs (entries).
- `values()`: Returns a collection of all values.

### Q. How to handle concurrent modifications in a `Map`?
- Use `ConcurrentHashMap` for concurrent access without `ConcurrentModificationException`.
- Alternatively, synchronize access with `Collections.synchronizedMap()`.

### Q. What happens if two keys have the same `hashCode` in `HashMap`?
- Both keys are placed in the same bucket, and the `equals()` method is used to differentiate them.
- In Java 8+, if collisions occur, entries are stored in a balanced tree, reducing lookup time.

### Q. What is the load factor in `HashMap`?
- The load factor measures how full the `HashMap` can get before resizing.
- Default load factor is 0.75, meaning when 75% of the capacity is filled, `HashMap` will resize (usually doubling the bucket size).

### Q. How does `LinkedHashMap` maintain the order of elements?
- `LinkedHashMap` maintains a doubly-linked list of entries, preserving the insertion order or access order.

### Q. How to sort a `HashMap` by values?
- Convert `HashMap` to a list and sort using a comparator:
  ```java
  Map<String, Integer> map = new HashMap<>();
  map.put("Apple", 2);
  map.put("Banana", 1);
  map.put("Orange", 3);

  List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
  list.sort(Map.Entry.comparingByValue());

  for (Map.Entry<String, Integer> entry : list) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
  }
  ```

### Q. Explain `WeakHashMap` in Java.
- **WeakHashMap** uses weak references for keys. If a key is no longer referenced elsewhere, the garbage collector removes the entry from the map. Useful for caching scenarios.
```

