package com.syntax.class01;

import java.util.Scanner;

public class Taskjava2 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("please enter a number between 1 and 7");
		int day=input.nextInt();
		if (day==1 || day==2 || day==3||day==4||day==5) {System.out.println("it is a weekday ");
		
		}else if (day==6||day==7) {System.out.println(" it is a weekend ");
		
		}
		else {System.out.println("please enter a valid number");
		
		}

	}

}
