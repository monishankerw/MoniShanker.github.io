package org.example.corejava.thread.outputQuestion.E;

class D extends Thread {
    public
    void run()
    {
        System.out.println("Run");
    }
} class E {
    public
    static void main(String[] args)
    {
        D t = new D();
        t.start();
        System.out.println("Main");
    }
}
//Options:
//1. Main Run
//2. Run Main
//3. Depend upon Program
//4. Depend upon JVM
//
//Output:
//
// The answer is option (4)
//Explanation : In the above program, we cant predict the exact order of the output as it is decided by the Thread scheduler which is the part of JVM.