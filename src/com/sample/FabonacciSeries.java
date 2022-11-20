package com.sample;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);
	int j=s.nextInt();
	
	int a=0,b=1;
			int c;
	
for(int i = 0;i<=j;i++) {
	
	System.out.println(a);
	c=a+b;
	a=b;
	b=c;	}
}
}
