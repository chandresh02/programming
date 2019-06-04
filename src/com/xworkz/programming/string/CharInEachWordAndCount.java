
package com.xworkz.programming.string;

import java.util.Scanner;

public class CharInEachWordAndCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		String nst="";
		int nc=0;
		for(int i=0;i<ch.length;i++)
		{
			if(str.charAt(i)==' ')
			{
				nst=nst+nc;
				nc=0;
			}
			else
			{
				nc++;
				nst=nst+str.charAt(i);
			}
			
		}
		nst=nst+ nc;
		System.out.println("no. of char in each word is:: "+ nst);
}
}