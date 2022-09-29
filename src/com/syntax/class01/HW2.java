package com.syntax.class01;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your birth month");
		String box1=input.nextLine();
		String seasonoftheyear;
		if (box1.equals("january")|| box1.equals("february") ||box1.equals("december")){
			seasonoftheyear="winter";
			
			
	}else if (box1.equals("september") ||box1.equals("november")|| box1.equals("october")) {
		seasonoftheyear="fall";
			
		}else if (box1.equals("march") ||box1.equals("may") ||box1.equals("april")) {
			seasonoftheyear="spring";
		}else if (box1.equals("june") ||box1.equals("july") ||box1.equals("august")) {
			seasonoftheyear="summer";
		}else {System.out.println("please enter a valid month");
		seasonoftheyear="invalid";
		}
				
				System.out.println(seasonoftheyear);

	}

}
