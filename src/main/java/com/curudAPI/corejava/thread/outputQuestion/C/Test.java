package org.example.corejava.thread.outputQuestion.C;

import java.util.concurrent.*;
  
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