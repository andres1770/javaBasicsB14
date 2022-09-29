package com.syntax.class01;

import java.util.Arrays;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Batch 14 is really good";

String[] arr=str.split(" ");

System.out.println(Arrays.toString(arr));
System.out.println(arr[0]);

System.out.println("*******************************************");

String str2="Today is sunday. sunday is good. i like sundays";
String[] arr2=str2.split("[.]");
System.out.println(Arrays.toString(arr2));
	}

}
