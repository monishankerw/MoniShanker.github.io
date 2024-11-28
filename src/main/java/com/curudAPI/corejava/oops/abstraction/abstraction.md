
1. What is abstraction in Java?
--> Hiding of implementation details is called as abstraction.
--> We can achieved in java using interface and abstract classes.
--> We can achieve 100% abstraction using interface.

2. What is Abstract keyword?
--> Abstract keyword help us to defined incomplete method and incomplete class.
--> To develop incomplete method in interface used of abstract keyword.

public interface A{
public abstract void test();
public void example();
}
--> A method that doesn't have its body is called abstract.
--> We use the same abstract keyword to create abstract methods.

3. Abstract class:
--> An abstract class 0 to 100% uncompleted.
--> An abstract class can consist of constructor.
--> An abstract class can consist of static and non static member.
--> We can create main method in an abstract class.
--> Object of abstract class can not be created.
--> Abstract class does not support multiple inheritance.

4.
--> yes, an abstract class always has a constructor. If you do not define you own constructor, the compiler will give a 
    default constructor to abstract constructor.
--> An abstract class can have parametrized constructor and the default constructor is always present in an abstract class.

5. Difference between abstract class and interface.
Interface:
--> Interface are 100% abstract.
--> support multiple inheritance.
--> All variable default by static and final.
Abstract class
--> Abstract class can be 0 to 100% uncompleted.
--> Does not support multiple inheritance.
--> We can create static and non-static variable.

6. Difference between abstraction and encapsulation?
abstraction
--> Hiding of implementation detail is called abstraction.
--> We can achieve by interface and abstract class.
--> abstraction can be o to 100% uncompleted.
--> Multiple inheritance not support.
Encapsulation:
--> Wrapping of data with method that operate on data is called encapsulation.
--> In encapsulation avoid direct access data making variable.
--> In encapsulation used getter and setter for make the variable public.
--> Datahiding is the feature of encapsulation.