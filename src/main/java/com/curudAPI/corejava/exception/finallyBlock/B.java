package org.example.corejava.exception.finallyBlock;


//---->Whenever Exception occur or not finally block continuous to execute.
//----> finally is the extension of try and catch block.
public class B {
    int x=12;

    public static void main(String[] args) {
        try{
            Integer.parseInt("xyz");
        }catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println(10);
        }
    }
}
