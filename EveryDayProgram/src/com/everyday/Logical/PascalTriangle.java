package com.everyday.Logical;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines : ");
        int line = scanner.nextInt();

        for (int i = 0 ; i < line ; i ++){
            for (int j = 0 ; j < line - i ; j++ )
                System.out.print(" ");
            int number = 1;
            for (int k = 0 ; k <= i; k ++){
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}

/*
Result:
Enter the number of lines :
5
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
* */