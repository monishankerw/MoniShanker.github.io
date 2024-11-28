package org.example.corejava.oops.encapsulation;

public class A {
    private int i;
    public void SetI(int i){
        this.i=i;
    }
    public int GetI(){
        return i;
    }

    public static void main(String[] args) {
        A a=new A();
        a.SetI(12);

        System.out.println(a.GetI());
    }
}
/*
Encapsulation is a part of object oriented programming.
Encapsulation is like a capsule that keeps things tightly closed and inaccessible from the outside world.
We can design a human class with parameters to store different information.
✦
Data is stored in the brain in the format of variables
Different types of data can be stored in different variables
Privacy is important to protect personal data
✦
Data access control in object-oriented programming
Objects allow direct access to data
Data access should be controlled to match real-world scenarios
✦
Private variables can only be accessed within the same class.
Private variables cannot be accessed from outside the class.
Instance variables should be made private to restrict access from outside.
✦
Data access is restricted using methods.
Methods allow controlled access to data.
Public methods can be used to retrieve data.
✦
Private variables can only be accessed within the class that they are defined in.
Accessing private variables can be done using getter methods.
Getter methods should be defined as public in order to be accessed from outside the class.
✦
Setting values for variables and accessing them using methods.
Variables can be assigned default values if not specified.
Methods can be used to set values for variables.
Value can be passed as an argument to the method to assign it to the variable.
✦
Encapsulation is a way to bind data and methods together
Data can only be accessed through methods
Variables are made private to prevent direct access


 */