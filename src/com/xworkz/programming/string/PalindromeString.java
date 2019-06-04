package com.xworkz.programming.string;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		String str2="";
		for(int i=ch.length-1;i>=0;i--)
		{
			str2+=str.charAt(i);
		}
		if(str2.equalsIgnoreCase(str))
		{
			System.out.println(str + " is palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
}

}