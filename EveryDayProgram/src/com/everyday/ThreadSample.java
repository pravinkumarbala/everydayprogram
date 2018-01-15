package com.everyday;

public class ThreadSample implements Runnable{

    @Override
    public void run() {
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println("Child Thread : " + i);
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                System.out.println("Child Thread Interrupted : " + e.getMessage());
            }
        }
        System.out.println("Child Thread Finished !!!");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadSample(), "My Thread");
        t.start();
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println("Main Thread : " + i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Main Thread Interrupted : " + e.getMessage());
            }
        }
        System.out.println("Main Thread Finished !!!");
    }
}