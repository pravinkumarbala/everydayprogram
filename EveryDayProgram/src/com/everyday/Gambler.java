package com.everyday;

import java.util.Scanner;

public class Gambler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the stake : ");
        int stake = scanner.nextInt();
        System.out.println("Enter the goal : ");
        int  goal = scanner.nextInt();
        System.out.println("Enter the trials : ");
        int trials = scanner.nextInt();

        System.out.println("Enter the bet : ");
        int bets = scanner.nextInt();
        System.out.println("Enter the wins : ");
        int wins = scanner.nextInt();

        for (int t = 0; t < trials; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }
            if (cash == goal)
                wins++;
        }

        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
}