package com.syntax.class01;

import java.util.Scanner;

public class DidYouGetAJob {

	public static void main(String[] args) {
		//DO WHILE LOOP
		Scanner inp=new Scanner(System.in);
		String answer;
		do {
			System.out.println("Did you get a job?");
			answer=inp.nextLine();
		}while (!answer.equals("yes"));
		System.out.println("Congrats");
		
		
		
		
		System.out.println("-----------------------------------");
		System.out.println("Did you get a job");
		
		while(!answer.equals("yes")) {
			System.out.println("Did you get a job?");
			answer=inp.nextLine();
		}
		}
	}


