package com.syntax.class01;

public class Dog {

			// state
		//attributes/properties/fields
	 String name;
	 String color;
	 String breed;
	 double weight;
	 int age;
	 
//this are behaviours of a dog 
	 void bark() {
		 System.out.println("barking......");
	 }
	 void sleep() {
		 System.out.println("dog is sleeping.......");
	 }
	 public static void main(String[] args) {
//creating objects for a class
		 Dog dog1=new Dog();
		 //calling a behaviour on an object
		 dog1.bark();
		 dog1.sleep();
	}

}
