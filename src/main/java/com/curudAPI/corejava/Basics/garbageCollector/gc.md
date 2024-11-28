
---

# Garbage Collection in Java

### Q. What is Garbage Collection?
- **Regular basis** of unused objects stored in RAM.
- **Avoids memory overflow**.
- **Helps manage memory efficiently**.

---

### Q. What is the Main Objective of Garbage Collection?
The main objective of garbage collection is to automatically manage memory in programming environments by identifying and reclaiming memory that is no longer in use.

#### Key Points:
1. **Automatic memory management**
2. **Finds unused memory**
3. **Frees up space**
4. **Prevents memory leaks**
5. **Keeps programs running smoothly**

---

### Q. JVM Memory Management

1. **Stack**
2. **Heap**

    - Program execution flow is maintained in the **stack**.
    - All objects in Java are created in the **heap**.
    - **Non-static** and **static variables** are stored in **meta-space**.
    - **Local** and **non-static variables** are stored in the **heap**.

---

### Q. Which Part of Memory (Stack or Heap) is Cleaned in the Garbage Collection Process?

In the garbage collection process, **heap memory** is cleaned, not the stack.

- **Heap Memory**: This is where dynamically allocated memory resides, such as objects created at runtime. Garbage collection focuses on freeing this memory, as objects can accumulate in the heap as the program runs.

- **Stack Memory**: This is used for static memory allocation, such as local variables and function calls, which are automatically cleaned up when the function exits. The garbage collector doesn’t handle stack memory because it’s managed automatically by the program’s execution flow.

---

### Q. What are the Possible Ways of Making an Object Eligible for Garbage Collection in Java?

In Java, an object becomes eligible for garbage collection when it is no longer reachable by any active part of the application. Here are some common ways to make an object eligible:

1. **Nullifying References**
    - Set the object reference to `null`. When no references point to the object, it becomes eligible for garbage collection.
   ```java
   MyClass obj = new MyClass();
   obj = null; // Now the object is eligible for garbage collection
   ```

2. **Reassigning References**
    - Assign a new value to an existing reference. If the original object doesn’t have any other references pointing to it, it becomes eligible for garbage collection.
   ```java
   MyClass obj1 = new MyClass();
   MyClass obj2 = new MyClass();
   obj1 = obj2; // Now the first object is eligible for garbage collection if obj1 was its only reference
   ```

3. **Objects Inside Method Scope (Local Objects)**
    - When an object is created within a method, it becomes eligible for garbage collection once the method completes and no external references exist.
   ```java
   void createObject() {
       MyClass localObj = new MyClass();
       // localObj becomes eligible for garbage collection after this method finishes, if no other references exist
   }
   ```

4. **Isolating Objects by Breaking Reference Chains**
    - If objects reference each other in a circular way but are no longer reachable by any active code, the entire group becomes eligible for garbage collection. Garbage collectors can detect these circular references.
   ```java
   class A {
       B b;
   }
   class B {
       A a;
   }
   A a = new A();
   B b = new B();
   a.b = b;
   b.a = a;
   a = null;
   b = null; // Both objects are eligible for garbage collection due to isolation
   ```

5. **Using Weak References**
    - Using `WeakReference` or `SoftReference` for objects (instead of strong references) allows them to be eligible for garbage collection if no strong references exist and memory is needed.
   ```java
   WeakReference<MyClass> weakRef = new WeakReference<>(new MyClass());
   // The object is eligible for GC if no strong references to it exist
   ```

---

### Q. Code Example: How Many Objects are Eligible for Garbage Collection?

```java
class MyClass {
    int value;
    MyClass(int value) {
        this.value = value;
    }
}

public class GarbageCollectionExample {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1);  // Object 1 created
        MyClass obj2 = new MyClass(2);  // Object 2 created
        MyClass obj3 = new MyClass(3);  // Object 3 created

        obj1 = obj2; // Object 1 is now eligible for GC
        obj2 = null; // Object 2 is now eligible for GC
        obj3 = obj1; // Object 3 is still referenced by obj1, so not eligible

        // How many objects are eligible for garbage collection here?
    }
}
```

#### Explanation

1. **Initially**:
    - Three objects are created:
        - `obj1` points to `new MyClass(1)`
        - `obj2` points to `new MyClass(2)`
        - `obj3` points to `new MyClass(3)`

2. **After `obj1 = obj2;`**:
    - `obj1` now references the object that `obj2` points to (`new MyClass(2)`).
    - The original object referenced by `obj1` (`new MyClass(1)`) has no references pointing to it, so it becomes **eligible for garbage collection**.

3. **After `obj2 = null;`**:
    - `obj2` is set to `null`, meaning the object originally referenced by `obj2` (`new MyClass(2)`) has no references pointing to it and is now **eligible for garbage collection**.

4. **After `obj3 = obj1;`**:
    - `obj3` now references the same object as `obj1` (which is `new MyClass(2)`).
    - The object originally referenced by `obj3` (`new MyClass(3)`) still has `obj3` pointing to it indirectly, so it is **not eligible for garbage collection**.

#### Final Answer
- **2 objects** are eligible for garbage collection: the objects initially referenced by `obj1` (`new MyClass(1)`) and `obj2` (`new MyClass(2)`).

---