package com.syntax.class01;

public class Logical {

	public static void main(String[] args) {
		
		
		//LOGICAL AND &&
		
		/*
		 * TRUE && TRUE= TRUE
		 * TRUE && FALSE = FALSE
		 * FALSE && TRUE = FALSE
		 * FALSE && FALSE =FALSE
		 */
		boolean understandJava=true;
        boolean enjoyJava=true;
        boolean practice=true;

        if(understandJava && enjoyJava && practice) {
            System.out.println("This is awesome");
        }

        System.out.println("  another example   ");

        int n1=100;
        int n2=200;
        int n3=300;

        if(n1>n2 && n1>n3) {
            System.out.println(n1 +"is the largest");

        } else if (n2>n3 && n2>n1) {
            System.out.println(n2+" is the largest");

        } else if (n3>n1 && n3>n2) {
            System.out.println(n3 +" is the largest");}
  //LOGIAL OR ||
        
        /*
         * TRUE|| FALSE= TRUE
         * TRUE ||TRUE= TRUE
         * FALSE||TRUE= TRUE
         * FALSE|| FALSE= FALSE
         */
        
        String day ="saturday";
         if (day.equals("saturday")|| day.equals("sunday")) {
        	 System.out.println(" i have java class");
         }
        		 
        		
        
        
        
        
        
        
        
        
        
        
        
        }



    }

	


