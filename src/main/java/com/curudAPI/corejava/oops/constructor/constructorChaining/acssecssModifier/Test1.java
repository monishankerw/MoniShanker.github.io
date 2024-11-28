package org.example.corejava.oops.constructor.constructorChaining.acssecssModifier;

public class Test1 {
    Test1(int x){
        System.out.println("Constructor called"+x);
    }
    public static class Test2{
        Test1 test1=new Test1(12);
        Test2(int i){
            test1=new Test1(i);
        }

        public static void main(String[] args) {
            Test2 t2=new Test2(3);
        }
    }
}
