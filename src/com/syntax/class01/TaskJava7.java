package com.syntax.class01;

import java.util.Scanner;

public class TaskJava7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your quiz grade ");
		int quiz=input.nextInt();
		System.out.println("please enter your mid term grade");
		int midTerm=input.nextInt();
		System.out.println("please enter your final scores");
		int finalScores=input.nextInt();
		int avr=(quiz+midTerm+finalScores)/3;
		String grade;
		if (avr>=90) { grade="A";
		
		}else if (avr>=70 && avr<90) { grade="B";
		
		}else if (avr>=50 && avr<70) { grade="C";
		
		}else if (avr<50 && avr>0) {grade = "F";
		}
		else {grade= "invalid"; System.out.println("please enter a valid score");
				
		}
		
		System.out.println("your grade is "+grade);

	}}


