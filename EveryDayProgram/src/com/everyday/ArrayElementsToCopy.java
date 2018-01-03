package com.everyday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayElementsToCopy {

	public static void main(String[] args) {
		List<Integer> integerArrayList = new ArrayList<>();
		integerArrayList.add(38);
		integerArrayList.add(99);
		integerArrayList.add(75);
		integerArrayList.add(32);
		
		System.out.println("Array List values");
		Iterator<Integer> iter = integerArrayList.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
		
		//Copy all the array list to object
		Object[] objectArray = integerArrayList.toArray();
		System.out.println();
		System.out.println("Object list values");
		for(int index = 0 ; index < objectArray.length ; index++ )
			System.out.println(objectArray[index]);
	}
}