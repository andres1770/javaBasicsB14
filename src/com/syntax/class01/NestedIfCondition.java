package com.syntax.class01;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		/*
		 *  
		 */

		int time=5;
		String day="monday";
		
		if (day.equals("monday"))//as string is a non primitive we can't use the == sign we have to use .equals
		{//it is called outer if condition is it is true then only inner conditions will be checked
			
			//if it is false it wont check any of the inner conditions 
			
			if (time>7) {
				System.out.println("lets go to office");
			}
		if (time<6) {
			System.out.println("let's sleep more");
		}
		
		
		}
		
		
		
		
	}

}
