Here are some questions and multiple-choice questions (MCQs) based on the topic of String Creation in Java:

Short Answer Questions

	1.	What is the String Constant Pool (SCP) in Java, and how does it optimize memory usage?
	2.	What happens when you use the intern() method on a string object?
	3.	Explain the difference in memory allocation between String s = "xyz"; and String s = new String("xyz");.
	4.	Why is it said that strings in Java are immutable?
	5.	Describe what happens in memory when the following code executes:

String str1 = new String("hello");
String str2 = str1.intern();

MCQs

Question 1

Which of the following statements about the String Constant Pool (SCP) is true?
A. SCP is part of heap memory.
B. SCP stores unique string literals to optimize memory usage.
C. Strings created using the new keyword are always added to the SCP.
D. SCP is available only in Java 8 and above.

Answer: B

Question 2

What will be the output of the following code?

class Test {
public static void main(String[] args) {
String s1 = "abc";
String s2 = "abc";
System.out.println(s1 == s2);
}
}

A. true
B. false
C. Compilation Error
D. Runtime Error

Answer: A
Explanation: Both s1 and s2 point to the same object in the SCP.

Question 3

What will be the output of the following code?

class Test {
public static void main(String[] args) {
String s1 = new String("abc");
String s2 = "abc";
System.out.println(s1 == s2);
}
}

A. true
B. false
C. Compilation Error
D. Runtime Error

Answer: B
Explanation: s1 is in heap memory, while s2 is in the SCP, so they have different references.

Question 4

What does the intern() method do in Java?
A. Deletes duplicate strings from the heap.
B. Stores the string in the heap memory.
C. Returns the reference of a string from the SCP if it exists, else adds it to the SCP.
D. Converts a string to lowercase.

Answer: C

Question 5

What happens if you create two strings using the new keyword with the same value?
A. Both strings will reference the same object in the SCP.
B. Two different objects will be created in the heap memory.
C. Only one object will be created in the heap, and it will point to the SCP.
D. An error will be thrown at runtime.

Answer: B

Question 6

Given the code below, what will be the output?

class Test {
public static void main(String[] args) {
String s1 = new String("java");
String s2 = s1.intern();
String s3 = "java";
System.out.println(s2 == s3);
}
}

A. true
B. false
C. Compilation Error
D. Runtime Error

Answer: A
Explanation: s2 points to the string in the SCP after calling intern(), which is the same as s3.

Questions and MCQs: Mutable vs. Immutable Classes

Short Answer Questions

	1.	Define a mutable class and provide an example.
	2.	Define an immutable class and explain its key features.
	3.	Why is it recommended to make a class final for immutability?
	4.	Explain why Java String is immutable and the advantages of this design.
	5.	What happens when you modify a String in Java?
	6.	How can a mutable field be handled inside an immutable class to preserve immutability?
	7.	What is the difference between a mutable and an immutable object in terms of thread safety?

Multiple-Choice Questions

Question 1

Which of the following is a key characteristic of an immutable class?
A. It must have all fields declared as protected.
B. It must provide setter methods for all fields.
C. It does not allow its state to be changed after creation.
D. It must implement the Cloneable interface.

Answer: C

Question 2

Which of the following ensures a class is immutable?
A. Declare the class final.
B. Make fields private and final.
C. Provide only getter methods, no setters.
D. All of the above.

Answer: D

Question 3

What is the output of the following code snippet?

class Test {
public static void main(String[] args) {
String str1 = "Java";
String str2 = str1;
str1 = "Python";
System.out.println(str1 + " " + str2);
}
}

A. Java Java
B. Python Java
C. Python Python
D. Java Python

Answer: B
Explanation: Strings are immutable; modifying str1 creates a new object, leaving str2 unchanged.

Question 4

What will be the output of the following code?

final class Immutable {
private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Immutable obj = new Immutable(10);
        System.out.println(obj.getValue());
    }
}

A. 10
B. Compilation Error
C. Runtime Error
D. None of the above

Answer: A

Question 5

Why are immutable objects considered thread-safe?
A. They use synchronized blocks internally.
B. Their state cannot be modified after creation.
C. They restrict access to fields using protected access modifiers.
D. They are always static.

Answer: B

Question 6

Which of the following is not a characteristic of a mutable class?
A. Allows modification of its fields after object creation.
B. Provides setter methods for its fields.
C. Ensures thread-safety inherently.
D. May result in inconsistent state if not properly synchronized in multi-threaded environments.

Answer: C

Question 7

What is the purpose of using the final keyword for a class in Java?
A. To ensure the class cannot be extended.
B. To make all fields in the class immutable.
C. To make all methods in the class synchronized.
D. To prevent method overloading in the class.

Answer: A

Question 8

In the following code, which rule of immutability is being violated?

public final class MyClass {
private final int data;

    public MyClass(int data) {
        this.data = data;
    }
    
    public void setData(int data) {
        this.data = data; // Compilation Error
    }
}

A. Class is not declared final.
B. Field is not declared private.
C. Method violates immutability by attempting to modify a final field.
D. Constructor is not properly initializing the field.

Answer: C

Questions and MCQs: String vs. StringBuilder vs. StringBuffer

Short Answer Questions

	1.	Differentiate between String, StringBuilder, and StringBuffer in terms of mutability.
	2.	Why is StringBuffer considered thread-safe, while StringBuilder is not?
	3.	What are the main use cases of String, StringBuilder, and StringBuffer?
	4.	Explain the impact of immutability in String on performance.
	5.	Write a code example to demonstrate how StringBuilder is mutable.
	6.	Compare the performance of StringBuilder and StringBuffer in single-threaded environments.
	7.	Which is better for creating a dynamically changing string: String or StringBuilder? Why?

Multiple-Choice Questions

Question 1

Which of the following statements about String is true?
A. Strings are mutable and stored in the heap.
B. Strings are immutable and stored in the String Constant Pool (SCP) or heap.
C. Strings are thread-safe by default because they are mutable.
D. Strings consume less memory than StringBuilder in dynamic operations.

Answer: B

Question 2

What will be the output of the following code?

class Test {
public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programming");
System.out.println(sb);
}
}

A. Java
B. Java Programming
C. Compilation Error
D. Runtime Error

Answer: B

Question 3

Which of the following is true about StringBuilder and StringBuffer?
A. Both are immutable.
B. Both are mutable, but StringBuffer is synchronized.
C. StringBuilder is thread-safe, but StringBuffer is not.
D. Both are synchronized and thread-safe.

Answer: B

Question 4

What is the main difference between StringBuilder and StringBuffer?
A. StringBuilder is immutable, and StringBuffer is mutable.
B. StringBuffer is synchronized, while StringBuilder is not.
C. StringBuilder uses more memory than StringBuffer.
D. StringBuffer cannot be used in multithreaded applications.

Answer: B

Question 5

Which of the following operations is faster in a single-threaded environment?
A. StringBuffer
B. StringBuilder
C. String
D. Both StringBuilder and StringBuffer have the same speed.

Answer: B
Explanation: StringBuilder is faster than StringBuffer in single-threaded environments because it is not synchronized.

Question 6

What will be the output of the following code?

class Test {
public static void main(String[] args) {
String str = "Hello";
str.concat(" World");
System.out.println(str);
}
}

A. Hello World
B. Hello
C. Compilation Error
D. Runtime Error

Answer: B
Explanation: Strings are immutable, so the concat() method creates a new string but does not modify the original str.

Question 7

Which of the following is not a valid use case for StringBuffer?
A. Building dynamic strings in a multithreaded environment.
B. Performing frequent string manipulations.
C. Storing a constant, unchanging value.
D. Appending strings in synchronized code.

Answer: C

Question 8

In which scenario should String be preferred over StringBuilder or StringBuffer?
A. When strings are frequently modified.
B. When thread safety is required during string manipulations.
C. When a constant or unchanging string value is required.
D. When performance is the highest priority.

Answer: C

Question 9

Which of the following code snippets correctly uses StringBuffer for thread-safe operations?
A.

StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");

B.

StringBuffer sb = "Hello";
sb.append(" World");

C.

StringBuffer sb = new StringBuffer("Hello");
StringBuffer sb2 = sb.concat(" World");

D.

StringBuffer sb = new StringBuffer("Hello");
sb.toUpperCase();

Answer: A

Questions and MCQs: Common String Methods

Short Answer Questions

	1.	What does the trim() method do in a string?
	2.	Explain the purpose of the split() method and give an example.
	3.	Write a code snippet to find the character at the 3rd index of the string “JavaDeveloper”.
	4.	How does the length() method work in Java? Is it a property or a method?
	5.	What happens if you call charAt() with an index out of range?
	6.	Given the string " Moni Shanker ", write a code snippet to:
	•	Remove whitespace at the beginning and end.
	•	Convert the entire string to uppercase.

Multiple-Choice Questions

Question 1

What does the toLowerCase() method do?
A. Converts the string to lowercase, modifying the original string.
B. Converts the string to lowercase and returns a new string.
C. Converts only the first letter to lowercase.
D. Throws an error if there are no uppercase characters.

Answer: B

Question 2

What is the output of the following code?

class Test {
public static void main(String[] args) {
String str = " Hello World ";
System.out.println(str.trim().toLowerCase());
}
}

A. hello world
B. Hello World
C. hello world
D. HELLO WORLD

Answer: C

Question 3

What will be the output of the following code?

class Test {
public static void main(String[] args) {
String str = "Java Developer";
System.out.println(str.length());
}
}

A. 12
B. 13
C. 14
D. 15

Answer: C

Explanation: The string "Java Developer" has 14 characters, including the space.

Question 4

What is the output of the following code?

class Test {
public static void main(String[] args) {
String str = "JavaDeveloper";
System.out.println(str.charAt(4));
}
}

A. D
B. d
C. Compilation Error
D. Runtime Error

Answer: A

Question 5

Which of the following is true about the split() method?
A. It splits the string into tokens and modifies the original string.
B. It splits the string based on a regular expression and returns an array.
C. It splits the string into characters.
D. It works only for strings containing spaces.

Answer: B

Question 6

What is the result of the following code?

class Test {
public static void main(String[] args) {
String str = "    ";
System.out.println(str.trim().length());
}
}

A. 0
B. 4
C. Compilation Error
D. Runtime Error

Answer: A
Explanation: trim() removes all leading and trailing spaces, leaving an empty string with length 0.

Question 7

What will happen if you call charAt(10) on the string "MoniShanker"?
A. It will return the character at index 10.
B. It will throw a StringIndexOutOfBoundsException.
C. It will return a null value.
D. It will return the last character of the string.

Answer: B

Question 8

Given the string "I am a Java Developer", what will be the result of split("a")?
A. ["I ", "m ", " J", "v", " Developer"]
B. ["I ", "am ", "a ", "Java ", "Developer"]
C. ["I", "m", "J", "v", "Developer"]
D. None of the above

Answer: A
Explanation: The split happens at every occurrence of the character "a". Spaces remain intact.

