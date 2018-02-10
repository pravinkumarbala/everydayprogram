package com.everyday;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the b and c : ");
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discrimiant = b * b - 4.0 * c;
        double sqroot = Math.sqrt(discrimiant);

        double sq1 = (-b + sqroot) / 2.0;
        double sq2 = (-b - sqroot) / 2.0;

        System.out.println(sq1);
        System.out.println(sq2);
    }
}
