package org.example.corejava.thread.outputQuestion.E;

class Test extends Thread {
    public
    void run()
    {
        System.out.println("Run");
    }
} class Myclass {
    public
    static void main(String[] args)
    {
        B t = new B();
        t.start();
    }
}
//Options:
//1. One thread created
//2. Two thread created
//3. Depend upon system
//4. No thread created
//Output:
//
// The answer is option (2)
//Explanation : In the above program, one thread will be created i.e. the main thread which is responsible to execute the main() method and the child thread will be created after the execution of t.start() which is responsible to execute run() method.