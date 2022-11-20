package com.sample;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		

	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	int check = n;
	int r=0;
	
	while(n!=0) {
		r= r*10 + n%10 ;//
		n=n/10;
	}
	
	System.out.println(r);
	
	
	if (r==check) {
		
		System.out.println(true);
	}
	else {System.out.println(false);}
}
	
}
