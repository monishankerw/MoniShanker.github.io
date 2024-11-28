package org.example.corejava.oops;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*class :
1. class helps us generate object.
2. Whenever make a request a class using new keyword.
*/
public class A {
    public void display() {
        System.out.println("Testing::");
    }

    static class Main {
        public static void main(String[] args) {
            A a = new A(); // Using new operator
            a.display();
        }
    }

    static class Main1 {
        public static void main(String[] args) throws InstantiationException, IllegalAccessException {

            A x = A.class.newInstance();// Using Class.newInstance() method
            x.display();
        }
    }
    static class Main2{
        public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            Constructor<A>x1=A.class.getConstructor();
            A x2=x1.newInstance();
            x2.display();
        }
    }
}
