```markdown
# Encapsulation in Java

## 1. What is Encapsulation?
Encapsulation is the concept of wrapping data (attributes) and methods (functions) that operate on the data into a single unit,
typically a class. This helps to restrict direct access to some of the object's components, which is a means of preventing unintended interference and misuse.

- **Key Points:**
  - Data is made private to prevent direct access.
  - Public methods, known as **getters** and **setters**, are provided to operate on the data.

## 2. Advantages of Encapsulation
- **Control Access to Data:** It allows for validation of values before they are set, ensuring that the object maintains a valid state.
- **Read-Only or Write-Only Access:** You can create read-only or write-only properties by only providing a getter or a setter method, respectively.

## 3. Data Hiding
- Data hiding is a principle that makes the class's variables private, restricting access from outside the class.
- **Note:** Data hiding applies to variables, not methods. Methods can still be public while their underlying data remains hidden.

## 4. How to Achieve Encapsulation in Java
To achieve encapsulation in Java, follow these steps:
1. Declare the variables of a class as private.
2. Provide public setter and getter methods to modify and view the variable values.

### Example
```java
public class Employee {
    private String name; // Private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}
```

## 5. What are Get and Set Methods?
- **Get Method:** The getter method is used to retrieve the value of a private variable.
- **Set Method:** The setter method is used to set or update the value of a private variable.

### Example
```java
Employee emp = new Employee();
emp.setName("John Doe"); // Using setter
String empName = emp.getName(); // Using getter
```

## 6. Benefits of Encapsulation
- **Data Hiding:** Protects the internal state of the object from unintended interference.
- **Increased Flexibility:** You can change the internal implementation without affecting other parts of the code.
- **Reusability:** Encapsulated code is easier to reuse in other programs or projects.

Here are some multiple-choice questions (MCQs) based on the concept of Encapsulation in Java:

MCQs

	1.	What is the primary purpose of encapsulation in Java?
A. To increase performance
B. To hide implementation details and protect data
C. To make the code shorter
D. To implement inheritance
Answer: B. To hide implementation details and protect data

	2.	Which of the following is NOT a feature of encapsulation?
A. Data hiding
B. Using public getter and setter methods
C. Allowing direct access to private fields
D. Controlling access to data
Answer: C. Allowing direct access to private fields

	3.	Which keyword is used to make a class member private?
A. public
B. private
C. protected
D. static
Answer: B. private

	4.	How can we access a private variable of a class?
A. By using the this keyword
B. By creating an object and directly accessing the variable
C. By using getter and setter methods
D. By declaring the variable as public
Answer: C. By using getter and setter methods

	5.	Which of the following statements about encapsulation is true?
A. Encapsulation requires variables to be declared public.
B. Encapsulation makes the implementation details of a class accessible to all.
C. Encapsulation allows us to hide implementation details using private variables and provides controlled access via public methods.
D. Encapsulation prevents inheritance in Java.
Answer: C. Encapsulation allows us to hide implementation details using private variables and provides controlled access via public methods.

	6.	What is the role of setter methods in encapsulation?
A. To directly access private variables
B. To set or update the value of private variables
C. To initialize private variables during object creation
D. To protect methods from being overridden
Answer: B. To set or update the value of private variables

	7.	What happens if a variable is declared as private in a class?
A. It can only be accessed from within the same package.
B. It can only be accessed by classes in the same hierarchy.
C. It cannot be accessed directly from outside the class.
D. It is automatically assigned a default value.
Answer: C. It cannot be accessed directly from outside the class.

	8.	In the following code, what will happen if you try to access the age variable directly from outside the Person class?

public class Person {
private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

A. You will get a runtime error.
B. You will get a compilation error.
C. The value of age will be printed.
D. The code will work fine without errors.
Answer: B. You will get a compilation error.

	9.	Encapsulation in Java is implemented using:
A. Abstract classes
B. Access modifiers
C. Interfaces
D. Inheritance
Answer: B. Access modifiers

	10.	Which of the following benefits is NOT associated with encapsulation?
A. Data hiding
B. Increased code maintainability
C. Reduced security
D. Flexibility in changing implementation
Answer: C. Reduced security
```

