package com.syntax.class01;

import java.util.Scanner;

public class ReviewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//type casting
	//EXAMPLE OF MANUAL EXPLICIT NARROWING
		//AS WE CANT FIT MORE THAN 127 IN BYTE WE WILL GET WRONG RESULTS
		short largerbox=127;
		byte smallerbox=(byte)largerbox;
		System.out.println(smallerbox);
		
	//EXAMPLE OF MANUAL EXPLICIT NARROWING
	//As we can fit 129 in short we will get proper results
        int largerBox1=129; 
		int largerbox1=127;
		short smallerbox2=(byte)largerbox1;
		System.out.println(smallerbox2);
	
	//EXAMPLE OF IMPLICIT WIDENING AUTOMATIC
		short smallerbox3=45;
		long largerbox3=smallerbox3;
		System.out.println(largerbox3);
	
		
		//IF DEMO EXAMPLE
		boolean rich=true;
		System.out.println("lets buy eggs for breakfast");
		if (rich)
		{
		System.out.println("lets buy a jet or an island ");
		
		}
		System.out.println("lets buy breakfast ");
		
		
		
		//IF ELSE DEMO ....
		 String userName="Admin";
	        String password="password";
	        if(password.equals("password123"))
	        {
	            System.out.println("Welcome "+userName);
	        }
	        else
	        {
	            System.out.println("Wrong password "+userName);
	        }
	        
	  	//IF ELSE IF DEMO ........
	  //if we need one outcome based on if conditions we use IF if the outcomes are more than that
	        //we can use IF ELSE IF
	        // whenever you have to check more than two conditions always use if else if conditions
	     
	        int number = 12;
if (number > 0) {
	            System.out.println("number is positive");
	        }
	        if (number < 0) {
	            System.out.println("number is negative");
	            {
	        if (number == 0) {
	            System.out.println("number is 0");
	        }
	        if (number > 0) 
	        {
	            System.out.println("number is positive");
	        } 
	        else if (number < 0) 
	        {
	            System.out.println("number is negative");
	        }
	        else  {
	            System.out.println("number is 0");
	        }
	        
	        //IF NESTED IF 
	       
	   /*
	         * Nested if-conditions are conditions which are dependent on each other if outer condition is
	         * not true inner-condition is never checked inner-condition is only checked when 
	         * outer-condition is passed 
	         */

	        int money=12;

	        if(money>10) {  //outer conditions

	            System.out.println("Lets buy some eggs");
	            int noOfEggs=2;

	            if(noOfEggs>0) {
	                System.out.println("lets boil the eggs");
	            }

	        }
	        
	        
	        //EXAMPLE 2................
	        boolean studyHard = true;

	        if (studyHard)
	        {
	            System.out.println(" we ge the job in first few weeks");
	            boolean goodCommunicationSkills = true;

	            if (goodCommunicationSkills)
	            {
	                System.out.println(" might get a job in Apple Amazon, etc. ");
	            } 
	            else
	            {
	                System.out.println(" we need to work on our communication skills");
	            }

	        } else 
	        {

	            System.out.println("it might take a little longer to get the job");
	        }

	        //SCANNER CLASS REVIEW 
	        /*
	         * nextLine is a special method that can capture spaces and enters as well 
	         * when we use any method like nextInt() or nextBoolean(), nextDouble() and after that if we use
	         * nextLine() we need to discard that enter by using an extra nextLine() call 
	         */

	        Scanner scanner=new Scanner(System.in);

	        System.out.println("Pelease Enter your age");
	        int age=scanner.nextInt();

	        System.out.println("Pelease Enter your name");
	        scanner.nextLine();
	        String name=scanner.nextLine();
	        System.out.println(name+" is "+age+" years old");


	    }
	    }
	        
	        
	}

}
