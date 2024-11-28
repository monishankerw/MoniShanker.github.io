package org.example.corejava.thread.outputQuestion.ThreadLifeCycle;

public class Sleep {
    public static void main(String[] args) {
        try{
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Testing");
    }
}
