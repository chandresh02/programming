package com.xworkz.programming.string;

import java.util.Scanner;

public class PalindromePgm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		String nstr = "";
		for (int i = 0; i < ch.length; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = t;

		}
		nstr = new String(ch);
		if (nstr.equalsIgnoreCase(str))
			System.out.println(str + " string is palindrome");
		else
			System.out.println(str + " string is not palindrome");

	}

}
