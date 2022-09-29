package com.syntax.class01;

import java.util.Scanner;

public class ImputFromKeryboard {

	public static void main(String[] args) {
	/*
	 * scanner is a class that helps us take the input from the keyboard it contains many different smaller modules called methods 
	 * that can help us take strings booleans basically all types of data from keyboard
	 */
	Scanner input= new Scanner(System.in);
	//a message will be displayed to the user on the console to enter his/her name 
	System.out.println("please enter your name");
	//Activates the java program to take the input from keyboard and store it inside the variable 
	String name=input.next();
	//prints whatever name user enters on the keyboard to the console
	System.out.println("hello "+name);
	
	
	}

}
