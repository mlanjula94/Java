package com.mapmay2;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		/* JavaSE application to make a Simple Calculator using switch...case 
		 * should be able to add, subtract, multiply and divide two numbers. 
		 * Scan the two numbers and operator using Scanner class.
		 */
		
		Scanner scanner1=new Scanner(System.in);  //Scanner is used to take the inputs from the user. System.in refers to keyboard
		System.out.println("Enter the FIRST number");
		int num1 = scanner1.nextInt();
		System.out.println("Enter the SECOND number");
		int num2 = scanner1.nextInt();
		System.out.println("Enter the OPERATOR");
		char operator = scanner1.next().charAt(0);
		scanner1.close();
		
		
		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(Double.valueOf(num1) / Double.valueOf(num2));
			break;
		default:
			System.out.println("You didn't use a Math operator");
			break;
		}
	}


}
