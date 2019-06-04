package com.xworkz.programming.string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println("reverse of string is:"+ rev);
}
}