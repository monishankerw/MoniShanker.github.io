package org.example.corejava.exception.exceptionConstructor;

public class Test {
    public Test() throws Exception{
        System.out.println("Inside Constructor:");
        throw new Exception("Exception in Constructor::");
    }
    public static void main(String[] args) {
try {
    Test test=new Test();
}catch (Exception e){
    System.out.println("Caught in Exception:"+e.getMessage());
}
    }
}
