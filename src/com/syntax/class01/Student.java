package com.syntax.class01;

public class Student {
String name;
String id;
int age;
double weight;
char gender;

void study() {
	System.out.println("Student is studying ");
}

void deleteMessages() {
	System.out.println("Deleting messages from Discord");
}

void eat() {
	System.out.println("Eating pizza...");
}

public static void main(String[] args) {
	//new student()=> creates an object of the student class
	Student fraidoonObject=new Student();
	
	fraidoonObject.name="Friadoon";
	fraidoonObject.id="123";
	fraidoonObject.age=22;
	fraidoonObject.weight=150;
	fraidoonObject.gender='M';
	
	System.out.println(fraidoonObject.name);
	System.out.println(fraidoonObject.age);
	
	fraidoonObject.deleteMessages();

	
	
	
	Student student2=new Student();
	student2.name="Asma";
	student2.age=15;
	student2.weight=30;
	student2.gender='F';
	System.out.println(student2.name);
	student2.eat();
}


}
