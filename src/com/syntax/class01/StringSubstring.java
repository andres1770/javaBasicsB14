package com.syntax.class01;

import utils.StringUtils;

public class StringSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String stri="today is sunday";

String day=stri.substring(9);

System.out.println(day);

System.out.println(stri.substring(6,8));

char c=stri.charAt(4);

System.out.println(stri.charAt(4));
System.out.println("*****************************************");

    String str="Thor love and thunder";
    StringUtils strUtils=new StringUtils();
    strUtils.printAllIndexes(str, 'e');
}
	}


