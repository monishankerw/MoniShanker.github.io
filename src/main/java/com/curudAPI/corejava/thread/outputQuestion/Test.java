package org.example.corejava.thread.outputQuestion;

public class Test implements Runnable
{
    public void run()
    {
        System.out.printf("GFG ");
        System.out.printf("Geeks ");
    }
    public static void main(String[] args)
    {
        Test obj = new Test();
        Thread thread = new Thread(obj);

        thread.start();
        System.out.printf("Geeks ");
        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("for ");
    }
}
//a) GFG Geeks Geeks for
//b) Geeks GFG Geeks for
//c) Either a or b
//d) Both a and b together
//
//Ans. (c)
//Explanation: From the statement “thread.start()”, we have two threads Main thread and “thread” thread. So either “GFG” can be printed or “Geeks”, depend on which thread, thread scheduler schedule.
//For (a), the parent thread after calling start() method is paused and the thread scheduler schedules the child thread which then completes its execution. Following this, the parent thread is scheduled. For (b), the parent thread calls start() method but continues its execution and prints on the console. When join() method is called, the parent thread has to wait for its child to complete its execution. Thread scheduler schedules child thread while the parent waits for the child to complete