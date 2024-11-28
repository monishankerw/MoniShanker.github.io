package org.example.corejava.designPattern.singleDesignPattern;
//Here we design the class such that only one object of class can be created throughout execution of the program.

public final class A {
    static A a=null;
    private A(){}//make constructor private
    public static A getInstance(){//write a static method that has the return type object of this single turn class.
        // here, the concept of Lazy initialization is used to write this static method.
        //Exm: socket or database connection
        if(a==null){
            A a=new A();
            return a;
        }
        return a;
    }

    public static class B{
        public static void main(String[] args) {
            A a1=A.getInstance();
            A a2=A.getInstance();
            System.out.println(a1);
            System.out.println(a2);
        }
    }
    //How to Design/create a singleton class in Java?
    // 1. Ensure that only one instance of class exists.
    // 2. Provide global access to that instance By:
    //Declaring all constructors of the class to be private
    //Providing a static method that return a reference of the instance
    //Lazy initialization concept is used to write the static method.
    //3. The instance is stored as a private static variable.
    //EX: Runtime class,Action Servlet,Service Locator
}
