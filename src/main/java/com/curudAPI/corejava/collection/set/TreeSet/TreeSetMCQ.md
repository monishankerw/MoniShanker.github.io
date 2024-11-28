
---

### 1. **Which of the following methods is used to add an element to a `TreeSet`?**
a) `add()`
b) `insert()`
c) `put()`
d) `push()`

**Answer**: a) `add()`

---

### 2. **What is the default sorting order in a `TreeSet`?**
a) Ascending order  
b) Descending order  
c) Custom order defined by a comparator  
d) No order at all

**Answer**: a) Ascending order

---

### 3. **What will happen if you try to add a `null` element to a `TreeSet` with natural ordering?**
a) It will throw a `NullPointerException`  
b) It will be added as the smallest element  
c) It will be added as the largest element  
d) It will be ignored

**Answer**: a) It will throw a `NullPointerException`

---

### 4. **Which of the following is the underlying data structure of a `TreeSet`?**
a) Array  
b) Linked list  
c) HashMap  
d) Red-Black Tree

**Answer**: d) Red-Black Tree

---

### 5. **What happens when you try to add a duplicate element to a `TreeSet`?**
a) It replaces the old element  
b) It throws an exception  
c) It is ignored  
d) It adds the element at a random position

**Answer**: c) It is ignored

---

### 6. **Which of the following interfaces does `TreeSet` implement?**
a) `List`  
b) `Set`  
c) `Queue`  
d) `Map`

**Answer**: b) `Set`

---

### 7. **Which method is used to check if a `TreeSet` contains a specific element?**
a) `hasElement()`  
b) `isPresent()`  
c) `contains()`  
d) `find()`

**Answer**: c) `contains()`

---

### 8. **What is the time complexity of the `add()` method in a `TreeSet`?**
a) O(1)  
b) O(log n)  
c) O(n)  
d) O(n log n)

**Answer**: b) O(log n)

---

### 9. **Which of the following methods in a `TreeSet` will return the smallest (first) element?**
a) `getFirst()`  
b) `min()`  
c) `first()`  
d) `head()`

**Answer**: c) `first()`

---

### 10. **How can you remove all elements from a `TreeSet`?**
a) `clearAll()`  
b) `empty()`  
c) `clear()`  
d) `removeAll()`

**Answer**: c) `clear()`

---

### 11. **Which method is used to get a subset of a `TreeSet` from a specified element?**
a) `subSet()`  
b) `tailSet()`  
c) `headSet()`  
d) `getSubSet()`

**Answer**: a) `subSet()`

---

### 12. **What is the maximum number of elements that a `TreeSet` can store?**
a) 10^6  
b) There is no limit  
c) Integer.MAX_VALUE  
d) It depends on the JVM

**Answer**: b) There is no limit

---

### 13. **Which of the following is the correct way to create a `TreeSet` with a custom `Comparator`?**
a) `TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());`  
b) `TreeSet<String> set = new TreeSet<>(new CustomComparator());`  
c) `TreeSet<String> set = new TreeSet<>(new Comparator<String>() {...});`  
d) All of the above

**Answer**: d) All of the above

---

### 14. **Which of the following methods in a `TreeSet` allows you to find the greatest element that is less than or equal to a given element?**
a) `floor()`  
b) `ceiling()`  
c) `lower()`  
d) `higher()`

**Answer**: a) `floor()`

---

### 15. **Which method in a `TreeSet` would return a subset of elements that are greater than or equal to a given element?**
a) `subSet()`  
b) `tailSet()`  
c) `headSet()`  
d) `upperSet()`

**Answer**: b) `tailSet()`

---

### 16. **What is the result of calling `treeSet.tailSet(element)` on a `TreeSet`?**
a) It returns all elements greater than or equal to the given element.  
b) It returns all elements less than the given element.  
c) It returns a subset of elements that are equal to the given element.  
d) It removes the given element from the set.

**Answer**: a) It returns all elements greater than or equal to the given element.

---

### 17. **What is the result of calling `treeSet.headSet(element)` on a `TreeSet`?**
a) It returns all elements greater than the given element.  
b) It returns all elements less than the given element.  
c) It removes the given element from the set.  
d) It returns a subset of elements that are equal to the given element.

**Answer**: b) It returns all elements less than the given element.

---

### 18. **Which of the following is true about the `TreeSet` class in Java?**
a) It implements the `List` interface.  
b) It allows duplicate elements.  
c) It stores elements in ascending order by default.  
d) It is backed by an array.

**Answer**: c) It stores elements in ascending order by default.

---

### 19. **Which method returns a view of the portion of the `TreeSet` whose elements are strictly less than a given element?**
a) `subSet()`  
b) `headSet()`  
c) `tailSet()`  
d) `lowerSet()`

**Answer**: b) `headSet()`

---

### 20. **What is the time complexity of the `contains()` method in a `TreeSet`?**
a) O(1)  
b) O(log n)  
c) O(n)  
d) O(n log n)

**Answer**: b) O(log n)

---

### 21. **Which of the following statements is true about `TreeSet`?**
a) It allows `null` elements if the comparator is not used.  
b) It does not allow `null` elements.  
c) It allows `null` elements with natural ordering.  
d) It allows `null` elements only if a custom comparator is provided.

**Answer**: b) It does not allow `null` elements.

---

### 22. **Which of the following methods in `TreeSet` can be used to check the size of the set?**
a) `count()`  
b) `getSize()`  
c) `size()`  
d) `length()`

**Answer**: c) `size()`

---

### 23. **How does a `TreeSet` handle duplicate elements?**
a) It stores duplicates in a separate collection.  
b) It ignores the duplicate element and doesn't add it.  
c) It replaces the duplicate element with the new one.  
d) It throws an exception when a duplicate element is added.

**Answer**: b) It ignores the duplicate element and doesn't add it.

---

### 24. **What will the `ceiling()` method in `TreeSet` return if no element is greater than or equal to the specified element?**
a) The greatest element less than the specified element.  
b) `null`  
c) The specified element itself.  
d) An exception.

**Answer**: b) `null`

---

### 25. **Which of the following methods allows the iteration of a `TreeSet` using a lambda expression?**
a) `forEach()`  
b) `iterate()`  
c) `stream()`  
d) `lambda()`

**Answer**: a) `forEach()`

---

### 26. **Which of the following is the correct way to iterate over a `TreeSet`?**
a) Using a `for` loop  
b) Using an `Iterator`  
c) Using `forEach()`  
d) All of the above

**Answer**: d) All of the above

---

### 27. **What is the `lower()` method used for in a `TreeSet`?**
a) It returns the greatest element that is less than the given element.


b) It returns the smallest element that is greater than the given element.  
c) It returns a subset of elements that are less than the given element.  
d) It returns the given element if it exists.

**Answer**: a) It returns the greatest element that is less than the given element.

---

### 28. **Which of the following is a valid way to create an empty `TreeSet`?**
a) `TreeSet<String> set = new TreeSet<>();`  
b) `TreeSet<String> set = new TreeSet<String>();`  
c) `TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());`  
d) All of the above

**Answer**: d) All of the above

---

### 29. **Which of the following methods is used to get the first element in a `TreeSet`?**
a) `first()`  
b) `min()`  
c) `head()`  
d) `top()`

**Answer**: a) `first()`

---

### 30. **What will happen if you attempt to add a non-comparable element to a `TreeSet`?**
a) It will be added without any issues.  
b) It will throw a `ClassCastException`.  
c) It will be added as the smallest element.  
d) It will be added as the largest element.

**Answer**: b) It will throw a `ClassCastException`.

---

### 31. **Which method is used to find the greatest element in a `TreeSet` that is less than or equal to a specified element?**
a) `ceiling()`  
b) `floor()`  
c) `lower()`  
d) `higher()`

**Answer**: b) `floor()`

---

### 32. **Which of the following collections is `TreeSet` most similar to?**
a) `ArrayList`  
b) `HashSet`  
c) `LinkedList`  
d) `PriorityQueue`

**Answer**: b) `HashSet`

---

### 33. **Which of the following statements is true about the `subSet()` method in `TreeSet`?**
a) It returns a view of a subset of elements between the specified start and end.  
b) It returns a copy of the subset.  
c) It throws an exception if the start element is greater than the end element.  
d) It removes elements outside the range.

**Answer**: a) It returns a view of a subset of elements between the specified start and end.

---

### 34. **How does `TreeSet` order its elements?**
a) Based on insertion order  
b) Based on natural ordering or a custom comparator  
c) It does not order its elements  
d) It orders elements by the hash value

**Answer**: b) Based on natural ordering or a custom comparator

---

### 35. **Which of the following methods can be used to convert a `TreeSet` to a list?**
a) `toList()`  
b) `asList()`  
c) `new ArrayList<>(treeSet)`  
d) `convertToList()`

**Answer**: c) `new ArrayList<>(treeSet)`

---

### 36. **Which method is used to retrieve the last (highest) element in a `TreeSet`?**
a) `last()`  
b) `max()`  
c) `top()`  
d) `end()`

**Answer**: a) `last()`

---

### 37. **What will happen if you attempt to add an element to a `TreeSet` that is not comparable?**
a) It will be added without issues.  
b) It will be added as the largest element.  
c) It will throw a `ClassCastException`.  
d) It will be ignored.

**Answer**: c) It will throw a `ClassCastException`.

---

### 38. **What is the output of `treeSet.ceiling(5)` if `treeSet` contains `{1, 3, 7, 10}`?**
a) 1  
b) 3  
c) 7  
d) 10

**Answer**: c) 7

---

### 39. **What is the effect of calling `treeSet.pollFirst()` on a `TreeSet`?**
a) It removes the last element.  
b) It removes and returns the first element.  
c) It removes the highest element.  
d) It clears the set.

**Answer**: b) It removes and returns the first element.

---

### 40. **Which of the following methods can you use to get the number of elements in a `TreeSet`?**
a) `count()`  
b) `size()`  
c) `length()`  
d) `getSize()`

**Answer**: b) `size()`

---

### 41. **Which method would you use to find the greatest element strictly less than a specified element in a `TreeSet`?**
a) `higher()`  
b) `ceiling()`  
c) `lower()`  
d) `floor()`

**Answer**: c) `lower()`

---

### 42. **How does a `TreeSet` handle elements that do not implement the `Comparable` interface?**
a) It throws a `ClassCastException`.  
b) It ignores them.  
c) It replaces them with `null`.  
d) It uses the `hashCode()` method to compare.

**Answer**: a) It throws a `ClassCastException`.

---

### 43. **Which of the following is true about a `TreeSet` created with a custom comparator?**
a) It sorts elements in the order defined by the comparator.  
b) It ignores the comparator and uses natural ordering.  
c) It allows duplicate elements based on the comparator's comparison.  
d) It can store `null` elements if the comparator supports it.

**Answer**: a) It sorts elements in the order defined by the comparator.

---

### 44. **Which method would you use to check if a `TreeSet` is empty?**
a) `isEmpty()`  
b) `hasElements()`  
c) `checkEmpty()`  
d) `isNull()`

**Answer**: a) `isEmpty()`

---

### 45. **Which of the following statements is true about `TreeSet` in Java?**
a) It stores elements in the order of insertion.  
b) It only allows one element of each type.  
c) It stores elements in sorted order.  
d) It implements the `Queue` interface.

**Answer**: c) It stores elements in sorted order.

---

### 46. **Which of the following methods in `TreeSet` can be used to add an element?**
a) `insert()`  
b) `add()`  
c) `put()`  
d) `store()`

**Answer**: b) `add()`

---

### 47. **What is the behavior of a `TreeSet` when you call `subSet()` with invalid range values?**
a) It throws an exception.  
b) It returns an empty set.  
c) It ignores the range and returns the entire set.  
d) It sorts the range before returning.

**Answer**: a) It throws an exception.

---

### 48. **Which of the following methods returns the last (largest) element in a `TreeSet`?**
a) `last()`  
b) `max()`  
c) `end()`  
d) `top()`

**Answer**: a) `last()`

---

### 49. **How do you prevent the addition of `null` elements to a `TreeSet`?**
a) By using a custom comparator that throws an exception for `null` values.  
b) By checking for `null` before adding.  
c) By using `Optional` to wrap the elements.  
d) `TreeSet` does not allow `null` values by default.

**Answer**: d) `TreeSet` does not allow `null` values by default.

---

### 50. **Which method returns a subset of elements from the `TreeSet` that are greater than or equal to a specified element?**
a) `tailSet()`  
b) `headSet()`  
c) `subSet()`  
d) `lowerSet()`

**Answer**: a) `tailSet()`

---

