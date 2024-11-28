package org.example.corejava.exception.throwandThrows.throwsEx;
//Whether exception happen in method or not surrounding calling statement in try catch become mandatory if throws keyword is used.
public class E{
    public static void test() throws Exception {
        int i = 10 / 0;
    }

    public static void main(String[] args) {
        E a = new E();

        try {
            a.test();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


//Throws keyword written down in the front of method.
//Throws keyword can not written down in the front of variable and class.
//Throws keyword,Throws Exception to the calling state ment of the method.
