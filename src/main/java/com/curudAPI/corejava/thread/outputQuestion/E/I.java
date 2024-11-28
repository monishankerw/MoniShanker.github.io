package org.example.corejava.thread.outputQuestion.E;

class I implements Runnable {
    public
    void run()
    {
        System.out.println("Run");
    }
} class J {
    public
    static void main(String[] args)
    {
        Thread t1 = new Thread();
        t1.start();
        System.out.println("Main");
    }
}
//Options:
//1. Run
//2. Main
//3. Compile time error
//4. Run Main
//
//Output:
//
// The answer is option (2)
//Explanation : In the above program, we are calling start() method of Thread class which is responsible to execute run() method of Thread class and Thread class run() method has empty implementation. That’s why one child thread will be created but it will not execute Test class run() method.
