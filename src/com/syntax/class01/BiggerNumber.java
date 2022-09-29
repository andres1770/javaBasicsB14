package com.syntax.class01;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter a number ");
		int num=input.nextInt();
		if(num>1 && num<11) {System.out.println("Small");
		
		}else if (num>=10&& num<101) {System.out.println("Medium number");
		
		}else if (num>100 && num<1000) {System.out.println("Large number");
		
		}else {System.out.println("pleased enter a number between 1 and 1000");
		
		}

	}

}
