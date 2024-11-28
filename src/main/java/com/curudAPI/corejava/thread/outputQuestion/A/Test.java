package org.example.corejava.thread.outputQuestion.A;

public class Test implements Runnable
{
    public void run()
    {
        System.out.printf("GFG ");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Test());
        thread1.start();
        thread1.start();
        System.out.println(thread1.getState());
    }
}
//a) GFG GFG TERMINATED
//b) GFG TERMINATED
//c) Compilation Error
//d) Runtime Error
//
//Ans. (d)
//Explanation: Invoking start() method on a thread moves the thread to a RUNNABLE state. But invoking start() method on a thread that has already started throws a IllegalThreadStateException because the thread is already in RUNNABLE state.