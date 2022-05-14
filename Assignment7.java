package com.mapmay2;

public class Assignment7 {

	public static void main(String[] args) {
		// Assignment 7:  JavaSE application to check whether the given String is Palindrome or not (use String only).
		String str = "string";
		String str2 = "civic";
		palindrome(str);
		palindrome(str2);

	}

	private static void palindrome(String str) {
		// 
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		//System.out.println(s);
		//System.out.println(str);
		System.out.println(str + " Palindrome status :" + str.contentEquals(s.toString()));
		
	}

}
