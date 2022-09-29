package com.syntax.class01;

public class SwitchCases {

	public static void main(String[] args) {
		// switch case is a statement that executes one statement from multiple values/conditions
		int day=7;
		
		System.out.println("-------------------------------------------");
String name;
switch(day){
case 1:
	name="monday";
	break;
case 2:
	name="tuesday";
	break;
case 3:
	name="wednesday";
	break;
case 4:
	name="thursday";
	break;
case 5:
	name="friday";
	break;
case 6:
	name="saturday";
	break;
case 7:
	name="sunday";
	break;
	default: 
		name="unknown";
		break;
	
}
System.out.println(name);
	}

}
