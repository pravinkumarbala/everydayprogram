package com.everyday.ThreadConcept;

class FirstClass extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            if(i%2 != 0){
                System.out.println(i);
                try{
                    Thread.sleep(4000);
                    Thread.yield();
                }catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

class SecondClass implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i <= 6; i++){
            if(i%2 == 0){
                System.out.println(i);
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

public class SimpleClass {
    public static void main(String[] args) throws InterruptedException{
        FirstClass t1 = new FirstClass();
        SecondClass t2 = new SecondClass();
        t1.run();
        t2.run();
    }
}
