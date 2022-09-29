package com.syntax.class01;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// PRINT ALL NJUMBERS FROM 1 TO 10
		
		int num=1;
		while(num<=10) {
			System.out.print(num+" ");
			num++;
		}
		
System.out.println("----------------------------------------");



//PRINT ALL NUMBERS FROM 10 TO 25
int a=10;
while(a<=25) {
	System.out.print(a+" ");
	a++;
}
	
	System.out.println("------------------------------------------------");
	//PRINT ALL NUMBERS FROM 10 TO 1
	
	int b =10;
	while(b>=1) {
		System.out.print(b+" ");
		b--;
	}
	System.out.println("---------------------------------------------------");
	// PRINT ALL NUMBERS FROM 50 TO 20
	int c=50;
	while (c>=20) {
		System.out.print(c+" ");
		c--;
	}
	System.out.println("---------------------------------------------------");
	// PRINT ALL EVEN NUMBERS FROM 1 TO 20
	int d=2;
	while(d<=20) {
		System.out.print(d+" ");
		d+=2;
	}
	System.out.println("ANOTHER WAY");
	int e=1;
	while (e<=20) {
		if (e%2==0) {
			System.out.print(e+" ");
	}
		e++;}
	
		System.out.println("------------------------------------------------------");
		
		
		
	}
	
	
	
}




	


