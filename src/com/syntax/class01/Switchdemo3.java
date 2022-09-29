package com.syntax.class01;

import java.util.Scanner;

public class Switchdemo3 {

	public static void main(String[] args) {
		 /*
		  * ask the user where is he/she from 
		  * based on the country define favorite food
		  */
		
		Scanner in=new Scanner(System.in);
		System.out.println("please tell me where are you from");
		String country=in.nextLine();
		String favoriteFood;
		
		switch(country){
		case "Usa":
			favoriteFood="burgers and fries";
			//break;
		case "kazakhstan":
			favoriteFood="beshparmak";
			//break;
		case "turkey":
			favoriteFood="adana kebab";
			//break;
		case "venezuela":
			favoriteFood="arepa";
			//break;
		case "india":
			favoriteFood="chicken curry";
				//break;
		case "yemen":
			favoriteFood="mandi";
			//break;
		case "afghanistan":
			favoriteFood="qaboli plaow";
			//break;
			default:
				favoriteFood="unknown";
				break;
		}
		System.out.println("you are from "+country+" and your favorite food is "+favoriteFood);
		
		
		
		
	}

}
