package com.everyday;

import java.util.Scanner;

public class ConvertDayYear {
	
	public static double minuteInYear = 60 * 24 * 365;
	
	public static void yearAndDays(double minuteNumber) {
		long years = (long) (minuteNumber/minuteInYear);
		long days = (int) (minuteNumber / 60 / 24) % 365;
		
		System.out.println((int)minuteNumber + " minute is approximately equal to " + years +" years and " + days +" minutes");
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double minute;
		System.out.println("Enter the minutes here: ");
		minute = read.nextDouble();
		yearAndDays(minute);
		read.close();
	}
}