package com.syntax.class01;

import java.util.Scanner;

public class HwIfElse3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter a number ");
		int num1=input.nextInt();
		System.out.println("please enter another number");
		int num2=input.nextInt();
		System.out.println("please enter a nominator (+,-,*,/)");
		char nom=input.next().charAt(0);
		int answer=0;
		if (nom=='+') {
			answer=num1+num2;
		}else if (nom=='-') {
			answer=num1-num2;
		}else if (nom=='*') {
			answer=num1*num2;
		}else if (nom=='/') {
			answer=num1/num2;
			
		}else {
			System.out.println("please enter a valid operator");
		}
System.out.println(answer);
	}

}
