package com.everyday;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StaffWorking {
    public static HashMap<String, Long> timeCapture = new HashMap<String, Long>();

    public static long watchTimer(){
        long startTime = System.currentTimeMillis();
        long totalDuration = 0;
        System.out.println("Press 'Y' to Stop the clock : ");
        while (true){
            String keyPress = new Scanner(System.in).next();
            char pressKey = keyPress.charAt(0);
            if (pressKey == 'y' || pressKey == 'Y') {
                totalDuration = System.currentTimeMillis() - startTime;
                break;
            }
        }
        return totalDuration;
    }

    public static String totalTimer(long timeInMilliSeconds){
        long seconds = timeInMilliSeconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
//        long days = hours / 24;
        String time = hours % 24 + ":" + minutes % 60 + ":" + seconds % 60;
        return time;
    }

    public static void addingChanges(String name, long time){
        for (Map.Entry<String, Long> addingTime : timeCapture.entrySet()){
            if (!timeCapture.containsKey(addingTime.getKey())){
                timeCapture.put(name, time);
            } else {
                timeCapture.put(addingTime.getKey(), addingTime.getValue() + time);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Staff Working and Break Time");
        System.out.println("============================");
        int choice = 0;
        do {
            System.out.println("1. Available 2. Project 3. System Issue 4. Learning 5. Break 6. Logout");
            System.out.println("**********************************************************************");
            System.out.print("Select any one option : ");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: String availableName = "Available";
                        System.out.print(availableName);
                        addingChanges(availableName, watchTimer());
                        break;
                case 2: String projectTime = "Project";
                        System.out.print(projectTime);
                        addingChanges(projectTime, watchTimer());
                        break;
                case 3: String systemIssueTime = "System Issue";
                        System.out.print(systemIssueTime);
                        addingChanges(systemIssueTime, watchTimer());
                        break;
                case 4: String learningTime = "Learning Time";
                        System.out.print(learningTime);
                        addingChanges(learningTime, watchTimer());
                        break;
                case 5: String breakTimer = "Break";
                        System.out.print(breakTimer);
                        addingChanges(breakTimer, watchTimer());
                        break;
                case 6: String logout = "Logout";
                        System.out.println(logout);
                        System.out.println("-------");
                        System.out.println("Total Time for the day");
                        for (Map.Entry<String, Long> totalTime: timeCapture.entrySet()) {
                            System.out.println(totalTime.getKey() + " : " + totalTimer(totalTime.getValue()));
                        }
                        break;
                default:
                    System.out.println("Sorry !!! Please select the correct option");
                    break;
            }
        } while (choice != 6);
    }
}