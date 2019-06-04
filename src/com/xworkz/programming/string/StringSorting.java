package com.xworkz.programming.string;

import java.util.Scanner;

public class StringSorting 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		String str2="";
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
				char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			str2=str2+ch[i];
		}
	
		System.out.println(str2);
}
}