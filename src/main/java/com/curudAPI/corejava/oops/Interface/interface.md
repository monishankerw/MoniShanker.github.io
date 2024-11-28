
INTERFACE
---> Interfaces are 100% abstract.
---> All variables default by static and final.
--> An Interface consists of only incomplete/ abstract method.
--> A Java interface consists static constants and abstract methods.
--> The interface in Java is a mechanism to achieve abstraction.
--> There can be only abstract methods in the Java interface, not the method body.
--> It used to achieve abstraction and multiple inheritance in Java.
--> Java Interface also represents the IS -A relationship.
ex: Comparator Interface


  parent                class
  
class-------(extends)-> class
interface---(implements)-> class
interface--(extends)----> interface
class-----(not)--------> interface

Why do we use an interface?
--> It is used to achieve total abstraction.
--> Since Java support multiple inheritance in the case of class by using an interface it can achieve multiple inheritance.
--> It is also used to achieve loose coupling.
--> Interface are used to implement abstraction.


---> To declare an interface use the interface keyword. It is used to provide total abstraction. That means all the methods in an 
 interface are declared with an empty body and are public and all fields are public, static and final by default.
---> A class that implements an interface must implement all the method declared in the interface. To implement interface used implements keyword.

