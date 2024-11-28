What is the internal data structure of a HashMap?

The internal data structure of a `HashMap` in Java is a combination of **array** and **linked list** (or **tree** in case of high collision) that optimizes the efficiency of data storage and retrieval. Let's break it down in detail:

### 1. **Array (Bucket Array)**
At its core, `HashMap` is backed by an array called a **bucket array**, where each element of the array is a bucket. This bucket array stores references to **linked lists** (or **binary search trees** in some cases).

- **Indexing:** When you insert a key-value pair into the `HashMap`, a **hash code** is generated for the key. This hash code is then used to calculate an index in the array, where the key-value pair will be stored. The index is determined using the formula:

  ```java
  index = (hashCode(key) & (n - 1))
  ```

  where `n` is the size of the bucket array, which is always a power of two.

### 2. **Linked List (for handling Collisions)**
In case two keys generate the same index (due to hash collisions), `HashMap` uses **separate chaining** to resolve the collision. The bucket (array element) at the given index contains a **linked list** of key-value pairs (each stored as a `Map.Entry` object).

- If two keys collide (i.e., their hash codes produce the same index), the new key-value pair is simply appended to the linked list at that index.
- During retrieval, the `HashMap` will search the linked list for the key.

### 3. **Tree (Red-Black Tree after Java 8)**
Starting with **Java 8**, if a bucket's linked list becomes too long (i.e., more than **8 elements**), `HashMap` optimizes it by converting the linked list into a **balanced binary search tree (Red-Black Tree)**.

- The reason for this is to improve performance from **O(n)** (linear search in the linked list) to **O(log n)** (logarithmic search in the tree).
- This transformation happens when the number of elements in the bucket exceeds a certain threshold (8), and it reverts back to a linked list if the number of elements drops below a threshold (6).

### 4. **Key Components Inside the Bucket**
Each element stored in the `HashMap` bucket array is a **Map.Entry** object, which contains:
- **Key**: The key of the map.
- **Value**: The corresponding value of the key.
- **Hash Code**: The hash code of the key.
- **Next**: A reference to the next node (for handling collisions, linked list or tree).

### 5. **Rehashing**
When the load factor (the ratio of the number of elements to the size of the array) exceeds a certain threshold (default is **0.75**), `HashMap` resizes its array by creating a new bucket array of double the size and redistributes the entries (called **rehashing**).

### Visual Representation:
1. **Array:**
    - The array holds references to linked lists (or trees).

2. **Linked List:**
    - Each bucket can point to a linked list of entries when collisions occur.

   ```
   [ ] -> [Node(Key1, Value1)] -> [Node(Key2, Value2)] -> null
   ```

3. **Tree:**
    - When the list gets too long, it converts into a Red-Black tree for better lookup performance.

   ```
   [ ] -> Root -> [Key1, Value1]
                  /        \
         [Key2, Value2]  [Key3, Value3]
   ```

### Example: Insertion Process
1. **Insert Key-Value Pair:**
    - The hash code is calculated for the key.
    - An index is determined using the formula `index = hashCode & (n - 1)`.
    - If no collision occurs, the key-value pair is inserted in the corresponding index.
    - If a collision occurs (i.e., the bucket is already occupied), it is added to a linked list or converted to a tree if the linked list becomes too long.

### Time Complexity:
- **Average Time Complexity:**
    - Insert, Search, Delete operations in a `HashMap` have an average time complexity of **O(1)** because the key is hashed to find the index.

- **Worst-case Time Complexity:**
    - Without tree optimization, in the worst case (if all keys collide), the time complexity degrades to **O(n)** due to the linked list traversal.
    - With the tree optimization (introduced in Java 8), the worst-case complexity for such scenarios improves to **O(log n)**.

### Summary:
The internal data structure of `HashMap` consists of:
- **An array of buckets** for storing key-value pairs.
- **Linked lists** for handling collisions.
- **Red-Black Trees** (Java 8+) to optimize performance when collisions become excessive.
- **Rehashing** mechanism to redistribute the entries when the load factor exceeds a threshold.