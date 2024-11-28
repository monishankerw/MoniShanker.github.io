package org.example.corejava.thread.outputQuestion.E;

class B extends Thread {
    public
    void run()
    {
        System.out.println("Run");
    }
} class C {
    public
    static void main(String[] args)
    {
        B t = new B();
        t.run();
    }
}
//Options:
//1. One thread created
//2. Two thread created
//3. Depend upon system
//4. No thread created
// The answer is option (1)
//Explanation : In the above program only one thread will be created i.e. the main thread which is responsible to execute the main() method only. The run() method is called by the object t like a normal method.
