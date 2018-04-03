package com.everyday;

public class NanoConversion {
    public static void main(String[] args) {
        System.out.println("Nano Conversion");
        System.out.println(Math.pow(10, 20));
        long startTime = System.nanoTime();
        for (long i = 0 ; i < Math.pow(10, 10); i++);
        long endTime = System.nanoTime();
        long totalTime =  (endTime - startTime) / 1000000000L;
        System.out.println("Start Time : " + startTime);
        System.out.println("End Time : " + endTime);
        System.out.println("Total : " + totalTime);

        long hours = totalTime / 3600;
        long minutes =  (totalTime % 3600) / 60;
        long seconds = (totalTime % 3600) % 60;

        System.out.println("HH:MM:SS = " + hours + "  : " + minutes + " : " + seconds);
    }
}