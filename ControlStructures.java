package com.mapmay2;

import java.util.Scanner;

public class ControlStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a  unit number");
		int unit = scanner.nextInt();
		
		
		if (unit > 0 && unit < 50) {
			System.out.println("$0.50");
		} 
		else if (unit > 50 && unit < 100)  {
			System.out.println("$1.00");
		}
		else if (unit > 100 && unit < 150)  {
			System.out.println("$1.50");
		}
		else {System.out.println("$3.00");}
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter a  MONTH number");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			System.out.println("Not a month");
			break;
		}
		*/
		int even = 0;
		int odd = 0;
		for(int i = 0; i < 6; i++) {
			if (i %2 == 0) {
				even = even +i;
			}
			else
			{
				odd = odd +i;
			}	
		}
		System.out.println("even total is : " + even);
		System.out.println("odd total is : " + odd);
		
		int sum = 0;
		for(int i = 0; i < 6; i=i+2) {
			sum = sum +i;
		}
		System.out.println(sum);
		}
	

}
