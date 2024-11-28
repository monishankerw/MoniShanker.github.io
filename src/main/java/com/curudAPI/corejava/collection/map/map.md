

```markdown
# Map in Java

- **Definition**: 
  - `Map` is an interface that represents a collection of key-value pairs, where each key is unique.
  - It provides an efficient way to store and retrieve values based on keys.
  - The most commonly used implementations of the `Map` interface are `HashMap`, `TreeMap`, and `LinkedHashMap`.

## Key Characteristics of a Map:

- **Key-Value Pair Storage**:
  - A `Map` stores data in pairs (`key`, `value`). You can retrieve a value by its key.
  
- **Unique Keys**:
  - Each key in a `Map` must be unique. If a duplicate key is added, it replaces the previous entry with the same key.
  
- **No Indexing**:
  - A `Map` does not maintain order in the way that a `List` does.
  - Some implementations like `LinkedHashMap` maintain insertion order, and `TreeMap` maintains sorted order.
  
- **Null Keys and Values**:
  - Some `Map` implementations like `HashMap` allow one null key and multiple null values.
  - `TreeMap` does not permit null keys.

## Example Code:

```java
Map<String, Integer> map = new HashMap<>();
map.put("Apple", 1);
map.put("Banana", 2);
map.put("Orange", 3);

// Retrieve value by key
int value = map.get("Banana");  // Returns 2
```
2.What are the commonly used Map implementations in Java?
Answer:
HashMap: A hash table-based implementation of Map, which provides constant-time performance for basic operations like get() and put(), assuming the hash function disperses the elements properly.
TreeMap: A Map that is sorted by its keys in natural order or by a comparator.
LinkedHashMap: A Map that maintains the insertion order of elements.
ConcurrentHashMap: A thread-safe version of HashMap.


Here are some multiple-choice questions (MCQs) based on the Map interface and its implementations in Java:

Basics of Map Interface

	1.	Which of the following is true about the Map interface?
	•	A. It allows duplicate keys.
	•	B. It stores data in key-value pairs.
	•	C. It maintains the order of elements by default.
	•	D. It extends the Collection interface.
Answer: B. It stores data in key-value pairs.
2.	What happens if you insert a duplicate key into a Map?
•	A. It throws an exception.
•	B. The previous value associated with that key is replaced.
•	C. Both values are stored.
•	D. The operation is ignored.
Answer: B. The previous value associated with that key is replaced.
3.	Which of the following Map implementations allows one null key and multiple null values?
•	A. HashMap
•	B. TreeMap
•	C. LinkedHashMap
•	D. Both HashMap and LinkedHashMap
Answer: D. Both HashMap and LinkedHashMap

Map Implementations

	4.	Which Map implementation is sorted by its keys?
	•	A. HashMap
	•	B. TreeMap
	•	C. LinkedHashMap
	•	D. ConcurrentHashMap
Answer: B. TreeMap
5.	Which Map implementation maintains the insertion order of elements?
•	A. HashMap
•	B. TreeMap
•	C. LinkedHashMap
•	D. Hashtable
Answer: C. LinkedHashMap
6.	Which Map implementation is thread-safe?
•	A. HashMap
•	B. TreeMap
•	C. LinkedHashMap
•	D. ConcurrentHashMap
Answer: D. ConcurrentHashMap
7.	Which Map implementation does not allow null keys?
•	A. HashMap
•	B. TreeMap
•	C. LinkedHashMap
•	D. ConcurrentHashMap
Answer: B. TreeMap
8.	What is the main difference between HashMap and LinkedHashMap?
•	A. HashMap allows null keys, while LinkedHashMap does not.
•	B. LinkedHashMap maintains insertion order, while HashMap does not.
•	C. HashMap is thread-safe, while LinkedHashMap is not.
•	D. LinkedHashMap allows duplicate keys, while HashMap does not.
Answer: B. LinkedHashMap maintains insertion order, while HashMap does not.

Working with Maps

	9.	Which method is used to retrieve a value associated with a specific key in a Map?
	•	A. getKey()
	•	B. find()
	•	C. fetch()
	•	D. get()
Answer: D. get()
10.	How do you check if a Map contains a specific key?
•	A. map.hasKey(key)
•	B. map.contains(key)
•	C. map.containsKey(key)
•	D. map.getKey(key)
Answer: C. map.containsKey(key)
11.	Which of the following is a correct way to remove a key-value pair from a Map?
•	A. map.delete(key)
•	B. map.remove(key)
•	C. map.erase(key)
•	D. map.clear(key)
Answer: B. map.remove(key)

Performance and Use Cases

	12.	Which Map implementation provides constant-time performance for get() and put() operations?
	•	A. TreeMap
	•	B. HashMap
	•	C. LinkedHashMap
	•	D. ConcurrentHashMap
Answer: B. HashMap
13.	Which of the following Map implementations is most suitable for maintaining a sorted order of keys?
•	A. HashMap
•	B. TreeMap
•	C. LinkedHashMap
•	D. ConcurrentHashMap
Answer: B. TreeMap

Null Keys and Values

	14.	Which of these statements about null keys in Java Map implementations is correct?
	•	A. HashMap does not allow null keys.
	•	B. TreeMap allows multiple null keys.
	•	C. LinkedHashMap allows one null key.
	•	D. ConcurrentHashMap allows null keys.
Answer: C. LinkedHashMap allows one null key.
15.	Why does TreeMap not allow null keys?
•	A. Because it is synchronized.
•	B. Because it maintains a natural ordering of keys.
•	C. Because it is backed by a LinkedHashMap.
•	D. Because it uses hashing for storage.
Answer: B. Because it maintains a natural ordering of keys.

Thread Safety

	16.	Which of the following statements is true regarding ConcurrentHashMap?
	•	A. It allows null keys and values.
	•	B. It is thread-safe and supports concurrency.
	•	C. It maintains insertion order.
	•	D. It throws an exception if a duplicate key is added.
Answer: B. It is thread-safe and supports concurrency.
17.	Which Map implementation is preferred for a single-threaded application where key ordering is important?
•	A. HashMap
•	B. TreeMap
•	C. ConcurrentHashMap
•	D. Hashtable
Answer: B. TreeMap
18.	Which method would you use to get the number of key-value pairs in a Map?
•	A. map.count()
•	B. map.size()
•	C. map.length()
•	D. map.items()
Answer: B. map.size()

Practical Scenarios

	19.	Which Map implementation would you use if you need a thread-safe collection and don’t need to maintain order?
	•	A. HashMap
	•	B. LinkedHashMap
	•	C. TreeMap
	•	D. ConcurrentHashMap
Answer: D. ConcurrentHashMap
20.	Which Map method returns a Set of the keys contained in the Map?
•	A. map.keySet()
•	B. map.getKeys()
•	C. map.values()
•	D. map.getKeySet()
Answer: A. map.keySet()
``` 

