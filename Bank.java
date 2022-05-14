package com.mapmay2;

//interace is a service requirement specification
//all services will be represented with abstract methods(any method without body and with the keyword abstract)
//all methods of interface are public and abstract by default
//once interface is released anyone can provide the implementation
//all variables inside interface are public, static and final bydefault
//interfaces can not be instantiated
//allows one default method, static methods and main method.
//interface reference variable can hold all its implementation classes' objects
public interface Bank {
	public static final double rateOfInterest=14.99;
	public abstract int createAccount(String customerName, String idType, String id);  //abstract method
	String creditAmount(int accountNumber, double amount);
	String debitAmount(int accountNumber, double amount);
	String transferAmount(int fromAccountNumber, int toAccountNumber,double amount);
	Statement[] miniStatement(int AccountNumber);
	default int houseLoan() {
		System.out.println("house loan");
		return 0;
	}
	
	static void carLaon() {
		System.out.println("car loan");
	}
	
	public static void main(String[] args) {
		//Bank bank=new Bank();
		Bank cityBank=new CityBank(); //polymorphism
		int accountNumber=cityBank.createAccount("naresh", "adhar", "dsd1212");
		System.out.println("suucess and the account number generated is:"+accountNumber);
		cityBank.creditAmount(accountNumber, 1000);
	}
	
}


