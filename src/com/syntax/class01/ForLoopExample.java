package com.syntax.class01;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   for (int h = 0; h < 24; h++) {

	            for (int m1 = 0; m1 <= 5; m1++) {

	                for (int m2 = 0; m2 <= 9; m2++) {

	                    if (h < 10) {
	                        System.out.println("0" + h + ":" + m1 + m2);
	                    } else {
	                        System.out.println(h + ":" + m1 + m2);
	                    }
	                }
	            }
	        }
		   for (int i = 1; i < 3; i++) { // --> outer loop controls inner loop

	            System.out.println("Hello");

	            for (int j = 1; j >= 3; j++) { // --> inner loop depends on outer loop
	                System.out.println("Bye");

	            }
	        }

	        System.out.println(" -----------------------------  ");

	        for(int i=0; i<=2; i++) {

	            for(int j=1; j<4; j++) {

	                System.out.println(i+" "+j);

	            }
	        }

	        System.out.println("End of the code");
	    }
	

	    }
	


