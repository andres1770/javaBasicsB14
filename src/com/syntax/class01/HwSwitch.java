package com.syntax.class01;

import java.util.Scanner;

public class HwSwitch {

	public static void main(String[] args) {
		System.out.println("please enter your grade");
		Scanner input=new Scanner(System.in);
		String grade=input.nextLine();
		String box;
		switch (grade) {
		case "A":
			box="exelent";
			break;
		case "B":
			box="good";
			break;
		case "C":
			box="average";
			break;
		case "D":
			box="bad";
			break;
			default:
				box= "not acceptable";
				break;
				
			
		}
		System.out.println("your grade is "+grade+" which means "+box);
		

	}

}
