package com.mapmay2;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		/* Assignment 4:   Print the following pattern
		1
		212
		32123
		4321234
		543212345 
		*/
		
		Scanner scanner1=new Scanner(System.in);  //Scanner is used to take the inputs from the user. System.in refers to keyboard
		System.out.println("enter the number");
		int num = scanner1.nextInt();
		scanner1.close();
		
		for (int i = 1; i <= num; i++) {
			String num_seq = "";
			
			for(int y = i; y > 1; y--) {
				num_seq = num_seq + (y);
			}
			
			String reverse = new StringBuffer(num_seq).reverse().toString();
			
			System.out.println(num_seq+ "1" + reverse);
		}
		
	}
}