package com.syntax.class01;

public class Task44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello";

int length=str.length();
if (!str.isEmpty()&&length%2!=0 &&length>=3) {
	
	int middleIndex=length/2;
	System.out.println(str.charAt(middleIndex));
}


	}

}
