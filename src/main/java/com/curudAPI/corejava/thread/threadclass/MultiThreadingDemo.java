package org.example.corejava.thread.threadclass;

public class MultiThreadingDemo extends Thread{
           @Override
           public void run() {
               try{
                   System.out.println("Thread"+Thread.currentThread().getId()+"is running");
               }catch (Exception e){
                   System.out.println("Exception occurred");
               }
           }

           public static void main(String[] args) {
               for (int i=0;i<8;i++){
                   MultiThreadingDemo ob=new MultiThreadingDemo() ;
                   ob.start();
               }
           }
       }