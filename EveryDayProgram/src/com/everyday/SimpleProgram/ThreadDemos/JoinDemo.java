package com.everyday.SimpleProgram.ThreadDemos;


class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i ++ ){
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        try{
            //t.join();
            t.join(5000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        for (int j = 0 ; j < 10 ; j ++)
            System.out.println("Main Thread");
    }
}