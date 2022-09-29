package com.syntax.class01;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		for (int i=1; i<=50; i++) {
			if (i%3==0) {
			System.out.print(i+" ");
			
		}}
		
		System.out.println("-------------------------------------------------------");
Scanner inp=new Scanner(System.in);
System.out.println("please enter item to buy ");
String item=inp.nextLine();
System.out.println("please enter the price of the item");
double price=inp.nextInt();

double money;
double total=0;

do { System.out.println("how much money do you have ");
money=inp.nextDouble();
total+=money;
double need;
double change;

if(total<price) {
	need=price-total;
	System.out.println("you need to pay more $"+need);
}else if (total>price) {
	change=total-price;
	System.out.println("here is your change $"+change);
	break;
}


}while(total!=price);
System.out.println("thank you for shopping");
	
	
	
	
	
	
	
	
	
	}

}
