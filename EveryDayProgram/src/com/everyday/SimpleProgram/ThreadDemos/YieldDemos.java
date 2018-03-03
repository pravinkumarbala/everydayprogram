package com.everyday.SimpleProgram.ThreadDemos;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i ++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

public class YieldDemos {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
        for (int j = 0 ; j < 10 ; j++)
            System.out.println("Main Thread");
    }
}