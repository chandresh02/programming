package com.xworkz.programming.string;

import java.util.Scanner;

public class FreqOfEachChar {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++)
		{
			int count = 0;
			for (int j = 0; j < ch.length; j++)
			{
				if (j <i && (ch[j] == ch[i])) 
				{
					break;
				}
				if (ch[i] == ch[j])
				{
					count++;
				}
			}
			if (count > 0) 
			{
				System.out.println(ch[i] + " present at " + count + " times");
			}
		}

	}
}