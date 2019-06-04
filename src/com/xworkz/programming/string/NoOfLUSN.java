package com.xworkz.programming.string;

import java.util.Scanner;

public class NoOfLUSN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int uc = 0, lc = 0, special = 0, number = 0, space = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] < 90) {
				uc++;
			} else if (ch[i] >= 97 && ch[i] < 122) {
				lc++;
			} else if (ch[i] >= 48 && ch[i] < 57) {
				number++;
			} else if (ch[i] == 32) {
				space++;
			} else {
				special++;
			}
		}
		System.out.println("no. of upper char is::"+uc);
		System.out.println("no. of lower char is::"+lc);
		System.out.println("no. of number char is::"+number);
		System.out.println("no. of space char is::"+space);
		System.out.println("no. of special char is::"+special);
	}

}
