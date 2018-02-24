package com.everyday.Datastructures.Array;

import java.util.Scanner;

public class JugglingAlgorithm {

    public static void leftRotate(int[] arr, int d, int n){
        int i , j , k, temp;
        for (i = 0 ; i < gcd(d, n); i++ ){
            temp = arr[i];
            j = i ;
            while (1 != 0){
                k = j + d;
                if (k >= n)
                    k -= n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public static int gcd(int a, int b){
        if ( b == 0 )
            return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int size = scanner.nextInt();
        int[] arrVal = new int[size];
        System.out.println("Enter the Array values : ");
        for (int i = 0 ; i < size; i ++)
            arrVal[i] = scanner.nextInt();
        System.out.println("Enter the rotation range value : ");
        int range = scanner.nextInt();
        leftRotate(arrVal, range, size);
        System.out.println("After the rotation");
        for (int i = 0 ; i < size ; i ++ )
            System.out.print(arrVal[i] + " ");
    }
}