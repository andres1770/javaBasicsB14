package com.syntax.class01;

import java.util.Scanner;

public class Hwjava4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("input current time 24 hour format");
		
		int hour=input.nextInt();
		String timeOfTheDay;
		
		if (hour>=1 && hour<=11) {
			timeOfTheDay="Morning";
		
		}else if (hour>12 && hour<15) {
			timeOfTheDay="Afternoon";
		
		}else if (hour>16 && hour<20) {
			timeOfTheDay="Evening";
		
		}else if (hour>=21 && hour<24) {
			timeOfTheDay="Night";
		
		}else { System.out.println("Please enter valid time");
		timeOfTheDay="invalid";
		}
				
System.out.println(timeOfTheDay);
	}

}
