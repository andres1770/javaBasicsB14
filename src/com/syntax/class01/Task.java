package com.syntax.class01;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		 int sum=0;
		int sumodd=0;
	for (int i =0; i<=50; i++) {
		if (i%2==0) {
			sum+=i;
		}else {
			sumodd+=i;
		}
		
	}
		
		System.out.println("the sum of even numbers is "+sum);
		
		System.out.println("sum of odd numbers is "+sumodd);
		
		System.out.println("-------------------------------------------------");
		
		Scanner input = new Scanner(System.in);
        int secret = 1234;
        int guess;

        do {
            System.out.println("Please guess the secret number: ");
            guess = input.nextInt();

        }while(guess != secret);

        System.out.println("You won!");

		
		
		
		
		
	}

}
