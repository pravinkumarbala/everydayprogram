package com.everyday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author pravinkumar
 */
public class ArrayListEvenOddNumbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> originalArrayList = new ArrayList<>();
		List<Integer> additionalArrayList = new ArrayList<>();
		
		for(int i = 1 ; i <= 50 ; i++) {
			if(i%2 == 0)
				originalArrayList.add(i);
			else
				additionalArrayList.add(i);
		}
		System.out.println("Even array list");
		System.out.println("---------------");
		System.out.println(originalArrayList);
		System.out.println("Odd array list");
		System.out.println("--------------");
		System.out.println(additionalArrayList);
		System.out.println("Whole Array List");
		originalArrayList.addAll(additionalArrayList);
		Iterator<Integer> iter = originalArrayList.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
	}
}