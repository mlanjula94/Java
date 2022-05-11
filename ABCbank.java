package com.mapmay2;

import java.util.Scanner;

public class ABCbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ***ABC Bank**
		 
		1. Create Account
		2. Credit Amount
		3. Debit Amount
		4. Transfer Amount
		5. Mini Statement
		6. Exit
		Select Any Option
		2
		Amount is Credited
		Do you want continue (Y/N)
		Y
		
		***ABC Bank**
		1. Create Account
		2. Credit Amount
		3. Debit Amount
		4. Transfer Amount
		5. Mini Statement
		6. Exit
		Select Any Option
		4
		Amount is Tranferred
		Do you want continue (Y/N)
		N
		Thank You, Please Visit Again 
		*/
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int selection;
		String decider;
		
		do {
			System.out.println("1. Create Account \n2. Credit Amount \n3. Debit Amount \n4. Transfer Amount \n5. Mini Statement \n6. Exit");
			System.out.println("Enter a  unit number");
			selection = scanner.nextInt();
			
			switch(selection) {
			case 1: System.out.println("Account created");
				break;
			case 2: System.out.println("Amount is Credited");
				break;
			case 3: System.out.println("Amount Debited");
				break;
			case 4: System.out.println("Amount is Tranferred");
				break;
			case 5: System.out.println("Mini statement not available");
				break;
			default: System.out.println("The system will exit.");
				break;			
			}
			System.out.println("\nDo you want continue (Y/N)");
			decider = scanner2.next().toUpperCase();
			System.out.println(decider);
		}
		while ( decider != "Y" );
		
		scanner.close();
		scanner2.close();
		
	}

}
