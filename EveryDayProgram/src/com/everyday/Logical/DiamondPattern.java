package com.everyday.Logical;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println("Enter the symbole : ");
        char c = scanner.next().charAt(0);
        for (int i = 1 ; i <= number ; i ++){
            for (int j = 1 ; j <= number -i ; j ++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i * 2 -1 ; j ++){
                System.out.print(c);
            }
            System.out.println();
        }
        for (int i = number - 1 ; i > 0 ; i --){
            for (int j = 1 ; j <= number -i ; j ++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i * 2 - 1; j ++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
/*Output
Enter the number :
10
Enter the symbole :
*
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *

* */