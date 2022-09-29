package com.syntax.class01;

public class NestedIfConditions2 {

	public static void main(String[] args) {
	
		double MoneyInMyAccount=2000;
		String season="spring";
		
		if (season.equals("spring")) {
			if(MoneyInMyAccount>30000) {
				System.out.println("let's go on vacations");
			
			}
			else {
				System.out.println("i need to save more money");
			
			}
		}
		

	}

}
