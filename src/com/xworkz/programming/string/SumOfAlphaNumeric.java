package com.xworkz.programming.string;

import java.util.Scanner;

public class SumOfAlphaNumeric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				sum = sum + ch[i] - 48;
			}
		}
		System.out.println("total sum is::" + sum);
	}
}