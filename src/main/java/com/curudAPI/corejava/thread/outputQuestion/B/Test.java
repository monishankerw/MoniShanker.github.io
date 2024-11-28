package org.example.corejava.thread.outputQuestion.B;

public class Test extends Thread implements Runnable
{
    public void run()
    {
        System.out.printf("GFG ");
    }
    public static void main(String[] args) throws InterruptedException
    {
        Test obj = new Test();
        obj.run();
        obj.start();
    }
}
//a) Runtime error
//b) Compilation error
//c) GFG GFG
//d) None of the above
//Ans. (c)
//Explanation: Test class extends Thread class that has start() method implemented. So invoking start() on an object that extends Thread class invokes run() method defined in the program.