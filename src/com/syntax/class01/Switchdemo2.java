package com.syntax.class01;

public class Switchdemo2 {

	public static void main(String[] args) {
		char choice='y';
		String answer;
		switch(choice) {
		case'Y':
			answer="yes";
			break;
		case'N':
			answer="no";
			break;
		case'M':
			answer="maybe";
			break;
		default:
			answer="unknown";
			break;
		}
System.out.println(answer);
	}

}
