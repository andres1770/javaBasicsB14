package com.syntax.class01;

public class Phone {
String make;
String Model;
String color;
int storage;
double size;
boolean cheap;
void call() {
	System.out.println("Callingg,,.....");
}
void takePictures() {
	System.out.println("Taking picturess");
}

public static void main(String[] args) {
	// name of class variable name= new name of class();
	
Phone iphone=new Phone();
iphone.make="Apple";
iphone.Model="Iphone 14 Pro Max";
iphone.color="purple";
iphone.storage=128;
iphone.size=6.8;
iphone.cheap=false;

System.out.println("Make "+iphone.make+" Model "+iphone.Model);
iphone.call();


System.out.println("************************");
	
	Phone samsung=new Phone();
	samsung.make="samsung";
	samsung.Model="22 Ultra";
	samsung.color="grey";
	samsung.storage=265;
	samsung.size=6.7;
	samsung.cheap=false;
	
	System.out.println(iphone.make);
	System.out.println(samsung.make);
	
	
	
	
	
}

}
