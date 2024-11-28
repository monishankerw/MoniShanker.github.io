How would you iterate over a Map in Java?

In Java, you can iterate over a `Map` in several ways. Here are four common methods:

### 1. Using `entrySet()` and a for-each loop:
This is the most common and efficient way to iterate over a `Map`.

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");

for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
```

### 2. Using `keySet()` and a for-each loop:
You can iterate over the keys, and then retrieve the values using `get()`.

```java
for (Integer key : map.keySet()) {
    System.out.println("Key: " + key + ", Value: " + map.get(key));
}
```

### 3. Using `values()` to iterate only over the values:
If you only need the values, you can use `values()`.

```java
for (String value : map.values()) {
    System.out.println("Value: " + value);
}
```

### 4. Using Java 8's `forEach()` with Lambda:
Java 8 introduced the `forEach()` method, which allows you to iterate over a `Map` more concisely.

```java
map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
```

Each of these methods is useful depending on your requirements, but `entrySet()` is often preferred for performance and clarity when you need both keys and values.



Explain different ways to iterate over key-value pairs in a Map.


### 1. **Using `entrySet()` and a `for-each` loop (Recommended)**
The `entrySet()` method returns a set view of the `Map`'s key-value pairs as `Map.Entry` objects. This method is both efficient and easy to read when you need access to both the keys and values.

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");

for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
```
- **Advantages**: Provides direct access to both key and value. Efficient and widely used.
- **Use case**: When you need to access both keys and values.

### 2. **Using `keySet()` and a `for-each` loop**
The `keySet()` method returns a `Set` of all the keys in the `Map`. You can then use each key to retrieve its corresponding value.

```java
for (Integer key : map.keySet()) {
    System.out.println("Key: " + key + ", Value: " + map.get(key));
}
```
- **Advantages**: Easy to understand.
- **Disadvantages**: Less efficient because `get()` is called for each key, which can be costly for large maps.
- **Use case**: When you are primarily focused on the keys or when values are not as important.

### 3. **Using `values()` for iterating over values only**
The `values()` method returns a `Collection` of the values contained in the `Map`, allowing you to iterate over the values only (without needing the keys).

```java
for (String value : map.values()) {
    System.out.println("Value: " + value);
}
```
- **Advantages**: Useful when you only need the values.
- **Disadvantages**: No access to the keys.
- **Use case**: When you only care about the values and not the keys.

### 4. **Using Java 8 `forEach()` method (Lambda expression)**
Java 8 introduced the `forEach()` method, which allows you to iterate through the `Map` using lambda expressions.

```java
map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
```
- **Advantages**: Concise, modern, and easier to read. No need for explicit loops.
- **Use case**: When you want a more functional-style iteration, particularly in Java 8 and above.

### 5. **Using `Iterator` over `entrySet()`**
You can also use an `Iterator` to iterate over the `entrySet()` of the `Map`. This is useful when you need to remove entries while iterating.

```java
Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<Integer, String> entry = iterator.next();
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
```
- **Advantages**: Supports removing entries from the `Map` while iterating.
- **Use case**: When you need to safely modify the `Map` (e.g., removing entries) during iteration.

### 6. **Using `Stream API` (Java 8 and above)**
You can convert the `Map` into a stream and then process it using stream operations such as `forEach`, `filter`, `map`, etc.

```java
map.entrySet().stream()
    .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
```
- **Advantages**: Offers more flexibility for applying complex operations (e.g., filtering, mapping).
- **Use case**: When you need to apply additional transformations or filtering on the `Map` entries.

### Summary
- **For general use**: `entrySet()` in a `for-each` loop is the most common and efficient approach.
- **For accessing only keys or values**: Use `keySet()` or `values()`.
- **For functional programming style**: Use Java 8’s `forEach()` or `Stream API`.
- **For modifying the map while iterating**: Use an `Iterator`.