
---

```markdown
# Association, Aggregation, and Composition in Java

Understanding the relationships between classes is fundamental in object-oriented programming (OOP). **Association**, **Aggregation**, and **Composition** are three types of relationships that define how objects interact with each other.

## Table of Contents
1. [Association](#1-association)
    - [Example](#association-example)
2. [Aggregation](#2-aggregation)
    - [Example](#aggregation-example)
3. [Composition](#3-composition)
    - [Example](#composition-example)
4. [Comparison Between Association, Aggregation, and Composition](#4-comparison-between-association-aggregation-and-composition)
5. [Summary](#5-summary)

---

## 1. Association

**Association** is a relationship where **all objects have their own lifecycle** and there is **no owner**. It defines a relationship between two separate classes which establishes through their objects.

- **Key Characteristics**:
  - It's the most general relationship between classes.
  - Indicates that objects are aware of each other.
  - There is **no ownership**; both classes can exist independently.
  - Can be **unidirectional** or **bidirectional**.

### Association Types
- **One-to-One**
- **One-to-Many**
- **Many-to-One**
- **Many-to-Many**

### Association Example

**Scenario**: A `Teacher` can teach multiple `Student`s, and a `Student` can have multiple `Teacher`s.

```java
// Teacher.java
import java.util.List;

public class Teacher {
    private String name;
    private List<Student> students;
    
    public Teacher(String name) {
        this.name = name;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void teach() {
        for (Student student : students) {
            System.out.println(this.name + " is teaching " + student.getName());
        }
    }
    
    // Getters and Setters
}

// Student.java
public class Student {
    private String name;
    private List<Teacher> teachers;
    
    public Student(String name) {
        this.name = name;
    }
    
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    public String getName() {
        return name;
    }
    
    public void study() {
        for (Teacher teacher : teachers) {
            System.out.println(this.name + " is studying with " + teacher.getName());
        }
    }
    
    // Getters and Setters
}
```

**Explanation**:
- Both `Teacher` and `Student` can exist independently.
- The relationship is **many-to-many**.
- There is **no ownership**; neither `Teacher` nor `Student` owns each other.
- The association is **bidirectional**; both classes are aware of each other.

---

## 2. Aggregation

**Aggregation** is a specialized form of Association where all objects have their own lifecycle, **but there is ownership**. However, the child object can exist **without** the parent object.

- **Key Characteristics**:
    - Represents a **"has-a"** relationship.
    - The child can exist independently of the parent.
    - It's a **weak association**.

### Aggregation Example

**Scenario**: A `Department` has multiple `Teacher`s. If the `Department` is removed, `Teacher`s still exist.

```java
// Department.java
import java.util.List;

public class Department {
    private String name;
    private List<Teacher> teachers;
    
    public Department(String name, List<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    // Getters and Setters
}

// Teacher.java
public class Teacher {
    private String name;
    
    public Teacher(String name) {
        this.name = name;
    }
    
    public void teach() {
        System.out.println(name + " is teaching");
    }
    
    public String getName() {
        return name;
    }
    
    // Getters and Setters
}
```

**Usage Example**:
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Smith");
        Teacher t2 = new Teacher("Ms. Johnson");
        
        Department department = new Department("Computer Science", Arrays.asList(t1, t2));
        
        for (Teacher teacher : department.getTeachers()) {
            teacher.teach();
        }
    }
}
```

**Explanation**:
- `Department` **owns** `Teacher`s, but `Teacher`s can exist without a `Department`.
- If `Department` is deleted, `Teacher`s still exist in the system.
- Represents a **weak ownership**.

---

## 3. Composition

**Composition** is a specialized form of Aggregation where if the parent object is destroyed, then the child objects **also cease to exist**. It represents a **strong ownership** and a part-of relationship.

- **Key Characteristics**:
    - Represents a **"part-of"** relationship.
    - The child **cannot** exist without the parent.
    - It's a **strong association**.

### Composition Example

**Scenario**: A `House` is composed of `Room`s. If the `House` is destroyed, the `Room`s are also destroyed.

```java
// House.java
import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> rooms;
    
    public House() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
    }
    
    public List<Room> getRooms() {
        return rooms;
    }
}

// Room.java
public class Room {
    private String name;
    
    public Room(String name) {
        this.name = name;
    }
    
    public void roomInfo() {
        System.out.println("This is the " + name);
    }
}
```

**Usage Example**:
```java
public class Main {
    public static void main(String[] args) {
        House house = new House();
        for (Room room : house.getRooms()) {
            room.roomInfo();
        }
        // When house object is garbage collected, rooms are also destroyed
    }
}
```

**Explanation**:
- `House` **owns** `Room`s, and `Room`s **cannot** exist without `House`.
- If `House` is destroyed, all its `Room`s are also destroyed.
- Represents a **strong ownership**.

---

## 4. Comparison Between Association, Aggregation, and Composition

| Aspect              | Association                                            | Aggregation                                            | Composition                                             |
|---------------------|--------------------------------------------------------|--------------------------------------------------------|---------------------------------------------------------|
| **Definition**      | Relationship between objects without ownership.        | Weak ownership relationship where child can exist independently. | Strong ownership where child cannot exist without parent. |
| **Type of Relation**| `Uses-a`                                               | `Has-a`                                                | `Part-of`                                               |
| **Life Cycle**      | Independent lifecycles.                                 | Parent and child have independent lifecycles.          | Child's lifecycle depends on the parent's lifecycle.    |
| **Example**         | A `Student` uses a `Library`.                          | A `Department` has `Teachers`.                         | A `House` is composed of `Rooms`.                       |
| **Dependency**      | Low                                                    | Medium                                                 | High                                                    |
| **Representation**  | Plain association line in UML diagrams.                | Hollow diamond arrow in UML diagrams.                  | Filled diamond arrow in UML diagrams.                   |

---

## 5. Summary

- **Association**: General relationship between classes; no ownership.
- **Aggregation**: Specialized form of Association with ownership; child can exist independently.
- **Composition**: Strong form of Aggregation; child cannot exist without parent.

**Choosing the right relationship** depends on the real-world scenario you are modeling:

- Use **Association** when classes are related but can exist independently.
- Use **Aggregation** when one class owns another, but the owned class can exist independently.
- Use **Composition** when one class is a part of another class and cannot exist independently.

Understanding these relationships helps in designing robust and maintainable object-oriented systems.

---

**References**:
- [Oracle Java Documentation](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
- [UML Relationships](https://www.uml-diagrams.org/association.html)

```

This comprehensive guide should help you understand and differentiate between **Association**, **Aggregation**, and **Composition** in Java, along with practical examples to illustrate each concept.

Let me know if you need any further assistance or clarification on these topics!