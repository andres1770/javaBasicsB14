package com.syntax.class01;

public class BreakContinuedemo {

	public static void main(String[] args) {
		

		        for(int i=1; i<15; i++) {

		            System.out.println("Hello");

		            if(i==3) {
		                break;
		            }
		        }
		        //break - break the loop and it usually used inside some type of conditions

		        boolean hungry=true;

		        while(hungry) {

		            System.out.println("Give me food");
		            break;
		        }


		        System.out.println("End");

		        
		        
		        
		        
		        System.out.println("-------------------------------------");
		        
		        for(int i=1; i<5; i++) {

		            if (i==3) {
		                continue;
		            }

		            System.out.println("Hello");
		            System.out.println("How are you");
		            System.out.println(i);
		        }

		        // I want to print numbers from 1 to 20 except number 3, 7 and 11

		        for (int i=1; i<=20; i++) {

		            if(i==3 || i==7  ||i==11) {
		                continue;
		            }

		            System.out.print(i+" ");
		        }

		        //continue - continues to the next iteration/cycle
		        // moment Java sees continue -> it goes back to the beginning of the loop
		        //it usually used inside some type of conditions

		    
		}
		
		    }
		

	


