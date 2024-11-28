
### Wrapper Class in Java

A Wrapper class in Java provides a way to use primitive data types (like `int`, `char`, etc.) as objects. Each primitive type has a corresponding Wrapper class in the `java.lang` package:

- `int` -> `Integer`
- `char` -> `Character`
- `float` -> `Float`
- `double` -> `Double`
- `long` -> `Long`
- `short` -> `Short`
- `byte` -> `Byte`
- `boolean` -> `Boolean`

#### Key Concepts:
1. **Wrapping (Boxing)**:
- **Definition**: The process of converting a primitive data type into its corresponding Wrapper class object.
- **Example**:
  ```java
  int a = 5;
  Integer aObj = Integer.valueOf(a); // Boxing
  ```

2. **Unboxing**:
- **Definition**: The process of converting the Wrapper class object back to its corresponding primitive data type.
- **Example**:
  ```java
  Integer aObj = 5;
  int a = aObj.intValue(); // Unboxing
  ```

**Advantages**:
- Allows primitive data types to be used in Collections (like `ArrayList`, `HashMap`), which require objects.
- Provides utility methods for converting between data types, parsing, etc.

### Primitive and Non-Primitive Data Types in Java

#### **Primitive Data Types:**
- **Definition**: Primitive data types are the most basic data types available in Java. They are predefined by the language and named by a keyword.
- **Types**: There are 8 primitive data types in Java:
    1. **byte**: 8-bit integer (`-128` to `127`)
    2. **short**: 16-bit integer (`-32,768` to `32,767`)
    3. **int**: 32-bit integer (`-2^31` to `2^31-1`)
    4. **long**: 64-bit integer (`-2^63` to `2^63-1`)
    5. **float**: 32-bit floating point
    6. **double**: 64-bit floating point
    7. **char**: 16-bit Unicode character
    8. **boolean**: Represents `true` or `false`

- **Characteristics**:
    - **Memory-efficient**: Primitive data types are stored in the stack memory, and they are very memory-efficient.
    - **No additional methods**: They don't come with methods.
    - **Default values**:
        - Numeric types (`byte`, `short`, `int`, `long`, `float`, `double`) default to `0`.
        - `char` defaults to `'\u0000'` (null character).
        - `boolean` defaults to `false`.

#### **Non-Primitive Data Types:**
- **Definition**: Non-primitive data types, also known as reference types, are derived from the primitive types and are created by the programmer.
- **Examples**:
    1. **String**: A sequence of characters.
    2. **Arrays**: A collection of elements of the same type.
    3. **Classes**: A blueprint for creating objects (instances).
    4. **Interfaces**: A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.

- **Characteristics**:
    - **Stored in heap memory**: The actual objects are stored in the heap, but references to these objects are stored in the stack.
    - **Can call methods**: Since they are objects, they can have methods that operate on data.
    - **Default value**: The default value for any non-primitive data type is `null`.

**Key Differences**:
- **Primitive types** are predefined in Java, while **non-primitive types** are created by the programmer.
- **Primitive types** store actual values, while **non-primitive types** store references to the objects.
- **Primitive types** are more memory efficient, while **non-primitive types** can use more memory because they reference objects in the heap.
