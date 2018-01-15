package com.everyday.SearchOperation;

import java.util.Random;
import java.util.Scanner;
import com.everyday.SortingTechnique.BubbleSort;

public class InterpolationSearch {

    public static int interpolSearch(int[] sortedArray, int toFind){
        int low = 0 ;
        int high = sortedArray.length - 1;
        int mid;
        while (sortedArray[low] <= toFind && sortedArray[high] >= toFind){
            if (sortedArray[high] - sortedArray[low] == 0 )
                return (low+high)/2;
            mid = low + ((toFind - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);

            if (sortedArray[mid] < toFind)
                low = mid + 1;
            else if(sortedArray[mid] > toFind)
                high = mid - 1;
            else
                return mid;
        }
        if (sortedArray[low] == toFind)
            return low;
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Random random = new Random();
        int n, i;
        System.out.println("Enter the number of integer elements : ");
        n = rd.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the integers elements : ");
        for (i = 0 ; i < n ; i++)
            arr[i] = Math.abs(random.nextInt(100));
        System.out.println("Before sorting ");
        BubbleSort.printArray(arr);

        System.out.println("\nAfter soring ");
        BubbleSort.printArray(BubbleSort.sort(arr));
        System.out.println("\nEnter the element to be search : ");
        int key = rd.nextInt();
        int result = interpolSearch(BubbleSort.sort(arr), key);
        if(result == -1)
            System.out.println("\n" + key + " element is not found");
        else
            System.out.println("\n" + key + "element found at position : " + (result + 1));
    }
}