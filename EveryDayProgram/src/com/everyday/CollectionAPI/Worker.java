package com.everyday.CollectionAPI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Worker implements Runnable{
    public boolean running = false;

    public Worker(){
        Thread thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();

        System.out.println("This is currently running on the main thread, this ID is : " + Thread.currentThread().getId());
        Date start = new Date();
        for (int i = 0 ; i < 5 ; i++)
            list.add(new Worker());

        for (Worker work: list)
            while (work.running)
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }

        Date end = new Date();
        long difference = end.getTime() - start.getTime();
        System.out.println("This is whole process took : " + difference / 1000 + " sec");
    }

    @Override
    public void run() {
        this.running = true;
        System.out.println("This is currently running on a separate thread, the ID is : " + Thread.currentThread().getId());
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }
        this.running = false;
    }
}
/*
Output
This is currently running on the main thread, this ID is : 1
This is currently running on a separate thread, the ID is : 10
This is currently running on a separate thread, the ID is : 11
This is currently running on a separate thread, the ID is : 12
This is currently running on a separate thread, the ID is : 13
This is currently running on a separate thread, the ID is : 14
This is whole process took : 5 sec
 */