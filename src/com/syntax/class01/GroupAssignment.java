package com.syntax.class01;

public class GroupAssignment {

	public static void main(String[] args) {
		int[][] arr=new int[2][4];	
			arr[0][0]=1;
			arr[0][1]=2;
			arr[0][2]=3;
			arr[0][3]=4;

			arr[1][0]=5;
			arr[1][1]=6;
			arr[1][2]=7;
			arr[1][3]=8;
	;
	int evennum=0;
     int i;
     int j;
     for(i=0;i<2;i++)
     {
    	 for (j=0;j<5;j++)
    	 { 
    		 if(arr[i][j]%2==0) {
    			 arr[i][j]=evennum;
    			 System.out.print(evennum);
    			 
    		 }
    	 }
     }}}
     
     
	
	
	
	
	
	
	