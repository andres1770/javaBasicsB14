package com.syntax.class01;

import java.util.Scanner;

public class InputFromKeyboard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=scanner.nextInt();
		
	if (age<18) {
		System.out.println("you should study");
	}
	else { System.out.println("you should work");
	
	}
}
}
