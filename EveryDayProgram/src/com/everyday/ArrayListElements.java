/**
 * 
 */
package com.everyday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * @author pravin
 *
 */
public class ArrayListElements {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(97);
		list.add(null);
		list.add(25);
		list.add(91);
		System.out.println("Using Iterator");
		IteratorMethod(list);
		System.out.println("Using Get Method");
		GetMethod(list);
		System.out.println("Using Enumeration");
		EnumMethod(list);
		
	}
	/*
	 * Enumeration using Collections
	 */
	private static void EnumMethod(List<Integer> list) {
		Enumeration<Integer> e = Collections.enumeration(list);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
	/*
	 * Get Method
	 */
	private static void GetMethod(List<Integer> list) {
		for(int i = 0 ; i < list.size() ; i++ )
			System.out.println(list.get(i));
	}
	/*
	 * Iterator Method
	 */
	private static void IteratorMethod(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}