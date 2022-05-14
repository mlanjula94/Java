package com.mapmay2;

import java.util.Random;

public class CityBank implements Bank {

	public int createAccount(String customerName, String idType, String id) {
		// TODO Auto-generated method stub
		Random random = new Random();
		return random.nextInt(1000); 
	}

	public String creditAmount(int accountNumber, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public String debitAmount(int accountNumber, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public String transferAmount(int fromAccountNumber, int toAccountNumber, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Statement[] miniStatement(int AccountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
