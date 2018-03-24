package com.everyday.ThreadConcept;

class FirstClass extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 6; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}

class SecondClass extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 6; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class SimpleClass {
    public static void main(String[] args) {
        FirstClass t1 = new FirstClass();
        SecondClass t2 = new SecondClass();
        t1.start();
        t2.start();
    }
}
