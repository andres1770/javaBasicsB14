package com.syntax.class01;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you resolved replit assignments please enter true or false");
		boolean solvedAnyRepls=scanner.nextBoolean();
		if (solvedAnyRepls)
		{
			System.out.println("how many repls you solved");
			int noOfReplsSolved=scanner.nextInt();
			if(noOfReplsSolved>=17) 
			{System.out.println("you are doing a great job");}
			else if (noOfReplsSolved>10) {System.out.println("you are doing ok please complete as soon as possible");}
			else {System.out.println("you should solve more repls");}
		}
		else
		{
			System.out.println("They are very important please solve them");
		}

	}

}
