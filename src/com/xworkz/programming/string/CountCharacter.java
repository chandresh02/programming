package com.xworkz.programming.string;

import java.util.Scanner;

public class CountCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int count=0;

		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>=65 && ch[i]<=90)|| (ch[i]>=97&& ch[i]<=122) || (ch[i]>=48 && ch[i]<=55)&& ch[i]!=32 && ch[i]!=';'
					&&ch[i]!='.')
				count++;
		}
		System.out.println("total character is::"+count);
		
}
}