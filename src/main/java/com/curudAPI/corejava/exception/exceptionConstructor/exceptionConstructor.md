~~~
~~~
Can we throw an exception from a constructor?
Yes, we can throw an exception from a constructor. When an exception is thrown from a constructor, object creation fails, and control passes to the calling code.

~~~
~~~
Example:


class Test {
public Test() throws Exception {
System.out.println("Inside constructor");
throw new Exception("Exception in constructor");
}

    public static void main(String[] args) {
        try {
            Test obj = new Test();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
Output:


Inside constructor
Caught exception: Exception in constructor