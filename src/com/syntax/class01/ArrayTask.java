package com.syntax.class01;

public class ArrayTask {

	public static void main(String[] args) {
		String[][] big=new String[2][4];
		big[0][0]="Mr";
		big[0][1]="Mrs";
		big[0][2]="Ms";
		big[0][3]="Miss";

		big[1][0]="Smith";
		big[1][1]="Jordan";
		big[1][2]="Jackson";
		big[1][3]="Obama";

		System.out.print(big[0][1]+" "+big[1][0]+" ");
		System.out.print(big[0][0]+" "+big[1][3]+" ");
		System.out.print(big[0][2]+" "+big[1][2]+" ");
		System.out.print(big[0][3]+" "+big[1][1]+" ");
		System.out.println("--------------------------------------");
		
		String[][] arr= {
				{"yusuf","hamza","Adam","John"},
				{"A","B","C","D"}
				};
		System.out.println(arr[0][1]+"="+arr[1][2]);
		System.out.println();
}
}