package com.sample;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	
Scanner s = new Scanner(System.in);
	
String n= s.next();
String r= "";

//	StringBuffer a;
//	StringBuffer sb = new StringBuffer(String.valueOf(n));
//	a=sb.reverse();
//	System.out.println(a);
	for(int i=n.length()-1;i>=0;i--) {
		r= r+ n.charAt(i);
	}
	System.out.println(r);
	System.out.println(n);
	if (n.equals(r)) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
}
}