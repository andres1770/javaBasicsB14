package com.syntax.class01;

import java.util.Arrays;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Proper way of creating an object
        String str= new String("Java"); 
        // Simpler and shorter way provided by Java Creators to make our life a little easier
        String name="Asma Alfadhli The Great"; // Only works for String and Wrapper classes
        /*
         * Counts the number of characters in a string including the spaces 
         */
        System.out.println(str.length());
        System.out.println(name.length());
        if(name.length()>15) {
            System.out.println("Name can't be more than 15 characters");
        }

        
        
        
        String stri="I love java programming";
        /*
         * toCharArray will convert a String to an array of chars
         */
        char[] charArray=str.toCharArray();

        System.out.println(Arrays.toString(charArray));
        System.out.println(charArray[7]);

        int counter=0;
        for(char c:charArray) {

            if(c=='a') {
                counter++;
            }
        }
        System.out.println("letter a has appread "+counter+" times");

    }

    
	}


