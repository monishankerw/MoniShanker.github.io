package org.example.corejava.thread.outputQuestion.D;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Test implements Runnable
{
    public static CyclicBarrier barrier = new CyclicBarrier(3);
    public void run()
    {
        System.out.printf(" GFG ");
        try
        {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Test());
        Thread thread2 = new Thread(new Test());

        thread1.start();
        thread2.start();
        System.out.printf(" GeeksforGeeks ");
        try
        {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e)
        {
            e.printStackTrace();
        }
        System.out.printf(" End ");

    }
}
//a) GeeksforGeeks GFG GFG End
//b) GFG GeeksforGeeks GFG End
//c) GFG GFG GeeksforGeeks End
//d) All the above
//
//Ans. (d)
//Explanation: For (a), the parent thread keep executing until it reaches the barrier. The child thread are then scheduled. For (b), thread scheduler scheduler thread1. Once it reaches the barrier, the parent thread is scheduled. Once parent thread reached the barrier, thread2 is scheduled. For (c), Both the child thread are scheduled. Finally when each of the child threads reach the barrier, the parent thread is scheduled.