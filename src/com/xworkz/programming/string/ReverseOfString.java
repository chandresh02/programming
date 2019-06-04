package com.xworkz.programming.string;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}   
	
	String	nstr=new String(ch);
		System.out.println("reverse of given string is::"+ nstr);
}
}

